<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.daffo.prontuario_drugservice.service.prontuario_drugLocalServiceUtil"%>
<%@ include file="/init.jsp" %>
<%--Message area --%>
<liferay-ui:success key="success" message="Successfully Submitted"/>

<portlet:actionURL name="formSubmit_drug" var="formSubmit">
<portlet:param name="mvcPath" value="/drug_add.jsp"/> 
</portlet:actionURL>
<aui:form name="fm" id="fm" action="${formSubmit}">  
<div class="container-fluid-1280">
<!-- First Row --> 
<div class="row">
<div class="col-md-12 ">
<br/>
<center>
<table width="70%" cellpadding="5">
<!-- <thead><tr><td colspan="2" style="Background-color:#2C95DD;font-size:20px; color:white">
<center>
<b>Drug</b>
</center>
</td></tr></thead> -->
<tbody>
<tr>
<td width="100">Gruppo</td><td><select class="form-control" required="required" name="<portlet:namespace/>Gruppo">
<option value="-1">-Select Item-</option>
<option value="ANTIBLASTICI">ANTIBLASTICI</option>
<option value="ANTIBIOTICI">ANTIBIOTICI</option>
<option value="CARDIOVASCOLARI">CARDIOVASCOLARI</option>
<option value="ANTIDOTIE CHELANTI">ANTIDOTIE CHELANTI</option>
<option value="DERMATOLOGICI">DERMATOLOGICI</option>
<option value="DIURETECI">DIURETECI</option>
<option value="SOLUZIONI NUTRITIVE">SOLUZIONI NUTRITIVE</option>
<option value="SOLUZIONI IDROSALINE E GLUCOSATE">SOLUZIONI IDROSALINE E GLUCOSATE</option>
<option value="ENDOCRINOLOGICI E METABOLICI">ENDOCRINOLOGICI E METABOLICI</option>
<option value="FARMACI SISTEMA RESPIRATORIO">FARMACI SISTEMA RESPIRATORIO</option>
<option value="GASTROINTESTINALI">GASTROINTESTINALI</option>
<option value="OSTETRICO-GINECOLOGICI">OSTETRICO-GINECOLOGICI</option>
<option value="OCULISTICI">OCULISTICI</option>
<option value="OTORINOLARINGOIATRICI">OTORINOLARINGOIATRICI</option>
<option value="UROLOGICI">UROLOGICI</option>
<option value="PLASMA E FRAZIONI PLASMATICHE">PLASMA E FRAZIONI PLASMATICHE</option>
<option value="EMATOLOGICI">EMATOLOGICI</option>
<option value="FARMACI DEL SISTEMA NEVOSO AUTONOMO">FARMACI DEL SISTEMA NEVOSO AUTONOMO</option>
<option value="MORILASSANTI">MORILASSANTI</option>
<option value="ANESTETICI LOCALI">ANESTETICI LOCALI</option>
<option value="ANESTETICI GENERALI">ANESTETICI GENERALI</option>
<option value="ANALGESICI-ANTIPIRETICI">ANALGESICI-ANTIPIRETICI</option>
<option value="FARMACI DEL SISTEMA NEVOSO CENTRALE">FARMACI DEL SISTEMA NEVOSO CENTRALE</option>
<option value="VACCINI E SIERI">VACCINI E SIERI</option>
<option value="VITAMINE">VITAMINE</option>
</select></td>
</tr>

