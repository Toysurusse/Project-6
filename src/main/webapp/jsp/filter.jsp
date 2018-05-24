<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html class = fonds>
<head>
    <meta charset="UTF-8">
    <title>Choisir un Topo</title>
    <link type="text/css" rel="stylesheet" href="CSS\topo.css" />
</head>
<body>

<%@ include file="blocktype/head.jsp" %>

<div class = "tribe"></div>
<ul>
    <s:form action="topo_detail">
        <s:select name="topoid" label="topo"
                  list="listTopo" listKey="identifiant" listValue="location"
                  emptyOption="true"
                  requiredLabel="true"/>
        <s:hidden name="siteid" value="0"/>
        <s:submit value="Rechercher ce topo"/>
    </s:form>
</ul>
<ul>
    <s:form action="topo_detail">
        <s:select name="siteid" label="site"
              list="listSite" listKey="identifiant" listValue="way"
              emptyOption="true"
              requiredLabel="true"/>
    <s:submit value="Rechercher ce site"/>
    </s:form>
</ul>

<footer>
    <%@ include file="blocktype/footer.jsp" %>
</footer>

</body>
</html>