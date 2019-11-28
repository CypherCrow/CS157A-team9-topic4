DROP DATABASE IF EXISTS CS157AProject;
CREATE DATABASE CS157AProject;
USE CS157AProject;

CREATE TABLE `Visit` (
  `Visit_ID` int(11) NOT NULL AUTO_INCREMENT,
  `THC` varchar(6) NOT NULL,
  `Date` datetime NOT NULL,
  `Patient_name` varchar(45) NOT NULL,
  PRIMARY KEY (`Visit_ID`)
);

LOCK TABLES `Visit` WRITE;
insert into Visit (Visit_ID, THC, Date, Patient_name) values (1, '258e6J', '2019-10-15 12:19:15', 'Read Cowperthwaite');
insert into Visit (Visit_ID, THC, Date, Patient_name) values (2, 'T64s8C', '2019-10-29 05:24:45', 'Giffy Francisco');
insert into Visit (Visit_ID, THC, Date, Patient_name) values (3, 'y38n4z', '2019-01-24 19:49:19', 'King Lorman');
insert into Visit (Visit_ID, THC, Date, Patient_name) values (4, 'm55H47', '2019-11-23 13:56:46', 'Robb A''Barrow');
insert into Visit (Visit_ID, THC, Date, Patient_name) values (5, 'T09V4B', '2019-06-25 00:43:11', 'Hilton Shilladay');
insert into Visit (Visit_ID, THC, Date, Patient_name) values (6, 'Y99K35', '2019-07-26 10:12:52', 'Loni Wickey');
insert into Visit (Visit_ID, THC, Date, Patient_name) values (7, 'T80u9I', '2019-02-15 01:39:08', 'Kamilah Soutar');
insert into Visit (Visit_ID, THC, Date, Patient_name) values (8, 'i08y6w', '2019-07-09 14:16:31', 'Callie Skitt');
insert into Visit (Visit_ID, THC, Date, Patient_name) values (9, 'd72g7u', '2019-11-20 17:12:19', 'Kayle Cavee');
insert into Visit (Visit_ID, THC, Date, Patient_name) values (10, 'C90U2A', '2019-09-15 08:23:53', 'Diann Pasek');
UNLOCK TABLES;

CREATE TABLE `Audiological` (
  `audiological_ID` int(11) NOT NULL AUTO_INCREMENT,
  `visit_id` int(11) NOT NULL,
  `comments` varchar(45) DEFAULT NULL,
  `R25` double DEFAULT NULL,
  `R50` double DEFAULT NULL,
  `R10` double DEFAULT NULL,
  `R12` double DEFAULT NULL,
  `L25` double DEFAULT NULL,
  `L50` double DEFAULT NULL,
  `L10` double DEFAULT NULL,
  `L12` double DEFAULT NULL,
  `T_PR` double DEFAULT NULL,
  `T_Rm` varchar(45) DEFAULT NULL,
  `T_LR` double DEFAULT NULL,
  `Th_R` double DEFAULT NULL,
  `T_RLs` double DEFAULT NULL,
  `T_PL` double DEFAULT NULL,
  `T_Lm` varchar(45) DEFAULT NULL,
  `T_LL` double DEFAULT NULL,
  `Th_L` double DEFAULT NULL,
  `T_Ls` double DEFAULT NULL,
  `WNR` double DEFAULT NULL,
  `WNL` double DEFAULT NULL,
  `MML` double DEFAULT NULL,
  `MRR` double DEFAULT NULL,
  `MRB` double DEFAULT NULL,
  `MRL` double DEFAULT NULL,
  `MLB` double DEFAULT NULL,
  `RSD` double DEFAULT NULL,
  `LSD` double DEFAULT NULL,
  `LR50` double DEFAULT NULL,
  `LR1` double DEFAULT NULL,
  `LR12` double DEFAULT NULL,
  `LRTP` double DEFAULT NULL,
  `LL50` double DEFAULT NULL,
  `LL1` double DEFAULT NULL,
  `LL12` double DEFAULT NULL,
  `LLTP` double DEFAULT NULL,
  PRIMARY KEY (`audiological_ID`),
  UNIQUE KEY `audiological_ID_UNIQUE` (`audiological_ID`),
  KEY `visit_id_idx` (`visit_id`),
  CONSTRAINT `visit_id` FOREIGN KEY (`visit_id`) REFERENCES `visit` (`Visit_ID`)
);

