<%@ page pageEncoding="UTF-8" %>
<%@ include file="structure/layout.jsp" %>
<title>Rent Topo</title>
<%@ include file="structure/head.jsp" %>

<label class="starter-template center-block text-md-center">
    Liste des topos réservés
</label>
<div class="align-center">
    <table class="table table-striped">
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
                    <s:property value="titleTopo"/>
                </th>
                <th>
                    <s:property value="compte_id"/>
                </th>
                <th>
                    <s:property value="statut"/>
                </th>
                <th>
                    <s:date name="%{date}" format="dd/MM/yyyy"/>
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
                    <s:select cssClass="form-control" theme="simple" headerKey="-1"
                              headerValue="Choisir un topo" name="rentTopo.topo_id" label="topo"
                              list="topoList" listKey="identifiant" listValue="location"
                              emptyOption="true"
                              requiredLabel="true"/>

                        <div class="input-append date form_datetime" data-date="2013-02-21T15:25:00Z">
                            <s:textfield cssClass="form-control" name="rentTopo.date" label="Date"
                                         requiredLabel="true"/>
                            <span class="add-on"><i class="icon-calendar"></i></span>
                        </div>
                    </br>
                    <s:submit value="enregistrer la location" cssClass="btn btn-primary center-block"/>
                </s:form>
            </div>

            <script type="text/javascript"
                    src="http://cdnjs.cloudflare.com/ajax/libs/jquery/1.8.3/jquery.min.js">
            </script>
            <script type="text/javascript"
                    src="../bootstrap/bootstrap-datetimepicker-master/sample%20in%20bootstrap%20v2/bootstrap/js/bootstrap.min.js">
            </script>
            <script type="text/javascript"
                    src="http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.min.js">
            </script>
            <script type="text/javascript"
                    src="http://tarruda.github.com/bootstrap-datetimepicker/assets/js/bootstrap-datetimepicker.pt-BR.js">
            </script>


            <script type="text/javascript">
                $(".form_datetime").datetimepicker({
                    format: "dd/MM/yyyy",
                    autoclose: true,
                    todayBtn: true,
                    startDate: "2013-02-14 10:00",
                    minuteStep: 10
                });
            </script>
            <div class="col-md-12 starter-template text-danger"><s:actionerror/></div>
        </s:if>
        <s:else>
            <s:a action="connectTry"
                 class="btn btn-primary center-block">Connectez vous pour ajouter un Topo à louer</s:a>
        </s:else>
    </div>
    <div class="col-sm-1"></div>
</div>


<%@ include file="structure/foot.jsp" %>

