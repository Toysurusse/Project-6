<%@ page pageEncoding="UTF-8" %>
<%@ include file="../structure/layout.jsp" %>
<title>Connect Success</title>
<%@ include file="../structure/head.jsp" %>


<label class="starter-template center-block text-md-center">Information du compte</label>

<div class="container">
    <table class="col-md-2 col-md-offset-5">
        <tr>
            <th>Nom</th>
            <th>
                <s:property value="%{account.name}"/>
            </th>
        </tr>
        <tr>
            <th>Prénom</th>
            <th>
                <s:property value="%{account.firstName}"/>
            </th>
        </tr>
        <tr>
            <th>Pseudo :</th>
            <th>
                <s:property value="%{account.pseudo}"/>
            </th>
        </tr>
        <tr>
            <th>Sexe :</th>
            <th>
                <s:property value="%{account.sex}"/>
            </th>
        </tr>
    </table>

    <div class="col-sm-12"></div>
</div>
<label class="starter-template center-block text-md-center">Information adresse</label>
</div>
<div class="container">
    <table class="col-md-2 col-md-offset-5">
        <tr>
            <th>Numéro de rue :</th>
            <th>
                <s:property value="%{adress.nbStreet}"/>
            </th>
        </tr>
        <tr>
            <th>Rue :</th>
            <th>
                <s:property value="%{adress.street}"/>
            </th>
        </tr>
        <tr>
            <th>Code Postal :</th>
            <th>
                <s:property value="%{adress.postalCode}"/>
            </th>
        </tr>

        <tr>
            <th>Ville :</th>
            <th>
                <s:property value="%{adress.city}"/>
            </th>
        </tr>
        <tr>
            <th>Code :</th>
            <th>
                <s:property value="%{adress.code}"/>
            </th>
        </tr>
        <tr>
            <th>Info :</th>
            <th>
                <s:property value="%{adress.infoSub}"/>
            </th>
        </tr>
    </table>
    <div class="col-sm-12"></div>
</div>
<s:a action="updateA" cssClass="center-block text-center">Mettre à jour vos informations personnelles</s:a>
<div class="col-sm-12"></div>
<label class="starter-template center-block text-md-center">Liste de vos Topos :</label>

<div class="align-center">
    <table class="table-striped table">
        <tr>
            <th>Topos :</th>
            <th>Ajouter Site</th>
            <th>Suppr</th>
        </tr>
        <s:iterator value="topolist">
            <tr>
                <th>
                    <s:a action="listSite">
                        <s:param name="topoid"><s:property value="identifiant"/> </s:param>
                        <s:param name="siteid">0</s:param>
                        <s:property value="location"/>
                    </s:a>
                </th>
                <th>
                    <s:a action="newSite">
                        <img src="../../picture/add.jpg" height="10" width="10"/>
                        <s:param name="id"><s:property value="identifiant"/> </s:param>
                    </s:a>
                </th>
                <th>
                    <s:a action="deleteTopo">
                        <img src="../../picture/Delete.JPG" height="10" width="10"/>
                        <s:param name="id"><s:property value="identifiant"/> </s:param>
                    </s:a>
                </th>
            </tr>
        </s:iterator>
    </table>
    <s:a action="newTopo" cssClass="center-block text-center">
        Ajouter un nouveau topo
    </s:a>
</div>

<label class="starter-template center-block text-md-center">Liste de vos sites</label>

<div class="align-center">
<table class="table-striped table">
    <tr>
        <th>Topo</th>
        <th>Secteur</th>
        <th>Voie</th>
        <th>Suppr</th>
    </tr>
    <s:iterator value="hashMapST">
        <tr>
            <th><s:property value="value.location"/></th>
            <th><s:property value="key.location"/></th>
            <th>
                <s:a action="listSite">
                    <s:param name="topoid"><s:property value="key.topos"/> </s:param>
                    <s:param name="siteid"><s:property value="key.identifiant"/></s:param>
                    <s:property value="key.way"/>
                </s:a>
            </th>
            <th>
                <s:a action="deleteSite">
                    <img src="../../picture/Delete.JPG" height="10" width="10"/>
                    <s:param name="id"><s:property value="key.identifiant"/> </s:param>
                </s:a>
            </th>
        </tr>
    </s:iterator>
</table>

<label class="starter-template center-block text-md-center">Liste de vos commentaires :</label>

<s:iterator value="hashMap">
    <div class="row">
        <div class="col-sm-2"></div>
        <div class="col-sm-3">
            Le <s:property value="key.createAt"/> </br>
            Ecrit par : <s:property value="value.pseudo"/> </br>
        </div>

        <div class="col-sm-4">
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
        <div class="col-sm-2"></div>
    </div>
    </div>
    <div class="col-md-12 center-block"></div>
</s:iterator>


<%@ include file="../structure/foot.jsp" %>