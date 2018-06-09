<%@ page pageEncoding="UTF-8" %>
<%@ include file="structure/layout.jsp" %>
<title>Site</title>
<%@ include file="structure/head.jsp" %>

<div class="container">

    <div class="starter-template">
        <s:iterator var="Topo" value="sitelist">
            <div class="container-fluid">
                <div class="container-fluid">
                    <p>
                        <s:a action="listSite">
                            <s:param name="topoid"><s:property value="topos"/> </s:param>
                            <s:param name="siteid"><s:property value="identifiant"/> </s:param>
                            <s:property value="location"/> : <s:property value="way"/>
                        </s:a>
                    </p>
                    hauteur : <s:property value="height"/> mètres </br>
                    difficulté : <s:property value="hardness"/> </br>
                    nombre de points d'attache : <s:property value="points_nb"/> </br>
                    </br>
                    </br>
                </div>
            </div>
        </s:iterator>
    </div>
</div>

<div class="row border border-info">
    <div class="col-sm-1"></div>
    <div class="col-sm-10">
        <s:if test="#session.user">

            <label class="starter-template center-block text-md-center">
                Ajouter un site d'escalade à ce topo :
                <s:a action="newSite">
                    <img src="../../picture/add.jpg" height="10" width="10"/>
                    <s:param name="id"> <s:property value="topoid"/> </s:param>
                </s:a>
            </label>

            <s:form action="addcom" theme="simple">
                <s:hidden name="commentaire.topoId" value="%{topoid}"/>
                <s:hidden name="commentaire.siteId" value="%{siteid}"/>
                <s:hidden name="commentaire.account" value="%{#session.user.id}"/>
                <div class="form-group">
                    <label for="comment">Titre :</label>
                    <s:textarea name="commentaire.title" label="title" requiredLabel="true" class="form-control"
                                rows="1" id="titre"/>
                </div>
                <div class="form-group">
                    <label for="comment">Comment :</label>
                    <s:textarea name="commentaire.commentary" label="commentaire" requiredLabel="true"
                                class="form-control" rows="5" id="comment"/>
                </div>
                <s:submit value="OK" cssClass="btn btn-primary"/>
            </s:form>
        </s:if>
        <s:else>
            <s:a action="connectTry"
                 class="btn btn-primary center-block">Connectez vous pour ajouter un commentaire</s:a>
        </s:else>
    </div>
    <div class="col-sm-1"></div>
</div>

<div class="col-md-12 center-block"></div>
<s:iterator value="hashMap">

    <div class="col-sm-1"></div>
    <div class="container">
        <div class="col-sm-3">
            Le <s:property value="key.createAt"/> </br>
            Ecrit par : <s:property value="value.pseudo"/> </br>
        </div>

        <div class="col-sm-6">
            <pre>
                <s:property value="key.title"/>
                <s:property value="key.commentary"/>
            </pre>
        </div>
        <div class="col-sm-1">
            <s:if test="%{#session.user.id==key.account}">
                <s:a action="deleteCom">
                    <s:param name="commentaire.topoId" value="%{topoid}"/>
                    <s:param name="commentaire.siteId" value="%{siteid}"/>
                    <img src="../picture/Delete.JPG" height="10" width="10"/>
                    <s:param name="id"><s:property value="key.comId"/> </s:param>
                </s:a>
            </s:if>
        </div>
    </div>
    </div>
    </br>
    <div class="col-md-12 center-block"></div>
</s:iterator>


<%@ include file="structure/foot.jsp" %>
