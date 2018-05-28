<%@ page pageEncoding="UTF-8" %>
<%@ include file="structure/headboot.jsp" %>

<div class="container">

    <div class="starter-template">
<s:iterator var="Topo" value="topolist">
    <div class = "container-fluid">
        <div class = "container-fluid">
            <p>
                <s:property value="location" /> :
                <s:a action="listSite">
                    <s:param name="topoid"><s:property value="topos" /> </s:param>
                    <s:param name="siteid"><s:property value="identifiant" /> </s:param>
                    <s:property value="way" />
                </s:a>

            </p>
                hauteur : <s:property value="height" /> mètres </br>
                difficulté : <s:property value="hardness" /> </br>
                nombre de points d'attache : <s:property value="points_nb" /> </br>
            </br>
            </br>
        </div>
    </div>
</s:iterator>
</div>
</div>


<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>window.jQuery || document.write('<script src="../bootstrap/docs/assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="../bootstrap/dist/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../bootstrap/docs/assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
