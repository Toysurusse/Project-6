<%@ page pageEncoding="UTF-8" %>
<%@ include file="../structure/headboot.jsp" %>

    <s:actionerror />

    <s:form action="connectTry">
        <div>
        <s:textfield placeholder="Login" name="pseudo" label="pseudo" requiredLabel="true" />
        </div>
        <div>
        <s:textfield placeholder="Password" name="password" label="password" requiredLabel="true" />
        </div>
        <div>
        <s:submit method="input" value="OK" cssClass="btn btn-primary"/>
        </div>
    </s:form>

    <s:a action="loadaccount">
        Créer un compte ?
    </s:a>

<%@ include file="../structure/foot.jsp" %>