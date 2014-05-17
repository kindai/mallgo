ALTER TABLE ADDRESS ADD CONSTRAINT REFERENCE_NOTNULL_CHECK CHECK
  (
    user_id IS NOT NULL
    OR (shop_id IS NOT NULL)
  );

insert into USER (username,password,email,status,city,state,country,zip,phone,languagePreference,created_by, modified_by )values
('DefaultUser','123123','mallgo@mallgo.com',23012,-1,-1,-1,'123','123',-1,'Admin','Admin');

insert into CATEGORY (name,description,created_by,modified_by)values
('Default','Default Category','Admin','Admin');

