insert into author(id, first_name, last_name) values(1, 'Will', 'Tan');
insert into post(id, title, body, author_id, posted_on) values(1, 'Title 1', 'Body 1', 1, CURRENT_DATE());
insert into post(id, title, body, author_id, posted_on) values(2, 'Title 2', 'Body 2', 1, CURRENT_DATE());