create database loan_78150;
use loan_78150;

create table admin(
admin_name varchar(20),
admin_id varchar(10) primary key unique,
admin_phone int,
admin_email varchar(20) unique,
admin_password varchar(20)
);

insert into admin values
('Hari', 'A001', 91234, 'hari@gmail.com', 'hari123' ),
('Holly', 'A002', 90807, 'holly@gmail.com', 'holly123');


create table service(
service_id varchar(20) primary key,
service_name varchar(20),
service_amount float,
service_expected float
);

insert into service values
('S001', 'Government', 2500000, 100000),
('S002', 'Private', 3000000, 200000);

create table user(
user_name varchar(20),
user_id varchar(20) primary key,
user_mobile int,
user_pan varchar(15),
user_city varchar(20),
service_id varchar (20),
foreign key(service_id) references service(service_id),
user_income long ,
cibil_score float,
expected_amount long,
user_password varchar(20)
);
insert into user values
('Finn', 'U001', 90123, 'ABC456', 'nellore', 'S002', 780000, 780, 190000, 'finn123' ),
('Happy', 'U002', 98765, 'QWE534', 'delhi', 'S001', 30000, 145, 90000, 'happy123' );

create table application(
user_id varchar(20),
foreign key(user_id) references user(user_id),
application_id varchar(10),
admin_id varchar(10),
foreign key(admin_id) references admin(admin_id),
monthly_emi float,
service_id varchar(20),
foreign key(service_id) references service(service_id)
);

insert into application values
('U001', 'Q001', 'A002', '20000', 'S002'),
('U002', 'Q002', 'A001', '30000', 'S001');

create table history(
user_id varchar(20),
foreign key(user_id) references user(user_id),
status varchar(20),
timing time ,
comments varchar(40)
);

insert into history values
('U001', 'IN PROCESS', '2022-09-28 13:24:25.950','Under process');

