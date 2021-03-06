CREATE TABLE PUBLIC.BUSSDRIVERS
(
    BUSSID int,
    DRIVERID int,

    VAR1 FLOAT,

    VAR1 CHAR,
    VAR1 NCHAR(30),
    VAR1 VARCHAR(20),
    VAR1 VARCHAR2(20),
    VAR1 NVARCHAR2(20),
    VAR1 NUMBER,
    VAR1 BINARY_FLOAT,
    VAR1 BINARY_DOUBLE,
    VAR1 DATE ,
    VAR1 TIMESTAMP,
    VAR1 TIMESTAMP WITH TIME ZONE,
    VAR1 TIMESTAMP WITH LOCAL TIME ZONE,
    VAR1 INTERVAL YEAR TO MONTH,
    VAR1 INTERVAL DAY TO SECOND,
    VAR1 LONG ,
    VAR1 NCLOB,
    VAR1 BLOB,
    VAR1 CLOB,

    VAR1 BFILE ,
    VAR1 RAW(20),
    VAR1 LONG RAW,
    VAR1 ROWID,
    VAR1 UROWID

);

CREATE TABLE time_table
(start_time    TIMESTAMP,
 duration_1    INTERVAL DAY (6) TO SECOND (5),
 duration_2    INTERVAL YEAR TO MONTH
);