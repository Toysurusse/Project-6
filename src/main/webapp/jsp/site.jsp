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

<s:iterator var="Site" value="listSite">
    <p>
        <s:a action="topo_detail">
            <s:param name="topoid"><s:property value="topos" /> </s:param>
            <s:param name="siteid"><s:property value="identifiant" /> </s:param>
            <s:property value="location" /> :
        </s:a>
        <s:property value="way" />
    </p>
    <p>
        hauteur : <s:property value="height" /> mètres </br>
        difficulté : <s:property value="hardness" /> </br>
        nombre de points d'attache : <s:property value="points_nb" /> </br>
    </p>
</s:iterator>

<div class = "ComFrame">

    <s:if test="#session.user">
        <s:form action="addcom">
            <s:hidden name="commentaire.topoId" value="%{topoid}" />
            <s:hidden name="commentaire.siteId" value="%{siteid}" />
            <s:hidden name="commentaire.account" value="%{#session.user.id}" />
            <s:textfield name="commentaire.title" label="title" requiredLabel="true" />
            <s:textfield name="commentaire.commentary" label="commentaire" requiredLabel="true" />
            <s:submit value="OK"/>
        </s:form>
    </s:if>
    <s:else>
        <s:a action="connectinit"><input type="button" name="accueil" value="Connectez vous pour ajouter un commentaire" class ="ButMenu"> </s:a>
    </s:else>

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
            <s:param name="commentaire.topoId" value="%{topoid}" />
            <s:param name="commentaire.siteId" value="%{siteid}" />
            <img src="../CSS/picture/Delete.JPG"  height="10" width="10"/>
            <s:param name="id"><s:property value="comId" /> </s:param>
        </s:a>
    </div>
</div>
</s:iterator>

<footer>
    <%@ include file="blocktype/footer.jsp" %>
</footer>

</body>
</html>
