<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<li class="active">
    <s:a href="#infoList">Info</s:a>
</li>
<li>
    <s:a href="filter">Filtrer</s:a>
</li>
<li>
    <s:a href="listTopo">Topos</s:a>
</li>
<li>
    <s:a href="#rentTopo">Louer un topo</s:a>
</li>
<li>
    <s:if test="#session.user">
        Utilisateur connecté :
        <s:property value="#session.user.pseudo" /></br>
        <s:a action="disconnect">Déconnexion</s:a>
    </s:if>
    <s:else>
        <s:a href="connectTry">Se Connecter</s:a>
    </s:else>

</li>

