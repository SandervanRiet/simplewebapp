insert into STARTING_POINT (
    ID,STARTING_POINT_NAME,MAXIMUM_MOTORCYCLES,INFORMATION,
    CITY,PUB_NEARBY,FOODSHOP_NEARBY)
values (
           1, 'scheve kerk', 100 , 'groot plein naast scheve kerk',
           'schelle',true , false );
insert into STARTING_POINT (
    ID,STARTING_POINT_NAME,MAXIMUM_MOTORCYCLES,INFORMATION,
    CITY,PUB_NEARBY,FOODSHOP_NEARBY)
values (
           2, 'scheve kerk', 100 , 'groot plein naast scheve kerk',
           'schelle',true , false );
insert into STARTING_POINT (
    ID,STARTING_POINT_NAME,MAXIMUM_MOTORCYCLES,INFORMATION,
    CITY,PUB_NEARBY,FOODSHOP_NEARBY)
values (
           3, 'scheve kerk', 100 , 'groot plein naast scheve kerk',
           'schelle',true , false );
insert into STARTING_POINT (
    ID,STARTING_POINT_NAME,MAXIMUM_MOTORCYCLES,INFORMATION,
    CITY,PUB_NEARBY,FOODSHOP_NEARBY)
values (
           4, 'scheve kerk', 100 , 'groot plein naast scheve kerk',
           'schelle',true , false );
insert into STARTING_POINT (
    ID,STARTING_POINT_NAME,MAXIMUM_MOTORCYCLES,INFORMATION,
    CITY,PUB_NEARBY,FOODSHOP_NEARBY)
values (
           5, 'scheve kerk', 100 , 'groot plein naast scheve kerk',
           'schelle',true , false );
insert into STARTING_POINT (
    ID,STARTING_POINT_NAME,MAXIMUM_MOTORCYCLES,INFORMATION,
    CITY,PUB_NEARBY,FOODSHOP_NEARBY)
values (
           6, 'scheve kerk', 100 , 'groot plein naast scheve kerk',
           'schelle',true , false );


insert into RIDE (
    ID, NAME, END_POINT,
    INFO, DATE ,TIME, DISTANCE_FROM_ANTWERP_IN_KM,STARTING_POINT_ID)
values (
           nextval('RIDE_SEQ'), 'De Roma', 'Niel',
           'leuke rit in de hood','2021-04-3' , '22:00' , 100, 2);
insert into RIDE (
    ID, NAME, END_POINT,
    INFO, DATE ,TIME, DISTANCE_FROM_ANTWERP_IN_KM,STARTING_POINT_ID)
values (
           nextval('RIDE_SEQ'), 'De Roma', 'Niel',
           'leuke rit in de hood','2021-04-3' , '22:00' , 50, 1);
insert into RIDE (
    ID, NAME, END_POINT,
    INFO, DATE ,TIME, DISTANCE_FROM_ANTWERP_IN_KM,STARTING_POINT_ID)
values (
           nextval('RIDE_SEQ'), 'De Roma', 'Niel',
           'leuke rit in de hood','2021-04-3' , '22:00' , 30, 4);
insert into RIDE (
    ID, NAME, END_POINT,
    INFO, DATE ,TIME, DISTANCE_FROM_ANTWERP_IN_KM,STARTING_POINT_ID)
values (
           nextval('RIDE_SEQ'), 'De Roma', 'Niel',
           'leuke rit in de hood','2021-04-3' , '22:00' ,150, 1);
insert into RIDE (
    ID, NAME, END_POINT,
    INFO, DATE ,TIME, DISTANCE_FROM_ANTWERP_IN_KM,STARTING_POINT_ID)
values (
           nextval('RIDE_SEQ'), 'De Roma', 'Niel',
           'leuke rit in de hood','2021-04-3' , '22:00' , 60, 2);


