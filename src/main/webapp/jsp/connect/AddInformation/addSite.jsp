<%@ page pageEncoding="UTF-8" %>
<%@ include file="../../structure/layout.jsp" %>
<title>Add Site</title>
<%@ include file="../../structure/head.jsp" %>

<label class="starter-template center-block text-md-center">Ajouter un site :</label>

<s:actionerror/>
<s:form action="addSite" theme="simple">

    <%@ include file="site.jsp" %>
    <div class="starter-template">
    <div class="row">
        <div class="col-sm-4">
            </br>
            <s:submit value="enregistrer le site" class="btn btn-primary"/>
        </div>
    </div>
    </div>
</s:form>
<%@ include file="../../structure/foot.jsp" %>