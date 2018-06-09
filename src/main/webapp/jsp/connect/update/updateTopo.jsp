<%@ page pageEncoding="UTF-8" %>
<%@ include file="../../structure/layout.jsp" %>
<title>Add Topo</title>
<%@ include file="../../structure/head.jsp" %>

<label class="starter-template center-block text-md-center">Ajouter un topo :</label>

<s:actionerror/>
<div class="col-sm-4"></div>
<div class="container-fluid col-sm-4">
    <s:form action="updateTopo" theme="simple">
        <div class="row">
            <label> Titre :</label>
            <s:textfield name="topo.location" label="Lieu du Topo" requiredLabel="true" cssClass="form-control">
            </s:textfield>
        </div>
        <div class="row">
            <p>
            <label> Résumé :</label>
            <s:textarea name="topo.resume" label="Information sur le topo" requiredLabel="true" class="form-control"
                        rows="5"
                        id="comment"/>
            </p>
            <s:submit value="enregistrer le topo" cssClass="btn btn-primary center-block"/>
        </div>
    </s:form>
</div>
<%@ include file="../../structure/foot.jsp" %>