<tr>
<td>SottoGruppo</td><td><select class="form-control" required="required"  name="<portlet:namespace/>SottoGruppo">
<option value="-1">-Select Item-</option>
<option value="AGENTI ALCHILANTI">AGENTI ALCHILANTI</option>
<option value="ALCALOIDI DELLA VINCA">ALCALOIDI DELLA VINCA</option>
<option value="TAXANI">TAXANI</option>
<option value="AGENTI ANTIMICROTUBULO">AGENTI ANTIMICROTUBULO</option>
<option value="ANTRACICLINE">ANTRACICLINE</option>
<option value="ANTIMETABOLITI">ANTIMETABOLITI</option>
<option value="DERIVATI DEL PLATINO">DERIVATI DEL PLATINO</option>
<option value="EPIPODOFILOTOSSINE">EPIPODOFILOTOSSINE</option>
<option value="ORMONI">ORMONI</option>
<option value="ALTRI ANTIBLASTICI">ALTRI ANTIBLASTICI</option>
<option value="IMMUNOMODULATORI">IMMUNOMODULATORI</option>
<option value="DISINTOSSICANTI IN CHEMIOTERAPIA">DISINTOSSICANTI IN CHEMIOTERAPIA</option>
<option value="AMINOGLICOSIDI">AMINOGLICOSIDI</option>
<option value="CEFALOSPORINE">CEFALOSPORINE</option>
<option value="MACROLIDI">MACROLIDI</option>
<option value="PENICILLINE PENICILLINASI SENSIBILI">PENICILLINE PENICILLINASI SENSIBILI</option>
<option value="PENICILLINE – INIBITORI PENICILLINASI">PENICILLINE – INIBITORI PENICILLINASI</option>
<option value="PENICILLINE PENCILLINASI RESISTENTI">PENICILLINE PENCILLINASI RESISTENTI</option>
<option value="PENICILLINE AD AMPIO SPETTRO">PENICILLINE AD AMPIO SPETTRO</option>
<option value="MONOBATAMICI">MONOBATAMICI</option>
<option value="CARBAPENEMI">CARBAPENEMI</option>
<option value="GLICOPEDPTIDI">GLICOPEDPTIDI</option>
<option value="CHINOLONICI">CHINOLONICI</option>
<option value="CLORAMFINICOLO">CLORAMFINICOLO</option>
<option value="SUFLAMIDICI">SUFLAMIDICI</option>
<option value="TETRACICLINE">TETRACICLINE</option>
<option value="ANTISETTICI VIE URINARIE">ANTISETTICI VIE URINARIE</option>
<option value="ANTITUBERCOLARI">ANTITUBERCOLARI</option>
<option value="ANTIMICOTICI">ANTIMICOTICI</option>
<option value="ANTIELMINITICI">ANTIELMINITICI</option>
<option value="ANTIPROTOZOARI">ANTIPROTOZOARI</option>
<option value="ANTIVIRALI">ANTIVIRALI</option>
<option value="ALTRI ANTIBIOTICI">ALTRI ANTIBIOTICI</option>
<option value="AGENTI IPOLIPEMIZZANTI">AGENTI IPOLIPEMIZZANTI</option>
<option value="ANTIARGINOSI">ANTIARGINOSI</option>
<option value="ANTIARITMICI">ANTIARITMICI</option>
<option value="ANTIIPERTENSIVI">ANTIIPERTENSIVI</option>
<option value="BETABLOCCANTI">BETABLOCCANTI</option>
<option value="GLUCOSIDI CARDIOATTIVI">GLUCOSIDI CARDIOATTIVI</option>
<option value="VASODILATATORI">VASODILATATORI</option>
<option value="ALFA-BETA BLOCCANTI">ALFA-BETA BLOCCANTI</option>
<option value="ALTRICARDIOVASCOLARI">ALTRICARDIOVASCOLARI</option>
<option value="ANTIDOTI E AGENTICHELANTI">ANTIDOTI E AGENTICHELANTI</option>
<option value="ANTIVIRALI">ANTIVIRALI</option>
<option value="ANTIBATTERICI">ANTIBATTERICI</option>
<option value="ANTIMICOTICI">ANTIMICOTICI</option>
<option value="CORTISONICI">CORTISONICI</option>
<option value="CORTISONICI – ANTIBIOTICI">CORTISONICI – ANTIBIOTICI</option>
<option value="ANTIPRURIGINOSI">ANTIPRURIGINOSI</option>
<option value="ALTRI DERMATOLOGICI">ALTRI DERMATOLOGICI</option>
<option value="ANTISCABBIA">ANTISCABBIA</option>
<option value="DIURETICI TIAZIDICI CORRELATI">DIURETICI TIAZIDICI CORRELATI</option>
<option value="DIURETICI DELL’ANSA">DIURETICI DELL’ANSA</option>
<option value="DIURETICI RISPARMIATORI POTASSIO">DIURETICI RISPARMIATORI POTASSIO</option>
<option value="ASSOCIAZIONI">ASSOCIAZIONI</option>
<option value="DIURETICI OSMOTICI">DIURETICI OSMOTICI</option>
<option value="AMINOACIDI">AMINOACIDI</option>
<option value="SOLUZIONI IDROSALINE E/O GLUCOSATE E/O ALTRE">SOLUZIONI IDROSALINE E/O GLUCOSATE E/O ALTRE</option>
<option value="SOLUZIONI PER FLEBOCLISI">SOLUZIONI PER FLEBOCLISI</option>
<option value="ANABOLIZZANTI">ANABOLIZZANTI</option>
<option value="ANTITIROIDEI">ANTITIROIDEI</option>
<option value="CORTICOSTEROIDI GLICOATTIVI">CORTICOSTEROIDI GLICOATTIVI</option>
<option value="DIENCEFALO IPOFISARI E DERIVATI">DIENCEFALO IPOFISARI E DERIVATI</option>
<option value="ELETTROLITI PER OS">ELETTROLITI PER OS</option>
<option value="FARMACI TIROIDEI">FARMACI TIROIDEI</option>
<option value="BIFOSFONATI">BIFOSFONATI</option>
<option value="ANTIGOTTOSI">ANTIGOTTOSI</option>
<option value="INSULINE">INSULINE</option>
<option value="IPOGLICENIZZANTI ORALI">IPOGLICENIZZANTI ORALI</option>
<option value="IPOGLICENIZZANTI ORALI ASSOCIAZIONI">IPOGLICENIZZANTI ORALI ASSOCIAZIONI</option>
<option value="ORMONI PANCREATICI">ORMONI PANCREATICI</option>
<option value="ANTIASMATICI">ANTIASMATICI</option>
<option value="FLUIDIFICANTI">FLUIDIFICANTI</option>
<option value="SEDATIVI DELLA TOSSE">SEDATIVI DELLA TOSSE</option>
<option value="SURFATTANTI POLMONARI">SURFATTANTI POLMONARI</option>
<option value="ANTIACIDI">ANTIACIDI</option>
<option value="ANTIDIARROICI E REIDRATANTI PER OS">ANTIDIARROICI E REIDRATANTI PER OS</option>
<option value="CATARTICI-LASSATIVI">CATARTICI-LASSATIVI</option>
<option value="ANTIEMETICI">ANTIEMETICI</option>
<option value="ENZIMI PANCREATICI">ENZIMI PANCREATICI</option>
<option value="ANTIULCERA H2 ANTAGONISTI E INIBITORI DI POMPA">ANTIULCERA H2 ANTAGONISTI E INIBITORI DI POMPA</option>
<option value="ALTRI ANTIULCERA">ALTRI ANTIULCERA</option>
<option value="ALTRI">ALTRI</option>
<option value="ANTIEMORROIDALI">ANTIEMORROIDALI</option>
<option value="OSTETRICO-GINECOLOGICI SISTEMICI">OSTETRICO-GINECOLOGICI SISTEMICI</option>
<option value="OSTETRICO-GINECOLOGICI ANTIBATTERICI">OSTETRICO-GINECOLOGICI ANTIBATTERICI</option>
<option value="OSTETRICO-GINECOLOGICI ANTIMICOTICI">OSTETRICO-GINECOLOGICI ANTIMICOTICI</option>
<option value="PROSTAGLANDINE">PROSTAGLANDINE</option>
<option value="ANESTETICI LOCALI">ANESTETICI LOCALI</option>
<option value="MIORILASSANTI CENTRALI">MIORILASSANTI CENTRALI</option>
<option value="MIORILASSANTI PERIFERICI NON DEPOLARIZZATI">MIORILASSANTI PERIFERICI NON DEPOLARIZZATI</option>
<option value="MIORILASSANTI PERIFERICI DEPOLARIZZATI">MIORILASSANTI PERIFERICI DEPOLARIZZATI</option>
<option value="ANESTETICI LOCALI">ANESTETICI LOCALI</option>
<option value="ANESTETICI LOCALI TOPICI">ANESTETICI LOCALI TOPICI</option>
<option value="ANESTETICI GENERALI INALAZIONE">ANESTETICI GENERALI INALAZIONE</option>
<option value="ANESTETICI GENERALI ENDOVENA">ANESTETICI GENERALI ENDOVENA</option>
<option value="ANTIREUMATICI ANTIINFIAMMATORI">ANTIREUMATICI ANTIINFIAMMATORI</option>
<option value="ANALGESICI STUPEFACENTI">ANALGESICI STUPEFACENTI</option>
<option value="ALTRI ANALGESICI">ALTRI ANALGESICI</option>
<option value="ANTIEPILLETICI">ANTIEPILLETICI</option>
<option value="ANTIDEPRESSIVI">ANTIDEPRESSIVI</option>
<option value="ANTIPARKINSONIANI">ANTIPARKINSONIANI</option>
<option value="BENZODIAZEPINE">BENZODIAZEPINE</option>
<option value="BENZODIAZEPINE ANALOGHI">BENZODIAZEPINE ANALOGHI</option>
<option value="NEUROLETTICI">NEUROLETTICI</option>
<option value="SISTEMA NERVOSO CENTRALE VARI">SISTEMA NERVOSO CENTRALE VARI</option>
<option value="INIBITORI PROLATTINA">INIBITORI PROLATTINA</option>
<option value="ANTIDEMENZA">ANTIDEMENZA</option>
<option value="VACCINI">VACCINI</option>
<option value="VITAMINA A - VITD2">VITAMINA A - VITD2</option>
<option value="COMPLESSO VITAMINICO B">COMPLESSO VITAMINICO B</option>
<option value="COMPLESSO MULTIVITAMINICO">COMPLESSO MULTIVITAMINICO</option>
<option value="VIT C">VIT C</option>
<option value="VIT B6">VIT B6</option>
<option value="VIT B1">VIT B1</option>
<option value="VIT K">VIT K</option>
<option value="VIT E">VIT E</option>
<option value="VIT D E ANALOGHI">VIT D E ANALOGHI</option>
<option value="MANCA DESCRIZIONE">MANCA DESCRIZIONE</option>

