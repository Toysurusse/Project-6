<%@ page pageEncoding="UTF-8" %>
<%@ include file="../structure/headboot.jsp" %>

Liste de vos informations personnelles :
<s:form action="updateaccount">
    <s:textfield name="account.name" label="name" requiredLabel="true"/>
    <s:textfield name="account.firstName" label="firstName" requiredLabel="true"/>
    <s:textfield name="account.pseudo" label="pseudo" requiredLabel="true"/>
    <s:textfield name="account.password" label="password" requiredLabel="true"/>
    <s:select label="Sexe"
              list="{'H', 'F'}"
              name="account.sex"
              requiredLabel="true"/>
    <s:submit value="Valider la modification"/>
</s:form>



<p>
    Liste de vos Topos :
</p>
<div class="container">
    <div class="row">
        <div class="col-sm-1"></div>
        <div class="col-sm-9">
            <p>Topos :</p>
        </div>
        <div class="col-sm-1">
            <p>Ajouter Site</p>
        </div>
        <div class="col-sm-1">
            <p>Suppr</p>
        </div>
    </div>
            <s:iterator value="topolist">
            <div class="row">
                <div class="col-sm-1"></div>
                <div class="col-sm-9">
                    <s:a action="listSite">
                        <s:param name="topoid"><s:property value="identifiant"/> </s:param>
                        <s:param name="siteid">0</s:param>
                        <s:property value="location"/>
                    </s:a>
                </div>
                <div class="col-sm-1">
                    <s:a action="newSite">
                        <img src="../../picture/add.jpg" height="10" width="10"/>
                        <s:param name="id"><s:property value="identifiant"/> </s:param>
                    </s:a>
                </div>
                <div class="col-sm-1">
                        <s:a action="deleteTopo">
                            <img src="../../picture/Delete.JPG" height="10" width="10"/>
                            <s:param name="id"><s:property value="identifiant"/> </s:param>
                        </s:a>
                </div>
            </div>
        </s:iterator>
    <div class="col-sm-1"></div>
    <s:a action="newTopo">
        Ajouter un nouveau topo
    </s:a>
</div>
<!-- /.container -->


<p>Liste de vos sites</p>

<div class="container">
    <div class="row">
        <div class="col-sm-1"></div>
        <div class="col-sm-2">
            Topo
        </div>
        <div class="col-sm-2">
            Secteur
        </div>
        <div class="col-sm-2">
            Voie
        </div>
        <div class="col-sm-1">
            <p>Suppr</p>
        </div>
    </div>
    <s:iterator value="hashMapST">
        <div class="row">
            <div class="col-sm-1"></div>
            <div class="col-sm-2">
                <s:property value="value.location"/>
            </div>
            <div class="col-sm-2">
                    <s:property value="key.location"/>
            </div>
            <div class="col-sm-2">
                <s:a action="listSite">
                    <s:param name="topoid"><s:property value="key.topos"/> </s:param>
                    <s:param name="siteid"><s:property value="key.identifiant"/></s:param>
                    <s:property value="key.way"/>
                </s:a>
            </div>
            <div class="col-sm-1">
                <s:a action="deleteSite">
                    <img src="../../picture/Delete.JPG" height="10" width="10"/>
                    <s:param name="id"><s:property value="key.identifiant"/> </s:param>
                </s:a>
            </div>
        </div>
    </s:iterator>
    <div class="col-sm-1"></div>
</div>

<p>
    Liste de vos commentaires :
</p>
<s:iterator value="hashMap">
    <div class="row">
        <div class="col-sm-1"></div>
        <div class="col-sm-3">
            Le <s:property value="key.createAt"/> </br>
            Ecrit par : <s:property value="value.pseudo"/> </br>
        </div>

        <div class="col-sm-7">
            <p>
                <s:property value="key.title"/>
            </p>
            <p>
                <s:property value="key.commentary"/>
            </p>
        </div>
        <div class="col-sm-1">
            <s:a action="deleteadminCom">
                <img src="../../picture/Delete.JPG" height="10" width="10"/>
                <s:param name="id"><s:property value="key.comId"/> </s:param>
            </s:a>
        </div>
        <div class="col-sm-1"></div>
    </div>
    </div>
    <div class="col-md-12 center-block"></div>
</s:iterator>


<%@ include file="../structure/foot.jsp" %>