use activity1;
INSERT INTO movie VALUES (201,'Bahubali-The_Beginning','Prabhas','Tamannah','2015/07/10','Telugu',21,'Drama_Fantasy',9091);
INSERT INTO movie VALUES (501,'2.0','Rajnikanth','Amy','2018/11/29','Tamil','20','Scientific',8892);
INSERT INTO movie VALUES (577,'Aval','Siddharth','Andrea','2017/11/3','Tamil','14','Horror',1899);
INSERT INTO movie VALUES (101,'Holiday','Akshay Kumar','Sonakshi','2014/6/6','Hindi','15','Crime Thriller',1010);
INSERT INTO movie VALUES (151,'Zero','Shah ruck','Katrina Kaif','2018/12/21','Hindi','16','Scientific',1988);
INSERT INTO movie VALUES (131,'Padmavaat','Shahid Kapoor','Deepika Padukone','2018/1/25','Hindi','21','Drama Epic',1899);
INSERT INTO movie VALUES (146,'Andhadhun','Ayushmann','Radika Apte','2018/10/5','Hindi','16','Crime Thriller',1899);
INSERT INTO movie VALUES (231,'Bharath Ane nenu','Mahesh Babu',	'Kiara'	,'2018/4/20','Telugu',15,'Thriller',7882);
INSERT INTO movie VALUES (244,'Gruham ',' Siddharth','Andrea','2018/11/17','Telugu',14,'Horror',1899);
INSERT INTO movie VALUES (337,'K G F chapter 1','Yash','Srinithi Shetty','2018/12/21','Kannada',21,'Action Thriller',6773);
INSERT INTO movie VALUES (136,'	Badhaai Ho','Ayushmann','Neena','2018/10/18','Hindi',14,'Drama Comedy',1854);
INSERT INTO movie VALUES (441,'The Villain'	,'Sudeep','Amy','2018/10/18','Kannada',16,'Drama',2341);
INSERT INTO movie VALUES (206,'	Maryada Ramanna','Sunil','Saloni','2010/7/23','Telugu',19,'Drama',	9091);
INSERT INTO movie VALUES (211,'	Khaidi No. 150','chiranjeevi','Kajal','2017/1/1','Telugu',20,'Drama Thriller',8892);
INSERT INTO movie VALUES (188,'Rangoon','Saif Ali Khan','Kangana','2017/2/2','Hindi',	15,'Drama',1899);
INSERT INTO movie VALUES (189,'The House Next Door','Siddharth','Andrea','2017/11/10','Hindi',14,'Horror',1899);


SELECT * FROM movie;
/*Question1*/
select Moviename FROM movie WHERE MovieType='Drama';
/*Question2*/
select Moviename FROM movie where Heroname='Ayushmann';
/*Question3*/
SELECT COUNT(Moviename) FROM movie WHERE Length>18;
/*Question4*/
SELECT Moviename FROM movie WHERE Length=(select min(Length) from movie);

/*Question5*/
SELECT * FROM movie Where Moviename LIKE'T%';
/*Question6*/
SELECT Moviename FROM movie WHERE Length=(select max(Length) from movie);
/*Question7*/
SELECT Moviename,Heroname,Heroinename FROM movie WHERE ReleaseDate>'2018/03/15';
/*Question8*/
SELECT COUNT(Moviename) FROM movie WHERE MovieType='Thriller';
/*Question9*/
SELECT COUNT(Moviename) FROM movie WHERE ReleaseDate<'2018/03/15';
/*Question10*/
SELECT ReleaseDate FROM movie WHERE Moviename='Zero';
/*Question11*/
SELECT Heroname FROM movie WHERE Heroinename='Amy';
/*Question12*/
SELECT COUNT(Moviename) FROM movie WHERE ReleaseDate LIKE'%/10/%';

/*ADVANCED QUERY*/
/*Question1*/
SELECT productions.ProductionName, movie.Production_id, count(Moviename) AS Total_Movies FROM productions JOIN movie ON productions.Production_id=movie.Production_id group by Production_id;
/*Question2*/
SELECT productions.ProductionName, productions.Ownername FROM production INNER JOIN movie ON movie.Productionid=productions.Production_id group by movie.Productionid HAVING count(Moviename)>2;
 /*Question3*/
SELECT productions.Production_id ,productions.Ownername, count(movie.Production_id) FROM productions JOIN movie ON productions.Production_id = movie.Production_id group by movie.Production_id ORDER BY count(productions.Production_id) DESC LIMIT 1;
/*Question4*/
SELECT movie.Moviename,movie.Heroname,productions.ProductionName FROM movie JOIN productions ON movie.Production_id=productions.Production_id WHERE productions.Ownername="Subaskaran";
/*Question5*/
SELECT movie.Moviename,movie.Heroname FROM movie JOIN productions ON movie.Production_id=productions.Production_id WHERE movie.Production_id like"%82";
/*qUESTION6*/
SELECT productions.Productionname, productions.Ownername FROM Productions JOIN movie ON productions.Production_id=movie.Production_id GROUP BY productions.Production_id HAVING count(movie.Moviename)=0;
/*Question7*/
SELECT productions.Productionname, productions.Ownername FROM Productions JOIN movie ON productions.Production_id=movie.Production_id WHERE movie.Language!='Hindi';
/*Question8*/
/*Question9*/
select distinct Heroname ,Language , count(Heroname) as result from  movie group by(Language) order by (result)  ;

 select Distinct p.Productionname,p.Ownername ,count(p.Productionname) as counter  from  movie as m right join productions as p ON  m.production_id =p.production_id  group by(m.Language) order by(counter) desc limit 1;
 /*Question11*/
  select p.Ownername ,p.Productionname from  movie as m right join productions as p ON  m.production_id =p.production_id where m.moviename is  null ;