<%@ page pageEncoding="UTF-8" %>
<%@ include file="../structure/headboot.jsp" %>

<p><html:errors property="error.connectEmpty"/></p>

<s:form action="connectTry">

    <div class="starter-template">
        <div class="row">
            <div class="col-sm-2">
                <label>Pseudo :</label>
            </div>
            <div class="col-sm-2">
                <s:textfield placeholder="Login" name="pseudo" label="pseudo" requiredLabel="true"/>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-2">
                <label>Password :</label>
            </div>
            <div class="col-sm-2">
                <s:textfield placeholder="Password" name="password" label="password" requiredLabel="true"/>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-4">
                </br>
                <s:submit method="input" value="Se Connecter" cssClass="btn btn-primary"/>
            </div>
        </div>
    </div>
    <html:errors property="error.connectError"/>
</s:form>
</br>
<s:a action="loadaccount">
    Créer un compte ?
</s:a>
<%@ include file="../structure/foot.jsp" %>