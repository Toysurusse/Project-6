<%@ page pageEncoding="UTF-8" %>
<%@ include file="../../structure/layout.jsp" %>
<title>Add Topo</title>
<%@ include file="../../structure/head.jsp" %>





<div class="col-sm-4"></div>
<div class="container col-sm-4">
<s:actionerror/>
<label class="starter-template center-block text-md-center">Ajouter un topo :</label>
    <s:form action="updateSite" theme="simple">
        <div class="row">
            <div class="col-sm-6">
                <label>Secteur :</label>
            </div>
            <div class="col-sm-6">
                <s:textfield name="site.location" label="Information sur le topo" requiredLabel="true" cssClass="form-control"/>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6">
                <label>Voie :</label>
            </div>
            <div class="col-sm-6">
                <s:textfield name="site.way" label="Information sur le topo" requiredLabel="true" cssClass="form-control"/>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6">
                <label>Cotation :</label>
            </div>
            <div class="col-sm-6">
                <s:textfield name="site.hardness" label="Information sur le topo" requiredLabel="true" cssClass="form-control"/>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6">
                <label>Hauteur :</label>
            </div>
            <div class="col-sm-6">
                <s:textfield name="site.height" label="Information sur le topo" requiredLabel="true" cssClass="form-control"/>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-6">
                <label>Points d'attache :</label>
            </div>
            <div class="col-sm-6">
                <s:textfield name="site.points_nb" label="Information sur le topo" requiredLabel="true" cssClass="form-control"/>
            </div>
        </div>
            <s:submit value="Modifier le site" cssClass="btn btn-primary center-block"/>
        </div>
    </s:form>
</div>
<%@ include file="../../structure/foot.jsp" %>