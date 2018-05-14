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
<ul>
    <s:iterator var="Topo" value="listTopo">
        <p>
        <s:a action="projet_detail">
            <s:param name="id"><s:property value="identifiant" /> </s:param>
            <s:property value="location" />
        </s:a>
        <p>
        <s:property value="resume" />
        </p>
    </s:iterator>
</ul>

</body>
</html>