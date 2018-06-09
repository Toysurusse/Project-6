--
-- PostgreSQL database dump
--

-- Dumped from database version 10.3
-- Dumped by pg_dump version 10.3

-- Started on 2018-06-09 13:23:29

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2900 (class 0 OID 20167)
-- Dependencies: 201
-- Data for Name: adresse; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.adresse (adres_id, numero_rue, rue, code_postal, ville, code, complement_adresse, adresse_principale) VALUES (1, 12, 'douve', 75015, 'Paris', 'Toysrusse', '', true);
INSERT INTO public.adresse (adres_id, numero_rue, rue, code_postal, ville, code, complement_adresse, adresse_principale) VALUES (2, 123, 'rue du poitou', 12450, 'Paris', '28B12', 'zffg', true);
INSERT INTO public.adresse (adres_id, numero_rue, rue, code_postal, ville, code, complement_adresse, adresse_principale) VALUES (3, 125, 'rue des bois', 93210, 'Saint Denis', '18B25', 'Test', true);
INSERT INTO public.adresse (adres_id, numero_rue, rue, code_postal, ville, code, complement_adresse, adresse_principale) VALUES (4, 125, 'rue des moulins', 75015, 'Paris', '45B58', '', true);
INSERT INTO public.adresse (adres_id, numero_rue, rue, code_postal, ville, code, complement_adresse, adresse_principale) VALUES (0, 0, '0', 0, '0', '0', '0', true);
INSERT INTO public.adresse (adres_id, numero_rue, rue, code_postal, ville, code, complement_adresse, adresse_principale) VALUES (5, 123, 'Rue Chabon', 75018, 'Paris', '93B12', 'Topo', false);
INSERT INTO public.adresse (adres_id, numero_rue, rue, code_postal, ville, code, complement_adresse, adresse_principale) VALUES (6, 12, 'Rue Malcolm', 13025, 'Marseille', '52A63', 'Plus', false);
INSERT INTO public.adresse (adres_id, numero_rue, rue, code_postal, ville, code, complement_adresse, adresse_principale) VALUES (7, 0, '', 0, '', '', '', false);
INSERT INTO public.adresse (adres_id, numero_rue, rue, code_postal, ville, code, complement_adresse, adresse_principale) VALUES (8, 251, 'rue calemb', 69210, 'lyon', '', '', false);
INSERT INTO public.adresse (adres_id, numero_rue, rue, code_postal, ville, code, complement_adresse, adresse_principale) VALUES (9, 123, 'Rue Chabon', 75018, 'Paris', '93B12', 'Topo', false);
INSERT INTO public.adresse (adres_id, numero_rue, rue, code_postal, ville, code, complement_adresse, adresse_principale) VALUES (10, 123, 'Rue Chabon', 75018, 'lyon', '93B12', 'Topo', false);


