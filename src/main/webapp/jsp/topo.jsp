<%@ page pageEncoding="UTF-8" %>
<%@ include file="structure/layout.jsp" %>
<title>Topo</title>
<%@ include file="structure/head.jsp" %>
<div class="container">
    <div class="starter-template">
        <div class = "container-fluid">
        <s:iterator var="Topo" value="topolist">

            <s:a action="listSite">
                <s:param name="topoid"><s:property value="identifiant" /> </s:param>
                <s:param name="siteid">0</s:param>
                <s:property value="location" />
            </s:a>
            <pre class="text-md-center">
                <s:property value="resume" />
            </pre>
        </s:iterator>
    </div>

</div><!-- /.container -->
</div>




<%@ include file="structure/foot.jsp" %>