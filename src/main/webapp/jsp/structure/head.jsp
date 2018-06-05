<%@ page pageEncoding="UTF-8" %>
<!-- Bootstrap core CSS -->
<link href="../bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<link href="../bootstrap/docs/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="../bootstrap/docs/examples/starter-template/starter-template.css" rel="stylesheet">
<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]>
<script src="../bootstrap/docs/assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
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
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">ClimbWay</a>
        </div>

        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active">
                    <s:a href="#infoList">Info</s:a>
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
                <li>
                    <div class="col-sm-6"></div>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li>
                    <s:if test="#session.user">
                    <div class="row">
                        <div class="text-primary">
                            <s:a href="connected" cssClass="btn btn-primary center-block">
                            Utilisateur connecté :
                            <s:property value="#session.user.pseudo"/>
                            </s:a>
                        </div>
                        <div>
                            <s:a action="disconnect" cssClass="btn btn-primary center-block">Déconnexion</s:a>
                        </div>
                        </s:if>
                        <s:else>
                        <s:a href="connectTry" cssClass="btn btn-default">Se Connecter</s:a>
                        </s:else>
                </li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>




