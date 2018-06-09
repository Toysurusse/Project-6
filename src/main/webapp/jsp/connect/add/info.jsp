<%@ page pageEncoding="UTF-8" %>
<%@ include file="../../structure/layout.jsp" %>
<title>Add Site</title>
<%@ include file="../../structure/head.jsp" %>


<label class="starter-template center-block text-md-center">Ajouter une information :</label>

<div class="starter-template col-sm-4"></div>

<div class="container-fluid col-sm-4">
    <s:form theme="simple" action="addInfo">
        <div class="row">
            <label class="starter-template col-sm-12"> Titre :</label>
            <s:textfield cssClass="form-control" placeholder="Title" name="info.title" label="pseudo"
                         requiredLabel="true"/>
        </div>
        <div class="row">
            <label class="starter-template col-sm-12"> Information</label>
            <s:textarea cssClass="form-control" placeholder="Information" name="info.info" label="password"
                        requiredLabel="true"/>
        </div>
        </br>
        <div class="row">
            <div class="col-sm-6">
                <s:submit method="input" value="valider" cssClass="btn btn-primary center-block"/>
            </div>
        </div>

    </s:form>
    <div class="starter-template"><s:actionerror/></div>
</div>
<div class="starter-template col-sm-4">

</div>
<%@ include file="../../structure/foot.jsp" %>
