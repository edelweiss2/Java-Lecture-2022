####################
|                                                                    
|    Table Join      
|                                                         
####################


/*
    1. 테이블 조인
*/

# song Table
CREATE TABLE if NOT EXISTS	song (
	sid INT PRIMARY KEY AUTO_INCREMENT,
	title VARCHAR(32) NOT NULL,
	lyrics VARCHAR(100)
) AUTO_INCREMENT = 101;

# girlgroup Table
CREATE TABLE if NOT EXISTS	girlgroup (
	gid INT PRIMARY KEY AUTO_INCREMENT, 
	`NAME` VARCHAR(32) NOT NULL,
	debut DATE NOT NULL,
	hitSongid INT 
) AUTO_INCREMENT = 1001;

/*
    2. 데이터 입력
*/

# Song Table
INSERT INTO song (title, lyrics) 
	VALUES ('Tell Me', 'tell me tell me tetetete tel me'),
	('Gee', 'GEE GEE GEE GEE GEE BABY BABY'),
	('미스터', '이름이 뭐야 미스터'), 
	('Abracadabra', '이러다 미쳐 내가 여리여리'),
	('8282', 'Give me a call Baby baby'), ('기대해', '기대해'),
	('I Dont care', '다른 여자들의 다리를'), 
	('Bad Girl Good Girl', '앞에선 한 마디 말도'), ('피노키오', '뉴예삐오'),
	('별빛달빛', '너는 내 별빛 내 마음의 별빛'), 
	('A', 'A 워오우 워오우워 우우우'),
	('나혼자', '나 혼자 밥을 먹고 나 혼자 영화 보고'), ('LUV', '설레이나요 '),
	('짧은치마', '짧은 치마를 입고 내가 길을 걸으면'),
	('위아래', '위 아래 위위 아래'), ('Dumb Dumb', '너 땜에 하루종일');

# girlgroup Table
INSERT INTO girlgroup (name, debut, hitsongid) 
	VALUES ('원더걸스', '2007-02-10', 101),
	('소녀시대', '2007-08-02', 102), ('카라', '2009-07-30', 103),
	('브라운아이드걸스', '2008-01-17', 104), ('다비치', '2009-02-27', 105),
	('2NE1', '2009-07-08', 106), ('f(x)', '2011-04-20', 108),
	('시크릿', '2011-01-06', 109), ('레인보우', '2010-08-12', 110),
	('애프터 스쿨', '2009-11-25', 120), ('포미닛', '2009-08-28', 121);

/*
    3. inner join 
*/

# Inner Join
SELECT r.`name`, r.debut, l.title, l.lyrics FROM song AS l 
	JOIN girlgroup AS r
	ON l.sid = r.hitSongid;

# Left Outer Join 
SELECT r.`name`, r.debut, l.title, l.lyrics
	FROM song AS l 
	left outer JOIN girlgroup AS r
	ON l.sid = r.hitSongid;

# Right Outer Join 
SELECT r.`name`, r.debut, l.title, l.lyrics
	FROM song AS l 
	right outer JOIN girlgroup AS r
	ON l.sid = r.hitSongid;    

# Full Outer Join  /* mysql은 full outer join을 지원하지않지만 union으로 가능 */
SELECT r.`name`, r.debut, l.title, l.lyrics
	FROM song AS l 
	left outer JOIN girlgroup AS r
	ON l.sid = r.hitSongid
UNION
SELECT r.`name`, r.debut, l.title, l.lyrics
	FROM song AS l 
	right outer JOIN girlgroup AS r
	ON l.sid = r.hitSongid;

# 데뷔일자가 빠른 5개 걸그룹의 히트송은? (그룹명, 곡명, 데뷔일자)
SELECT l.NAME, r.title, l.debut FROM girlgroup AS l
	JOIN song AS r
	ON l.hitSongid = r.sid
	ORDER BY l.debut DESC
	LIMIT 5;

# 2009년에 데뷔한 걸그룹의 히트송은?
# 걸그룹 이름, 데뷔일, 히트송
SELECT r.`NAME`, r.debut, r.hitSongid FROM song AS l
	JOIN girlgroup AS r
	ON l.sid = r.hitSongid
	WHERE r.debut BETWEEN DATE('2009-01-01') AND DATE('2009-12-31');
	    


	