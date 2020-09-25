INSERT INTO T_USER VALUES ( 'guest1' , '1234' ,'guest1', 'guest1', '인천시','계양구','용종동' , now(), now() , 'N' , NULL ) ; 
INSERT INTO T_USER_TOKEN values ('guest1','abcef',now());

INSERT INTO T_USER VALUES ( 'guest2' , '1234' ,'guest2', 'guest2', '인천시','계양구','용종동' , now(), now() , 'N' , NULL ) ;
INSERT INTO T_USER_TOKEN values ('guest2','accef',now());

INSERT INTO T_USER_FRIEND VALUES ('guest1','guest2','guest2' , now(),now());
INSERT INTO T_USER_FRIEND VALUES ('guest2','guest1','guest1' , now(),now());

INSERT INTO T_GROUP VALUES ('group1','group1',now(),now());

INSERT INTO T_USER_GROUP VALUES ( 'guest1','group1','group1',now(),now());

INSERT INTO T_CATEGORY VALUES ( 'category1' , 'TOP' , 'category1' , 1, now(),now(),'N',null);
INSERT INTO T_CATEGORY VALUES ( 'cate1' , 'category1' , 'cate1' , 2, now(),now(),'N',null);

INSERT INTO T_USER_CATEGORY VALUES ( 'guest1' , 'cate1' ,now() );

