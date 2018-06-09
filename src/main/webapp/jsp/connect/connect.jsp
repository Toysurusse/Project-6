<%@ page pageEncoding="UTF-8" %>
<%@ include file="../structure/layout.jsp" %>
<title>Connect</title>
<%@ include file="../structure/head.jsp" %>

<div>
<div class="starter-template col-sm-4"></div>
<div class="container-fluid col-sm-4">
    <s:form theme="simple" action="connectTry">
        <div class="row">
            <label for="pseudo" class="starter-template col-sm-12"> Pseudo :</label>
            <s:textfield cssClass="form-control" placeholder="Login" name="pseudo" label="pseudo"
                         requiredLabel="true"/>
        </div>
        <div class="row">
            <label for="password" class="starter-template col-sm-12"> Mot de passe :</label>
            <s:password cssClass="form-control" placeholder="Password" name="password" label="password"
                        requiredLabel="true"/>
        </div>
        </br>
        <div class="row">
            <div class="col-sm-6">
                <s:submit method="input" value="Se Connecter" cssClass="btn btn-primary center-block"/>
            </div>
            <div class="col-sm-6">
                <s:a action="loadaccount" cssClass="btn btn-primary center-block">Créer un compte ?</s:a>
            </div>
        </div>

    </s:form>
    <div class="starter-template"><s:actionerror/></div>
</div>
<div class="starter-template col-sm-4"></div>
</div>
<%@ include file="../structure/foot.jsp" %>