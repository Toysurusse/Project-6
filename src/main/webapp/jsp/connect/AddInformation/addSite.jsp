<%@ page pageEncoding="UTF-8" %>
<%@ include file="../../structure/headboot.jsp" %>

<p>
    Ajouter un site :
</p>


<s:actionerror/>
<s:form action="addSite">

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