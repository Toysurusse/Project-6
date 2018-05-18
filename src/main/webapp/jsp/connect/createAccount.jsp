<%--
  Created by IntelliJ IDEA.
  User: maxle
  Date: 14/05/2018
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%@ include file="../blocktype/head.jsp" %>

<s:form action="newaccount">

    <s:textfield name="account.id" label="id" requiredLabel="true" />
    <s:textfield name="account.name" label="name" requiredLabel="true" />
    <s:textfield name="account.firstName" label="firstName" requiredLabel="true" />
    <s:textfield name="account.pseudo" label="pseudo" requiredLabel="true" />
    <s:textfield name="account.password" label="password" requiredLabel="true" />
    <s:select label="Sexe :"
              headerKey="-1" headerValue="Sexe :"
              list="{'H', 'F'}"
              name="account.sex"
              value="0" />
    <s:textfield name="account.adresseId" label="adresseId" requiredLabel="true" />

    <s:textfield name="adress.adressId" label="adressId" requiredLabel="true" />
    <s:textfield name="adress.nbStreet" label="nbStreet" requiredLabel="true" />
    <s:textfield name="adress.street" label="street" requiredLabel="true" />
    <s:textfield name="adress.postalCode" label="postalCode" requiredLabel="true" />
    <s:textfield name="adress.city" label="city" requiredLabel="true" />
    <s:textfield name="adress.code" label="code" requiredLabel="true" />
    <s:textfield name="adress.infoSub" label="infoSub" requiredLabel="true" />
    <s:select label="Adresse Principale :"
              headerKey="-1" headerValue="Adresse Principale :"
              list="{'Oui', 'Non'}"
              name="adress.principalAdress"
              value="0" />

    <s:submit value="OK"/>
</s:form>

<footer>
    <%@ include file="../blocktype/footer.jsp" %>
</footer>

</body>
</html>
