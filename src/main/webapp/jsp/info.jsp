<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html class = fonds>
<head>
    <meta charset="UTF-8">
    <title>Choisir un Site</title>
    <link type="text/css" rel="stylesheet" href="CSS/topo.css" />
</head>
<body>
<%@ include file="blocktype/head.jsp" %>

<div class = "tribe"></div>
<s:iterator var="Information" value="listInfo">
    <p>
        <s:property value="title" />
    <p>
        <s:property value="info" />
    </p>
</s:iterator>

<div class = "tribe"></div>

<div>
<s:form action="infoadd">
    <s:textfield name="information.title" label="Title" requiredLabel="true" />
    <s:textfield name="information.info" label="Texte" requiredLabel="true" />
    <s:submit value="OK"/>
</s:form>
</div>

<footer>
    <%@ include file="blocktype/footer.jsp" %>
</footer>
</body>
</html>
