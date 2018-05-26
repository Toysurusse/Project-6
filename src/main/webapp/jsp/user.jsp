<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../picture/Logo.png">
    <title>Accueil</title>
    <!-- Bootstrap core CSS -->
    <link href="../bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="../bootstrap/docs/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="../bootstrap/docs/examples/starter-template/starter-template.css" rel="stylesheet">
    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]><script src="../bootstrap/docs/assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
    <script src="../bootstrap/docs/assets/js/ie-emulation-modes-warning.js"></script>
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">ClimbWay</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <%@ include file="head.jsp" %>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>

<div class="container">

    <div class="starter-template">

        <div class = "container-fluid">
            <div class = "container-fluid">
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
            <div>
                <div class = "container-fluid">
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
                <div class = "container-fluid">
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
        </div>


        <h1>test</h1>

        <s:property value="userBo"/>
        <s:property value="userBo"/>

        <h1>Bootstrap starter template</h1>
        <p class="lead">Use this document as a way to quickly start any new project.<br> All you get is this text and a mostly barebones HTML document.</p>
    </div>

</div><!-- /.container -->


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="../bootstrap/docs/assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="../bootstrap/dist/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../bootstrap/docs/assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
