<%@ page pageEncoding="UTF-8" %>
<%@ include file="../structure/layout.jsp" %>
<title>Update Account</title>
<%@ include file="../structure/head.jsp" %>

Liste de vos informations personnelles :

    <div class="row">
    <div class="col-sm-4"></div>
    <div class="starter-template col-sm-4">
    <s:actionerror/>
    </div>
    <div class="col-sm-4"></div>
    </div>
    <div clas="starter-template">
    <div class="border border-info">
    <s:form cssClass="form-group" action="updateaccount">
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Nom</label>
            </div>
            <div class="col-sm-2">
                <s:textfield labelposition="left" name="account.name" label="name" requiredLabel="true"
                             title="name"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Prénom</label>
            </div>
            <div class="col-sm-2">
                <s:textfield title="firstName" name="account.firstName" label="firstName" requiredLabel="true"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Password :</label>
            </div>
            <div class="col-sm-2">
                <s:textfield name="account.pseudo" label="pseudo" requiredLabel="true"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Sexe :</label>
            </div>
            <div class="col-sm-2">
                <s:select label="Sexe"
                          headerKey="-1" headerValue="%{account.sex}"
                          list="{'H', 'F'}"
                          name="account.sex"
                          value="0" requiredLabel="true"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Numéro de rue :</label>
            </div>
            <div class="col-sm-2">
                <s:textfield name="adress.nbStreet" label="nbStreet" requiredLabel="false"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Rue :</label>
            </div>
            <div class="col-sm-2">
                <s:textfield name="adress.street" label="street" requiredLabel="false"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Code Postal :</label>
            </div>
            <div class="col-sm-2">
                <s:textfield name="adress.postalCode" label="postalCode" requiredLabel="false"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Ville :</label>
            </div>
            <div class="col-sm-2">
                <s:textfield name="adress.city" label="city" requiredLabel="false"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Code :</label>
            </div>
            <div class="col-sm-2">
                <s:textfield name="adress.code" label="code" requiredLabel="false"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Info :</label>
            </div>
            <div class="col-sm-2">
                <s:textfield name="adress.infoSub" label="infoSub" requiredLabel="false"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Adresse Principale :</label>
            </div>
            <div class="col-sm-2">
                <s:select label="Adresse Principale"
                          headerKey="-1" headerValue="%{adress.principalAdress}"
                          list="{'Oui', 'Non'}"
                          name="adress.principalAdress"
                          value="0"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <s:submit value="Valider" cssClass="btn btn-primary center-block"/>
            </div>
            <div class="col-sm-2">
                <s:a cssClass="btn btn-primary center-block" action="connected">Annuler</s:a>
            </div>
            <div class="col-sm-4"></div>
        </div>
    </s:form>
    </div>
    </div>
<%@ include file="../structure/foot.jsp" %>