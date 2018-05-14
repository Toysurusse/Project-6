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
        <h1>Liste des différents Topos</h1>
    </div>
    <div>

    </div>
</div>
<div class = "tribe"></div>

<s:iterator var="Site" value="listSite">
    <p>
        <s:property value="location" />
    <p>
        <s:property value="way" /> :
    </p>
    <p>
        hauteur : <s:property value="height" /> </br>
        difficulté : <s:property value="hardness" /> </br>
        nombre de points : <s:property value="points_nb" /> </br>
    </p>
    </br>
</s:iterator>



</body>
</html>
