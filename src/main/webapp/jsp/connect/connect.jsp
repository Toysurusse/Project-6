<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html class = fonds>
<head>
    <meta charset="UTF-8">
    <title>Topos</title>
    <link type="text/css" rel="stylesheet" href="CSS\topo.css" />
</head>
<body>

<%@ include file="../blocktype/head.jsp" %>

<div class = "tribe"></div>

    <s:actionerror />

    <s:form action="connecttry">
        <s:textfield name="pseudo" label="pseudo" requiredLabel="true" />
        <s:textfield name="password" label="password" requiredLabel="true" />
        <s:submit value="OK"/>
    </s:form>

<footer>
    <%@ include file="../blocktype/footer.jsp" %>
</footer>

</body>
</html>