--
-- TOC entry 2904 (class 0 OID 20189)
-- Dependencies: 205
-- Data for Name: commentaires; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.commentaires (com_id, compte_id, titre, commentaire, createat, deleteat) VALUES (11, 1, 'Bonjour', 'Super', '2018-05-24 10:25:29.739', '2018-05-24 15:26:06.632593');
INSERT INTO public.commentaires (com_id, compte_id, titre, commentaire, createat, deleteat) VALUES (13, 1, 'Fontainebleau', 'Ce site d''escalade est magnifique', '2018-05-24 16:03:37.027', NULL);
INSERT INTO public.commentaires (com_id, compte_id, titre, commentaire, createat, deleteat) VALUES (14, 1, 'Bonjour', 'Super', '2018-05-24 16:06:11.705', NULL);
INSERT INTO public.commentaires (com_id, compte_id, titre, commentaire, createat, deleteat) VALUES (15, 1, 'Bonjour', 'Ce site d''escalade est magnifique', '2018-05-24 16:06:29.361', NULL);
INSERT INTO public.commentaires (com_id, compte_id, titre, commentaire, createat, deleteat) VALUES (18, 1, 'Bonjour', 'Ce site d''escalade est magnifique', '2018-05-29 00:59:31.658', NULL);
INSERT INTO public.commentaires (com_id, compte_id, titre, commentaire, createat, deleteat) VALUES (19, 1, 'Bonjour', 'Super', '2018-05-29 01:09:35.231', NULL);
INSERT INTO public.commentaires (com_id, compte_id, titre, commentaire, createat, deleteat) VALUES (16, 1, 'Bonjour', 'Ce site d''escalade est magnifique', '2018-05-29 00:57:51.238', '2018-05-29 01:11:03.423585');
INSERT INTO public.commentaires (com_id, compte_id, titre, commentaire, createat, deleteat) VALUES (20, 1, 'Hello', 'Nouveau commentaire', '2018-06-02 16:50:53.038', NULL);
INSERT INTO public.commentaires (com_id, compte_id, titre, commentaire, createat, deleteat) VALUES (21, 1, 'hi', 'ajout dun commentaire test', '2018-06-02 16:54:12.878', NULL);
INSERT INTO public.commentaires (com_id, compte_id, titre, commentaire, createat, deleteat) VALUES (22, 1, 'jtjt', 'jhrjrtj', '2018-06-02 16:54:30.888', NULL);
INSERT INTO public.commentaires (com_id, compte_id, titre, commentaire, createat, deleteat) VALUES (23, 1, 'Hello', 'Commentaire
Sur
Plusieurs lignes
Et plus', '2018-06-02 17:04:59.834', NULL);
INSERT INTO public.commentaires (com_id, compte_id, titre, commentaire, createat, deleteat) VALUES (24, 1, 'test', 'test2R', '2018-06-07 17:47:13.422', NULL);
INSERT INTO public.commentaires (com_id, compte_id, titre, commentaire, createat, deleteat) VALUES (25, 1, 'Test', 'Test22r', '2018-06-07 17:54:03.86', NULL);
INSERT INTO public.commentaires (com_id, compte_id, titre, commentaire, createat, deleteat) VALUES (26, 1, 'Bjor', 'Hello', '2018-06-07 23:26:42.794', NULL);
INSERT INTO public.commentaires (com_id, compte_id, titre, commentaire, createat, deleteat) VALUES (27, 1, 'Test', 'Test', '2018-06-08 06:21:21.127', NULL);
INSERT INTO public.commentaires (com_id, compte_id, titre, commentaire, createat, deleteat) VALUES (28, 1, 'Test', 'Test', '2018-06-08 06:21:49.886', '2018-06-08 06:21:52.852833');


--
-- TOC entry 2902 (class 0 OID 20175)
-- Dependencies: 203
-- Data for Name: compte; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.compte (id, nom, prenom, pseudo, mot_de_passe, sexe, adresse_id, accessuser) VALUES (2, 'max', 'mac', 'mix', 'max', 'H', 2, NULL);
INSERT INTO public.compte (id, nom, prenom, pseudo, mot_de_passe, sexe, adresse_id, accessuser) VALUES (3, 'TestToy', 'ToyTest', 'Test', 'test', 'H', 3, NULL);
INSERT INTO public.compte (id, nom, prenom, pseudo, mot_de_passe, sexe, adresse_id, accessuser) VALUES (4, 'Tar', 'Firm', 'Tartar', 'tour', 'H', 4, NULL);
INSERT INTO public.compte (id, nom, prenom, pseudo, mot_de_passe, sexe, adresse_id, accessuser) VALUES (0, '0', '0', '0', '0', 'H', 0, NULL);
INSERT INTO public.compte (id, nom, prenom, pseudo, mot_de_passe, sexe, adresse_id, accessuser) VALUES (5, 'Jean', 'Gilles', 'jeannot', 'motdepasse', 'H', 5, NULL);
INSERT INTO public.compte (id, nom, prenom, pseudo, mot_de_passe, sexe, adresse_id, accessuser) VALUES (6, 'Pierre', 'Jacques', 'Pierrot', 'Pascalou', 'H', 6, NULL);
INSERT INTO public.compte (id, nom, prenom, pseudo, mot_de_passe, sexe, adresse_id, accessuser) VALUES (7, 'maxime', 'Gilles', 'jeannot', 'motdepasse', 'H', 7, 1);
INSERT INTO public.compte (id, nom, prenom, pseudo, mot_de_passe, sexe, adresse_id, accessuser) VALUES (8, 'pj', 'papy', 'PJ758', 'motdepasse', 'H', 8, 1);
INSERT INTO public.compte (id, nom, prenom, pseudo, mot_de_passe, sexe, adresse_id, accessuser) VALUES (1, 'maximilien', 'mad', 'Toys', 'Toysrusse', 'H', 0, 0);
INSERT INTO public.compte (id, nom, prenom, pseudo, mot_de_passe, sexe, adresse_id, accessuser) VALUES (9, 'Jean', 'Gilles', 'jeannot123', 'motdepasse', 'H', 9, 1);
INSERT INTO public.compte (id, nom, prenom, pseudo, mot_de_passe, sexe, adresse_id, accessuser) VALUES (10, 'Jean', 'Gilles', 'jeannot12', 'motdepasse', 'H', 10, 1);


--
-- TOC entry 2906 (class 0 OID 20202)
-- Dependencies: 207
-- Data for Name: droits_acces; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2908 (class 0 OID 28211)
-- Dependencies: 209
-- Data for Name: information; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.information (info_id, info_titre, info_texte, account) VALUES (4, 'RedBull Font&Bleau : place à la finale le 23 juin', 'La grande finale du RedBull Font&Bleau, la compétition de bloc par équipe, se rapproche : tous dans la forêt le samedi 23 juin !

On vous l’annonçait au début de la tournée des qualifications de cette 3e édition du RedBull Font&Bleau… Fin des sept phases qualificatives qui ont connu un fort succès avec plus de 1000 grimpeurs inscrits, et place à la finale ! Quarante équipes de trois grimpeurs s’affronteront pour la finale du Red Bull Font&Bleau 2018 au cœur de la forêt de Fontainebleau le samedi 23 juin.', 1);
INSERT INTO public.information (info_id, info_titre, info_texte, account) VALUES (6, 'Fanny Gibert monte sur le podium ', ' Après un début de saison prometteur, la française Fanny Gibert prend la troisième place sur la Coupe du monde de bloc en Chine. 
Direction Tai''An en Chine pour la 4ème étape de la Coupe du monde de bloc qui nous a une fois de plus réservé quelques surprises. Chez les hommes, l''Israélien Alex Khazanov a été le seul à croiter le bloc 4, ce qui lui a valu de remporter la médaille d''or pour sa première finale internationale. Il devance ainsi la doublette Slovène Jernej Kruder et Gregor Vezonik, respectivement 2ème et 3ème. A noter, nos amis Japonais terminent 4ème et 5ème, un résultat qui met fin à quasi 2 ans et demi, soit 17 Coupes du monde d''affilée, avec au moins un Japonais sur le podium... 
Il n''en est pas de même chez les filles : la doublette Akiyo Noguchi et Miho Nonaka ne laisse une fois de plus que des miettes aux autres concurrentes, et en l''absence des grandes favorites comme Janja Garnbret, Shauna Coxsey ou Petra Klingler, ce coup-ci c''est la Francaise Fanny Gibert qui empoche le bronze, et sauve l''honneur du clan français qui s''est fait malmener sur cette étape... ', 1);
INSERT INTO public.information (info_id, info_titre, info_texte, account) VALUES (8, 'Mawem et Jaubert en Or', ' Doublé historique pour l''équipe de France de vitesse : Anouck Jaubert et Bassa Mawem remportent la Coupe du monde de Tai''an. 
Cette seconde étape chinoise restera marquée au fer rouge ou plutôt bleu blanc rouge ! Après une étape "ratée" la semaine dernière, l''équipe de France de vitesse, menée par ses deux leaders, a décroché le saint Graal à Tai''An. Malmenée en 1/2 finale, Anouck profitera de l''erreur de sa concurrente indonésienne Aries Susanti Rahayu pour se hisser en finale, où elle ne fera qu''une bouchée de Sari Agustina en 7"62 . Chez les hommes, Bassa s''offre, avec le meilleur temps de la compétition (5"61), sa première victoire en Coupe du monde et la seconde marseillaise de la journée. ', 1);
INSERT INTO public.information (info_id, info_titre, info_texte, account) VALUES (10, 'Le Japon encore et toujours', ' La troisième étape de la coupe du monde de Bloc a eu lieu ce week-end en Chine, à Chongqing. Akyo Noguchi et Kokoro Fuji remportent l''or ! 
Une fois n''est pas coutume, direction la Chine pour la suite des aventures internationales et,  à ce jeu-là, le Japon empoche l''or chez les hommes comme chez les femmes. Au-dessus du lot durant tout le week-end, et profitant de l''absence de Janja Garnbret, Shauna Coxsey et Petra Klingler, les deux japonaises Akiyo Noguchi (en or) et sa compatriote Miho Nonaka (en argent) n''ont laissé que quelques miettes aux autres grimpeuses. La serbe Stasa Gejo, championne d''Europe, s''offre elle son premier podium en Coupe du monde en complétant le podium. Chez les hommes, sur les sept japonais en 1/2 finale, un seul se hissera en finale, mais ça suffira pour squatter une fois de plus la plus haute marche du podium. Avec 1 bloc d''avance, Kokoro Fuji s''offre sa quatrième victoire de Coupe du monde en devançant Sean Mc Coll et Alex Rubtsov. On notera aussi l''absence de Jongwon Chon, retenu en Corée pour le championnat national (qu''il remporte).
Coté Français, le week-end n''a pas été a la fête... Malgré des qualif prometteuses avec 7 tricolores en 1/2, aucun ne prendra malheureusement son ticket pour les finales. Un air de revanche sonnera surement le week-end prochain lors de la prochaine étape à Tai''an toujours en Chine. ', 1);
INSERT INTO public.information (info_id, info_titre, info_texte, account) VALUES (12, '"So High", la BD !', ' Après le film et avant les prises, Romain Desgranges sort "So High" la BD.
"So High", une bande dessinée signée Flore Beaudelin et Romain Desgranges aux Editions Paulsen / Guérin, sort aujourd''hui... Au menu de ces 220 pages : Chamonix, St Étienne, Joshua Tree, Arkansas, Alabama, Rockland, Castle Hill, Shanghai, Atlanta, Boulder, Imst, Kranj... Bref, le plein d''aventure en mode BD !
En attendant toutes les infos dans le prochain numéro de Grimper, ce roman graphique est disponible dans toute les librairies ou chez Guérin.

  

Et pour ceux et celles qui n''avaient pas encore vu le film :



Tags : Romain Desgranges, guérin, so high
', 1);
INSERT INTO public.information (info_id, info_titre, info_texte, account) VALUES (14, '"So High", la BD !', ' Après le film et avant les prises, Romain Desgranges sort "So High" la BD.
"So High", une bande dessinée signée Flore Beaudelin et Romain Desgranges aux Editions Paulsen / Guérin, sort aujourd''hui... Au menu de ces 220 pages : Chamonix, St Étienne, Joshua Tree, Arkansas, Alabama, Rockland, Castle Hill, Shanghai, Atlanta, Boulder, Imst, Kranj... Bref, le plein d''aventure en mode BD !
En attendant toutes les infos dans le prochain numéro de Grimper, ce roman graphique est disponible dans toute les librairies ou chez Guérin.

  

Et pour ceux et celles qui n''avaient pas encore vu le film :



Tags : Romain Desgranges, guérin, so high
', 1);
INSERT INTO public.information (info_id, info_titre, info_texte, account) VALUES (16, 'Romain Desgranges dépoussière "Joyeux Léon" ', 'Romain Desgranges s''offre "Joyeux Léon" 26 ans après l''ouverture par Fred Nicole. 
Qui a dit que notre vainqueur de la coupe du monde ne sortait jamais de son gymnase ? Il a profité du retour furtif du soleil pour enchainer en quelques essais "Joyeux leon", ligne mythique et historique ouverte en 1992 par Fred Nicole, qui avec cette dizaine de mouvements, franchissait une nouvelle étape dans l''histoire de l''escalade en annonçant pour la première fois la cotation de 8B+/V14 en trav''. Dave Graham, Fred Rouhling, Ty Landman, Paul Robinson... Tous y sont allés de leur pèlerinage pour tâter les réglettes de cette trav'' située près de Martigny en Suisse. ', 1);


--
-- TOC entry 2898 (class 0 OID 20159)
-- Dependencies: 199
-- Data for Name: liste_droits_acces; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.liste_droits_acces (droit_id, nom_droit) VALUES (0, 'Administrateur');
INSERT INTO public.liste_droits_acces (droit_id, nom_droit) VALUES (1, 'User');
INSERT INTO public.liste_droits_acces (droit_id, nom_droit) VALUES (2, 'SuperUser');


--
-- TOC entry 2907 (class 0 OID 20207)
-- Dependencies: 208
-- Data for Name: mails; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 2905 (class 0 OID 20197)
-- Dependencies: 206
-- Data for Name: page_index; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.page_index (page_id, comid, siteid, topoid) VALUES (11, 11, 0, 1);
INSERT INTO public.page_index (page_id, comid, siteid, topoid) VALUES (13, 13, 0, 1);
INSERT INTO public.page_index (page_id, comid, siteid, topoid) VALUES (14, 14, 6, 0);
INSERT INTO public.page_index (page_id, comid, siteid, topoid) VALUES (15, 15, 0, 2);
INSERT INTO public.page_index (page_id, comid, siteid, topoid) VALUES (16, 16, 0, 1);
INSERT INTO public.page_index (page_id, comid, siteid, topoid) VALUES (18, 18, 0, 1);
INSERT INTO public.page_index (page_id, comid, siteid, topoid) VALUES (19, 19, 0, 1);
INSERT INTO public.page_index (page_id, comid, siteid, topoid) VALUES (20, 20, 0, 1);
INSERT INTO public.page_index (page_id, comid, siteid, topoid) VALUES (21, 21, 0, 1);
INSERT INTO public.page_index (page_id, comid, siteid, topoid) VALUES (22, 22, 0, 1);
INSERT INTO public.page_index (page_id, comid, siteid, topoid) VALUES (23, 23, 0, 1);
INSERT INTO public.page_index (page_id, comid, siteid, topoid) VALUES (24, 24, 0, 0);
INSERT INTO public.page_index (page_id, comid, siteid, topoid) VALUES (25, 25, 17, 0);
INSERT INTO public.page_index (page_id, comid, siteid, topoid) VALUES (26, 26, 9, 2);
INSERT INTO public.page_index (page_id, comid, siteid, topoid) VALUES (27, 27, 0, 2);
INSERT INTO public.page_index (page_id, comid, siteid, topoid) VALUES (28, 28, 6, 2);


--
-- TOC entry 2903 (class 0 OID 20181)
-- Dependencies: 204
-- Data for Name: pret_de_topo; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.pret_de_topo (topo_pret_id, compte_id, topo_id, statut_topo, topotitle, rentdate) VALUES (4, 1, 0, true, 'Fontainebleau', '2018-06-01');
INSERT INTO public.pret_de_topo (topo_pret_id, compte_id, topo_id, statut_topo, topotitle, rentdate) VALUES (5, 1, 0, true, 'Fontainebleau', '2018-06-01');
INSERT INTO public.pret_de_topo (topo_pret_id, compte_id, topo_id, statut_topo, topotitle, rentdate) VALUES (6, 1, 0, true, 'Fontainebleau', '2018-06-01');
INSERT INTO public.pret_de_topo (topo_pret_id, compte_id, topo_id, statut_topo, topotitle, rentdate) VALUES (8, 1, 1, true, 'Fontainebleau', '2018-06-01');
INSERT INTO public.pret_de_topo (topo_pret_id, compte_id, topo_id, statut_topo, topotitle, rentdate) VALUES (11, 1, 1, true, 'Fontainebleau', '2018-06-01');
INSERT INTO public.pret_de_topo (topo_pret_id, compte_id, topo_id, statut_topo, topotitle, rentdate) VALUES (13, 1, 1, true, 'Fontainebleau', '2018-06-01');
INSERT INTO public.pret_de_topo (topo_pret_id, compte_id, topo_id, statut_topo, topotitle, rentdate) VALUES (14, 1, 1, true, 'Fontainebleau', '2018-06-01');
INSERT INTO public.pret_de_topo (topo_pret_id, compte_id, topo_id, statut_topo, topotitle, rentdate) VALUES (15, 1, 2, true, 'Phocéennes', '2018-06-01');
INSERT INTO public.pret_de_topo (topo_pret_id, compte_id, topo_id, statut_topo, topotitle, rentdate) VALUES (17, 1, 2, true, 'Phocéennes', '2018-06-12');


--
-- TOC entry 2896 (class 0 OID 20152)
-- Dependencies: 197
-- Data for Name: site_de_grimpe; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (1, 'Cuvier', 'Ange', '4', '6a', '0', 1, 1);
INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (2, 'Cuvier', 'Chien fou', '3', '8b', '0', 1, 1);
INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (3, 'Dame Blanche', 'Diable', '5', '5a', '0', 1, 1);
INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (4, 'Dame Blanche', 'Hard', '6', '7c', '1', 1, 1);
INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (6, 'Front Falaise', 'Challenge', '10', '6a', '1', 2, 1);
INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (7, 'Front Falaise', 'Hope', '20', '8b', '1', 2, 1);
INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (8, 'Front Falaise', 'Try Hard', '15', '5a', '1', 2, 1);
INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (9, 'Front Falaise', 'Full Control', '20', '7c', '1', 2, 1);
INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (10, 'North Face', 'Project', '43', '6b', '1', 2, 1);
INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (11, 'Hell North', 'Help', '15', '6a', '1', 3, 1);
INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (12, 'Hell North', 'Why ?', '56', '8b', '2', 3, 1);
INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (13, 'Hell North', 'True Life', '23', '5a', '2', 3, 1);
INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (14, 'Hell South', 'Mania', '43', '7c', '1', 3, 1);
INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (15, 'Hell South', 'Hero', '16', '6b', '2', 3, 1);
INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (16, 'Back Door', 'Fly', '56', '6a', '5', 4, 1);
INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (17, 'Back Door', 'Sleep', '75', '8b', '4', 4, 1);
INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (18, 'True Life', 'Climb', '81', '5a', '2', 4, 1);
INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (19, 'True Life', 'Boring', '28', '7c', '4', 4, 1);
INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (20, 'True Life', 'Hell', '39', '6b', '5', 4, 1);
INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (0, '0', '0', '0', '0', '0', 0, 1);
INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (5, 'Dame Blanche', 'Pain and Glory', '5', '6b', '1', 1, 1);
INSERT INTO public.site_de_grimpe (site_id, secteur, voie, hauteur, cotation, nb_points, topo, accountid) VALUES (22, 'La Plage', 'iconique', '10', '9B+', '2', 2, 1);


--
-- TOC entry 2895 (class 0 OID 20144)
-- Dependencies: 196
-- Data for Name: topo; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.topo (topo_id, topo_titre, topo_texte, account) VALUES (3, 'Corse', 'Vous retrouvez sur ces pages quelques-unes des voies que j''ai ouvertes avec mes amis ainsi que des voies plus accessibles que j''aime à partager avec des amateurs curieux des montagnes Corses.', 1);
INSERT INTO public.topo (topo_id, topo_titre, topo_texte, account) VALUES (4, 'Vosges', 'De nombreuses parois, roches et blocs s''offrent à la pratique de l''escalade dans le massif des Vosges. Au cœur d''une nature vivifiante et généreuse, débutants et grimpeurs chevronnés trouveront leur niveau de difficulté tout en profitant de points de vues à couper le souffle !', 1);
INSERT INTO public.topo (topo_id, topo_titre, topo_texte, account) VALUES (12, 'Var', 'Ce lieu magique abrite de nombreuses voies', 1);
INSERT INTO public.topo (topo_id, topo_titre, topo_texte, account) VALUES (0, 'Fontainebleauf', 'Les secteurs d''escalade se r&eacute;partissent dans toute la for&ecirc;t autour de Fontainebleau. Beaucoup de secteurs sont en dehors de la for&ecirc;t de Fontainebleau proprement dite. Ainsi des rochers du Duc (For&ecirc;t D&eacute;partementale des Grands Avaux, Nainville-les-Roches, Beauvais, Champcueil, 44 km de Paris), de la Base de Loisirs de Buthiers (Malesherbes), de la Dame Jouanne et de L''&Eacute;l&eacute;phant (Larchant, 71 km de Paris). Des secteurs sont sur des terrains communaux, et parfois priv&eacute;s : Videlles, Boigneville, le Puiselet.Quelques massifs sont accessibles en train (le rocher Canon &agrave; Bois-le-Roi, Le Calvaire, Le mont Ussy, les rochers d''Avon &agrave; Fontainebleau-Avon, le Restant du Long Rocher &agrave; Bourron-Marlotte, le Petit-Bois, le Gr&eacute;au &agrave; Nemours) ou en RER (La Troche &agrave; Orsay, Chamarande, Maisse, Boigneville, Malesherbes).', 1);
INSERT INTO public.topo (topo_id, topo_titre, topo_texte, account) VALUES (2, 'Phocéennes', 'Topo d''escalade décrivant 38 sites autour de Marseille.', 1);
INSERT INTO public.topo (topo_id, topo_titre, topo_texte, account) VALUES (1, 'Fontainebleau', 'Les secteurs d''escalade se répartissent dans toute la forêt autour de Fontainebleau. Beaucoup de secteurs sont en dehors de la forêt de Fontainebleau proprement dite. Ainsi des rochers du Duc (Forêt Départementale des Grands Avaux, Nainville-les-Roches, Beauvais, Champcueil, 44 km de Paris), de la Base de Loisirs de Buthiers (Malesherbes), de la Dame Jouanne et de L''Éléphant (Larchant, 71 km de Paris). Des secteurs sont sur des terrains communaux, et parfois privés : Videlles, Boigneville, le Puiselet.

Quelques massifs sont accessibles en train (le rocher Canon à Bois-le-Roi, Le Calvaire, Le mont Ussy, les rochers d''Avon à Fontainebleau-Avon, le Restant du Long Rocher à Bourron-Marlotte, le Petit-Bois, le Gréau à Nemours) ou en RER (La Troche à Orsay, Chamarande, Maisse, Boigneville, Malesherbes).', 1);


--
-- TOC entry 2930 (class 0 OID 0)
-- Dependencies: 200
-- Name: adresse_id_seq_1; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.adresse_id_seq_1', 1, false);


--
-- TOC entry 2931 (class 0 OID 0)
-- Dependencies: 202
-- Name: compte_id_seq_2_1; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.compte_id_seq_2_1', 1, false);


--
-- TOC entry 2932 (class 0 OID 0)
-- Dependencies: 210
-- Name: droits_acces_acces_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.droits_acces_acces_id_seq', 1, false);


--
-- TOC entry 2933 (class 0 OID 0)
-- Dependencies: 214
-- Name: information_info_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.information_info_id_seq', 2, true);


--
-- TOC entry 2934 (class 0 OID 0)
-- Dependencies: 198
-- Name: liste_droits_acces_droit_id_seq_1; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.liste_droits_acces_droit_id_seq_1', 1, false);


--
-- TOC entry 2935 (class 0 OID 0)
-- Dependencies: 213
-- Name: pret_de_topo_topo_pret_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.pret_de_topo_topo_pret_id_seq', 17, true);


--
-- TOC entry 2936 (class 0 OID 0)
-- Dependencies: 212
-- Name: site_de_grimpe_site_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.site_de_grimpe_site_id_seq', 6, true);


--
-- TOC entry 2937 (class 0 OID 0)
-- Dependencies: 211
-- Name: topo_topo_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.topo_topo_id_seq', 15, true);


-- Completed on 2018-06-09 13:23:29

--
-- PostgreSQL database dump complete
--

