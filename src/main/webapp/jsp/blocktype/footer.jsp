<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class ="Menu"></div>
    <div>
        <div class ="Space"></div>
        <div>
            <s:a action="infolist"> <input type="button" name="info" value="Info" class ="ButMenu" style="text-decoration: "> </s:a>
        </div>
        <div class ="Space"></div>
    </div>
    <div>
        <div class ="Space"></div>
        <div>
            <s:a action="filter"> <input type="button" name="topos" value="Rechercher" class ="ButMenu"> </s:a>        </div>
        <div class ="Space"></div>
    </div>
    <div>
        <div class ="Space"></div>
        <div>
            <s:a action="list_topo"><input type="button" name="accueil" value="Accéder aux topos" class ="ButMenu"> </s:a>
        </div>
        <div class ="Space"></div>
    </div>
    <div>
        <div class ="Space"></div>
        <div>
            <s:a action="list_topo"><input type="button" name="accueil" value="Louer un topo" class ="ButMenu"> </s:a>
        </div>
        <div class ="Space"></div>
    </div>
    <div>
        <div class ="Space"></div>
        <div>
            <s:a action="newaccount"><input type="button" name="accueil" value="Vous inscrire?" class ="ButMenu"> </s:a>
        </div>
        <div class ="Space"></div>
    </div>



