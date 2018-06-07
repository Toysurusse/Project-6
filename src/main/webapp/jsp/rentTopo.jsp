<%@ page pageEncoding="UTF-8" %>
<%@ include file="structure/layout.jsp" %>
<title>Rent Topo</title>
<%@ include file="structure/head.jsp" %>

<label class="starter-template center-block text-md-center">
    Liste des topos réservés
</label>
<div class="align-center">
    <table class="table-striped table">
        <tr>
            <th>Topo</th>
            <th>Compte</th>
            <th>Statut</th>
            <th>Date</th>
            <th>Suppr</th>
        </tr>
        <s:iterator var="RentTopo" value="listrent">
            <tr>
                <th>
                    <s:property value="topo_id"/>
                </th>
                <th>
                    <s:property value="compte_id"/>
                </th>
                <th>
                    <s:property value="statut"/>
                </th>
                <th>
                    <s:property value="date"/>
                </th>
                <th>
                        <s:a action="rentDelete">
                            <img src="../picture/Delete.JPG" height="10" width="10"/>
                            <s:param name="rentid"><s:property value="id"/> </s:param>
                        </s:a>
                </th>
            </tr>
        </s:iterator>
    </table>

</div>


<div class="row border border-info">
    <div class="col-sm-12">
        <s:if test="#session.user">
            <div class="col-sm-4"></div>

            <div class="container-fluid col-sm-4">
                <s:form theme="simple" action="rentAdd">
                    <s:select cssClass="form-control" theme="simple" name="rentTopo.topo_id" label="topo"
                              list="topoList" listKey="identifiant" listValue="location"
                              emptyOption="true"
                              requiredLabel="true"/>
                    <div id="datetimepicker" class="input-append date">
                        <s:textfield cssClass="form-control" name="rentTopo.date" label="Date"
                                     requiredLabel="true"/>
                        <span class="add-on">
        <i data-time-icon="icon-time" data-date-icon="icon-calendar"></i>
      </span>
                    </div>
                    </br>
                    <s:submit value="enregistrer le RDV" cssClass="btn btn-primary center-block"/>
                </s:form>
            </div>

            <script type="text/javascript"
                    src="http://cdnjs.cloudflare.com/ajax/libs/jquery/1.8.3/jquery.min.js">
            </script>
            <script type="text/javascript"
                    src="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.2.2/js/bootstrap.min.js">
            </script>
            <script type="text/javascript"
                    src="http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.min.js">
            </script>
            <script type="text/javascript"
                    src="http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.pt-BR.js">
            </script>
            <script type="text/javascript">
                $('#datetimepicker').datetimepicker({
                    format: 'dd/MM/yyyy hh:mm',
                    language: 'pt-BR'
                });
            </script>
        </s:if>
        <s:else>
            <s:a action="connectTry"
                 class="btn btn-primary center-block">Connectez vous pour ajouter un Topo à louer</s:a>
        </s:else>
    </div>
    <div class="col-sm-1"></div>
</div>


<%@ include file="structure/foot.jsp" %>

