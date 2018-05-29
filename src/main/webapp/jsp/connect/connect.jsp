<%@ page pageEncoding="UTF-8" %>
<%@ include file="../structure/headboot.jsp" %>
<div class="col-sm-12"></div>
    <s:actionerror />

<div class="w3-container w3-teal">
    <div class="col-sm-12"></div>
    <s:form action="connectTry">
        <div class="form-group">
        <s:textfield class="text-primary"  placeholder="Login" name="pseudo" label="pseudo" requiredLabel="true" />
        </div>
        <div class="col-sm-12 row-sm-1"></div>
        <div class="form-group">
        <s:textfield class="text-primary" placeholder="Password" name="password" label="password" requiredLabel="true" />
        </div>
        <div class="col-sm-12"></div>
        <div>
        <s:submit method="input" value="Se Connecter" cssClass="btn btn-primary center-block"/>
        </div>
    </s:form>

    <s:a action="loadaccount">
        Créer un compte ?
    </s:a>
</div>
<%@ include file="../structure/foot.jsp" %>