LOCK TABLES `Audiological` WRITE;
insert into Audiological (audiological_ID, visit_id, comments, R25, R50, R10, R12, L25, L50, L10, L12, T_PR, T_Rm, T_LR, Th_R, T_RLs, T_PL, T_Lm, T_LL, Th_L, T_Ls, WNR, WNL, MML, MRR, MRB, MRL, MLB, RSD, LSD, LR50, LR1, LR12, LRTP, LL50, LL1, LL12, LLTP) values (1, 1, 'integer', 96, 6, 67, 71, 29, 91, 17, 44, 44, 92, 85, 12, 44, 81, 44, 79, 70, 22, 46, 9, 16, 55, 68, 91, 81, 68, 28, 3, 81, 73, 87, 58, 13, 67, 5);
insert into Audiological (audiological_ID, visit_id, comments, R25, R50, R10, R12, L25, L50, L10, L12, T_PR, T_Rm, T_LR, Th_R, T_RLs, T_PL, T_Lm, T_LL, Th_L, T_Ls, WNR, WNL, MML, MRR, MRB, MRL, MLB, RSD, LSD, LR50, LR1, LR12, LRTP, LL50, LL1, LL12, LLTP) values (2, 2, 'cras pellentesque dui tristique est', 92, 75, 83, 77, 98, 73, 21, 94, 27, 9, 77, 70, 15, 37, 52, 4, 38, 91, 89, 68, 55, 90, 100, 90, 68, 29, 99, 72, 56, 39, 47, 0, 79, 61, 8);
insert into Audiological (audiological_ID, visit_id, comments, R25, R50, R10, R12, L25, L50, L10, L12, T_PR, T_Rm, T_LR, Th_R, T_RLs, T_PL, T_Lm, T_LL, Th_L, T_Ls, WNR, WNL, MML, MRR, MRB, MRL, MLB, RSD, LSD, LR50, LR1, LR12, LRTP, LL50, LL1, LL12, LLTP) values (3, 3, 'est congue elementum in hac', 72, 78, 100, 8, 20, 10, 30, 24, 76, 94, 19, 89, 36, 34, 37, 97, 84, 18, 30, 35, 30, 86, 32, 29, 43, 74, 76, 50, 95, 91, 73, 57, 28, 56, 43);
insert into Audiological (audiological_ID, visit_id, comments, R25, R50, R10, R12, L25, L50, L10, L12, T_PR, T_Rm, T_LR, Th_R, T_RLs, T_PL, T_Lm, T_LL, Th_L, T_Ls, WNR, WNL, MML, MRR, MRB, MRL, MLB, RSD, LSD, LR50, LR1, LR12, LRTP, LL50, LL1, LL12, LLTP) values (4, 4, 'vel est donec odio justo', 46, 70, 69, 93, 24, 79, 23, 14, 70, 93, 93, 23, 35, 64, 15, 68, 36, 81, 35, 99, 83, 80, 87, 25, 24, 98, 41, 15, 84, 73, 3, 82, 70, 51, 77);
insert into Audiological (audiological_ID, visit_id, comments, R25, R50, R10, R12, L25, L50, L10, L12, T_PR, T_Rm, T_LR, Th_R, T_RLs, T_PL, T_Lm, T_LL, Th_L, T_Ls, WNR, WNL, MML, MRR, MRB, MRL, MLB, RSD, LSD, LR50, LR1, LR12, LRTP, LL50, LL1, LL12, LLTP) values (5, 5, 'nonummy maecenas tincidunt lacus at velit', 95, 48, 61, 42, 8, 8, 19, 22, 12, 63, 55, 42, 41, 86, 34, 63, 3, 65, 13, 35, 99, 14, 9, 54, 22, 43, 79, 94, 37, 40, 31, 27, 74, 23, 69);
insert into Audiological (audiological_ID, visit_id, comments, R25, R50, R10, R12, L25, L50, L10, L12, T_PR, T_Rm, T_LR, Th_R, T_RLs, T_PL, T_Lm, T_LL, Th_L, T_Ls, WNR, WNL, MML, MRR, MRB, MRL, MLB, RSD, LSD, LR50, LR1, LR12, LRTP, LL50, LL1, LL12, LLTP) values (6, 6, 'augue quam sollicitudin vitae eget', 83, 37, 83, 79, 71, 67, 42, 37, 49, 48, 90, 24, 16, 84, 37, 95, 5, 65, 62, 77, 48, 34, 0, 85, 78, 11, 3, 39, 76, 72, 28, 91, 89, 81, 37);
insert into Audiological (audiological_ID, visit_id, comments, R25, R50, R10, R12, L25, L50, L10, L12, T_PR, T_Rm, T_LR, Th_R, T_RLs, T_PL, T_Lm, T_LL, Th_L, T_Ls, WNR, WNL, MML, MRR, MRB, MRL, MLB, RSD, LSD, LR50, LR1, LR12, LRTP, LL50, LL1, LL12, LLTP) values (7, 7, 'nulla tempus', 17, 6, 80, 9, 21, 19, 36, 63, 53, 95, 94, 17, 62, 66, 66, 41, 21, 49, 78, 99, 2, 93, 22, 22, 65, 81, 11, 97, 5, 25, 3, 91, 86, 54, 76);
insert into Audiological (audiological_ID, visit_id, comments, R25, R50, R10, R12, L25, L50, L10, L12, T_PR, T_Rm, T_LR, Th_R, T_RLs, T_PL, T_Lm, T_LL, Th_L, T_Ls, WNR, WNL, MML, MRR, MRB, MRL, MLB, RSD, LSD, LR50, LR1, LR12, LRTP, LL50, LL1, LL12, LLTP) values (8, 8, 'sem praesent id massa id nisl', 50, 46, 93, 57, 76, 87, 41, 62, 93, 54, 33, 60, 84, 48, 31, 28, 81, 18, 64, 6, 99, 81, 82, 65, 68, 7, 78, 56, 24, 58, 15, 29, 40, 13, 64);
insert into Audiological (audiological_ID, visit_id, comments, R25, R50, R10, R12, L25, L50, L10, L12, T_PR, T_Rm, T_LR, Th_R, T_RLs, T_PL, T_Lm, T_LL, Th_L, T_Ls, WNR, WNL, MML, MRR, MRB, MRL, MLB, RSD, LSD, LR50, LR1, LR12, LRTP, LL50, LL1, LL12, LLTP) values (9, 9, 'lorem vitae mattis nibh ligula nec sem', 80, 62, 30, 24, 54, 74, 16, 9, 49, 66, 35, 11, 92, 62, 16, 95, 71, 86, 39, 26, 3, 53, 9, 21, 55, 40, 25, 31, 5, 57, 1, 29, 7, 81, 5);
insert into Audiological (audiological_ID, visit_id, comments, R25, R50, R10, R12, L25, L50, L10, L12, T_PR, T_Rm, T_LR, Th_R, T_RLs, T_PL, T_Lm, T_LL, Th_L, T_Ls, WNR, WNL, MML, MRR, MRB, MRL, MLB, RSD, LSD, LR50, LR1, LR12, LRTP, LL50, LL1, LL12, LLTP) values (10, 10, 'odio curabitur convallis', 55, 31, 49, 84, 31, 75, 27, 85, 11, 11, 99, 16, 99, 48, 65, 80, 94, 85, 24, 92, 38, 24, 83, 8, 78, 21, 57, 12, 15, 97, 90, 52, 13, 22, 59);
UNLOCK TABLES;


