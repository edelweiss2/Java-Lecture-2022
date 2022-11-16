/*
    데이터 조작 언어 (DML : Data Manipulate Language)
*/
USE world;      # 사용할 데이터베이스 선택
SHOW TABLES;    # 
DESC city;

/*
SELECT 필드명  FROM 테이블명
    WHERE 조건
    GROUP BY 필드명
    HAVING 그룹조건
    ORDER BY 필드명 순서
    LIMIT 숫자 OFFSET 숫자;
*/

SELECT * FROM city;
SELECT `Name`, Population FROM city;
SELECT NOW();

/* 조회 조건 */
SELECT * FROM city WHERE countrycode ='KOR';   # 국내 도시 조회
SELECT `Name`, District, Population FROM city WHERE countrycode ='KOR';   

SELECT `Name`, District, Population FROM city
	 WHERE countrycode = 'KOR' AND Population > 1000000;

SELECT DISTINCT District FROM city  #distinct - 고유한
	WHERE countrycode='KOR';			#대한민국 광역도시명     

# 수도권 (서울, 인천, 경기) 도시 찾아보기
SELECT * FROM city
	WHERE District='Seoul'
	 OR District='Inchon' OR district='Kyonggi';

SELECT * FROM city
	WHERE id % 100 = 0;     

# 국내 인구수 100만 이상 도시중 인구가 홀수인 도시
SELECT * FROM city
	WHERE countrycode = 'KOR' 
	AND Population >= 1000000 = 0
	AND population % 2 = 1;

# 국내 인구수 50만에서 100만 사이
SELECT * FROM city
	WHERE countrycode = 'KOR' 
	AND Population >= 500000
	AND population <= 1000000;

# 충청 남북도의 도시 
SELECT * FROM city
	WHERE countrycode = 'KOR' 
	AND district like 'Chungchong%'; 

/* 순서 */ 

# 전세계 인구 800만 이상인 도시를 내림차순으로 조회
SELECT * FROM city
	WHERE population >= 8000000 
	ORDER BY population DESC;  #descending

# 한국에서 100만 이상 도시를 내림차순
SELECT * FROM city
	WHERE population >= 1000000 AND countrycode ='KOR'
	ORDER BY District;    

#한국에서 50만 이상인 도시를 광역시도 오름차순, 인구수 내림차순으로
SELECT * FROM city
	WHERE population >= 500000 AND countrycode ='KOR'
	ORDER BY District ASC, population DESC;  # ASC(ASCENDING) 생략가능

/* 갯수 */
# 전세계 인구 top 10
SELECT * FROM city	
	ORDER BY population DESC
	LIMIT 10; 

# 국내인구 top 5
SELECT * FROM city	
	WHERE countrycode = 'KOR'
	ORDER BY population DESC
	LIMIT 5; 

# 국내 인구수 11~20위 도시
SELECT * FROM city	
	WHERE countrycode = 'KOR'
	ORDER BY population DESC
	LIMIT 10 OFFSET 10;     # 앞 10개를 건너뛰고 (offset) 10개를 선택한것

/* 함수 */
# 국내 도시의 개수
SELECT COUNT(*) FROM city
	WHERE countrycode = 'kor';

# 국내 도시의 평균 인구수
SELECT ROUND(avg(population)) FROM city
	WHERE countrycode = 'kor';    

# 국내 도시의 최대, 최소 인구수
SELECT MAX(population), MIN(population) FROM city  
	WHERE countrycode = 'KOR';

/* 그룹 */
# 경기도의 도시 이름
SELECT GROUP_CONCAT(`Name`) FROM city
	 WHERE district = 'Kyonggi';

# 국내 광역시도 이름
SELECT GROUP_CONCAT(District) FROM city
	 WHERE countrycode = 'kor';

# 국내 광역시도의 인구수 합계를 내림차순으로 정렬
SELECT district, SUM(population) FROM city  
	WHERE countrycode = 'KOR'
	GROUP BY district
	ORDER BY SUM(population) DESC;

# 국가별 도시의 개수가 많은 나라 Top 10
SELECT countrycode, COUNT(*) FROM city
	GROUP BY countrycode
	ORDER BY COUNT(*) DES
	LIMIT 10;

# 국내 도시의 개수가 5개 이상인 도 의 인구수 평균
SELECT district, ROUND(AVG(population)), COUNT(*) FROM city
	WHERE countrycode = 'kor'
	GROUP BY district
	HAVING COUNT(*) >= 5;

# 국내 도시의 개수가 5개 이상인 도의 인구수 평균을 인구수 평균의 내림차순으로 정렬 
SELECT district, ROUND(AVG(population)), COUNT(*) FROM city
	WHERE countrycode = 'kor'
	GROUP BY district
	HAVING COUNT(*) >= 5
	ORDER BY(population) DESC;

# 도시의 개수가 100개 이상인 국가의 인구수 평균을 인구수 평균의 내림차순으로 정렬 
SELECT countrycode, ROUND(AVG(population)), COUNT(*) FROM city
	GROUP BY countrycode
	HAVING COUNT(*) >= 100
	ORDER BY(population) DESC;

# 대륙별 면적, 평균 GNP, 국가의 숫자
SELECT continent, SUM(SurfaceArea), ROUND(AVG(gnp)), COUNT(*) FROM country
	 GROUP BY continent;

/* Join  두개의 테이블을 하나로 */
#도시의 개수가 많은 나라 Top 10
SELECT country.name, city.countrycode, count(*) FROM city
     JOIN country
     ON city.countrycode = country.code
     GROUP BY countrycode
     ORDER BY count(*) DESC
     LIMIT 10;

# 인구가 많은 도시의 Top10의 국가명과 도시명과 인구수
SELECT r.name, l.name, l.Population FROM city AS l
	JOIN country AS r
	ON l.CountryCode = r.CountryCode
	ORDER BY l.population DESC
	LIMIT 10; 

# 아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 정렬
# 			대륙명, 국가명, 도시명, 인구 수 표시
SELECT r.continent, r.Name AS `country`, l.Name AS `city`, l.Population
	FROM city AS l
	JOIN country AS r
	ON l.countrycode = r.code
	WHERE r.Continent = 'asia'
	ORDER BY l.Population DESC
	LIMIT 10; 

# 우리나라의 공식 언어는?
SELECT `Language`, countrycode FROM countrylanguage
	WHERE CountryCode = 'KOR' 
	AND isOfficial = TRUE;

# 아시아 국가의 국가명과 공식 언어
SELECT r.Name, language FROM countrylanguage AS l
	JOIN country AS r
	ON l.countrycode = r.code
	WHERE r.Continent = 'asia'
	AND isofficial = TRUE;

