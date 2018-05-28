<%@ page pageEncoding="UTF-8" %>
<%@ include file="../structure/headboot.jsp" %>

Liste de vos informations personnelles :
<s:form action="updateaccount">
    <s:textfield name="account.name" label="name"  requiredLabel="true"></s:textfield>
    <s:textfield name="account.firstName" label="firstName" requiredLabel="true"></s:textfield>
    <s:textfield name="account.pseudo" label="pseudo" requiredLabel="true" />
    <s:textfield name="account.password" label="password" requiredLabel="true" />
    <s:select label="Sexe"
              list="{'H', 'F'}"
              name="account.sex"
              requiredLabel="true"/>
    <s:submit value="Valider la modification"/>
</s:form>



<p>
Liste de vos commentaires :
</p>
<s:iterator value="hashMap">
    </br>
    <s:property value="key.title"/>
    <div class = "ComFrame">
        <div>
            Le <s:property value="key.createAt"/> </br>
            Ecrit par : <s:property value="value.pseudo"/> </br>
        </div>
        <div>
            <s:property value="key.commentary"/>
        </div>
        <div class = Delete>
            <s:a action="deleteComDATA">
                <img src="../CSS/picture/Delete.JPG"  height="10" width="10"/>
                <s:param name="id"><s:property value="key.comId" /> </s:param>
            </s:a>
        </div>
    </div>
</s:iterator>


<%@ include file="../structure/foot.jsp" %>