CREATE TABLE `CatChem` (
  `CatChem_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`CatChem_id`),
  UNIQUE KEY `CatChem_id_UNIQUE` (`CatChem_id`)
);

LOCK TABLES `CatChem` WRITE;
insert into CatChem (CatChem_id, name, description) values (1, 'Octinoxate', 'Grass-roots eco-centric info-mediaries');
insert into CatChem (CatChem_id, name, description) values (2, 'Titanium Dioxide', 'Diverse solution-oriented synergy');
insert into CatChem (CatChem_id, name, description) values (3, 'garlic', 'Profound high-level protocol');
insert into CatChem (CatChem_id, name, description) values (4, 'GLYCERIN', 'Focused bandwidth-monitored protocol');
insert into CatChem (CatChem_id, name, description) values (5, 'Sodium Fluoride, hydrofluoric acid', 'Open-architected radical portal');
insert into CatChem (CatChem_id, name, description) values (6, 'Sodium Fluoride', 'Self-enabling multi-tasking middleware');
insert into CatChem (CatChem_id, name, description) values (7, 'ACETAMINOPHEN', 'Visionary incremental complexity');
insert into CatChem (CatChem_id, name, description) values (8, 'Sodium Monofluorophosphate', 'Mandatory bottom-line neural-net');
insert into CatChem (CatChem_id, name, description) values (9, 'Rescue', 'Multi-channelled 24/7 methodology');
insert into CatChem (CatChem_id, name, description) values (10, 'AMLODIPINE BESYLATE', 'Mandatory local knowledge user');
UNLOCK TABLES;

CREATE TABLE `Disease` (
  `Disease_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Disease_id`),
  UNIQUE KEY `Disease_id_UNIQUE` (`Disease_id`)
);

LOCK TABLES `Disease` WRITE;
insert into Disease (Disease_id, name, description) values (1, 'Lorazepam', 'Digitized 24 hour synergy');
insert into Disease (Disease_id, name, description) values (2, 'metoprolol succinate and hydrochlorothiazide', 'Integrated object-oriented open architecture');
insert into Disease (Disease_id, name, description) values (3, 'ciclopirox', 'Progressive disintermediate solution');
insert into Disease (Disease_id, name, description) values (4, 'Shark liver oil', 'Enhanced motivating concept');
insert into Disease (Disease_id, name, description) values (5, 'Hydrocortisone', 'Programmable stable system engine');
insert into Disease (Disease_id, name, description) values (6, 'Avobenzone, Homosalate and Oxybenzone', 'Profit-focused client-driven extranet');
insert into Disease (Disease_id, name, description) values (7, 'Carbamazepine', 'Multi-lateral mission-critical success');
insert into Disease (Disease_id, name, description) values (8, 'Oxcarbazepine', 'Mandatory systematic array');
insert into Disease (Disease_id, name, description) values (9, 'Helium Oxygen Nitrogen mixture', 'Devolved global approach');
insert into Disease (Disease_id, name, description) values (10, 'Triamterene and Hydrochlorothiazide', 'Monitored client-driven paradigm');
UNLOCK TABLES;

CREATE TABLE `Generic` (
  `Generic_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Generic_id`),
  UNIQUE KEY `Generic_id_UNIQUE` (`Generic_id`)
);

LOCK TABLES `Generic` WRITE;
insert into Generic (Generic_id, name, description) values (1, 'TOXICODENDRON RADICANS LEAF', 'Balanced clear-thinking array');
insert into Generic (Generic_id, name, description) values (2, 'OCTINOXATE', 'Customer-focused responsive knowledge base');
insert into Generic (Generic_id, name, description) values (3, 'QUETIAPINE FUMARATE', 'Front-line human-resource benchmark');
insert into Generic (Generic_id, name, description) values (4, 'Adenosine', 'Synergistic logistical interface');
insert into Generic (Generic_id, name, description) values (5, 'Betamethasone Dipropionate', 'Organized systematic methodology');
insert into Generic (Generic_id, name, description) values (6, 'phendimetrazine tartrate', 'Horizontal national monitoring');
insert into Generic (Generic_id, name, description) values (7, 'ropinirole hydrochloride', 'Operative eco-centric extranet');
insert into Generic (Generic_id, name, description) values (8, 'MAGNESIUM HYDROXIDE', 'Fundamental cohesive website');
insert into Generic (Generic_id, name, description) values (9, 'Acetaminophen', 'De-engineered holistic algorithm');
insert into Generic (Generic_id, name, description) values (10, 'Perindopril Erbumine', 'Front-line cohesive extranet');
UNLOCK TABLES;

CREATE TABLE `Medicament` (
  `Medicament_id` int(11) NOT NULL AUTO_INCREMENT,
  `Generic_id` int(11) NOT NULL,
  `Disease_id` int(11) NOT NULL,
  `CatChem_id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  `Usual_dose` int(11) DEFAULT NULL,
  PRIMARY KEY (`Medicament_id`),
  UNIQUE KEY `Medicament_id_UNIQUE` (`Medicament_id`),
  KEY `Generic_id_idx` (`Generic_id`),
  KEY `Disease_id_idx` (`Disease_id`),
  KEY `CatChem_id_idx` (`CatChem_id`),
  CONSTRAINT `CatChem_id` FOREIGN KEY (`CatChem_id`) REFERENCES `catchem` (`CatChem_id`),
  CONSTRAINT `Disease_id` FOREIGN KEY (`Disease_id`) REFERENCES `disease` (`Disease_id`),
  CONSTRAINT `Generic_id` FOREIGN KEY (`Generic_id`) REFERENCES `generic` (`Generic_id`)
);

