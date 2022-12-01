
CREATE DATABASE Prueba; 

DROP TABLE IF EXISTS Prueba.dbo.Grgobject;
CREATE TABLE Prueba.dbo.Grgobject (
	gobject_id int NULL,
	hierarchical_name varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	hosting_tree_level varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	area_gobject_id varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	hosted_by_gobject_id int NULL
);

DROP TABLE IF EXISTS Prueba.dbo.ts_history;
CREATE TABLE Prueba.dbo.ts_history (
	
	tag_name varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	Value float NULL,
	date_time varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	ww_retrieval_mode varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	ww_resolution varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,

);

DROP TABLE IF EXISTS Prueba.dbo.ts_tag;
CREATE TABLE Prueba.dbo.ts_tag (
	
	tag_name varchar(100) COLLATE SQL_Latin1_General_CP1_CI_AS NULL,
	
);


INSERT INTO Prueba.dbo.Grgobject
(gobject_id, hierarchical_name, hosting_tree_level, area_gobject_id, hosted_by_gobject_id)
VALUES(1, 'Prueba1', '5', '555', 0);


INSERT INTO Prueba.dbo.ts_tag (tag_name) 
VALUES('ValuePrueba');

INSERT INTO Prueba.dbo.ts_tag (tag_name) 
VALUES('ValuePrueba2');

INSERT INTO Prueba.dbo.ts_history (tag_name,Value,date_time,ww_retrieval_mode,ww_resolution) 
VALUES('ValuePrueba',258,'2022-05-09 09:10:30.1000000','DELTA',651);
INSERT INTO Prueba.dbo.ts_history (tag_name,Value,date_time,ww_retrieval_mode,ww_resolution) 
VALUES('ValuePrueba',20,'2022-05-09 09:10:30.2000000','DELTA',7654);
INSERT INTO Prueba.dbo.ts_history (tag_name,Value,date_time,ww_retrieval_mode,ww_resolution) 
VALUES('ValuePrueba',258,'2022-05-09 09:10:30.3000000','DELTA',6874);
