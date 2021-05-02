CREATE DATABASE dbStudy;
CREATE TABLE STUDENTS(
                         PERSON_ID INTEGER,
                         FIRST_NAME VARCHAR(30) NOT NULL,
                         SECOND_NAME VARCHAR(30) NOT NULL,
                         LAST_NAME VARCHAR(30) NOT NULL,
                         BIRTH_DAY DATE NOT NULL,
                         CLASS VARCHAR(30),
                         PRIMARY KEY (PERSON_ID)
);