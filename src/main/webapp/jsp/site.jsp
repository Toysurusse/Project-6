<%@ page pageEncoding="UTF-8" %>
<%@ include file="structure/headboot.jsp" %>

<div class="container">

    <div class="starter-template">
<s:iterator var="Topo" value="sitelist">
    <div class = "container-fluid">
        <div class = "container-fluid">
            <p>
                <s:a action="listSite">
                    <s:param name="topoid"><s:property value="topos" /> </s:param>
                    <s:param name="siteid"><s:property value="identifiant" /> </s:param>
                    <s:property value="location" /> : <s:property value="way" />
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


<%@ include file="structure/foot.jsp" %>
