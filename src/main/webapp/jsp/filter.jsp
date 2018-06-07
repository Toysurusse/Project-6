<%@ page pageEncoding="UTF-8" %>
<%@ include file="structure/layout.jsp" %>
<title>Filter</title>
<%@ include file="structure/head.jsp" %>

<label class="starter-template center-block text-md-center">Rechercher votre lieu de grimpe par mot clef :</label>

<div class=" container ">
    <div class="col-md-4 col-md-offset-4">
        <s:form theme="simple" action="find">
            <s:textfield cssClass="form-control" placeholder="mot clef" name="requestfind" label="requestfind"
                         requiredLabel="true"/>
            </br>
            <s:submit value="Rechercher" cssClass="btn btn-primary center-block"/>
        </s:form>
    </div>
    <div class="col-sm-12"></div>
</div>
<s:if test="%{requestfind!=null}">
    <div class="align-center">
        <table class="table-striped table">
            <tr>
                <th>Topo</th>
                <th>Secteur</th>
                <th>Voie</th>
                <th>Hauteur</th>
                <th>Cotation</th>
                <th>Nb Points</th>
            </tr>
            <s:iterator value="findResult">
                <tr>
                    <th>
                        <s:a action="listSite">
                            <s:param name="topoid"><s:property value="key.identifiant" /> </s:param>
                            <s:param name="siteid">0</s:param>
                            <s:property value="key.location"/>
                        </s:a>
                        </th>
                    <th>
                        <s:a action="listSiteByLocation">
                            <s:param name="location"><s:property value="value.location"/></s:param>
                            <s:property value="value.location"/>
                        </s:a>
                        </th>
                    <th>
                        <s:a action="listSite">
                            <s:param name="topoid"><s:property value="key.identifiant" /> </s:param>
                            <s:param name="siteid"><s:property value="value.identifiant" /></s:param>
                            <s:property value="value.way"/>
                        </s:a>
                    </th>
                    <th><s:property value="value.height"/></th>
                    <th><s:property value="value.hardness"/></th>
                    <th><s:property value="value.points_nb"/></th>
                </tr>
            </s:iterator>
        </table>
    </div>
</s:if>
<label class="starter-template center-block text-md-center">Rechercher par liste déroulante :</label>
    <div class="col-md-4 bg-light">
        <label class="starter-template center-block text-md-center">Topos :</label>
        <s:form theme="simple" action="listSite">
            <s:select cssClass="form-control" theme="simple" name="topoid" label="topo"
                      list="topolist" listKey="identifiant" listValue="location"
                      emptyOption="true"
                      requiredLabel="true"/>
            <s:hidden name="siteid" value="0"/>
            </br>
            <s:submit value="Rechercher ce topo" cssClass="btn btn-primary center-block"/>
        </s:form>
    </div>
        <div class="col-md-4 bg-light">
        <label class="starter-template center-block text-md-center">Secteurs :</label>
        <s:form theme="simple" action="listSiteByLocation">
            <s:select cssClass="form-control" name="location" label="Secteur"
                      list="locationlist"
                      emptyOption="true"
                      requiredLabel="true"/>
            </br>
            <s:submit value="Rechercher ce secteur" cssClass="btn btn-primary center-block"/>
        </s:form>
        </div>
            <div class="col-md-4 bg-white">
        <label class="starter-template center-block text-md-center">Sites :</label>
        <s:form theme="simple" action="listSite">
            <s:select cssClass="form-control" name="siteid" label="site"
                      list="sitelist" listKey="identifiant" listValue="way"
                      emptyOption="true"
                      requiredLabel="true"/>
            </br>
            <s:submit value="Rechercher ce site" cssClass="btn btn-primary center-block"/>
        </s:form>
            </div>
</div>


<%@ include file="structure/foot.jsp" %>