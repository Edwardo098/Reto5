use c2g69;

insert into ciclos values
(1,"FUND DE PROGRAMACION"),
(2,"PROG BASICA"),
(3,"DESARROLLO SW"),
(4,"DESARROLLO WEB");

select * from ciclos;

insert into ciudad values
(1,"Bucaramanga"),
(2,"Bogota"),
(3,"Medellin"),
(4,"Barranquilla");

select * from ciudad;

insert into estudio values
(1,"Bachillerato"),
(2,"Pregrado"),
(3,"Especializacion"),
(4,"Postgrado");

select * from estudio;

insert into grupo values
("G69"),
("G70"),
("G80"),
("G90");

select * from grupo;


insert into tripulante values
(1,"Diaz Martinez","Juan Carlos",2,1,"G69"),
(2,"Perez Gomez","Maria",1,2,"G70"),
(3,"Hernandez Sierra","Yuli Marcela",4,3,"G69"),
(4,"Maldonado Ortiz","Juan Manuel",3,4,"G80");

select * from tripulante;

insert into matricula values
(1,1,4.5,4.0),
(1,2,5.0,4.5), 
(2,1,4.0,3.5),
(3,1,3.5,4.5);

select * from matricula;

insert into matricula values
(4,8,4.5,4.0);

insert into tripulante values
(5,"Diaz Martinez","Juan Carlos",9,1,"G69");

alter table matricula
drop column Reto2;

alter table matricula
add column Reto2 float4,
add column Reto3 float4;

update matricula set Reto2=4.0, Reto3=5.0 where id=1 and ciclo=2;

delete from matricula where id>1;

select ma.id,tr.apellidos,tr.nombres,ci.descripcion,ma.Reto1,ma.Reto2,ma.Reto3
from matricula ma
join tripulante tr on ma.id=tr.id
join ciudad ci on ci.codigo_ciu=tr.codigo_ciu;