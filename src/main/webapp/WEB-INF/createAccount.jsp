<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html class = fonds>
<head>
    <title>Se Connecter</title>
    <link type="text/css" rel="stylesheet" href="CSS\seconnecter.css" />
</head>
<body>

<%@ include file="index.jsp" %>

<c:choose>
    <c:when test="${ !empty sessionScope.pseudo && !empty sessionScope.password }">
        <p>Bienvenu ${ sessionScope.pseudo } !</p>
        <p>Vous pouvez poursuivre votre navigation</p>
    </c:when>
    <c:when test="${ empty sessionScope.pseudo && empty sessionScope.password }">

<form method="post" action="createaccount">
    <div class ="sub">
        <div class = "bordureW"></div>
        <div class = Article>
            <p>
                <label for="pseudo" class="formulary">pseudo : </label>
                <input type="text" name="pseudo" id="pseudo" />
            </p>
            <p>
                <label for="password" class="formulary">password : </label>
                <input type="text" name="password" id="password" />
            </p>
            <p>
                <label for="passwordControl" class="formulary">passwordControl : </label>
                <input type="text" name="passwordControl" id="passwordControl" />
            </p>
            <p>
                <label for="firstName" class="formulary">firstName : </label>
                <input type="text" name="firstName" id="firstName" />
            </p>
            <p>
                <label for="name" class="formulary">name : </label>
                <input type="text" name="name" id="name" />
            </p>

            <div class=alignV>
            <div><p>Sexe : </p></div>
            <select name="sexChoisi">
                        <option value=<c:out value="H" />><c:out value="H" /></option>
                        <option value=<c:out value="F" />><c:out value="F" /></option>
            </select>
            </div>

            <p>
                <label for="nbStreet" class="formulary">nbstreet : </label>
                <input type="text" name="nbStreet" id="nbStreet" />
            </p>
            <p>
                <label for="street" class="formulary">street : </label>
                <input type="text" name="street" id="street" />
            </p>
            <p>
                <label for="postalCode" class="formulary">postalCode : </label>
                <input type="text" name="postalCode" id="postalCode" />
            </p>
            <p>
                <label for="city" class="formulary">city : </label>
                <input type="text" name="city" id="city" />
            </p>
            <p>
                <label for="code" class="formulary">code : </label>
                <input type="text" name="code" id="code" />
            </p>
            <p>
                <label for="infoSub" class="formulary">infoSub : </label>
                <input type="text" name="infoSub" id="infoSub" />
            </p>

            <div class=alignV>
                <div><p>Adresse Principale : </p></div>
            <select name="principalAdress">
                <option value=<c:out value="True" />><c:out value="Oui" /></option>
                <option value=<c:out value="False" />><c:out value="Non" /></option>
            </select>
            </div>

            <input type="submit"  class ="ButMenu"/>
            <a href="http://localhost:8080/connect" target="_blank"> <input type="button" name="accueil" value="Se Connecter" class ="ButMenu"> </a>
        </div>
        <div class = "bordureW"></div>
    </div>
</form>

    </c:when>
</c:choose>

</body>
</html>
