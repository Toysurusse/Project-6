<%@ page pageEncoding="UTF-8" %>
<%@ include file="../structure/headboot.jsp" %>

<s:if test="#session.user">
    Vous êtes déjà connecté en tant que :
    <s:property value="#session.user.pseudo" /></br>
    <s:a action="disconnect">Cliquez ici pour vous déconnecter</s:a>
</s:if>
<s:else>

<s:actionerror />
    <div class="container-fluid">
<s:form action="createaccount">
    <div class="form-group">
    <div class="container-fluid">
    <s:textfield labelposition="left" name="account.name" label="name" requiredLabel="true" title="name" />
    </div>
    <div class="container-fluid">
    <s:textfield title="firstName" name="account.firstName" label="firstName" requiredLabel="true" />
    </div>
    <s:textfield name="account.pseudo" label="pseudo" requiredLabel="true" />
    <s:textfield name="account.password" label="password" requiredLabel="true" />
    <s:select label="Sexe"
              headerKey="-1" headerValue="Choisir Sexe"
              list="{'H', 'F'}"
              name="account.sex"
              value="0" requiredLabel="true"/>

    <s:if test = "addAdress = 'True'">
    <s:textfield name="adress.nbStreet" label="nbStreet" requiredLabel="false" />
    <s:textfield name="adress.street" label="street" requiredLabel="false" />
    <s:textfield name="adress.postalCode" label="postalCode" requiredLabel="false" />
    <s:textfield name="adress.city" label="city" requiredLabel="false" />
    <s:textfield name="adress.code" label="code" requiredLabel="false" />
    <s:textfield name="adress.infoSub" label="infoSub" requiredLabel="false" />
    <s:select label="Adresse Principale"
              headerKey="-1" headerValue="Type d'adresse"
              list="{'Oui', 'Non'}"
              name="adress.principalAdress"
              value="0" />
    </div>
    </s:if>
    <s:submit value="Valider l'inscription" cssClass="btn btn-primary"/>
</s:form>
    </div>
</s:else>

<%@ include file="../structure/foot.jsp" %>
