DROP TABLE T_USER ; 
CREATE TABLE T_USER (
	USER_ID VARCHAR(100) PRIMARY KEY , 
    USER_PW VARCHAR(100)
) ; 

DROP TABLE T_USER_TOKEN ; 
CREATE TABLE T_USER_TOKEN (
	USER_ID VARCHAR(100) , 
	USER_TOKEN VARCHAR(100) ,
	PRIMARY KEY ( USER_ID , USER_TOKEN )
) ; 