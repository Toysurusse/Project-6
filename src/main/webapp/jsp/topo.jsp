<%@ page pageEncoding="UTF-8" %>
<%@ include file="structure/headboot.jsp" %>
<div class="container">
    <div class="starter-template">
        <div class = "container-fluid">
        <s:iterator var="Topo" value="topolist">

            <s:a action="listSite">
                <s:param name="topoid"><s:property value="identifiant" /> </s:param>
                <s:param name="siteid">0</s:param>
                <s:property value="location" />
            </s:a>
            <p>
                <s:property value="resume" />
            </p>
        </s:iterator>
    </div>

</div><!-- /.container -->
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
