<%@ page pageEncoding="UTF-8" %>
<%@ include file="structure/layout.jsp" %>
<title>Accueil</title>
<%@ include file="structure/head.jsp" %>


    <s:iterator var="Information" value="informationList">
        <div class="container">
        <h2>
            <s:property value="title"/>
        </h2>
        <p>
            <s:property value="info"/>
        </p>
        </div>
        </br>
    </s:iterator>


<%@ include file="structure/foot.jsp" %>
