INSERT INTO USER
(ID, username, password, role)
VALUES
    (nextval('USER_SEQ'), 'admin', '$2a$10$6kVdS9/B1qoZfREQTn.Kauu7wUdEn6PrCbLN41PhezNTXE04KlG62', 'ROLE_ADMIN');
INSERT INTO USER
(ID, username, password, role)
VALUES
    (nextval('USER_SEQ'), 'Jefke', '$2a$10$Wsh4ZHBvq2oDA0QV8phPKe4zSaRrXZkbrXFiY0SddEZVXImDrceXa', 'ROLE_USER');
insert into STARTING_POINT (
    ID,STARTING_POINT_NAME,MAXIMUM_MOTORCYCLES,INFORMATION,
    CITY,PUB_NEARBY,FOODSHOP_NEARBY)
values (
           1, 'Scheve kerk', 100 , 'Groot plein naast scheve kerk',
           'Schelle',true , false );
insert into STARTING_POINT (
    ID,STARTING_POINT_NAME,MAXIMUM_MOTORCYCLES,INFORMATION,
    CITY,PUB_NEARBY,FOODSHOP_NEARBY)
values (
           2, 'De schorre', 200 , 'Parkeerterrein naast de schorre',
           'Boom',false , false );
insert into STARTING_POINT (
    ID,STARTING_POINT_NAME,MAXIMUM_MOTORCYCLES,INFORMATION,
    CITY,PUB_NEARBY,FOODSHOP_NEARBY)
values (
           3, 'Heldenplaats', 50 , 'Groot plein in de buurt van school olvi',
           'Boom',false , true );
insert into STARTING_POINT (
    ID,STARTING_POINT_NAME,MAXIMUM_MOTORCYCLES,INFORMATION,
    CITY,PUB_NEARBY,FOODSHOP_NEARBY)
values (
           4, 'Sporthal', 15 , 'Parking voor het zwembad',
           'Hemiksem',false , false );
insert into STARTING_POINT (
    ID,STARTING_POINT_NAME,MAXIMUM_MOTORCYCLES,INFORMATION,
    CITY,PUB_NEARBY,FOODSHOP_NEARBY)
values (
           5, 'Gemeentehuis', 25 , 'Parking naast het gemeentehuis en kerk',
           'Kontich',true , true );
insert into STARTING_POINT (
    ID,STARTING_POINT_NAME,MAXIMUM_MOTORCYCLES,INFORMATION,
    CITY,PUB_NEARBY,FOODSHOP_NEARBY)
values (
           6, 'De bist', 50 , 'Groot parkeerterein in het centrum van Wilrijk',
           'Wilrijk',true , true );

insert into RIDE (
    ID, NAME, END_POINT,
    INFO, DATE ,TIME, DISTANCE_FROM_ANTWERP_IN_KM,STARTING_POINT_ID)
values (
           nextval('RIDE_SEQ'), 'Uitstapje rupelstreek', 'Niel',
           'Leuke rit door de rupelstreek','2022-06-3' , '10:00' , 70, 2);
insert into RIDE (
    ID, NAME, END_POINT,
    INFO, DATE ,TIME, DISTANCE_FROM_ANTWERP_IN_KM,STARTING_POINT_ID)
values (
           nextval('RIDE_SEQ'), 'Rondje Schelde', 'Antwerpen',
           'Leuke rit langs de Schelde','2022-07-19' , '08:00' , 0, 1);
insert into RIDE (
    ID, NAME, END_POINT,
    INFO, DATE ,TIME, DISTANCE_FROM_ANTWERP_IN_KM,STARTING_POINT_ID)
values (
           nextval('RIDE_SEQ'), 'Tocht Geraardsbergen', 'Geraardsbergen',
           'Leuke rit van Hemiksem naar Geraardsbergen','2022-08-23' , '12:00' ,50, 4);
insert into RIDE (
    ID, NAME, END_POINT,
    INFO, DATE ,TIME, DISTANCE_FROM_ANTWERP_IN_KM,STARTING_POINT_ID)
values (
           nextval('RIDE_SEQ'), 'Ronde Limburg', 'Tongeren',
           'Leuke rit door heel Limburg','2021-09-28' , '14:00' ,110, 1);
insert into RIDE (
    ID, NAME, END_POINT,
    INFO, DATE ,TIME, DISTANCE_FROM_ANTWERP_IN_KM,STARTING_POINT_ID)
values (
           nextval('RIDE_SEQ'), 'Dagje Ardennen', 'Ardennen',
           'Leuke rit richting de Ardennen','2021-10-15' , '11:00' , 100, 3);
insert into RIDE (
    ID, NAME, END_POINT,
    INFO, DATE ,TIME, DISTANCE_FROM_ANTWERP_IN_KM,STARTING_POINT_ID)
values (
           nextval('RIDE_SEQ'), 'Dagje Nederland', 'Amsterdam',
           'Leuke rit richting Nederland naar Amsterdam','2021-11-5' , '08:00' , 160, 5);
insert into RIDE (
    ID, NAME, END_POINT,
    INFO, DATE ,TIME, DISTANCE_FROM_ANTWERP_IN_KM,STARTING_POINT_ID)
values (
           nextval('RIDE_SEQ'), 'tour Normandie', 'Lieury',
           'Leuke rit richting Frankrijk naar Lieury','2021-12-1' , '11:00' , 500, 6);

