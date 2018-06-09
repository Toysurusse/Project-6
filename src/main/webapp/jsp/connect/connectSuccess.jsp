<%@ page pageEncoding="UTF-8" %>
<%@ include file="../structure/layout.jsp" %>
<title>Connect Success</title>
<%@ include file="../structure/head.jsp" %>

<div class="container col-md-4">
    <div class="col-sm-12">

        <label class="starter-template center-block text-md-center">Information du compte</label>

        </br>

        <table class="table-striped table">
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
    </div>

    </br>
    <label class="starter-template center-block text-md-center">Information adresse</label>
    </br>
    <div class="col-md-4"></div>
    <table class="table-striped  table">
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
    <div class="col-md-4"></div>

    <s:a action="updateA" cssClass="center-block text-center">Mettre à jour vos informations personnelles</s:a>
</div>
</br>
<div class="container">
    </br>
    <label class="starter-template center-block text-md-center">Liste de vos Topos :</label>
    </br>
    <div class="align-center">
        <table class="table-striped table">
            <tr>
                <th>Topos :</th>
                <th>Ajouter Site</th>
                <th>Update</th>
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
                        <s:a action="upTopo">
                            <img src="../../picture/update.png" height="10" width="10"/>
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
</div>

</br>
<div class="container">
    <label class="starter-template center-block text-md-center">Liste de vos sites</label>
    </br>
    <div class="align-center">
        <table class="table-striped table">
            <tr>
                <th>Topo</th>
                <th>Secteur</th>
                <th>Voie</th>
                <th>Modifier</th>
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
                        <s:a action="upSite">
                            <img src="../../picture/update.png" height="10" width="10"/>
                            <s:param name="id"><s:property value="key.identifiant"/> </s:param>
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

    </div>
</div>
</br>

<div class="container">
    <label class="starter-template center-block text-md-center">
        Partager une information :
        <s:a action="addInfoinit">
            <img src="../../picture/add.jpg" height="10" width="10"/>
        </s:a>
    </label>
    </br>
    <label class="starter-template center-block text-md-center">
        Liste des informations partagées :
    </label>
    </br>
    <div class="container">
        <div class="starter-template">
            <div class="container-fluid">
                <s:iterator var="Information" value="informationList">

                    <div class="row">
                        <div class="col-sm-1"></div>
                        <label class="starter-template center-block col-md-9">
                            <s:property value="title"/>
                        </label>
                        <div class="col-sm-1">
                            <s:a action="deleteInfo">
                                <img src="../../picture/Delete.JPG" height="10" width="10"/>
                                <s:param name="id"><s:property value="id"/> </s:param>
                            </s:a>
                        </div>
                        <div class="col-sm-1"></div>
                    </div>
                    <pre class="text-md-center">
                <s:property value="info"/>
            </pre>
                </s:iterator>
            </div>

        </div><!-- /.container -->
    </div>
</div>
</br>

<div class="container">
<label class="starter-template center-block text-md-center">Liste de vos commentaires :</label>

<s:iterator value="hashMap">
    <div class="container">
        </br>
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
    </br>
    <div class="col-md-12 center-block"></div>
</s:iterator>
</div>
<%@ include file="../structure/foot.jsp" %>