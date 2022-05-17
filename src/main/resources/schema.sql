DROP TABLE IF EXISTS survey_details;
create table survey_details(
    id int auto_increment primary key,
    first_name varchar(100) not null,
    last_name varchar(100) not null,
    email varchar(100) not null,
    telephone_number varchar(10) not null,
    street_address varchar(100) not null,
    city varchar(100) not null,
    state varchar(100) not null,
    zip varchar(10) not null,
    date_of_survey date not null,
    most_liked varchar(100),
    interested_in varchar(20),
    recommending varchar(100),
    additional_comments varchar(100)
);