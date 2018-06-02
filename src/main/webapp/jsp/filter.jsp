<%@ page pageEncoding="UTF-8" %>
<%@ include file="structure/layout.jsp" %>
<title>Filter</title>
<%@ include file="structure/head.jsp" %>

<div class="container">
    <div class="starter-template">
        <ul>
            <s:form action="listSite">
            <s:select name="topoid" label="topo"
                      list="topolist" listKey="identifiant" listValue="location"
                      emptyOption="true"
                      requiredLabel="true"/>
            <s:hidden name="siteid" value="0"/>
            <s:submit value="Rechercher ce topo" cssClass="btn-primary"/>
        </s:form>
        </ul>
        <ul>
        <s:form action="listSite">
            <s:select name="siteid" label="site"
                      list="sitelist" listKey="identifiant" listValue="way"
                      emptyOption="true"
                      requiredLabel="true"/>
            <s:submit value="Rechercher ce site" cssClass="btn-primary"/>
        </s:form>
    </ul>
        <ul>
            <s:form action="listSiteByLocation">
                <s:select name="location" label="Secteur"
                          list="locationlist"
                          emptyOption="true"
                          requiredLabel="true"/>
                <s:submit value="Rechercher ce secteur" cssClass="btn-primary"/>
            </s:form>
        </ul>
    </div>
</div>


<%@ include file="structure/foot.jsp" %>