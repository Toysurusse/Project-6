<%@ page pageEncoding="UTF-8" %>
<%@ include file="../structure/layout.jsp" %>
<title>Connect Success</title>
<%@ include file="../structure/head.jsp" %>

<div clas="starter-template">
    <div class="border border-info">
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-4">
                <label class="starter-template">Information du compte</label>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Nom</label>
            </div>
            <div class="col-sm-2">
                <s:property value="%{account.name}"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Prénom</label>
            </div>
            <div class="col-sm-2">
                <s:property value="%{account.firstName}"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Password :</label>
            </div>
            <div class="col-sm-2">
                <s:property value="%{account.password}"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Sexe :</label>
            </div>
            <div class="col-sm-2">
                <s:property value="%{account.sex}"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-4">
                <label class="starter-template">Information adresse</label>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Numéro de rue :</label>
            </div>
            <div class="col-sm-2">
                <s:property value="%{adress.nbStreet}"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Rue :</label>
            </div>
            <div class="col-sm-2">
                <s:property value="%{adress.street}"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Code Postal :</label>
            </div>
            <div class="col-sm-2">
                <s:property value="%{adress.postalCode}"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Ville :</label>
            </div>
            <div class="col-sm-2">
                <s:property value="%{adress.city}"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Code :</label>
            </div>
            <div class="col-sm-2">
                <s:property value="%{adress.code}"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Info :</label>
            </div>
            <div class="col-sm-2">
                <s:property value="%{adress.infoSub}"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
    </div>
</div>

<div class="row">
    <div class="col-sm-4"></div>
    <p>
        <s:a action="updateA" cssClass="starter-template">Mettre à jour votre compte</s:a>
    </p>
    <div class="col-sm-4"></div>
</div>


<div class="row">
    <div class="col-sm-4"></div>
    <div class="col-sm-4">
        <label class="starter-template">Liste de vos Topos :</label>
    </div>
    <div class="col-sm-4"></div>
</div>
<div class="container">
    <div class="row">
        <div class="col-sm-3"></div>
        <div class="col-sm-4">
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
            <div class="col-sm-3"></div>
            <div class="col-sm-4">
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
    <div class="col-sm-3"></div>
    <s:a action="newTopo">
        Ajouter un nouveau topo
    </s:a>
</div>

<div class="row">
    <div class="col-sm-4"></div>
    <div class="col-sm-4">
        <label class="starter-template">Liste de vos sites</label>
    </div>
    <div class="col-sm-4"></div>
</div>
<div class="container">
    <div class="row">
        <div class="col-sm-3"></div>
        <div class="col-sm-2">
            Topo
        </div>
        <div class="col-sm-2">
            Secteur
        </div>
        <div class="col-sm-2">
            Voie
        </div>
        <div class="col-sm-3">
            <p>Suppr</p>
        </div>
    </div>
    <s:iterator value="hashMapST">
        <div class="row">
            <div class="col-sm-3"></div>
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
    <div class="col-sm-3"></div>
</div>

<div class="row">
    <div class="col-sm-4"></div>
    <div class="col-sm-4">
        <label class="starter-template">Liste de vos commentaires :</label>
    </div>
    <div class="col-sm-4"></div>
</div>
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