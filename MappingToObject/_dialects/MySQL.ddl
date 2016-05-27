/*http://dev.mysql.com/doc/refman/5.7/en/data-types.html*/
CREATE TABLE Numeric_Types_table
(
    V_INT INT,
    V_INTEGER INTEGER,
    V_SMALLINT SMALLINT,
    V_TINYINT TINYINT,
    V_MEDIUMINT MEDIUMINT,
    V_BIGINT BIGINT,

    V_DECIMAL DECIMAL,
  V_NUMERIC NUMERIC,
  V_DECIMAL1 DECIMAL(5,2),

  V_FLOAT  FLOAT,
  V_DOUBLE DOUBLE,
  V_FLOAT1 FLOAT(7,4),
  V_REAL REAL(7,4),
  V_DOUBLE_PRECISION DOUBLE PRECISION,


  V_BIT BIT,
  V_BIT1 BIT(2),
  V_INT_ZEROFILL INT(4) ZEROFILL,
  V_INT_UNSIGNED INT  UNSIGNED,
  V_INT_AUTO_INCREMENT INT AUTO_INCREMENT,
  V_INT_NOT_NULL INT NOT NULL
);

CREATE TABLE Date_Time_Types_table
(
  V_DATE DATE,
  V_DATETIME DATETIME,
  V_TIMESTAMP TIMESTAMP,
  V_TIME TIME,
  V_YEAR YEAR,
  V_YEAR1 YEAR(2)
);

CREATE TABLE CURRENT_TIMESTAMP_Types_table (
  V_TIMESTAMP_DEFAULT_CURRENT_TIMESTAMP_ON_UPDATE  TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  V_DATETIME_DEFAULT_CURRENT_TIMESTAMP_ON_UPDATE DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  V_TIMESTAMP_DEFAULT_CURRENT_TIMESTAMP TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  V_DATETIME_DEFAULT_CURRENT_TIMESTAMP DATETIME DEFAULT CURRENT_TIMESTAMP,
  V_TIMESTAMP_DEFAULT_0 TIMESTAMP DEFAULT 0,
  V_DATETIME_DEFAULT_0 DATETIME DEFAULT 0,
  V_TIMESTAMP_DEFAULT_0_ON_UPDATE_CURRENT_TIMESTAMP TIMESTAMP DEFAULT 0 ON UPDATE CURRENT_TIMESTAMP,
  V_DATETIME_DEFAULT_0_ON_UPDATE_CURRENT_TIMESTAMP DATETIME DEFAULT 0 ON UPDATE CURRENT_TIMESTAMP,
  V_TIMESTAMP_ON_UPDATE_CURRENT_TIMESTAMP TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,     -- default 0
  V_TIMESTAMP_NULL_ON_UPDATE_CURRENT_TIMESTAMP TIMESTAMP NULL ON UPDATE CURRENT_TIMESTAMP, -- default NULL
  V_DATETIME_ON_UPDATE_CURRENT_TIMESTAMP DATETIME ON UPDATE CURRENT_TIMESTAMP,         -- default NULL
  V_DATETIME_NULL_ON_UPDATE_CURRENT_TIMESTAMP DATETIME NOT NULL ON UPDATE CURRENT_TIMESTAMP, -- default 0

  V_TIMESTAMP_NULL TIMESTAMP NULL,
  V_TIMESTAMP_NULL_DEFAULT_0 TIMESTAMP NULL DEFAULT 0,

  V_TIMESTAMP6_DEFAULT_CURRENT_TIMESTAMP6_ON_UPDATE TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),

  V_TIMESTAMP6_DEFAULT_CURRENT_TIMESTAMP3_ON_UPDATE TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP(3),
  V_TIMESTAMP_NULL_DEFAULT_0000 TIMESTAMP NULL DEFAULT '0000-00-00 00:00:00',
  V_TIMESTAMP_NULL_DEFAULT_NULL TIMESTAMP NULL DEFAULT NULL
);

CREATE TABLE String_Types_table
(
  V_CHAR CHAR,
  V_VARCHAR VARCHAR(255),
  V_BINARY BINARY ,
  V_VARBINARY VARBINARY(255),
  V_BLOB BLOB ,
  V_TEXT TEXT,

  V_LONG LONG,  /* should not be recognised!!! */
  V_LONGBLOB LONGBLOB,
  V_LONGTEXT LONGTEXT,

  V_MEDIUMBLOB MEDIUMBLOB,
  V_MEDIUMTEXT MEDIUMTEXT,

  V_ENUM ENUM('x-small', 'small', 'medium', 'large', 'x-large'),
  V_SET SET('one', 'two')

);

CREATE TABLE Spatial_Types_table
(
  V_GEOMETRY GEOMETRY,
  V_POINT  POINT,
  V_LINESTRING LINESTRING,
  V_POLYGON POLYGON,
  V_MULTIPOINT MULTIPOINT,
  V_MULTILINESTRING MULTILINESTRING,
  V_MULTIPOLYGON MULTIPOLYGON,
  V_GEOMETRYCOLLECTION GEOMETRYCOLLECTION

);

CREATE TABLE geom_Example (
  g GEOMETRY NOT NULL,
  SPATIAL INDEX(g)
)ENGINE=MyISAM;



CREATE TABLE JSON_Types_table (
  V_JSON JSON,
  V_INT INT
);
INSERT INTO JSON_Types_table VALUES ("[3,10,5,17,44]", 33), ("[3,10,5,17,[22,44,66]]", 0);

