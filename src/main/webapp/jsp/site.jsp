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
        <s:a action="site_detail">
        <s:param name="topoid"><s:property value="identifiant" /> </s:param>
        <s:param name="siteId"><s:property value="identifiant" /> </s:param>
            <s:property value="location" />
        </s:a>
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

<div class = "ComFrame">
<s:form action="addCom">
    <s:textfield name="title" label="title" requiredLabel="true" />
    <s:textfield name="commentaire" label="commentaire" requiredLabel="true" />
    <s:submit value="OK"/>
</s:form>
</div>

<s:iterator var="Commentaire" value="listCommentaire">
<div class = "ComFrame">
    <div>
    <p>
        <s:property value="title" />
    </p>
    <p>
        <s:property value="commentary" />
    </p>
    </div>
    <div class = Delete>
        <s:a action="deleteCom">
            <s:param name="comid"><s:property value="comId" /> </s:param>
            Suppr
        </s:a>
    </div>
</div>
</s:iterator>


<footer>
    <%@ include file="index.jsp" %>
</footer>

</body>
</html>
