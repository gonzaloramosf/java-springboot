--CREATE TABLE CLIENT(id Long, name varchar(150), lastname varchar(150), direction varchar(200))
CREATE TABLE CLIENT (id bigint NOT NULL auto_increment, name varchar(150), PRIMARY KEY (id));

insert into CLIENT(name) values('Rodrigo');
insert into CLIENT(name) values('Lautaro');
insert into CLIENT(name) values('Federico');
insert into CLIENT(name) values('Agustin');
insert into CLIENT(name) values('Tomas');

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