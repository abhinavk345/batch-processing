# batch-processing
url :
PostMApping:
localhost:9090/jobs/import

-----------------------------
output view::
--------------------------------------------
mysql> select * from customer_new limit 100;
+------+-----------------------+-------------------+------------+--------------------------------+------------+-------------+-------------+
| id   | contact_no            | country           | dob        | email                          | first_name | gender      | last_name   |
+------+-----------------------+-------------------+------------+--------------------------------+------------+-------------+-------------+
| 1950 | Philippines           | +63 874 226 3611  | 3/24/2023  | tgoodayo4@techcrunch.com       | Theo       | Bigender    | Gooday      |
| 1949 | China                 | +86 842 322 3028  | 8/3/2022   | mmoorheado3@examiner.com       | Malissia   | Female      | Moorhead    |
| 1948 | China                 | +86 770 726 0999  | 2/15/2023  | bducketto2@flickr.com          | Bertie     | Female      | Duckett     |
| 1947 | Malaysia              | +60 698 207 9635  | 8/29/2022  | ttogwello1@amazon.co.jp        | Timothy    | Male        | Togwell     |
| 1946 | Portugal              | +351 126 395 9365 | 1/18/2023  | vagnoloo0@homestead.com        | Vanessa    | Female      | Agnolo      |
| 1945 | Dominican Republic    | +1 448 603 9299   | 1/19/2023  | sbroynz@google.cn              | Shayla     | Female      | Broy        |
| 1944 | China                 | +86 425 991 7137  | 4/6/2023   | hsyresny@arizona.edu           | Honoria    | Female      | Syres       |
| 1943 | Guatemala             | +502 572 230 5059 | 9/11/2022  | agianninottinx@forbes.com      | Austin     | Female      | Gianninotti |
| 1942 | Madagascar            | +261 474 194 5144 | 6/22/2023  | kcaukillnw@aboutads.info       | Klement    | Male        | Caukill     |
| 1941 | Israel                | +972 880 617 9087 | 1/31/2023  | gdicksonnv@google.com.br       | Gerri      | Female      | Dickson     |
| 1940 | Indonesia             | +62 306 800 9559  | 5/16/2023  | cquarenu@live.com              | Cchaddie   | Agender     | Quare       |
| 1939 | China                 | +86 219 424 9607  | 8/9/2022   | fjirant@sciencedaily.com       | Faunie     | Female      | Jira        |
| 1938 | China                 | +86 186 182 6414  | 5/4/2023   | ahuncootns@boston.com          | Araldo     | Male        | Huncoot     |
| 1937 | China                 | +86 746 317 5912  | 10/23/2022 | mbellamynr@meetup.com          | Micaela    | Female      | Bellamy     |
| 1936 | China                 | +86 520 439 3764  | 11/6/2022  | bsavatiernq@aol.com            | Burnaby    | Male        | Savatier    |
| 1935 | Palestinian Territory | +970 730 290 3078 | 12/18/2022 | astoffelnp@tinyurl.com         | Angil      | Female      | Stoffel     |
| 1934 | Portugal              | +351 122 488 7302 | 6/24/2023  | lbreakeyno@apple.com           | Liliane    | Female      | Breakey     |
| 1933 | Czech Republic        | +420 571 518 3112 | 11/26/2022 | saxlebynn@facebook.com         | Stearn     | Male        | Axleby      |
| 1932 | Indonesia             | +62 535 791 6619  | 2/25/2023  | dsantenm@yolasite.com          | Diane      | Female      | Sante       |
| 1931 | Philippines           | +63 325 622 1707  | 7/6/2023   | bvaleriusnl@aboutads.info      | Brand      | Male        | Valerius    |
| 1930 | China                 | +86 689 557 4421  | 7/15/2023  | igoudienk@adobe.com            | Ingelbert  | Male        | Goudie      |
| 1929 | Czech Republic        | +420 911 661 7126 | 11/17/2022 | balbanynj@nasa.gov             | Bendix     | Polygender  | Albany      |
| 1928 | Botswana              | +267 412 783 7380 | 6/18/2023  | astachinini@odnoklassniki.ru   | Andras     | Male        | Stachini    |
| 1927 | Mexico                | +52 465 925 9200  | 11/14/2022 | ldeboldnh@marketwatch.com      | Lucie      | Female      | Debold      |
| 1926 | Indonesia             | +62 186 628 8271  | 8/25/2022  | dhedgeleyng@state.tx.us        | Didi       | Female      | Hedgeley    |
|
