package com.abhi.batch.config;

import com.abhi.batch.entity.Customer;
import com.abhi.batch.repository.CustomerRepository;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

@Configuration
@EnableBatchProcessing

public class SpringBatchConfiguration {


    @Autowired
    private JobBuilderFactory jobBuilderFactory;
    @Autowired
    private StepBuilderFactory stepBuilderFactory;
    @Autowired
    private CustomerRepository customerRepository;

    public FlatFileItemReader<Customer> reader() {
        FlatFileItemReader<Customer> reader = new FlatFileItemReader<>();
        reader.setResource(new FileSystemResource("src/main/resources/dummy.csv"));
        reader.setName("csvReader");
        reader.setLinesToSkip(1);

        reader.setLineMapper(lineMapper());
        return reader;
    }

    private LineMapper<Customer> lineMapper() {
        DefaultLineMapper<Customer> lineMapper = new DefaultLineMapper<>();
        DelimitedLineTokenizer delimitedLineTokenizer = new DelimitedLineTokenizer();
        delimitedLineTokenizer.setDelimiter(",");
        delimitedLineTokenizer.setStrict(false);
        delimitedLineTokenizer.setNames("firstName", "lastName", "email", "gender", "contactNo", "country", "dob");
        BeanWrapperFieldSetMapper<Customer> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
        fieldSetMapper.setTargetType(Customer.class);
        lineMapper.setLineTokenizer(delimitedLineTokenizer);
        lineMapper.setFieldSetMapper(fieldSetMapper);

        return lineMapper;
    }

    @Bean
    public CustomerProcessor processor() {
        return new CustomerProcessor();
    }

    @Bean
    public RepositoryItemWriter<Customer> writer() {
        RepositoryItemWriter<Customer> writer = new RepositoryItemWriter<>();
        writer.setRepository(customerRepository);
        return writer;
    }

    @Bean
    public Step step1(){
        return stepBuilderFactory.get("csv-step").<Customer
                ,Customer>chunk(10).reader(reader())
                .processor(processor())
                .writer(writer())
                .build();

    }

    @Bean
    public Job runJob(){
        return  jobBuilderFactory.get("importCustomer")
                .flow(step1())
                .end().build();

    }
}
