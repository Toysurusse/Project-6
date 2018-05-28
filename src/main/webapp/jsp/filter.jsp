<%@ page pageEncoding="UTF-8" %>
<%@ include file="structure/headboot.jsp" %>

<div class="container">
    <div class="starter-template">
        <ul>
            <s:form action="listSite">
                <s:select name="topoid" label="topo"
                          list="topolist" listKey="identifiant" listValue="location"
                          emptyOption="true"
                          requiredLabel="true"/>
                <s:hidden name="siteid" value="0"/>
                <s:submit value="Rechercher ce topo"/>
            </s:form>
        </ul>
        <ul>
            <s:form action="listSite">
                <s:select name="siteid" label="site"
                          list="sitelist" listKey="identifiant" listValue="way"
                          emptyOption="true"
                          requiredLabel="true"/>
                <s:submit value="Rechercher ce site"/>
            </s:form>
        </ul>
    </div>
</div>


<%@ include file="structure/foot.jsp" %>