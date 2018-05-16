<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class ="Menu"></div>
    <div>
        <div class ="Space"></div>
        <div>
        <a href="http://localhost:8080/accueil" target="_blank"> <input type="button" name="share"  value="partager une information" class ="ButMenu"> </a>
        </div>
        <div class ="Space"></div>
    </div>
    <div>
        <div class ="Space"></div>
        <div>
            <s:a action="filter"> <input type="button" name="topos" value="Accéder aux topos" class ="ButMenu"> </s:a>        </div>
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
            <s:a action="list_topo"><input type="button" name="accueil" value="Louer un topo" class ="ButMenu"> </s:a>
        </div>
        <div class ="Space"></div>
    </div>
    <div>
        <div class ="Space"></div>
        <div>
        <a href="http://localhost:8080/createaccount" target="_blank"> <input type="button" value="Vous inscrire ?" class ="ButMenu"> </a>
        </div>
        <div class ="Space"></div>
    </div>



