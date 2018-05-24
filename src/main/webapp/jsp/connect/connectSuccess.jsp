<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html class = fonds>
<head>
    <meta charset="UTF-8">
    <title>Connecté</title>
    <link type="text/css" rel="stylesheet" href="CSS\topo.css" />
</head>
<body>

<%@ include file="../blocktype/head.jsp" %>

<div class = "tribe"></div>
<p>
Liste de vos commentaires :
</p>
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
            <s:a action="deleteComDATA">
                <img src="../CSS/picture/Delete.JPG"  height="10" width="10"/>
                <s:param name="id"><s:property value="comId" /> </s:param>
            </s:a>
        </div>
    </div>
</s:iterator>

<footer>
    <%@ include file="../blocktype/footer.jsp" %>
</footer>

</body>
</html>
