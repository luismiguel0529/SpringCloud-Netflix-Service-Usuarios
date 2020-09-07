INSERT INTO usuarios (username, password, enabled, name, lastname, email) VALUES ('Andres', '$2a$10$OB.k9oUWM4UB3cAmj7I4A.MRFWDsPlX5kPt9Yz/BkNiz4qnLS.GKa', 1, 'Andres', 'Rodriguez', 'AndresRodriguez@hotmail.com');
INSERT INTO usuarios (username, password, enabled, name, lastname, email) VALUES ('Juan', '$2a$10$6d7IWwJGkewbZUdE41uup.K.y9OEddJeSR.3PMRVHuz7B/eu3y7r6', 1, 'Juan', 'Rodriguez', 'JuanRodriguez@hotmail.com');


INSERT INTO roles (name) VALUES ('ROLE_USER');
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');


INSERT INTO usuarios_roles (user_id, role_id) VALUES (1, 2);
INSERT INTO usuarios_roles (user_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (user_id, role_id) VALUES (2, 1);




