<%@ page pageEncoding="UTF-8" %>
<%@ include file="../structure/layout.jsp" %>
<title>Update Account</title>
<%@ include file="../structure/head.jsp" %>



<div class="row">
    <div class="col-sm-4"></div>
    <div class="starter-template col-sm-4">
        <s:actionerror/>
    </div>
    <div class="col-sm-4"></div>
</div>

<div class="row">
    <div class="col-sm-4"></div>
    <div class="container col-sm-4">
        <label class="starter-template center-block text-md-center">Liste de vos informations personnelles :</label>
    <s:form cssClass="form-group" theme="simple" action="updateaccount">
        <div class="row">
            <div class="col-sm-6">
                <label>Nom :</label>
            </div>
            <div class="col-sm-6">
                <s:textfield labelposition="left" name="account.name" label="name" requiredLabel="true"
                             title="name"  cssClass="form-control"/>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6">
                <label>Prénom :</label>
            </div>
            <div class="col-sm-6">
                <s:textfield title="firstName" name="account.firstName" label="firstName" requiredLabel="true" cssClass="form-control"/>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6">
                <label>Pseudo :</label>
            </div>
            <div class="col-sm-6">
                <s:textfield name="account.pseudo" label="pseudo" requiredLabel="true" cssClass="form-control"/>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6">
                <label>Sexe :</label>
            </div>
            <div class="col-sm-6">
                <s:select label="Sexe"
                          headerKey="%{account.sex}" headerValue="%{account.sex}"
                          list="{'H', 'F'}"
                          name="account.sex"
                          value="0" requiredLabel="true" cssClass="form-control"/>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6">
                <label>Numéro de rue :</label>
            </div>
            <div class="col-sm-6">
                <s:textfield name="adress.nbStreet" label="nbStreet" requiredLabel="false" cssClass="form-control"/>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6">
                <label>Rue :</label>
            </div>
            <div class="col-sm-6">
                <s:textfield name="adress.street" label="street" requiredLabel="false" cssClass="form-control"/>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6">
                <label>Code Postal :</label>
            </div>
            <div class="col-sm-6">
                <s:textfield name="adress.postalCode" label="postalCode" requiredLabel="false" cssClass="form-control"/>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6">
                <label>Ville :</label>
            </div>
            <div class="col-sm-6">
                <s:textfield name="adress.city" label="city" requiredLabel="false" cssClass="form-control"/>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6">
                <label>Code :</label>
            </div>
            <div class="col-sm-6">
                <s:textfield name="adress.code" label="code" requiredLabel="false" cssClass="form-control"/>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6">
                <label>Info :</label>
            </div>
            <div class="col-sm-6">
                <s:textfield name="adress.infoSub" label="infoSub" requiredLabel="false" cssClass="form-control"/>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6">
                <label>Adresse Principale :</label>
            </div>
            <div class="col-sm-6">
                <s:select label="Adresse Principale"
                          headerKey="%{adress.principalAdress}" headerValue="%{adress.principalAdress}"
                          list="{'Oui', 'Non'}"
                          name="adress.principalAdress"
                          value="0" cssClass="form-control"/>
            </div>
        </div>
        </br>
        <div class="row">
            <div class="col-sm-6">
                <s:submit value="Valider" cssClass="btn btn-primary center-block"/>
            </div>
            <div class="col-sm-6">
                <s:a cssClass="btn btn-primary center-block" action="connected">Annuler</s:a>
            </div>
        </div>
    </s:form>
    </div>
    <div class="col-sm-4"></div>
</div>

<%@ include file="../structure/foot.jsp" %>