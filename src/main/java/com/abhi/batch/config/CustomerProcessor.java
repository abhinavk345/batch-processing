package com.abhi.batch.config;

import com.abhi.batch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer>{

    @Override
    public Customer process(Customer customer) throws Exception {
        return customer;
    }
}
