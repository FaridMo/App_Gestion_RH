CREATE DATABASE dbgestion;

use dbgestion;

CREATE TABLE login(
	username varchar(255) not null,
	password varchar(255) not null
);

INSERT INTO login VALUES("ali","passer123");

CREATE TABLE employe(
	id_emp int NOT NULL AUTO_INCREMENT,
	nom varchar(255) NOT NULL,
	prenom varchar(255) NULL,
	num_cni varchar(255) NOT NULL UNIQUE,
	sexe varchar(255) NULL,
	dateNais varchar(255) NULL,
	lieuNais varchar(255) NULL,
	grpsanguin varchar(255) NULL,
	etude varchar(255) NULL,
	departement varchar(255) NULL,
	poste varchar(255) NULL,
	contrat varchar(255) NULL,
	salaire varchar(255) NULL,
	date_embauche varchar(255) NULL,
	telMobile varchar(255) NULL,
	telFixe varchar(255) NULL,
	email varchar(255) NULL,
	nvposte varchar(255) NULL,
	datepromo varchar(255) NULL,
	debut_conge varchar(255) NULL,
	fin_conge varchar(255) NULL,
	type_conge varchar(255) NULL,
	PRIMARY KEY (id_emp)
);





INSERT INTO employe (nom,prenom,num_cni,sexe,dateNais,lieuNais,grpsanguin,etude,departement,poste,contrat,salaire,date_embauche,telMobile,telFixe,email) VALUES ('ABDOULKADER','Ali','123456','Masculin','01-10-2002','Djibouti','A+','Licence','informatique','developpeur','Contrat à Durée Déterminé (CDD)','900000','02-01-2018','(+253) 77 44 89 19','(+253) 21 45 36 54','aliabdo');

INSERT INTO employe (nom,prenom,num_cni,sexe,dateNais,lieuNais,grpsanguin,etude,departement,poste,contrat,salaire,date_embauche,telMobile,telFixe,email) VALUES ('ISMAEL','omar','789654','Masculin','08-01-2002','Djibouti','AB+','Licence','informatique','analyste','Contrat à Durée Indéterminé (CDI)','700000','09-01-2020','(+253) 77 12 34 56','(+253) 21 47 85 23','ismaelomar');

INSERT INTO employe (nom,prenom,num_cni,sexe,dateNais,lieuNais,grpsanguin,etude,departement,poste,contrat,salaire,date_embauche,telMobile,telFixe,email) VALUES ('HASSAN','soultan','982325','Masculin','10-06-1999','Anguilla','AB-','Doctorat','administration','Directeur','Contrat à Durée Indéterminé (CDI)','450000','12-01-2022','(+253) 77 87 96 85','(+253) 21 66 66 85','soultanhassan@gmail.com');

INSERT INTO employe (nom,prenom,num_cni,sexe,dateNais,lieuNais,grpsanguin,etude,departement,poste,contrat,salaire,date_embauche,telMobile,telFixe,email) VALUES ('HELEM','houmed','456123','Masculin','03-04-2002','Djibouti','O+','Licence','informatique','Architecte réseau','Contrat à Durée Déterminé (CDD)','9000000','12-01-2020','(+253) 77 77 85 45','(+253) 21 53 60 42','helemhoumed');

INSERT INTO employe (nom,prenom,num_cni,sexe,dateNais,lieuNais,grpsanguin,etude,departement,poste,contrat,salaire,date_embauche,telMobile,telFixe,email) VALUES ('ABOUBAKER','mohamed','963258','Masculin','05-06-2001','Djibouti','O-','Licence','informatique','Expert','Contrat à Durée Déterminé (CDD)','600000','08-01-2022','(+253) 77 18 81 08','(+253) 21 36 52 14','aboubakermohamed');

INSERT INTO employe (nom,prenom,num_cni,sexe,dateNais,lieuNais,grpsanguin,etude,departement,poste,contrat,salaire,date_embauche,telMobile,telFixe,email) VALUES ('ALI','assia','968523','Féminin','10-02-2001','Djibouti','AB+','Licence','informatique','formatrice','Contrat à Durée Déterminé (CDD)','700000','18-07-2020','(+253) 77 96 32 01','(+253) 21 03 05 06','assiaali');

INSERT INTO employe (nom,prenom,num_cni,sexe,dateNais,lieuNais,grpsanguin,etude,departement,poste,contrat,salaire,date_embauche,telMobile,telFixe,email) VALUES ('MOHAMED','habon','169732','Féminin','18-07-2000','Djibouti','O+','Master','iformatique','testeuse','Contrat à Durée Déterminé (CDD)','800000','13-01-2019','(+253) 77 84 56 12','(+253) 21 46 30 12','habonmohamed');

INSERT INTO employe (nom,prenom,num_cni,sexe,dateNais,lieuNais,grpsanguin,etude,departement,poste,contrat,salaire,date_embauche,telMobile,telFixe,email) VALUES ('ISSA','youssouf','197645','Masculin','20-07-2003','Djibouti','AB-','Baccalauréat Générale','informatique','architecte du systeme','Contrat à Durée Déterminé (CDD)','800000','05-08-2021','(+253) 77 98 75 26','(+253) 21 30 10 20','issayousouf');