LOCK TABLES `Medicament` WRITE;
insert into Medicament (Medicament_id, Generic_id, Disease_id, CatChem_id, name, description, Usual_dose) values (1, 1, 1, 1, 'Duloxetine', 'Versatile context-sensitive moderator', 27);
insert into Medicament (Medicament_id, Generic_id, Disease_id, CatChem_id, name, description, Usual_dose) values (2, 2, 2, 2, 'Cattle Epithelium', 'Organized exuding strategy', 20);
insert into Medicament (Medicament_id, Generic_id, Disease_id, CatChem_id, name, description, Usual_dose) values (3, 3, 3, 3, 'Nicotine Polacrilex', 'Extended discrete superstructure', 26);
insert into Medicament (Medicament_id, Generic_id, Disease_id, CatChem_id, name, description, Usual_dose) values (4, 4, 4, 4, 'sodium bicarbonate', 'Front-line multi-tasking', 33);
insert into Medicament (Medicament_id, Generic_id, Disease_id, CatChem_id, name, description, Usual_dose) values (5, 5, 5, 5, 'Pyrithione zinc', 'Multi-channelled interactive architecture', 18);
insert into Medicament (Medicament_id, Generic_id, Disease_id, CatChem_id, name, description, Usual_dose) values (6, 6, 6, 6, 'Oxycodone and Acetaminophen', 'Right-sized zero tolerance challenge', 23);
insert into Medicament (Medicament_id, Generic_id, Disease_id, CatChem_id, name, description, Usual_dose) values (7, 7, 7, 7, 'SALICYLIC ACID', 'Virtual composite', 70);
insert into Medicament (Medicament_id, Generic_id, Disease_id, CatChem_id, name, description, Usual_dose) values (8, 8, 8, 8, 'mercaptopurine', 'Face to face content-based middleware', 86);
insert into Medicament (Medicament_id, Generic_id, Disease_id, CatChem_id, name, description, Usual_dose) values (9, 9, 9, 9, 'Riluzole', 'User-centric secondary access', 6);
insert into Medicament (Medicament_id, Generic_id, Disease_id, CatChem_id, name, description, Usual_dose) values (10, 10, 10, 10, 'Hydrocodone Bitartrate', 'Networked intangible toolset', 23);
UNLOCK TABLES;

