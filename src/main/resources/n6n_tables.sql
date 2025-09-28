-- Table: n6n.roles

 DROP TABLE IF EXISTS n6n.roles;

CREATE TABLE IF NOT EXISTS n6n.roles
(
    role_id VARCHAR(100)  PRIMARY KEY,
    org_id VARCHAR(100)   NOT NULL,
    
    role_name character varying(100)  NOT NULL,
    isactive character varying(1) default 'A',
    role_description text ,
    createdby character varying(100) COLLATE pg_catalog."default",
    updatedby character varying(100) COLLATE pg_catalog."default",
    created_date timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    updated_date timestamp with time zone DEFAULT CURRENT_TIMESTAMP
    
)


 DROP TABLE IF EXISTS n6n.module;

CREATE TABLE IF NOT EXISTS n6n.module
(
 
	 module_id VARCHAR(100)  PRIMARY KEY ,
	org_id VARCHAR(100)  NOT NULL,
    name  VARCHAR(100),
    description TEXT,
    isactive VARCHAR(1) default 'A',
    
	
    createdby VARCHAR(100) ,
    updatedby VARCHAR(100),
    created_date timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    updated_date timestamp with time zone DEFAULT CURRENT_TIMESTAMP
    
)




-- Table: n6n.permission

-- DROP TABLE IF EXISTS n6n.permission;

CREATE TABLE IF NOT EXISTS n6n.permission
(
    id bigint PRIMARY KEY,
    permission_id VARCHAR(100) not null unique,
	permission_name VARCHAR(100) not null,
    org_id VARCHAR(100),
	module_id VARCHAR(100),
	 isactive VARCHAR(1),
	description text,
	created_date timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    updated_date timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
	createdby VARCHAR(100) ,
    updatedby character varying(100) 
   );
    
	
	
	
	
-- Table: n6n.form

 DROP TABLE IF EXISTS n6n.form;

CREATE TABLE IF NOT EXISTS n6n.form
(
   
    form_id VARCHAR(100) PRIMARY KEY,
	form_name VARCHAR(100) not null,
	isactive VARCHAR(1) default 'A',
	description text,
	created_date timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    updated_date timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
	createdby VARCHAR(100) ,
    updatedby VARCHAR(100) 
   );
   
   
  
   --Table: n6n.organisation
 DROP TABLE IF EXISTS n6n.organisation;

CREATE TABLE IF NOT EXISTS n6n.organisation
(
    org_id VARCHAR(100) PRIMARY KEY,
	org_name VARCHAR(100) not null,
	description text,
	isactive VARCHAR(1) default 'A',
	module VARCHAR(100) ,
	created_date timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    updated_date timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
	createdby VARCHAR(100) ,
    updatedby VARCHAR(100) 
   );






  
   #module :---------------------------------------------------------------
   
   
 	 INSERT INTO n6n.module(
	 module_id, org_id, name, description, isactive)
	VALUES ('m1001', 'o1001', 'Admin', 'Manage account all level User, Subcriber and SP', 'A');
	
		 INSERT INTO n6n.module(
	 module_id, org_id, name, description, isactive)
	VALUES ('m1002', 'o1002', 'Manager', 'Doctors, Hotel Managers, Industry Managers, etc', 'A');
	
		 INSERT INTO n6n.module(
	 module_id, org_id, name, description, isactive)
	VALUES ('m1003', 'o1003', 'Staff', 'Nurses, Hotel Staff, Industry Staff etc', 'A');
	
	INSERT INTO n6n.module(
	 module_id, org_id, name, description, isactive)
	VALUES ('m1004', 'o1004', 'Customer', 'Subcriber Customer', 'A');
	
	INSERT INTO n6n.module(
	 module_id, org_id, name, description, isactive)
	VALUES ('m1005', 'o1005', 'Vendor', 'Subcriber Vendor', 'A');
	
	
	--organisation :------------------------------------------------
	
	INSERT INTO n6n.organisation(
	org_id, org_name, description)
	VALUES ('o1001', 'health care', 'Hospital, Clinic');
	
	INSERT INTO n6n.organisation(
	org_id, org_name, description)
	VALUES ('o1002', 'Automobile', 'Showroom, Garage, etc');
	
	INSERT INTO n6n.organisation(
	org_id, org_name, description)
	VALUES ('o1003', 'Personal Care', 'Salons, Spas, Gyms, etc');
	
	INSERT INTO n6n.organisation(
	org_id, org_name, description)
	VALUES ('o1004', 'Hospitality', 'Hotel, Resturant');
	
	
	INSERT INTO n6n.organisation(
	org_id, org_name, description)
	VALUES ('o1005', 'General', 'Industry, Factory, Ofice, etc');
	
   --Table: n6n.Industry
 DROP TABLE IF EXISTS n6n.Industry;

