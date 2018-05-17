<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<header>
    <div class = "logo">
    </div>
    <div class = "titre">
        <h1>Bienvenue sur notre site d'escalade !</h1>
    </div>
    <div>
        <s:if test="#session.user">
            Utilisateur connecté :
            <s:property value="#session.user.pseudo" /></br>
            <s:a action="disconnect">Déconnexion</s:a>
        </s:if>
        <s:else>
            <s:a action="connectinit"><input type="button" name="accueil" value="Se Connecter" class ="ButMenu"> </s:a>
        </s:else>
    </div>
</header>
