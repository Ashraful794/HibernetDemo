insert into Location(id, name) values(1, 'Budapest, Hungary');
insert into Location(id, name) values(2, 'Owerri, Nigeria');
insert into Location(id, name) values(3, 'Califonia, USA');

insert into People(id,email, name,  locationid) values(1,'kany@gmail.com', 'Kindson',  1);
insert into People(id,email, name,  locationid) values(2,'yuba@gmail.com', 'Jeffrey',  2);
insert into People(id,email, name,  locationid) values(3,'solace@gmail.com', 'Solace',  3);
insert into People(id,email, name,  locationid) values(4,'zabir@gmail.com', 'Zabir',  2);



insert into Post(id,  details, peopleid) values(1,  'Very good post', 1);
insert into Post(id,  details, peopleid) values(2,  'A rainy day', 2);
insert into Post(id,  details, peopleid) values(3,  'nice tutorials', 3);
insert into Post(id,  details, peopleid) values(4,  'Java Post', 3);



insert into Image(id,pathName, peopleid) values(4,  'E:\Problem Solving New\HibernetDemo\src\main\resources\static\image\OHPQE700', 1);
