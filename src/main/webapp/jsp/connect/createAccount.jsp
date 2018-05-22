<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html class = fonds>
<head>
    <meta charset="UTF-8">
    <title>Créer un compte</title>
    <link type="text/css" rel="stylesheet" href="CSS\topo.css" />
</head>
<body>

<%@ include file="../blocktype/head.jsp" %>


<s:if test="#session.user">
    Vous êtes déjà connecté en tant que :
    <s:property value="#session.user.pseudo" /></br>
    <s:a action="disconnect">Cliquez ici pour vous déconnecter</s:a>
</s:if>
<s:else>

<s:actionerror />

<s:form action="createaccount">

    <s:textfield name="account.name" label="name" requiredLabel="true" />
    <s:textfield name="account.firstName" label="firstName" requiredLabel="true" />
    <s:textfield name="account.pseudo" label="pseudo" requiredLabel="true" />
    <s:textfield name="account.password" label="password" requiredLabel="true" />
    <s:select label="Sexe"
              headerKey="-1" headerValue="Choisir Sexe"
              list="{'H', 'F'}"
              name="account.sex"
              value="0" requiredLabel="true"/>

    <s:a action="addaddress">
        <s:checkbox name="addAdress" fieldValue="true" label="Associer une adresse"/>
    </s:a>

    <s:if test = "addAdress = 'True'">
    <s:textfield name="adress.nbStreet" label="nbStreet" requiredLabel="false" />
    <s:textfield name="adress.street" label="street" requiredLabel="false" />
    <s:textfield name="adress.postalCode" label="postalCode" requiredLabel="false" />
    <s:textfield name="adress.city" label="city" requiredLabel="false" />
    <s:textfield name="adress.code" label="code" requiredLabel="false" />
    <s:textfield name="adress.infoSub" label="infoSub" requiredLabel="false" />
    <s:select label="Adresse Principale"
              headerKey="-1" headerValue="Type d'adresse"
              list="{'Oui', 'Non'}"
              name="adress.principalAdress"
              value="0" />
    </s:if>
    <s:submit value="Valider l'inscription"/>
</s:form>

</s:else>

<footer>
    <%@ include file="../blocktype/footer.jsp" %>
</footer>

</body>
</html>
