# Projet 6 OPC

# Site Escalade

## Organisation du répertoire

*   `src` : Application java Struts2
	*   `dao` : Gestion de la BDD
	*   `menu.action` : couche service
	*   `entity` : entité
	*   `ressources` : Fichiers de propriété et de paramétrage de struts2, log4j2.xml pour les logs
	*   `webapp` : gestion du front
    	*   `bootstrap` : gestion du thème
    	*   `jsp` : affichage des pages
    	*   `WEBINF` : gestion des beans et du fichier web.xml
*   `pom.xml` : gestion maven


## Environnement de développement

L'application java est packagée par le fichier pom.xml. Il permet de générer l'application sous forme de war. 
*   `mvn clean install` : Génération du war

Le war peut être lancé sur un tomcat. Il peut être lancé via le dossier bin; le fichier war peut être lancé en commande ou via l'interface disponnible sur le port du tomcat via navigateur web.

Il comporte :

*   un schema de la bdd pour charger les données d'installation (postgreSQL).
*   le fichier war
*   Le pom.xml (mvn)
*   le fichier readme.md
*   le fichier gitIgnore
*   l'application java



### Lancement

    mvn clean install
    exécuter catalina.bat sur windows
    exécuter catalina.sh sur linux


### Arrêt

    exécuter stop.bat sur windows
    exécuter stop.sh sur linux


### Remise à zero

    restaure BDD
 
 ## Contributeurs
 
 Maximilien LeBoiteux alias ToyTheRusse : https://github.com/Toysurusse
 
 Ce projet est libre de droit et disponible gratuitement : https://github.com/Toysurusse/Project-6/
 
 ## License
 
 This project is open source
 
