<%@ page pageEncoding="UTF-8" %>
<%@ include file="../../structure/layout.jsp" %>
<title>Add Site</title>
<%@ include file="../../structure/head.jsp" %>

<s:actionerror/>
<div class="row col-md-12">
        <div class="col-md-4"></div>
        <div class="container col-md-4">
            <label class="starter-template center-block text-md-center">Ajouter un site :</label>
            <s:form action="addSite" theme="simple">

            <%@ include file="site.jsp" %>
            </br>
            <s:submit value="enregistrer le site" class="btn btn-primary center-block"/>
        </div>
        </s:form>

    <div class="col-md-4"></div>
</div>
<%@ include file="../../structure/foot.jsp" %>