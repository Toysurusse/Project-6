<%@ page pageEncoding="UTF-8" %>
<%@ include file="../structure/headboot.jsp" %>

Liste de vos informations personnelles :
<s:form action="updateaccount">
    <s:textfield name="account.name" label="name" requiredLabel="true"/>
    <s:textfield name="account.firstName" label="firstName" requiredLabel="true"/>
    <s:textfield name="account.pseudo" label="pseudo" requiredLabel="true"/>
    <s:textfield name="account.password" label="password" requiredLabel="true"/>
    <s:select label="Sexe"
              list="{'H', 'F'}"
              name="account.sex"
              requiredLabel="true"/>
    <s:submit value="Valider la modification"/>
</s:form>

<p>Souhaitez vous ajouter un topo ?</p>

<s:actionerror />
<s:form action="addTopo">
    <s:textfield name="topo.location" label="Lieu du Topo" requiredLabel="true"/>
    <s:textfield name="topo.resume" label="Information sur le topo" requiredLabel="true" />
    <s:submit value="créer le topo"/>
</s:form>

<p>
    Liste de vos commentaires :
</p>
<s:iterator value="hashMap">
    <div class="row">
        <div class="col-sm-1"></div>
        <div class="col-sm-3">
            Le <s:property value="key.createAt"/> </br>
            Ecrit par : <s:property value="value.pseudo"/> </br>
        </div>

        <div class="col-sm-7">
            <p>
                <s:property value="key.title"/>
            </p>
            <p>
                <s:property value="key.commentary"/>
            </p>
        </div>
        <div class="col-sm-1">
            <s:a action="deleteadminCom">
                <img src="../../picture/Delete.JPG" height="10" width="10"/>
                <s:param name="id"><s:property value="key.comId"/> </s:param>
            </s:a>
        </div>
        <div class="col-sm-1"></div>
    </div>
    </div>
    <div class="col-md-12 center-block"></div>
</s:iterator>


<%@ include file="../structure/foot.jsp" %>