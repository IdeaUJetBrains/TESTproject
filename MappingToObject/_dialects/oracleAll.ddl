/* https://docs.oracle.com/cd/B28359_01/server.111/b28318/datatype.htm */
CREATE TABLE BUGS_Types_table
(
  V_DATE DATE,
  V_VARCHAR2 VARCHAR2(20),
  V_NVARCHAR2 NVARCHAR2(20)

);
CREATE TABLE LOB_table
(
  V_NCLOB NCLOB,
  V_BLOB BLOB,
  V_CLOB CLOB,
  V_BFILE BFILE
);
CREATE TABLE Numeric_Types_table
(
  V_NUMBER NUMBER,
  V_FLOAT FLOAT,
  V_BINARY_FLOAT BINARY_FLOAT,
  V_BINARY_DOUBLE BINARY_DOUBLE,
  V_LONG LONG,
  V_RAW RAW(20),
  V_LONG_RAW LONG RAW


);
CREATE TABLE Character_Types_table
(
  V_CHARACTER CHARACTER(255),
  V_CHAR CHAR,
  V_VARCHAR VARCHAR(255),
  V_VARCHAR2 VARCHAR2(255),
  V_NCHAR NCHAR(30),
  V_NVARCHAR2 NVARCHAR2(255)

);

CREATE TABLE time_table
(
  V_DATE DATE,
  V_TIMESTAMP TIMESTAMP,
  V_TIMESTAMP_W_TIME_ZONE TIMESTAMP WITH TIME ZONE,
  V_TIMESTAMP_W_LOCAL_TIME_ZONE TIMESTAMP WITH LOCAL TIME ZONE,
  V_INTERVAL_YEAR_TO_MONTH INTERVAL YEAR TO MONTH,
  V_INTERVAL_DAY_TO_SECOND INTERVAL DAY (6) TO SECOND (5)
);

CREATE TABLE ROWID_Types_table
(
  V_ROWID ROWID,
  V_UROWID UROWID(50)
);



CREATE TABLE XML_Types_table
(
  V_XMLTYPE XMLTYPE,
  V_UriType UriType,
  V_XDBURITYPE XDBURITYPE,
  V_DBURITYPE DBURITYPE,
  V_HTTPURITYPE HTTPURITYPE

);


CREATE TABLE Spatial_Types_table
(
  V_SDO_GEOMETRY SDO_GEOMETRY,
  V_SDO_GEORASTER SDO_GEORASTER,
  V_SDO_TOPO_GEOMETRY SDO_TOPO_GEOMETRY

);

CREATE TABLE Media_types_table
(
  V_ORDDICOM ORDDICOM,
  V_ORDDOC ORDDOC,
  V_ORDAUDIO ORDAUDIO,
  V_ORDIMAGE ORDIMAGE,
  V_ORDVIDEO ORDVIDEO
  /*V_ORDImageSignature ORDImageSignature  - depricated */

);
CREATE TABLE Still_image_object_types_table
(
  V_SI_AVERAGECOLOR SI_AVERAGECOLOR,
  V_SI_COLOR SI_COLOR,
  V_SI_COLORHISTOGRAM SI_COLORHISTOGRAM,
  V_SI_FEATURELIST SI_FEATURELIST,
  V_SI_POSITIONALCOLOR SI_POSITIONALCOLOR,
  V_SI_STILLIMAGE SI_STILLIMAGE,
  V_SI_TEXTURE SI_TEXTURE

);
CREATE TABLE EXPRESSION_Type_table
(
  V_EXPRESSION EXPRESSION
);

CREATE TABLE ANSI_SQL_Datatypes_OracleRecognizes_table
(
  V_NATIONAL_CHAR_VARYING NATIONAL CHAR VARYING,
  V_NCHAR_VARYING NCHAR VARYING(255),
  V_NATIONAL_CHARACTER_VARYING NATIONAL CHARACTER VARYING(255),
  V_NATIONAL_CHAR NATIONAL CHAR(255),


  V_NUMERIC NUMERIC,
  V_DECIMAL DECIMAL,
  V_int int,
  V_INTEGER INTEGER,
  V_SMALLINT SMALLINT,

  V_DOUBLE_PRECISION DOUBLE PRECISION,
  V_REAL REAL,

  V_DEC DEC
);

