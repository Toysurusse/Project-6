<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <title>Accueil</title>
    <link type="text/css" rel="stylesheet" href="CSS\index.css" />
</head>
<body class = "fonds">

<div class = "TitlePage">
    <div class = "logo">
    </div>
    <div class = "titre">
        <h1>Choisissez un topo !</h1>
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
</div>

<div class = "tribe"></div>

<%@ include file="index.jsp" %>


<form name="form1" method="post" action="filter">
    <div>
        <select name="topochoisi">
            <option value= "0"><c:out value="Choisir" /></option>
            <c:forEach var="topo" items="${ topos }">
                <c:if test = "${topo.getID () != 0}">
                    <option value=<c:out value="${ topo.getID ()}" /> <c:out value="${ topo.getLocation ()}" />><c:out value="${ topo.getLocation ()}" /></option>
                </c:if>
            </c:forEach>
        </select>
    </div>

    <select  name="sitechoisi">
        <div>
            <option value= "0"><c:out value="Choisir" /></option>
            <c:forEach var="topo" items="${ topos }">
                <c:if test = "${topo.getID () != 0}">
                    <optiongroup label=<c:out value="${ topo.getLocation ()}" />><c:out value="${ topo.getLocation ()}" />
                        <c:forEach var="site" items="${ sites }">
                            <c:if test = "${site.getTopos () == topo.getID ()}">
                                <option value= "<c:out value="${ site.getId ()}" />"><c:out value="${ site.getWay ()}" /></option>
                            </c:if>
                        </c:forEach>
                    </optiongroup>
                </c:if>
            </c:forEach>
        </div>
    </select>
    <div>
        <input type="submit" value="Envoyer" class = "ButMenu">
    </div>
</form>


<div class ="sub">
    <div  class = "Article">
        <div>
            <u><c:out value="${ topoChoix.getID ()}" /> <c:out value=" ${ topoChoix.getLocation () }" /></u>
        </div>
        <div>
            <c:out value="${ topoChoix.getResume ()}" />
        </div>
</div>
</div>

<div class ="sub">
    <div  class = "Article">
        <div>
            <u><c:out value="${ siteChoix.getId ()}" /> <c:out value=" ${ siteChoix.getLocation () }" /></u>
        </div>
        <div>
                <c:out value="${ siteChoix.getId () }"/>
                <c:out value="${ siteChoix.getLocation()}"/>
                <c:out value="${ siteChoix.getWay()}"/>
                <c:out value=" ${ siteChoix.getHeight() }"/>
                <c:out value="${ siteChoix.getHardness() }"/>
                <c:out value=" ${ siteChoix.getPoints_nb() }"/>
                <c:out value="${ siteChoix.getTopos() }"/>
        </div>
    </div>
</div>

</body>
</html>
