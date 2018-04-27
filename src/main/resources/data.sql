insert into user (username, password, enabled, name, surname, email, img, description) values ('admin', '$2a$10$Pu2BzhYFCasFG4ddvJUjS.CjsnZomjiIX5Hj6jMvTWErSgiYsqFS.', true, 'Jan', 'Kowalski', 'jan@kowalski.pl', 'https://banner.kisspng.com/20180402/bje/kisspng-computer-icons-avatar-login-user-avatar-5ac207e69ecd41.2588125315226654466505.jpg', 'Jestem adminem tego portalu i bla bla bla');
insert into user (username, password, enabled, name, surname, email, img, description) values ('ania', '$2a$10$9SjNyDaTpPR7EhBf51ERH.m8pk.PNPouXQSMpNK28wS0F6wHg7vR6', true, 'Anna', 'Zawada', 'jakis@mail.pl', 'https://png.icons8.com/color/1600/circled-user-female-skin-type-1-2.png', 'Jestem uczennicą liceum. Lubię koty.');
insert into user (username, password, enabled, name, surname, email, img, description) values ('ola', '$2a$10$9SjNyDaTpPR7EhBf51ERH.m8pk.PNPouXQSMpNK28wS0F6wHg7vR6', true, 'Ola', 'Nowak', 'jakis@mail.pl','https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS4z_Qe_VuhpJP8Hw3VJatR62YnPREUrDB3DptSfi-a3e7WvIlW', 'Jestem mamą. Mam dwoje dzieci.');
insert into user (username, password, enabled, name, surname, email, img, description) values ('kasia', '$2a$10$9SjNyDaTpPR7EhBf51ERH.m8pk.PNPouXQSMpNK28wS0F6wHg7vR6', true, 'Kasia', 'Kot', 'jakis@mail.pl','','');
insert into user (username, password, enabled, name, surname, email, img, description) values ('basia','$2a$10$9SjNyDaTpPR7EhBf51ERH.m8pk.PNPouXQSMpNK28wS0F6wHg7vR6', false, 'Basia', 'Zając', 'jakis@mail.pl','','');
insert into user (username, password, enabled, name, surname, email, img, description) values ('asia','$2a$10$9SjNyDaTpPR7EhBf51ERH.m8pk.PNPouXQSMpNK28wS0F6wHg7vR6', true, 'Asia', 'Słowik', 'jakis@mail.pl','','');
insert into user (username, password, enabled, name, surname, email, img, description) values ('marysia','$2a$10$9SjNyDaTpPR7EhBf51ERH.m8pk.PNPouXQSMpNK28wS0F6wHg7vR6', false, 'Marysia', 'Kwiatek', 'jakis@mail.pl','','');

insert into user_role (username, role) values ('admin', 'ROLE_ADMIN');
insert into user_role (username, role) values ('ania', 'ROLE_USER');
insert into user_role (username, role) values ('ola', 'ROLE_USER');
insert into user_role (username, role) values ('kasia', 'ROLE_USER');
insert into user_role (username, role) values ('basia', 'ROLE_USER');
insert into user_role (username, role) values ('asia', 'ROLE_USER');

INSERT INTO relation (id_inviting, id_invited, activation) VALUES (2,1,false);
INSERT INTO relation (id_inviting, id_invited, activation) VALUES (3,1,true);
INSERT INTO relation (id_inviting, id_invited, activation) VALUES (4,1,true);
INSERT INTO relation (id_inviting, id_invited, activation) VALUES (4,2,false);



