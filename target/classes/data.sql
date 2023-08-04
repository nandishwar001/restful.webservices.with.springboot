insert into user_details(id, birth_date, name) values(1001, current_date(), 'User1');

insert into user_details(id, birth_date, name) values(1002, current_date(), 'User2');

insert into user_details(id, birth_date, name) values(1003, current_date(), 'User3');

insert into post(id, description, user_id) values(2001, 'First Post', 1002);
insert into post(id, description, user_id) values(2002, 'Second Post', 1003);
insert into post(id, description, user_id) values(2003, 'Third Post', 1002);
insert into post(id, description, user_id) values(2004, 'Fourth Post', 1003);