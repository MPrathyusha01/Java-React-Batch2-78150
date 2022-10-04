create database online_78150;
use online_78150;
create table admin(
admin_name varchar(20) not null,
admin_id int not null unique primary key,
admin_phone int not null,
admin_email varchar(25),
admin_password varchar(10)
);

create table student(
student_name varchar(20),
student_id int unique primary key,
student_phone int,
student_email varchar(25) unique,
student_place varchar(20),
student_password varchar(20)
);

create table login(
username int,
password varchar(20),
role varchar(20)
);

create table courses(
admin_id int ,
foreign key(admin_id) references admin(admin_id),
course_id int unique not null primary key,
course_name varchar(20),
course_cost float not null,
course_duration int
);

create table course_details(
course_id int,
foreign key(course_id) references courses(course_id),
student_id int,
foreign key(student_id) references student(student_id),
payment float,
# foreign key(payment) references courses(course_cost),
course_status varchar(20)
);


create table details(
student_id int,
foreign key(student_id) references student(student_id),
admin_id int,
foreign key(admin_id) references admin(admin_id),
status varchar(20)
);

insert into admin values
('Johns', 1001, 98123,'johns@gmail.com', 'johns123'),
('Jinny', 1002, 91234, 'jinny@gmail.com', 'jinny123'),
('Justin', 1003, 95678, 'justin@gmail.com', 'justin123');

insert into student values
('Tom', 9001, 98485, 'tom@gmail.com','nellore', 'tom123'),
('Jimmy', 9002, 90305, 'jimmy@gmail.com', 'hyderabad','jimmy123');

insert into login values
(1001 , 'johns123', 'admin'),
(1002, 'jinny123', 'admin'),
(1003, 'justin123','admin'),
(9001, 'tom123', 'student'),
(9002, 'jimmy123', 'student');

insert into courses values
(1002, 5001, 'Python', 1200.0, 3),
(1002, 5002, 'java: 101', 3500, 7),
(1001, 5003, 'Myswql foundation', 2500, 2);

insert into course_details values
(5002, 9002, 3500, 'COMPLETED'),
(5001, 9001, 1200.0, 'ONGOING');

insert into details values
(9001, 1002, 'ACCEPTED'),
(9002, 1001, 'ACCEPTED');


# drop database online_78150;
# drop table courses;