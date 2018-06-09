<%@ page pageEncoding="UTF-8" %>
<!-- Bootstrap core CSS -->
<link href="../../bootstrap/theme/normalize.css" rel="stylesheet">
<link href="../../bootstrap/theme/fontello.css" rel="stylesheet">
<link href="../../bootstrap/theme/style.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="../../bootstrap/theme/lib/bootstrap/css/bootstrap.css" rel="stylesheet">
<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]>
<script src="../../bootstrap/docs/assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script src="../../bootstrap/docs/assets/js/ie-emulation-modes-warning.js"></script>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
<![endif]-->
</head>

<body>

<header id="header">

<div class="logo">
    <s:a href="accueil"><img src="../../picture/Logo.png" title="Back to Accueil" height="50px" width="50"/></s:a>
</div>

<div class="connect" >
        <s:if test="#session.user">
                <s:a href="connected">
                    info :
                    <s:property value="#session.user.pseudo"/>
                </s:a>
                <s:a action="disconnect">Déconnexion</s:a>
        </s:if>
            <s:else>
                <s:a href="connect">Se Connecter</s:a>
            </s:else>
</div>

<div class="navigate">
    <ul>
        <li>
            <s:a href="accueil" cssClass="boutonConnect">Info</s:a>
        </li>
        <li>
            <s:a href="filter">Filtrer</s:a>
        </li>
        <li>
            <s:a href="listTopo">Topos</s:a>
        </li>
        <li>
            <s:a href="rent">Louer un topo</s:a>
        </li>
    </ul>
</div>
</header>

<div class="containerstructure">





