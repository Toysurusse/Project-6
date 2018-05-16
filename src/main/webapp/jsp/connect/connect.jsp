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
<div class = "TitlePage">
    <div class = "logo">
    </div>
    <div class = "titre">
        <h1>Connectez-vous</h1>
    </div>
    <div>

    </div>
</div>
<div class = "tribe"></div>

    <s:actionerror />

    <s:form action="connecttry">
        <s:textfield name="pseudo" label="pseudo" requiredLabel="true" />
        <s:textfield name="password" label="password" requiredLabel="true" />
        <s:submit value="OK"/>
    </s:form>
</body>
</html>