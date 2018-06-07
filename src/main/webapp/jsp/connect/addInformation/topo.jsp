<%@ page pageEncoding="UTF-8" %>

<s:actionerror/>
<s:form action="addTopo" theme="simple">
    <div class="starter-template">
        <div class="row">
            <div class="col-sm-2">
                <label>Localisation :</label>
            </div>
            <div class="col-sm-2 ">
                <s:textfield name="topo.location" label="Lieu du Topo" requiredLabel="true" cssClass="form-control"/>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-2">
                <label>Description :</label>
            </div>
            <div class="col-sm-2">
                <s:textarea name="topo.resume" label="Information sur le topo" requiredLabel="true" class="form-control" rows="5" id="comment"/>
            </div>
        </div>

        <label class="starter-template center-block text-md-center">Site du Topo (vous devez renseigner un site pour créer le topo) :</label>

        <%@ include file="site.jsp" %>

        <div class="row">
            <div class="col-sm-4">
                </br>
                <s:submit value="enregistrer le topo" class="btn btn-primary"/>
            </div>
        </div>
    </div>
</s:form>