create table IF NOT EXISTS ref_status
(
    code        varchar(255) not null
        primary key,
    description varchar(255),
    label       varchar(255)
);