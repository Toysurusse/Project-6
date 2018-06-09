<%@ page pageEncoding="UTF-8" %>
<%@ include file="../../structure/layout.jsp" %>
<title>Add Topo</title>
<%@ include file="../../structure/head.jsp" %>



<s:actionerror/>
<div class="col-sm-4"></div>
<div class="container col-sm-4">
    <label class="starter-template center-block text-md-center">Ajouter un topo :</label>
    <s:form action="updateTopo" theme="simple">
        <div class="row">
            <div class="col-md-12">
            <label> Titre :</label>
            </div>
            <div class="col-md-12">
            <s:textfield name="topo.location" label="Lieu du Topo" requiredLabel="true" cssClass="form-control">
            </s:textfield>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
            <label> Résumé :</label>
            </div>
            <div class="col-md-12">
            <s:textarea name="topo.resume" label="Information sur le topo" requiredLabel="true" class="form-control"
                        rows="5"
                        id="comment"/>
            </div>
        </div>
        </br>
            <s:submit value="enregistrer le topo" cssClass="btn btn-primary center-block"/>

    </s:form>
</div>
<%@ include file="../../structure/foot.jsp" %>