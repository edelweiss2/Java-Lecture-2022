###########################################################
|                                                                    
|    데이터 정의 언어 (DDL: Data Definition Language)        
|                                                         
###########################################################

/*
*       1. Table 생성
*/
# 주소록 테이블 생성
CREATE TABLE if NOT EXISTS addrBook (
	num INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	`name` VARCHAR(4) NOT NULL,
	tel VARCHAR(14) NOT NULL,
	birthday DATE		
) AUTO_INCREMENT=101;    

# 고객 테이블 생성
CREATE TABLE if NOT EXISTS customer (
	uid VARCHAR(10) NOT NULL PRIMARY KEY,
	pwd CHAR(44) NOT NULL,			#암호화한 결과를 저장
	`name` VARCHAR(4) NOT NULL,
	email VARCHAR(20),
	regDate DATE DEFAULT (CURRENT_TIME),
	isDeleted INT DEFAULT 0
);

/*
    2. Table 조회
*/
# 데이터베이스 내의 테이블 목록조회
SHOW TABLES;

# 테이블의 구조 조회
DESC customer;

/*
    3. Table 삭제
*/
# Table test2 삭제
DROP TABLE test2;

# Table test의 내용만 없에고 싶을때 
TRUNCATE test;

/*
    4. Table 이름 변경 RENAME
*/

# koreanCity -> korCity
RENAME TABLE koreancity TO korCity;

/*
    5. Table 구조 변경 ALTER
*/
# customer 테이블에 tel 항목 추가
ALTER TABLE customer 
	ADD tel VARCHAR(14);

# customer 테이블에 tel 항목 삭제    
ALTER TABLE customer 
	DROP tel;

# customer 테이블 name 항목 다음에 tel 추가   
ALTER TABLE customer 
	ADD tel VARCHAR(14) AFTER `name`;

# customer 테이블 tel 항목 자료형에 not null 추가 
ALTER TABLE customer 
	CHANGE tel tel VARCHAR(14) NOT NULL;

/*
    5. View 생성
*/    
# 인구 700만 이상인 도시를 largecity 뷰 생성
CREATE VIEW largecity 
	AS SELECT * FROM city where population >= 9000000
	WITH CHECK OPTION;

# 서울의 인구를 8900000으로 변경하면 에러가 발생(체크옵션 위배)
update largecity set population=8900000 where id = 2331;

# city 테이블에서 변경하면 largecity에도 반영이 됨
update city set population=9900000 where id = 2331;

/*
    6. 
*/  