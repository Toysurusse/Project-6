<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html class = fonds>
<head>
    <title>Topos</title>
    <link type="text/css" rel="stylesheet" href="CSS\topo.css" />
</head>
<body>
<div class = "TitlePage">
    <div class = "logo">
    </div>
    <div class = "titre">
        <h1>Liste des différents Topos</h1>
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

        <c:forEach var="topo" items="${ topos }">
            <c:if test = "${topo.getID () != 0}">
                <div class ="sub">
                <div class = "bordureW"></div>
                <div  class = "Article">
                <div>
                <u><c:out value="${ topo.getID ()}" /> <c:out value="${ topo.getLocation ()}" /></u>
                </div>
                <div>
                    <c:out value="${ topo.getResume ()}" /> /</br>
                </div>
                <div class = "bordureH"></div>
                </div>
                <div class = "bordureW"></div>
                </div>
            </c:if>
        </c:forEach>
        <c:forEach var="commentaire" items="${ commentaires }">
            <div class ="sub">
            <div class = "bordureW"></div>
            <div  class = "Article">
                <div>
                    <u><c:out value="${ commentaire.getComId ()}" /> <c:out value="${ commentaire.getTitle ()}" /></u>
                </div>
                <div>
                    <c:out value="${ commentaire.getCommentary ()}" /> /</br>
                </div>
                <div class = "bordureH"></div>
            </div>
            <div class = "bordureW"></div>
            </div>
        </c:forEach>

<form method="post" action="topo">
    <div class ="sub">
        <div class = "bordureW"></div>
        <div class = Article>
            <p>
                <label for="Commentary">Commentary : </label>
                <input type="text" name="Commentary" id="Commentary" />
            </p>
            <p>
                <label for="Title">Title : </label>
                <input type="text" name="Title" id="Title" />
            </p>
            <input type="submit" class ="ButMenu" />
        </div>
        <div class = "bordureW"></div>
    </div>
    <input type="submit" />
    </div>
    <div class = "bordureW"></div>
    </div>
</form>



</body>
</html>