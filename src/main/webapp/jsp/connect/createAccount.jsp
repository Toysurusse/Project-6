<%@ page pageEncoding="UTF-8" %>
<%@ include file="../structure/layout.jsp" %>
<title>Create Account</title>
<%@ include file="../structure/head.jsp" %>

<s:if test="#session.user">
    Vous êtes déjà connecté en tant que :
    <s:property value="#session.user.pseudo"/></br>
    <s:a action="disconnect">Cliquez ici pour vous déconnecter</s:a>
</s:if>
<s:else>
    <div class="row">
    <div class="col-sm-4"></div>
    <div class="starter-template col-sm-4">
    <s:actionerror/>
    </div>
        <div class="col-sm-4"></div>
    </div>
    <div clas="starter-template">
        <div class="border border-info">
            <s:form theme="simple" cssClass="form-group" action="createaccount">
                <div class="row">
                    <div class="col-sm-4"></div>
                    <div class="col-sm-2">
                        <label class="text-primary text-md-center">Nom</label>
                    </div>
                    <div class="col-sm-2">
                        <s:textfield cssClass="form-control" labelposition="left" name="account.name" label="name" title="name"/>
                    </div>
                    <div class="col-sm-4"><html:errors property="error.emptyName"/></div>
                </div>
                <div class="row">
                    <div class="col-sm-4"></div>
                    <div class="col-sm-2">
                        <label class="text-primary text-md-center">Prénom</label>
                    </div>
                    <div class="col-sm-2">
                        <s:textfield cssClass="form-control" labelSeparator="" title="firstName" name="account.firstName" label="firstName" requiredLabel="true"/>
                    </div>
                    <div class="col-sm-4"><html:errors property="error.emptyFirstName"/></div>
                </div>
                <div class="row">
                    <div class="col-sm-4"></div>
                    <div class="col-sm-2">
                        <label class="text-primary text-md-center">Pseudo :</label>
                    </div>
                    <div class="col-sm-2">
                        <s:textfield cssClass="form-control" name="account.pseudo" label="pseudo" requiredLabel="true"/>
                    </div>
                    <div class="col-sm-4"><html:errors property="error.emptyPseudo"/></div>
                </div>
                <div class="row">
                    <div class="col-sm-4"></div>
                    <div class="col-sm-2">
                        <label class="text-primary text-md-center">Password :</label>
                    </div>
                    <div class="col-sm-2">
                        <s:password cssClass="form-control" name="account.password" label="password" requiredLabel="true"/>
                    </div>
                    <div class="col-sm-4"><html:errors property="error.emptyPassword"/></div>
                </div>
                <div class="row">
                    <div class="col-sm-4"></div>
                    <div class="col-sm-2">
                        <label class="text-primary text-md-center">Sexe :</label>
                    </div>
                    <div class="col-sm-2">
                        <s:select cssClass="form-control" label="Sexe"
                                  headerKey="Choisir Sexe" headerValue="Choisir Sexe"
                                  list="{'H', 'F'}"
                                  name="account.sex"
                                  value="0" requiredLabel="true"/>
                    </div>
                    <div class="col-sm-4"><html:errors property="error.emptySex"/></div>
                </div>
                <div class="row">
                    <div class="col-sm-4"></div>
                    <div class="col-sm-2">
                        <label class="text-primary text-md-center">Numéro de rue :</label>
                    </div>
                    <div class="col-sm-2">
                        <s:textfield cssClass="form-control" name="adress.nbStreet" label="nbStreet" requiredLabel="false"/>
                    </div>
                    <div class="col-sm-4"></div>
                </div>
                <div class="row">
                    <div class="col-sm-4"></div>
                    <div class="col-sm-2">
                        <label class="text-primary text-md-center">Rue :</label>
                    </div>
                    <div class="col-sm-2">
                        <s:textfield cssClass="form-control" name="adress.street" label="street" requiredLabel="false"/>
                    </div>
                    <div class="col-sm-4"></div>
                </div>
                <div class="row">
                    <div class="col-sm-4"></div>
                    <div class="col-sm-2">
                        <label class="text-primary text-md-center">Code Postal :</label>
                    </div>
                    <div class="col-sm-2">
                        <s:textfield cssClass="form-control" name="adress.postalCode" label="postalCode" requiredLabel="false"/>
                    </div>
                    <div class="col-sm-4"></div>
                </div>
                <div class="row">
                    <div class="col-sm-4"></div>
                    <div class="col-sm-2">
                        <label class="text-primary text-md-center">Ville :</label>
                    </div>
                    <div class="col-sm-2">
                        <s:textfield cssClass="form-control" name="adress.city" label="city" requiredLabel="false"/>
                    </div>
                    <div class="col-sm-4"></div>
                </div>
                <div class="row">
                    <div class="col-sm-4"></div>
                    <div class="col-sm-2">
                        <label class="text-primary text-md-center">Code :</label>
                    </div>
                    <div class="col-sm-2">
                        <s:textfield cssClass="form-control" name="adress.code" label="code" requiredLabel="false"/>
                    </div>
                    <div class="col-sm-4"></div>
                </div>
                <div class="row">
                    <div class="col-sm-4"></div>
                    <div class="col-sm-2">
                        <label class="text-primary text-md-center">Info :</label>
                    </div>
                    <div class="col-sm-2">
                        <s:textfield cssClass="form-control" name="adress.infoSub" label="infoSub" requiredLabel="false"/>
                    </div>
                    <div class="col-sm-4"></div>
                </div>
                <div class="row">
                    <div class="col-sm-4"></div>
                    <div class="col-sm-2 text-primary text-lg-left">
                        <label>Adresse Principale :</label>
                    </div>
                    <div class="col-sm-2">
                        <s:select cssClass="form-control" label="Adresse Principale"
                                  headerKey="-1" headerValue="Type d'adresse"
                                  list="{'Oui', 'Non'}"
                                  name="adress.principalAdress"
                                  value="0"/>
                    </div>
                    <div class="col-sm-4"></div>
                </div>
                </br>
                <div class="row">
                    <div class="col-sm-4"></div>
                    <div class="col-sm-4">
                        <s:submit value="Valider l'inscription" cssClass="btn btn-primary center-block"/>
                    </div>
                    <div class="col-sm-4"></div>
                </div>
            </s:form>
        </div>
    </div>
</s:else>

<%@ include file="../structure/foot.jsp" %>
