<p>Souhaitez vous ajouter un topo ?</p>

<s:actionerror/>
<s:form action="addTopo">
    <div class="starter-template">
        <div class="row">
            <div class="col-sm-2">
                <label>Localisation :</label>
            </div>
            <div class="col-sm-2 ">
                <s:textfield name="topo.location" label="Lieu du Topo" requiredLabel="true"/>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-2">
                <label>Description :</label>
            </div>
            <div class="col-sm-2">
                <s:textfield name="topo.resume" label="Information sur le topo" requiredLabel="true"/>
            </div>
        </div>

        <p>Site du Topo (vous devez renseigner un site pour créer le topo) :</p>

        <%@ include file="site.jsp" %>

        <div class="row">
            <div class="col-sm-4">
                </br>
                <s:submit value="enregistrer le topo" class="btn btn-primary"/>
            </div>
        </div>
    </div>
</s:form>