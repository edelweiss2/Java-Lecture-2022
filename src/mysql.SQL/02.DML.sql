###########################################################
#                                                                     
#    데이터 조작 언어 (DML: Data Manipulation Language)         
#                                          
###########################################################

/* 2.UPDATE  */
# Yong-in 시의 이름을 용인으로 변경
UPDATE city 
	SET `NAME` = '용인'
	WHERE ID = 2362

# Suwon  시의 이름을 수원으로 변경하고 인구도 100만으로 변경
UPDATE city 
	SET `NAME` = '수원', `Population` = 1000000
	WHERE ID = 2340;

# Kang-won의 이름을 강원도로 변경
UPDATE city SET district = '강원도'
	WHERE district = 'Kang-won';

/* 3.INSERT  */
# 속초시를 추가
INSERT INTO city (`Name`, CountryCode, District, Population)
	VALUES ('속초', 'KOR', '강원도', 100000);

INSERT INTO city
	VALUES (DEFAULT, '속초', 'KOR', '강원도', 100000);

# 여러 건의 데이터를 한번에 입력
# 경기도에 화성시와 의정부시를 추가
INSERT INTO city 
	VALUES (DEFAULT, '화성', 'KOR', 'Kyonggi', 500000),
			 (DEFAULT, '의정부', 'KOR', 'Kyonggi', 300000);

#대량 데이터 삽입
#국내 도시만으로 새로운 테이블 생성하고 기존 테이블 데이터로 채우기
CREATE TABLE if NOT EXISTS koreanCity LIKE city;
INSERT INTO koreanCity 
	SELECT * FROM city WHERE CountryCode = 'KOR';
        
/*  삭제  */

# ID값이 4081인 데이터값 삭제
DELETE FROM city WHERE id = 4081;

# id값이 4081 이상~ 4083 삭제
DELETE FROM koreancity
	WHERE id >= 4081 AND id <= 4083;

# 인구 10만 이하 삭제
DELETE FROM koreancity
	WHERE Population < 100000;
    
	