CREATE TABLE IF NOT EXISTS n6n.Industry
(
    industry_id VARCHAR(100) PRIMARY KEY,
	industry_name VARCHAR(100) not null,
	description text,
	isactive VARCHAR(1) default 'A',
	module VARCHAR(100) ,
	created_date timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    updated_date timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
	createdby VARCHAR(100) ,
    updatedby VARCHAR(100) 
   );
   
   
   
   	--Industry :------------------------------------------------
	
	INSERT INTO n6n.Industry(
	industry_id, industry_name, description)
	VALUES ('i1001', 'health care', 'Hospital, Clinic');
	
	INSERT INTO n6n.Industry(
	industry_id, industry_name, description)
	VALUES ('i1002', 'Automobile', 'Showroom, Garage, etc');
	
	INSERT INTO n6n.Industry(
	industry_id, industry_name, description)
	VALUES ('i1003', 'Personal Care', 'Salons, Spas, Gyms, etc');
	
	INSERT INTO n6n.Industry(
	industry_id, industry_name, description)
	VALUES ('i1004', 'Hospitality', 'Hotel, Resturant');
	
	
	INSERT INTO n6n.Industry(
	industry_id, industry_name, description)
	VALUES ('i1005', 'General', 'Industry, Factory, Ofice, etc');
	
	
	
	
	INSERT INTO n6n.form(
	form_id, form_name, description)
	VALUES ('f1001', 'Patient Form', 'Patient Form');
	
	INSERT INTO n6n.form(
	form_id, form_name, description)
	VALUES ('f1002', 'Clinic Form', 'Clinic Form');
	
	INSERT INTO n6n.form(
	form_id, form_name, description)
	VALUES ('f1003', 'Test Form', 'Test Form');
	
	
		INSERT INTO n6n.form(
	form_id, form_name, description)
	VALUES ('f1004', 'Result Form', 'Result Form');

	INSERT INTO n6n.form(
	form_id, form_name, description)
	VALUES ('f1005', 'Doctor Form', 'Doctor Form');

	INSERT INTO n6n.form(
	form_id, form_name, description)
	VALUES ('f1006', 'Backup Form', 'Backup Form');
	
	INSERT INTO n6n.form(
	form_id, form_name, description)
	VALUES ('f1007', 'Utility Form', 'Utility Form');

	INSERT INTO n6n.form(
	form_id, form_name, description)
	VALUES ('f1008', 'Doctor Form', 'Doctor Form');





   --module :---------------------------------------------------------------
   
   INSERT INTO n6n.roles(
	role_id, org_id, role_name role_description)
		VALUES ('r1001', 'o1001', 'Admin', 'Manage account all level User, Subcriber and SP');
	
	   INSERT INTO n6n.roles(
	role_id, org_id, role_name role_description)
	VALUES ('r1002', 'o1002', 'Manager', 'Doctors, Hotel Managers, Industry Managers, etc');
	   INSERT INTO n6n.roles(
	role_id, org_id, role_name role_description)
	VALUES ('r1003', 'o1003', 'Staff', 'Nurses, Hotel Staff, Industry Staff etc');
	   INSERT INTO n6n.roles(
	role_id, org_id, role_name role_description)
VALUES ('r1004', 'o1004', 'Customer', 'Subcriber Customer');
	
		   INSERT INTO n6n.roles(
	role_id, org_id, role_name role_description)
VALUES ('r1005', 'o1005', 'Vendor', 'Subcriber Vendor');
	
  

	


