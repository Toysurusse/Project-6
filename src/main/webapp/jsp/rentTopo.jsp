<%@ page pageEncoding="UTF-8" %>
<%@ include file="structure/layout.jsp" %>
<title>Rent Topo</title>
<%@ include file="structure/head.jsp" %>

<div class="container">
    <div class="starter-template">
        <div class="container-fluid">
            <s:iterator var="RentTopo" value="listrent">
                <div class="row">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-9">
                        <s:property value="title"/>
                    </div>
                    <div class="col-sm-1">
                        <s:if test="#session.user.id==account.id">
                            <s:a action="rentDelete">
                                <img src="../picture/Delete.JPG" height="10" width="10"/>
                                <s:param name="rentid"><s:property value="id"/> </s:param>
                            </s:a>
                        </s:if>
                    </div>
                </div>
                <div class="row">
                    <div class="col-sm-2"></div>
                    <div class="col-sm-10">
                        <s:property value="resume"/>
                    </div>
                </div>
            </s:iterator>
        </div>
    </div>
</div>


<div class="row border border-info">
<div class="col-sm-12">
<s:if test="#session.user">
    <s:form action="rentAdd">
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Topo</label>
            </div>
            <div class="col-sm-2">
                <s:select name="rentTopo.topo_id" label="topo"
                          list="topoList" listKey="identifiant" listValue="location"
                          emptyOption="true"
                          requiredLabel="true"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Titre du Topo</label>
            </div>
            <div class="col-sm-2">
                <s:textfield name="rentTopo.title" label="title" requiredLabel="true"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label>Résumé</label>
            </div>
            <div class="col-sm-2">
                <s:textfield name="rentTopo.resume" label="resume" requiredLabel="true"/>
            </div>
            <div class="col-sm-4"></div>
        </div>
        <div class="row">
            <div class="col-sm-4"></div>
        </div>
        <div class="col-sm-4">
            <s:submit value="Proposer ce topo en location" cssClass="btn-primary center-block"/>
        </div>
        </div>
        </div>
    </s:form>
</s:if>
<s:else>
    <s:a action="connectTry" class="btn btn-primary center-block">Connectez vous pour ajouter un Topo à louer</s:a>
</s:else>
</div>
<div class="col-sm-1"></div>
</div>


<%@ include file="structure/foot.jsp" %>

