<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>

<head>
    <title>Accueil</title>
    <link type="text/css" rel="stylesheet" href="CSS\index.css" />
</head>

<header>
    <div class = "logo">
    </div>
    <div class = "titre">
        <h1>Bienvenue sur notre site d'escalade !</h1>
    </div>
    <div>
        <c:choose>
            <c:when test="${ !empty sessionScope.pseudo && !empty sessionScope.password }">
                <p>Bienvenu ${ sessionScope.pseudo } !</p>
            </c:when>
            <c:when test="${ empty sessionScope.pseudo && empty sessionScope.password }">
                <a href="http://localhost:8080/connect" target="_blank"> <input type="button" name="share"  value="Se Connecter" class ="ButMenu"> </a>
            </c:when>
        </c:choose>

    </div>
</header>

<body class = "fonds">

<s:a action="list_topo">Liste des projets</s:a>

<div class = "FirstPage">
    <div class = "bordure"></div>
    <div class = "Article">
        <h2>
            Jernej Kruder, l'homme du moment !
        </h2>
        <p>
            Après avoir remporté deux médailles en deux Coupes du monde, le slovène s'offre "Water World" 9a.
        </p>
        <p>
            Sans contestation, Jernej Kruder a fait une bonne préparation hivernale. Après avoir remporté la première Coupe du monde de bloc et empoché l'argent sur la seconde, le slovène a croité les 55 mètres de toit de "Water World" 9a à OSP/Misja Pec. Avant de s'envoler pour la Chine pour la suite des Coupes du monde de bloc, cette performance "lactique" ne passe pas inaperçue pour les bookmakers olympiques...
        </p>
    </div>
    <div class = "bordure"></div>
    <div>
        <div class = "Article">
            <h2>
                Ethan Pringle plie "Moonlight Buttress"
            </h2>
            <p>
                L'américain Ethan Pringle s'offre l'ascension flash de la classique "Moonlight Buttress".
            </p>
            <p>
                Les 200 m de ce bestseller du parc de Zion dans l'Utah n'ont pas été ménagés par Ethan Pringle qui n'en a fait qu'une bouchée : 10 longueurs sur coinceurs entre 5.8 et 5.12+ (5b à 7c) qu'il commente en toute simplicité : "Ce fut une journée mémorable, sans tomber ni craquer mon pantalon. J'ai l'impression d'avoir escaladé El Cap. Y a-t-il une autre voie dans le monde avec autant de fissures à doigt à la suite ? Et dans un si bel endroit ? "
            </p>
        </div>
        <div class = "bordure"></div>
        <div class = "Article">
            <h2>
                V13 pour Alex Puccio
            </h2>
            <p>
                De retour sur le rocher après une session "training" en vue des compétitions, l'américaine Alex Puccio s'offre en quelques essais “Green in the Face” V13/8B.
            </p>
            <p>
                En vue de son trip européen et des coupes du monde de cet été, Alex Puccio s'était enfermée dans son pan pour l'entrainement, mais elle s'est tout de même autorisée une journée pour prendre l'air à Castle Rock Idaho, quelque part entre Salt Lake et Seattle, et en revient avec “Green in the Face” V13, soit un nouveau 8b bloc à son actif... Normal !
            </p>
        </div>
    </div>
    <div class = "bordure"></div>
</div>

<footer>
    <%@ include file="index.jsp" %>
</footer>

</body>
</html>