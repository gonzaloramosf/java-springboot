--CREATE TABLE CLIENT(id Long, name varchar(150), lastname varchar(150), direction varchar(200))
CREATE TABLE CLIENT (id bigint NOT NULL auto_increment, name varchar(150), lastname varchar(200), date varchar (50), PRIMARY KEY (id));

insert into CLIENT(name, lastname, date) values('Rodrigo', 'Del Campo', '2002-06-19');
insert into CLIENT(name, lastname, date) values('Lautaro', 'Gonzalez', '1978-12-26');
insert into CLIENT(name, lastname, date) values('Federico', 'Gomez', '2001-07-08');
insert into CLIENT(name, lastname, date) values('Agustin', 'Tucumano', '1998-02-07');
insert into CLIENT(name, lastname, date) values('Tomas', 'Garcia', '1989-03-11');

--INSERT INTO CLIENT(id, name, lastname, direction)
--VALUES(0, 'Rodrigo', 'Gonzalez', 5456)
--INSERT INTO CLIENT(id, name, lastname, direction)
--VALUES(1, 'Lautaro', 'Gomez', 3456)
--INSERT INTO CLIENT(id, name, lastname, direction)
--VALUES(2, 'Federico', 'Tucumano', 2567)
--INSERT INTO CLIENT(id, name, lastname, direction)
--VALUES(1, 'Agustin', 'Potente', 3456)
--INSERT INTO CLIENT(id, name, lastname, direction)
--VALUES(2, 'Tomas', 'Garcia', 2567)