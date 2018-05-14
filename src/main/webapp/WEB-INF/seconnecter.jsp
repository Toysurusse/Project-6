<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html class = fonds>
<head>
    <title>Se Connecter</title>
    <link type="text/css" rel="stylesheet" href="CSS\seconnecter.css" />
</head>
<body>

<%@ include file="index.jsp" %>

<div class ="Article">
<c:choose>
    <c:when test="${ !empty sessionScope.pseudo && !empty sessionScope.password }">
        <p>Vous êtes connecté avec le compte : ${ sessionScope.pseudo } !</p

        <p>Vous pouvez poursuivre votre navigation.</p>
    </c:when>

    <c:when test="${ empty sessionScope.pseudo && empty sessionScope.password }">
    <form method="post" action="connect">
        <p>
            <label for="pseudo">Pseudo : </label>
            <input type="text" name="pseudo" id="pseudo" />
        </p>
        <p>
            <label for="password">Password : </label>
            <input type="text" name="password" id="password" />
        </p>
        <div>
            <input type="submit" class = "ButMenu"/>
            <a href="http://localhost:8080/createaccount" target="_blank"> <input type="button" name="accueil" value="Créer un compte" class ="ButMenu"> </a>
        </div>
    </form>
    </c:when>
</c:choose>
    <c:forEach var="account" items="${ accounts }">
                <div>
                    <c:out value="${ account.getId ()}" /> <c:out value="${ account.getName ()}" />
                </div>
                <div>
                    <c:out value="${ account.getFirstName()}" /> /</br>
                    <c:out value="${ account.getPseudo()}" /> /</br>
                    <c:out value="${ account.getPassword()}" /> /</br>
                    <c:out value="${ account.getSex()}" /> /</br>
                    <c:out value="${ account.getAdresseId()}" /> /</br>
                </div>
            <div class = "bordure"></div>
    </c:forEach>
</div>
</body>
</html>