CREATE TABLE `Pharmacology` (
  `pharmacology_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Pvisit_id` int(11) NOT NULL,
  `medicament_id` int(11) DEFAULT NULL,
  `dose` int(11) DEFAULT NULL,
  `durnation` int(11) DEFAULT NULL,
  `comments` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`pharmacology_ID`),
  UNIQUE KEY `pharmacology_ID_UNIQUE` (`pharmacology_ID`),
  KEY `Pvisit_id_idx` (`Pvisit_id`),
  KEY `medicament_id_idx` (`medicament_id`),
  CONSTRAINT `Pvisit_id` FOREIGN KEY (`Pvisit_id`) REFERENCES `visit` (`Visit_ID`),
  CONSTRAINT `medicament_id` FOREIGN KEY (`medicament_id`) REFERENCES `medicament` (`Medicament_id`)
);

LOCK TABLES `Pharmacology` WRITE;
insert into Pharmacology (pharmacology_ID, Pvisit_id, medicament_id, dose, durnation, comments) values (1, 1, 1, 99, 4, 'Business-focused user-facing');
insert into Pharmacology (pharmacology_ID, Pvisit_id, medicament_id, dose, durnation, comments) values (2, 2, 2, 88, 69, 'Business-focused coherent Graphical');
insert into Pharmacology (pharmacology_ID, Pvisit_id, medicament_id, dose, durnation, comments) values (3, 3, 3, 91, 90, 'Optimized neutral monitoring');
insert into Pharmacology (pharmacology_ID, Pvisit_id, medicament_id, dose, durnation, comments) values (4, 4, 4, 45, 24, 'Vision-oriented emulation');
insert into Pharmacology (pharmacology_ID, Pvisit_id, medicament_id, dose, durnation, comments) values (5, 5, 5, 4, 33, 'Cross-platform exuding workforce');
insert into Pharmacology (pharmacology_ID, Pvisit_id, medicament_id, dose, durnation, comments) values (6, 6, 6, 54, 73, 'Customer-focused hybrid moderator');
insert into Pharmacology (pharmacology_ID, Pvisit_id, medicament_id, dose, durnation, comments) values (7, 7, 7, 37, 40, 'human-resource collaboration');
insert into Pharmacology (pharmacology_ID, Pvisit_id, medicament_id, dose, durnation, comments) values (8, 8, 8, 72, 8, 'Sharable zero tolerance project');
insert into Pharmacology (pharmacology_ID, Pvisit_id, medicament_id, dose, durnation, comments) values (9, 9, 9, 29, 87, 'Fundamental logistical product');
insert into Pharmacology (pharmacology_ID, Pvisit_id, medicament_id, dose, durnation, comments) values (10, 10, 10, 19, 24, 'Fully-configurable monitoring');
UNLOCK TABLES;
