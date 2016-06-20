DROP DATABASE test_case;
CREATE DATABASE test_case;

USE test_case;

SET foreign_key_checks = 0;

CREATE TABLE `USERS` (
  `ID`              INT(6)       NOT NULL AUTO_INCREMENT,
  `USERNAME`        VARCHAR(50)  NOT NULL,
  `PASSWORD`        VARCHAR(500) NOT NULL,
  `MOBILE`          VARCHAR(50)           DEFAULT NULL,
  `EMAIL`           VARCHAR(50)           DEFAULT NULL,
  `ADDRESS`         VARCHAR(500)          DEFAULT NULL,
  `PRICE`           DOUBLE                DEFAULT '0',
  `ENABLED`         TINYINT(1)   NOT NULL,
  `LAST_LOGIN`      DATETIME              DEFAULT NULL,
  `REGISTER_TIME`   DATETIME              DEFAULT NULL,
  `COORDS`          VARCHAR(500)          DEFAULT NULL,
  `GENDER`          TINYINT(2)            DEFAULT NULL,
  `LAST_LOGIN_IP`   VARCHAR(45)           DEFAULT NULL,
  `ADDS_PRICE`      DOUBLE                DEFAULT NULL,
  `TOTAL_DISPLAY`   INT(10)               DEFAULT NULL,
  `ADD_WEIGHT`      INT(4)                DEFAULT NULL,
  `DETAIL`          TEXT,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `USERNAME` (`USERNAME`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_turkish_ci;

SET foreign_key_checks = 1;
