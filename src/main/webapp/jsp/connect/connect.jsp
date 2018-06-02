<%@ page pageEncoding="UTF-8" %>
<%@ include file="../structure/layout.jsp" %>
<title>Connect</title>
<%@ include file="../structure/head.jsp" %>

<p><html:errors property="error.connectEmpty"/></p>

<div clas="starter-template">
    <div class="border border-info">
        <s:form action="connectTry">
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Pseudo :</label>
            </div>
            <div class="col-sm-2">
                <s:textfield placeholder="Login" name="pseudo" label="pseudo" requiredLabel="true"/>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Password :</label>
            </div>
            <div class="col-sm-2">
                <s:textfield placeholder="Password" name="password" label="password" requiredLabel="true"/>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-4">
                </br>
                <s:submit method="input" value="Se Connecter" cssClass="btn btn-primary center-block"/>
            </div>
        </div>
    </div>

    </s:form>
    </br>
    <div class="row">
        <div class="col-sm-4"></div>
        <div class="col-sm-4 center-block">
            <s:a action="loadaccount" cssClass="center-block">
                <p>Créer un compte ?</p>
            </s:a>
        </div>
    </div>
</div>

<%@ include file="../structure/foot.jsp" %>