</select></td>
</tr>
<tr>
<td>Codice </td><td><input class="form-control required" style="background-color: #eee" required="required" name="<portlet:namespace/>Codice" ></td>
</tr>
<tr>
<td>Principio Attivo </td><td><input class="form-control" style="background-color: #eee" required="required" name="<portlet:namespace/>Principio_Attivo" ></td>
</tr>
<tr>
<td>Nome Commerciale </td><td><input class="form-control" style="background-color: #eee" required="required" name="<portlet:namespace/>Nome_Commerciale" ></td>
</tr>
<tr>
<td>
<br/>
 <aui:button  style="width:200px;background-color:#e60000;color:white; height:40px" value="Reset" onclick="this.form.reset()" />
 </td>
 <td>
 <br/>
 <aui:button value="Save" key="save"  style="width:200px;background-color:#006622;color:white; height:40px" onClick="javascript:showAddNoteDialog();"/>
</td>
</tr>
</tbody>
</table>
</center>
</div> 
</div>
</div>
</aui:form>
<div class="yui3-skin-sam">
  <div id="modal"></div>
</div> 
<script>

function showAddNoteDialog(){

  
   YUI().use('aui-modal', function(Y) {
       var modal = new Y.Modal(
         {
           bodyContent: '<label for="feedback/suggestions" ><liferay-ui:message key="Are you want to submit form"/></label>',
           centered: true,
           headerContent: '<h3><label for="formsofinteraction"><liferay-ui:message key="Confirmation Box"/></label></h3>',
           modal: true,
           render: '#modal',
           width:300,
           height:200
         }
       ).render();
        modal.addToolbar(
              [
                {
                  label: '<liferay-ui:message key="Cancel"/>',
                  on: {
                    click: function() {
                     modal.hide();
                    }
                  }
                },
                {
                   label: '<liferay-ui:message key="Submit"/>',
                   on: {
                     click: function() {
                      modal.hide();
                      var flag=true;
                      var all_select = document.getElementsByTagName("select");
                      for (i = 0; i < all_select.length; i++) {
                    	  if(all_select[i].value=='-1')
                    		  {
                    		  all_select[i].style.backgroundColor = "yellow";
                    		  flag=false;
                    		  }
                      }
                      var inputs = document.getElementsByTagName('input');
                      for(var i = 0; i < inputs.length; i++) {
                          if(inputs[i].type.toLowerCase() == 'text') {
                        	  if(inputs[i].value==''){
                        		  inputs[i].style.backgroundColor = "yellow";
                            	  inputs[i].placeholder="Input me";
                            	  inputs[i].focus();
                            	  flag=false;
                              /*
                              if(inputs[i].name=="<portlet:namespace/>Codice")
                        	  {
                            	  inputs[i].style.backgroundColor = "red";
                            	  inputs[i].placeholder="Input me";
                            	  inputs[i].focus();
                            	  flag=false;
                            	//  alert(inputs[i].value);
                              }
                              if(inputs[i].name=="<portlet:namespace/>Principio_Attivo")
                        	  {
                            	  inputs[i].style.backgroundColor = "red";
                            	  inputs[i].focus();
                            	  inputs[i].placeholder="Input me";
                            	  flag=false;
                            	//  alert(inputs[i].value);
                              }
                              if(inputs[i].name=="<portlet:namespace/>Nome_Commerciale")
                        	  {
                            	  inputs[i].style.backgroundColor = "red";
                            	  inputs[i].focus();
                            	  inputs[i].placeholder="Input me";
                            	  flag=false;
                            	//  alert(inputs[i].value);
                              }
                              
                              */
                        	}
                          }
                          
                      }
						
                      if(flag==true){
                    	document.getElementById("<portlet:namespace/>fm").submit();
                    	//Liferay.Util.getOpener().<portlet:namespace/>windowRefresh();
						}
                     }
                   }
                 },
                ]
       );
     }
   );
 }
</script>
