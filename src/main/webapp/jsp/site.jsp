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

<div class =  "container-fluid">

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
        <s:a action="connectinit"><input type="button" name="accueil" value="Connectez vous pour ajouter un commentaire"> </s:a>
    </s:else>

</div>
<div class="container">
    <div class="starter-template">

    </div>
</div>




<%@ include file="structure/foot.jsp" %>
