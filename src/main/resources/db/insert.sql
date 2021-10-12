
set foreign_key_checks=0;

truncate table product;
truncate table feed_back;

insert into product(`id`,`currency`,`details`, `name`,`price`)
value (110,'USD','the sofa in town newel ','luxury chair', 4500),
    (111,'NGN','the sofa in town newel ','luxury chair', 2200000),
    (112,'CFA','the sofa in town newel ','luxury chair', 6500),
    (113,'SGD','the sofa in town newel ','luxury chair', 5000);

set foreign_key_checks=1;