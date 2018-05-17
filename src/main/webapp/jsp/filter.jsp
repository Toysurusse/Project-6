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
    <s:form action="topo_detail">
        <s:select name="topoid" label="topo"
                  list="listTopo" listKey="identifiant" listValue="location"
                  emptyOption="true"
                  requiredLabel="true"/>
        <s:select name="topoid" label="site"
              list="listSite" listKey="identifiant" listValue="way"
              emptyOption="true"
              requiredLabel="true"/>
    <s:submit value="Rechercher"/>
    </s:form>
</ul>


<footer>
    <%@ include file="index.jsp" %>
</footer>

</body>
</html>