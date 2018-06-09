<%@ page pageEncoding="UTF-8" %>

<s:actionerror/>
<s:form action="addTopo" theme="simple">

    <div class="starter-template">
        <div class="row">
            <div class="col-md-6">
                <label>Localisation :</label>
            </div>
            <div class="col-md-6 ">
                <s:textfield name="topo.location" label="Lieu du Topo" requiredLabel="true" cssClass="form-control"/>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <label>Description :</label>
            </div>
            <div class="col-md-6">
                <s:textarea name="topo.resume" label="Information sur le topo" requiredLabel="true" class="form-control"
                            rows="5" id="comment"/>
            </div>
        </div>

        <%@ include file="site.jsp" %>

        <div class="row">
            <div class="col-sm-12">
                </br>
                <s:submit value="enregistrer le topo" class="btn btn-primary center-block"/>
            </div>
        </div>
    </div>

</s:form>
<s:actionerror/>