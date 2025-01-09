select * from user;

-- login
select id, name from user where email = '1234@naver.com' and password = '1234';

-- update
update user set name="홍길동", gender="female"