INSERT INTO employe (nom,prenom,num_cni,sexe,dateNais,lieuNais,grpsanguin,etude,departement,poste,contrat,salaire,date_embauche,telMobile,telFixe,email) VALUES ('MOHAMED','ahmed','025896','Masculin','21-07-2002','Djibouti','AB+','Licence','informatique','administrateur','Contrat à Durée Déterminé (CDD)','900000','10-04-2021','(+253) 77 01 02 03','(+253) 21 40 50 60','mohamedahmed');

INSERT INTO employe (nom,prenom,num_cni,sexe,dateNais,lieuNais,grpsanguin,etude,departement,poste,contrat,salaire,date_embauche,telMobile,telFixe,email) VALUES ('ALI','hasna','030609','Féminin','14-04-2000','Djibouti','AB+','Master','informatique','administratrice','Contrat à Durée Déterminé (CDD)','700000','10-04-2022','(+253) 77 01 97 56','(+253) 21 30 26 21','hasnaali');

INSERT INTO employe (nom,prenom,num_cni,sexe,dateNais,lieuNais,grpsanguin,etude,departement,poste,contrat,salaire,date_embauche,telMobile,telFixe,email) VALUES ('ALI','mohamed','040890','Masculin','06-04-2002','Djibouti','A-','Licence','informatique','technicien','Contrat à Durée Indéterminé (CDI)','500000','08-03-2020','(+253) 77 64 51 82','(+253) 21 75 46 23','alimohamed');

INSERT INTO employe (nom,prenom,num_cni,sexe,dateNais,lieuNais,grpsanguin,etude,departement,poste,contrat,salaire,date_embauche,telMobile,telFixe,email) VALUES ('MOHAMED','zeinab','756123','Féminin','15-05-2002','Djibouti','AB-','Licence','informatique','gestionnaire','Contrat à Durée Déterminé (CDD)','700000','08-05-2022','(+253) 77 21 31 41','(+253) 21 61 53 42','zeinabali');

INSERT INTO employe (nom,prenom,num_cni,sexe,dateNais,lieuNais,grpsanguin,etude,departement,poste,contrat,salaire,date_embauche,telMobile,telFixe,email) VALUES ('ALI','aicha','794586','Féminin','07-06-2001','Djibouti','AB+','Licence','informaticque','développeuse','Contrat à Durée Déterminé (CDD)','400000','03-01-2021','(+253) 77 45 48 49','(+253) 21 36 54 75','qichaqli');

INSERT INTO employe (nom,prenom,num_cni,sexe,dateNais,lieuNais,grpsanguin,etude,departement,poste,contrat,salaire,date_embauche,telMobile,telFixe,email) VALUES ('SALEM','abdo','321542','Masculin','24-10-2001','Djibouti','AB+','Master','informatique','administrateur de réseau','Contrat à Durée Indéterminé (CDI)','500000','14-05-2022','(+253) 77 45 43 12','(+253) 21 45 01 23','salemabdo');

INSERT INTO employe (nom,prenom,num_cni,sexe,dateNais,lieuNais,grpsanguin,etude,departement,poste,contrat,salaire,date_embauche,telMobile,telFixe,email) VALUES ('ALI','omar','643819','Masculin','12-04-2002','Djibouti','A-','Master','informatique','testeur','Contrat à Durée Déterminé (CDD)','500000','25-06-2021','(+253) 77 12 13 14','(+253) 21 20 60 30','omarali');

INSERT INTO employe (nom,prenom,num_cni,sexe,dateNais,lieuNais,grpsanguin,etude,departement,poste,contrat,salaire,date_embauche,telMobile,telFixe,email) VALUES ('ALI','nagat','131516','Féminin','06-08-2002','Djibouti','A-','Licence','informatique','testeuse','Contrat à Durée Déterminé (CDD)','800000','12-07-2023','(+253) 77 52 53 51','(+253) 21 45 16 43','nagatali');

INSERT INTO employe (nom,prenom,num_cni,sexe,dateNais,lieuNais,grpsanguin,etude,departement,poste,contrat,salaire,date_embauche,telMobile,telFixe,email) VALUES ('ABDO','madina','251326','Féminin','09-06-2000','Djibouti','A-','Doctorat','informatique','administratrice de réseau','Contrat à Durée Déterminé (CDD)','900000','14-03-2020','(+253) 77 32 10 50','(+253) 21 96 45 32','madinaabdo');

INSERT INTO employe (nom,prenom,num_cni,sexe,dateNais,lieuNais,grpsanguin,etude,departement,poste,contrat,salaire,date_embauche,telMobile,telFixe,email) VALUES ('ISSA','ibrahim','396452','Masculin','07-06-2002','Djibouti','AB+','Licence','informatique','technicien','Contrat à Durée Déterminé (CDD)','700000','08-01-2022','(+253) 77 47 58 69','(+253) 21 45 63 21','ibrahimissa');


