<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.daffo.prontuario_drugservice.model.prontuario_drug"%>
<%@page import="com.daffo.prontuario_drugservice.service.prontuario_drugLocalServiceUtil"%>
<%@ include file="/init.jsp" %>

<%
String drug_id=request.getParameter("data");
prontuario_drug pd=null;
try{
pd=prontuario_drugLocalServiceUtil.getprontuario_drug(new Long(drug_id).longValue());
}catch(Exception e){
	pd=prontuario_drugLocalServiceUtil.getprontuario_drug(new Long(request.getAttribute("data").toString()).longValue());
}
%>

<%--Message area --%>
<liferay-ui:success key="success" message="Successfully Updated"/>

<portlet:actionURL name="editSubmit_drug" var="formSubmit">
<portlet:param name="mvcPath" value="/drug_edit.jsp"/> 
</portlet:actionURL>
<aui:form name="fm" id="fm" action="${formSubmit}">  
<input type="hidden" value="<%=pd.getDrug_id()%>" name="<portlet:namespace/>drug_id"/>
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
<option value="-1" <%=pd.getGruppo().equalsIgnoreCase("-1")?"selected":"" %>>-Select Item-</option>
<option value="ANTIBLASTICI" <%=pd.getGruppo().equalsIgnoreCase("ANTIBLASTICI")?"selected":"" %>>ANTIBLASTICI</option>
<option value="ANTIBIOTICI" <%=pd.getGruppo().equalsIgnoreCase("ANTIBIOTICI")?"selected":"" %>>ANTIBIOTICI</option>
<option value="CARDIOVASCOLARI" <%=pd.getGruppo().equalsIgnoreCase("CARDIOVASCOLARI")?"selected":"" %>>CARDIOVASCOLARI</option>
<option value="ANTIDOTIE CHELANTI" <%=pd.getGruppo().equalsIgnoreCase("ANTIDOTIE CHELANTI")?"selected":"" %>>ANTIDOTIE CHELANTI</option>
<option value="DERMATOLOGICI" <%=pd.getGruppo().equalsIgnoreCase("DERMATOLOGICI")?"selected":"" %>>DERMATOLOGICI</option>
<option value="DIURETECI" <%=pd.getGruppo().equalsIgnoreCase("DIURETECI")?"selected":"" %>>DIURETECI</option>
<option value="SOLUZIONI NUTRITIVE" <%=pd.getGruppo().equalsIgnoreCase("SOLUZIONI NUTRITIVE")?"selected":"" %>>SOLUZIONI NUTRITIVE</option>
<option value="SOLUZIONI IDROSALINE E GLUCOSATE" <%=pd.getGruppo().equalsIgnoreCase("SOLUZIONI IDROSALINE E GLUCOSATE")?"selected":"" %>>SOLUZIONI IDROSALINE E GLUCOSATE</option>
<option value="ENDOCRINOLOGICI E METABOLICI" <%=pd.getGruppo().equalsIgnoreCase("ENDOCRINOLOGICI E METABOLICI")?"selected":"" %>>ENDOCRINOLOGICI E METABOLICI</option>
<option value="FARMACI SISTEMA RESPIRATORIO" <%=pd.getGruppo().equalsIgnoreCase("FARMACI SISTEMA RESPIRATORIO")?"selected":"" %>>FARMACI SISTEMA RESPIRATORIO</option>
<option value="GASTROINTESTINALI" <%=pd.getGruppo().equalsIgnoreCase("GASTROINTESTINALI")?"selected":"" %>>GASTROINTESTINALI</option>
<option value="OSTETRICO-GINECOLOGICI" <%=pd.getGruppo().equalsIgnoreCase("OSTETRICO-GINECOLOGICI")?"selected":"" %>>OSTETRICO-GINECOLOGICI</option>
<option value="OCULISTICI" <%=pd.getGruppo().equalsIgnoreCase("OCULISTICI")?"selected":"" %>>OCULISTICI</option>
<option value="OTORINOLARINGOIATRICI" <%=pd.getGruppo().equalsIgnoreCase("OTORINOLARINGOIATRICI")?"selected":"" %>>OTORINOLARINGOIATRICI</option>
<option value="UROLOGICI" <%=pd.getGruppo().equalsIgnoreCase("UROLOGICI")?"selected":"" %>>UROLOGICI</option>
<option value="PLASMA E FRAZIONI PLASMATICHE" <%=pd.getGruppo().equalsIgnoreCase("PLASMA E FRAZIONI PLASMATICHE")?"selected":"" %>>PLASMA E FRAZIONI PLASMATICHE</option>
<option value="EMATOLOGICI" <%=pd.getGruppo().equalsIgnoreCase("EMATOLOGICI")?"selected":"" %>>EMATOLOGICI</option>
<option value="FARMACI DEL SISTEMA NEVOSO AUTONOMO" <%=pd.getGruppo().equalsIgnoreCase("FARMACI DEL SISTEMA NEVOSO AUTONOMO")?"selected":"" %>>FARMACI DEL SISTEMA NEVOSO AUTONOMO</option>
<option value="MORILASSANTI" <%=pd.getGruppo().equalsIgnoreCase("MORILASSANTI")?"selected":"" %>>MORILASSANTI</option>
<option value="ANESTETICI LOCALI" <%=pd.getGruppo().equalsIgnoreCase("ANESTETICI LOCALI")?"selected":"" %>>ANESTETICI LOCALI</option>
<option value="ANESTETICI GENERALI" <%=pd.getGruppo().equalsIgnoreCase("ANESTETICI GENERALI")?"selected":"" %>>ANESTETICI GENERALI</option>
<option value="ANALGESICI-ANTIPIRETICI" <%=pd.getGruppo().equalsIgnoreCase("ANALGESICI-ANTIPIRETICI")?"selected":"" %>>ANALGESICI-ANTIPIRETICI</option>
<option value="FARMACI DEL SISTEMA NEVOSO CENTRALE" <%=pd.getGruppo().equalsIgnoreCase("FARMACI DEL SISTEMA NEVOSO CENTRALE")?"selected":"" %>>FARMACI DEL SISTEMA NEVOSO CENTRALE</option>
<option value="VACCINI E SIERI" <%=pd.getGruppo().equalsIgnoreCase("VACCINI E SIERI")?"selected":"" %>>VACCINI E SIERI</option>
<option value="VITAMINE" <%=pd.getGruppo().equalsIgnoreCase("VITAMINE")?"selected":"" %>>VITAMINE</option>
</select></td>
</tr>
<tr>
<td>SottoGruppo</td><td><select class="form-control" required="required"  name="<portlet:namespace/>SottoGruppo">
<option value="-1" <%=pd.getSottoGruppo().equalsIgnoreCase("-1")?"selected":"" %>>-Select Item-</option>
<option value="AGENTI ALCHILANTI" <%=pd.getSottoGruppo().equalsIgnoreCase("AGENTI ALCHILANTI")?"selected":"" %>>AGENTI ALCHILANTI</option>
<option value="ALCALOIDI DELLA VINCA" <%=pd.getSottoGruppo().equalsIgnoreCase("ALCALOIDI DELLA VINCA")?"selected":"" %>>ALCALOIDI DELLA VINCA</option>
<option value="TAXANI" <%=pd.getSottoGruppo().equalsIgnoreCase("TAXANI")?"selected":"" %>>TAXANI</option>
<option value="AGENTI ANTIMICROTUBULO" <%=pd.getSottoGruppo().equalsIgnoreCase("AGENTI ANTIMICROTUBULO")?"selected":"" %>>AGENTI ANTIMICROTUBULO</option>
<option value="ANTRACICLINE" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTRACICLINE")?"selected":"" %>>ANTRACICLINE</option>
<option value="ANTIMETABOLITI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIMETABOLITI")?"selected":"" %>>ANTIMETABOLITI</option>
<option value="DERIVATI DEL PLATINO" <%=pd.getSottoGruppo().equalsIgnoreCase("DERIVATI DEL PLATINO")?"selected":"" %>>DERIVATI DEL PLATINO</option>
<option value="EPIPODOFILOTOSSINE" <%=pd.getSottoGruppo().equalsIgnoreCase("EPIPODOFILOTOSSINE")?"selected":"" %>>EPIPODOFILOTOSSINE</option>
<option value="ORMONI" <%=pd.getSottoGruppo().equalsIgnoreCase("ORMONI")?"selected":"" %>>ORMONI</option>
<option value="ALTRI ANTIBLASTICI" <%=pd.getSottoGruppo().equalsIgnoreCase("ALTRI ANTIBLASTICI")?"selected":"" %>>ALTRI ANTIBLASTICI</option>
<option value="IMMUNOMODULATORI" <%=pd.getSottoGruppo().equalsIgnoreCase("IMMUNOMODULATORI")?"selected":"" %>>IMMUNOMODULATORI</option>
<option value="DISINTOSSICANTI IN CHEMIOTERAPIA" <%=pd.getSottoGruppo().equalsIgnoreCase("DISINTOSSICANTI IN CHEMIOTERAPIA")?"selected":"" %>>DISINTOSSICANTI IN CHEMIOTERAPIA</option>
<option value="AMINOGLICOSIDI" <%=pd.getSottoGruppo().equalsIgnoreCase("AMINOGLICOSIDI")?"selected":"" %>>AMINOGLICOSIDI</option>
<option value="CEFALOSPORINE" <%=pd.getSottoGruppo().equalsIgnoreCase("CEFALOSPORINE")?"selected":"" %>>CEFALOSPORINE</option>
<option value="MACROLIDI" <%=pd.getSottoGruppo().equalsIgnoreCase("MACROLIDI")?"selected":"" %>>MACROLIDI</option>
<option value="PENICILLINE PENICILLINASI SENSIBILI" <%=pd.getSottoGruppo().equalsIgnoreCase("PENICILLINE PENICILLINASI SENSIBILI")?"selected":"" %>>PENICILLINE PENICILLINASI SENSIBILI</option>
<option value="PENICILLINE – INIBITORI PENICILLINASI" <%=pd.getSottoGruppo().equalsIgnoreCase("PENICILLINE – INIBITORI PENICILLINASI")?"selected":"" %>>PENICILLINE – INIBITORI PENICILLINASI</option>
<option value="PENICILLINE PENCILLINASI RESISTENTI" <%=pd.getSottoGruppo().equalsIgnoreCase("PENICILLINE PENCILLINASI RESISTENTI")?"selected":"" %>>PENICILLINE PENCILLINASI RESISTENTI</option>
<option value="PENICILLINE AD AMPIO SPETTRO" <%=pd.getSottoGruppo().equalsIgnoreCase("PENICILLINE AD AMPIO SPETTRO")?"selected":"" %>>PENICILLINE AD AMPIO SPETTRO</option>
<option value="MONOBATAMICI" <%=pd.getSottoGruppo().equalsIgnoreCase("MONOBATAMICI")?"selected":"" %>>MONOBATAMICI</option>
<option value="CARBAPENEMI" <%=pd.getSottoGruppo().equalsIgnoreCase("CARBAPENEMI")?"selected":"" %>>CARBAPENEMI</option>
<option value="GLICOPEDPTIDI" <%=pd.getSottoGruppo().equalsIgnoreCase("GLICOPEDPTIDI")?"selected":"" %>>GLICOPEDPTIDI</option>
<option value="CHINOLONICI" <%=pd.getSottoGruppo().equalsIgnoreCase("CHINOLONICI")?"selected":"" %>>CHINOLONICI</option>
<option value="CLORAMFINICOLO" <%=pd.getSottoGruppo().equalsIgnoreCase("CLORAMFINICOLO")?"selected":"" %>>CLORAMFINICOLO</option>
<option value="SUFLAMIDICI" <%=pd.getSottoGruppo().equalsIgnoreCase("SUFLAMIDICI")?"selected":"" %>>SUFLAMIDICI</option>
<option value="TETRACICLINE" <%=pd.getSottoGruppo().equalsIgnoreCase("TETRACICLINE")?"selected":"" %>>TETRACICLINE</option>
<option value="ANTISETTICI VIE URINARIE" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTISETTICI VIE URINARIE")?"selected":"" %>>ANTISETTICI VIE URINARIE</option>
<option value="ANTITUBERCOLARI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTITUBERCOLARI")?"selected":"" %>>ANTITUBERCOLARI</option>
<option value="ANTIMICOTICI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIMICOTICI")?"selected":"" %>>ANTIMICOTICI</option>
<option value="ANTIELMINITICI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIELMINITICI")?"selected":"" %>>ANTIELMINITICI</option>
<option value="ANTIPROTOZOARI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIPROTOZOARI")?"selected":"" %>>ANTIPROTOZOARI</option>
<option value="ANTIVIRALI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIVIRALI")?"selected":"" %>>ANTIVIRALI</option>
<option value="ALTRI ANTIBIOTICI" <%=pd.getSottoGruppo().equalsIgnoreCase("ALTRI ANTIBIOTICI")?"selected":"" %>>ALTRI ANTIBIOTICI</option>
<option value="AGENTI IPOLIPEMIZZANTI" <%=pd.getSottoGruppo().equalsIgnoreCase("AGENTI IPOLIPEMIZZANTI")?"selected":"" %>>AGENTI IPOLIPEMIZZANTI</option>
<option value="ANTIARGINOSI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIARGINOSI")?"selected":"" %>>ANTIARGINOSI</option>
<option value="ANTIARITMICI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIARITMICI")?"selected":"" %>>ANTIARITMICI</option>
<option value="ANTIIPERTENSIVI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIIPERTENSIVI")?"selected":"" %>>ANTIIPERTENSIVI</option>
<option value="BETABLOCCANTI" <%=pd.getSottoGruppo().equalsIgnoreCase("BETABLOCCANTI")?"selected":"" %>>BETABLOCCANTI</option>
<option value="GLUCOSIDI CARDIOATTIVI" <%=pd.getSottoGruppo().equalsIgnoreCase("GLUCOSIDI CARDIOATTIVI")?"selected":"" %>>GLUCOSIDI CARDIOATTIVI</option>
<option value="VASODILATATORI" <%=pd.getSottoGruppo().equalsIgnoreCase("VASODILATATORI")?"selected":"" %>>VASODILATATORI</option>
<option value="ALFA-BETA BLOCCANTI" <%=pd.getSottoGruppo().equalsIgnoreCase("ALFA-BETA BLOCCANTI")?"selected":"" %>>ALFA-BETA BLOCCANTI</option>
<option value="ALTRICARDIOVASCOLARI" <%=pd.getSottoGruppo().equalsIgnoreCase("ALTRICARDIOVASCOLARI")?"selected":"" %>>ALTRICARDIOVASCOLARI</option>
<option value="ANTIDOTI E AGENTICHELANTI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIDOTI E AGENTICHELANTI")?"selected":"" %>>ANTIDOTI E AGENTICHELANTI</option>
<option value="ANTIVIRALI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIVIRALI")?"selected":"" %>>ANTIVIRALI</option>
<option value="ANTIBATTERICI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIBATTERICI")?"selected":"" %>>ANTIBATTERICI</option>
<option value="ANTIMICOTICI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIMICOTICI")?"selected":"" %>>ANTIMICOTICI</option>
<option value="CORTISONICI" <%=pd.getSottoGruppo().equalsIgnoreCase("CORTISONICI")?"selected":"" %>>CORTISONICI</option>
<option value="CORTISONICI – ANTIBIOTICI" <%=pd.getSottoGruppo().equalsIgnoreCase("CORTISONICI – ANTIBIOTICI")?"selected":"" %>>CORTISONICI – ANTIBIOTICI</option>
<option value="ANTIPRURIGINOSI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIPRURIGINOSI")?"selected":"" %>>ANTIPRURIGINOSI</option>
<option value="ALTRI DERMATOLOGICI" <%=pd.getSottoGruppo().equalsIgnoreCase("ALTRI DERMATOLOGICI")?"selected":"" %>>ALTRI DERMATOLOGICI</option>
<option value="ANTISCABBIA" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTISCABBIA")?"selected":"" %>>ANTISCABBIA</option>
<option value="DIURETICI TIAZIDICI CORRELATI" <%=pd.getSottoGruppo().equalsIgnoreCase("DIURETICI TIAZIDICI CORRELATI")?"selected":"" %>>DIURETICI TIAZIDICI CORRELATI</option>
<option value="DIURETICI DELL’ANSA" <%=pd.getSottoGruppo().equalsIgnoreCase("DIURETICI DELL’ANSA")?"selected":"" %>>DIURETICI DELL’ANSA</option>
<option value="DIURETICI RISPARMIATORI POTASSIO" <%=pd.getSottoGruppo().equalsIgnoreCase("DIURETICI RISPARMIATORI POTASSIO")?"selected":"" %>>DIURETICI RISPARMIATORI POTASSIO</option>
<option value="ASSOCIAZIONI" <%=pd.getSottoGruppo().equalsIgnoreCase("ASSOCIAZIONI")?"selected":"" %>>ASSOCIAZIONI</option>
<option value="DIURETICI OSMOTICI" <%=pd.getSottoGruppo().equalsIgnoreCase("DIURETICI OSMOTICI")?"selected":"" %>>DIURETICI OSMOTICI</option>
<option value="AMINOACIDI" <%=pd.getSottoGruppo().equalsIgnoreCase("AMINOACIDI")?"selected":"" %>>AMINOACIDI</option>
<option value="SOLUZIONI IDROSALINE E/O GLUCOSATE E/O ALTRE" <%=pd.getSottoGruppo().equalsIgnoreCase("SOLUZIONI IDROSALINE E/O GLUCOSATE E/O ALTRE")?"selected":"" %>>SOLUZIONI IDROSALINE E/O GLUCOSATE E/O ALTRE</option>
<option value="SOLUZIONI PER FLEBOCLISI" <%=pd.getSottoGruppo().equalsIgnoreCase("SOLUZIONI PER FLEBOCLISI")?"selected":"" %>>SOLUZIONI PER FLEBOCLISI</option>
<option value="ANABOLIZZANTI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANABOLIZZANTI")?"selected":"" %>>ANABOLIZZANTI</option>
<option value="ANTITIROIDEI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTITIROIDEI")?"selected":"" %>>ANTITIROIDEI</option>
<option value="CORTICOSTEROIDI GLICOATTIVI" <%=pd.getSottoGruppo().equalsIgnoreCase("CORTICOSTEROIDI GLICOATTIVI")?"selected":"" %>>CORTICOSTEROIDI GLICOATTIVI</option>
<option value="DIENCEFALO IPOFISARI E DERIVATI" <%=pd.getSottoGruppo().equalsIgnoreCase("DIENCEFALO IPOFISARI E DERIVATI")?"selected":"" %>>DIENCEFALO IPOFISARI E DERIVATI</option>
<option value="ELETTROLITI PER OS" <%=pd.getSottoGruppo().equalsIgnoreCase("ELETTROLITI PER OS")?"selected":"" %>>ELETTROLITI PER OS</option>
<option value="FARMACI TIROIDEI" <%=pd.getSottoGruppo().equalsIgnoreCase("FARMACI TIROIDEI")?"selected":"" %>>FARMACI TIROIDEI</option>
<option value="BIFOSFONATI" <%=pd.getSottoGruppo().equalsIgnoreCase("BIFOSFONATI")?"selected":"" %>>BIFOSFONATI</option>
<option value="ANTIGOTTOSI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIGOTTOSI")?"selected":"" %>>ANTIGOTTOSI</option>
<option value="INSULINE" <%=pd.getSottoGruppo().equalsIgnoreCase("INSULINE")?"selected":"" %>>INSULINE</option>
<option value="IPOGLICENIZZANTI ORALI" <%=pd.getSottoGruppo().equalsIgnoreCase("IPOGLICENIZZANTI ORALI")?"selected":"" %>>IPOGLICENIZZANTI ORALI</option>
<option value="IPOGLICENIZZANTI ORALI ASSOCIAZIONI" <%=pd.getSottoGruppo().equalsIgnoreCase("IPOGLICENIZZANTI ORALI ASSOCIAZIONI")?"selected":"" %>>IPOGLICENIZZANTI ORALI ASSOCIAZIONI</option>
<option value="ORMONI PANCREATICI" <%=pd.getSottoGruppo().equalsIgnoreCase("ORMONI PANCREATICI")?"selected":"" %>>ORMONI PANCREATICI</option>
<option value="ANTIASMATICI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIASMATICI")?"selected":"" %>>ANTIASMATICI</option>
<option value="FLUIDIFICANTI" <%=pd.getSottoGruppo().equalsIgnoreCase("FLUIDIFICANTI")?"selected":"" %>>FLUIDIFICANTI</option>
<option value="SEDATIVI DELLA TOSSE" <%=pd.getSottoGruppo().equalsIgnoreCase("SEDATIVI DELLA TOSSE")?"selected":"" %>>SEDATIVI DELLA TOSSE</option>
<option value="SURFATTANTI POLMONARI" <%=pd.getSottoGruppo().equalsIgnoreCase("SURFATTANTI POLMONARI")?"selected":"" %>>SURFATTANTI POLMONARI</option>
<option value="ANTIACIDI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIACIDI")?"selected":"" %>>ANTIACIDI</option>
<option value="ANTIDIARROICI E REIDRATANTI PER OS" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIDIARROICI E REIDRATANTI PER OS")?"selected":"" %>>ANTIDIARROICI E REIDRATANTI PER OS</option>
<option value="CATARTICI-LASSATIVI" <%=pd.getSottoGruppo().equalsIgnoreCase("CATARTICI-LASSATIVI")?"selected":"" %>>CATARTICI-LASSATIVI</option>
<option value="ANTIEMETICI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIEMETICI")?"selected":"" %>>ANTIEMETICI</option>
<option value="ENZIMI PANCREATICI" <%=pd.getSottoGruppo().equalsIgnoreCase("ENZIMI PANCREATICI")?"selected":"" %>>ENZIMI PANCREATICI</option>
<option value="ANTIULCERA H2 ANTAGONISTI E INIBITORI DI POMPA" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIULCERA H2 ANTAGONISTI E INIBITORI DI POMPA")?"selected":"" %>>ANTIULCERA H2 ANTAGONISTI E INIBITORI DI POMPA</option>
<option value="ALTRI ANTIULCERA" <%=pd.getSottoGruppo().equalsIgnoreCase("ALTRI ANTIULCERA")?"selected":"" %>>ALTRI ANTIULCERA</option>
<option value="ALTRI" <%=pd.getSottoGruppo().equalsIgnoreCase("ALTRI")?"selected":"" %>>ALTRI</option>
<option value="ANTIEMORROIDALI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIEMORROIDALI")?"selected":"" %>>ANTIEMORROIDALI</option>
<option value="OSTETRICO-GINECOLOGICI SISTEMICI" <%=pd.getSottoGruppo().equalsIgnoreCase("OSTETRICO-GINECOLOGICI SISTEMICI")?"selected":"" %>>OSTETRICO-GINECOLOGICI SISTEMICI</option>
<option value="OSTETRICO-GINECOLOGICI ANTIBATTERICI" <%=pd.getSottoGruppo().equalsIgnoreCase("OSTETRICO-GINECOLOGICI ANTIBATTERICI")?"selected":"" %>>OSTETRICO-GINECOLOGICI ANTIBATTERICI</option>
<option value="OSTETRICO-GINECOLOGICI ANTIMICOTICI" <%=pd.getSottoGruppo().equalsIgnoreCase("OSTETRICO-GINECOLOGICI ANTIMICOTICI")?"selected":"" %>>OSTETRICO-GINECOLOGICI ANTIMICOTICI</option>
<option value="PROSTAGLANDINE" <%=pd.getSottoGruppo().equalsIgnoreCase("PROSTAGLANDINE")?"selected":"" %>>PROSTAGLANDINE</option>
<option value="ANESTETICI LOCALI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANESTETICI LOCALI")?"selected":"" %>>ANESTETICI LOCALI</option>
<option value="MIORILASSANTI CENTRALI" <%=pd.getSottoGruppo().equalsIgnoreCase("MIORILASSANTI CENTRALI")?"selected":"" %>>MIORILASSANTI CENTRALI</option>
<option value="MIORILASSANTI PERIFERICI NON DEPOLARIZZATI" <%=pd.getSottoGruppo().equalsIgnoreCase("MIORILASSANTI PERIFERICI NON DEPOLARIZZATI")?"selected":"" %>>MIORILASSANTI PERIFERICI NON DEPOLARIZZATI</option>
<option value="MIORILASSANTI PERIFERICI DEPOLARIZZATI" <%=pd.getSottoGruppo().equalsIgnoreCase("MIORILASSANTI PERIFERICI DEPOLARIZZATI")?"selected":"" %>>MIORILASSANTI PERIFERICI DEPOLARIZZATI</option>
<option value="ANESTETICI LOCALI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANESTETICI LOCALI")?"selected":"" %>>ANESTETICI LOCALI</option>
<option value="ANESTETICI LOCALI TOPICI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANESTETICI LOCALI TOPICI")?"selected":"" %>>ANESTETICI LOCALI TOPICI</option>
<option value="ANESTETICI GENERALI INALAZIONE" <%=pd.getSottoGruppo().equalsIgnoreCase("ANESTETICI GENERALI INALAZIONE")?"selected":"" %>>ANESTETICI GENERALI INALAZIONE</option>
<option value="ANESTETICI GENERALI ENDOVENA" <%=pd.getSottoGruppo().equalsIgnoreCase("ANESTETICI GENERALI ENDOVENA")?"selected":"" %>>ANESTETICI GENERALI ENDOVENA</option>
<option value="ANTIREUMATICI ANTIINFIAMMATORI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIREUMATICI ANTIINFIAMMATORI")?"selected":"" %>>ANTIREUMATICI ANTIINFIAMMATORI</option>
<option value="ANALGESICI STUPEFACENTI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANALGESICI STUPEFACENTI")?"selected":"" %>>ANALGESICI STUPEFACENTI</option>
<option value="ALTRI ANALGESICI" <%=pd.getSottoGruppo().equalsIgnoreCase("ALTRI ANALGESICI")?"selected":"" %>>ALTRI ANALGESICI</option>
<option value="ANTIEPILLETICI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIEPILLETICI")?"selected":"" %>>ANTIEPILLETICI</option>
<option value="ANTIDEPRESSIVI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIDEPRESSIVI")?"selected":"" %>>ANTIDEPRESSIVI</option>
<option value="ANTIPARKINSONIANI" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIPARKINSONIANI")?"selected":"" %>>ANTIPARKINSONIANI</option>
<option value="BENZODIAZEPINE" <%=pd.getSottoGruppo().equalsIgnoreCase("BENZODIAZEPINE")?"selected":"" %>>BENZODIAZEPINE</option>
<option value="BENZODIAZEPINE ANALOGHI" <%=pd.getSottoGruppo().equalsIgnoreCase("BENZODIAZEPINE ANALOGHI")?"selected":"" %>>BENZODIAZEPINE ANALOGHI</option>
<option value="NEUROLETTICI" <%=pd.getSottoGruppo().equalsIgnoreCase("NEUROLETTICI")?"selected":"" %>>NEUROLETTICI</option>
<option value="SISTEMA NERVOSO CENTRALE VARI" <%=pd.getSottoGruppo().equalsIgnoreCase("SISTEMA NERVOSO CENTRALE VARI")?"selected":"" %>>SISTEMA NERVOSO CENTRALE VARI</option>
<option value="INIBITORI PROLATTINA" <%=pd.getSottoGruppo().equalsIgnoreCase("INIBITORI PROLATTINA")?"selected":"" %>>INIBITORI PROLATTINA</option>
<option value="ANTIDEMENZA" <%=pd.getSottoGruppo().equalsIgnoreCase("ANTIDEMENZA")?"selected":"" %>>ANTIDEMENZA</option>
<option value="VACCINI" <%=pd.getSottoGruppo().equalsIgnoreCase("VACCINI")?"selected":"" %>>VACCINI</option>
<option value="VITAMINA A - VITD2" <%=pd.getSottoGruppo().equalsIgnoreCase("VITAMINA A - VITD2")?"selected":"" %>>VITAMINA A - VITD2</option>
<option value="COMPLESSO VITAMINICO B" <%=pd.getSottoGruppo().equalsIgnoreCase("COMPLESSO VITAMINICO B")?"selected":"" %>>COMPLESSO VITAMINICO B</option>
<option value="COMPLESSO MULTIVITAMINICO" <%=pd.getSottoGruppo().equalsIgnoreCase("COMPLESSO MULTIVITAMINICO")?"selected":"" %>>COMPLESSO MULTIVITAMINICO</option>
<option value="VIT C" <%=pd.getSottoGruppo().equalsIgnoreCase("VIT C")?"selected":"" %>>VIT C</option>
<option value="VIT B6" <%=pd.getSottoGruppo().equalsIgnoreCase("VIT B6")?"selected":"" %>>VIT B6</option>
<option value="VIT B1" <%=pd.getSottoGruppo().equalsIgnoreCase("VIT B1")?"selected":"" %>>VIT B1</option>
<option value="VIT K" <%=pd.getSottoGruppo().equalsIgnoreCase("VIT K")?"selected":"" %>>VIT K</option>
<option value="VIT E" <%=pd.getSottoGruppo().equalsIgnoreCase("VIT E")?"selected":"" %>>VIT E</option>
<option value="VIT D E ANALOGHI" <%=pd.getSottoGruppo().equalsIgnoreCase("VIT D E ANALOGHI")?"selected":"" %>>VIT D E ANALOGHI</option>
<option value="MANCA DESCRIZIONE" <%=pd.getSottoGruppo().equalsIgnoreCase("MANCA DESCRIZIONE")?"selected":"" %>>MANCA DESCRIZIONE</option>
</select></td>
</tr>
<tr>
<td>Codice </td><td><input class="form-control required" style="background-color: #eee" value="<%=pd.getCodice() %>" required="required" name="<portlet:namespace/>Codice" ></td>
</tr>
<tr>
<td>Principio Attivo </td><td><input class="form-control" style="background-color: #eee" required="required" value=<%=pd.getPrincipio_Attivo() %> name="<portlet:namespace/>Principio_Attivo" ></td>
</tr>
<tr>
<td>Nome Commerciale </td><td><input class="form-control" style="background-color: #eee" required="required" value="<%=pd.getNome_Commerciale() %>" name="<portlet:namespace/>Nome_Commerciale" ></td>
</tr>
<tr>
<td colspan="2" style="text-align:right">
 <br/>
 <aui:button value="Update" key="save"  style="width:200px;background-color:#006622;color:white; height:40px" onClick="javascript:showAddNoteDialog();"/>
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
