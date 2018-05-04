
<!DOCTYPE html>
<html>
<head>
    <title>Accueil</title>
    <link type="text/css" rel="stylesheet" href="PageCSS\index.css" />
</head>
<body>
<h1>Bienvenu sur notre site d'escalade !</h1>

<p>Vous souhaitez ?</p>

<div>
    <p><c:out value ="Bonjour !"/></p>
    <a href="http://localhost:8080/accueil" target="_blank"> <input type="button" name="share"  value="partager une information"> </a>
</div>
<div>
    <a href="http://localhost:8080/filtre" target="_blank"> <input type="button" name="filtre" value="Rechercher un site de grimpe"> </a>
</div>
<div>
    <a href="http://localhost:8080/topo" target="_blank"> <input type="button" name="topos" value="Accéder aux topos"> </a>
</div>
<div>
    <a href="http://localhost:8080/accueil" target="_blank"> <input type="button" name="accueil" value="Louer un topo"> </a>
</div>
<div>
    <a href="http://localhost:8080/inscription" target="_blank"> <input type="button" value="Vous inscrire ?"> </a>
</div>

</body>
</html>