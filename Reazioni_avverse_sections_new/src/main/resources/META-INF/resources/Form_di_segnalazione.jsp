<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="/init.jsp" %>

<portlet:actionURL name="formSubmit" var="formSubmit">
<%--<portlet:param name="mvcPath" value="/views/selEmployee.jsp"/> --%>
</portlet:actionURL>
<liferay-ui:success key="success" message="Record saved successfully!"/>

<style> 
tr{ //text-align:center; font-family: Arial Unicode MS, Lucida Sans Unicode, sans-serif; font-weight:bold; font-size:13px; } .row{ margin-bottom: 4px; } .border_cols{ border: 1px solid; } </style> 
<script>
YUI().use(
		  'aui-datepicker',
		  function(Y) {
		    var datepicker = new Y.DatePicker(
		      {
		        trigger: '#DATA_2',
		         mask: '%d/%m/%Y',
		         popover: {
		          toolbars: {
		            header: [[
		              {
		                icon:'icon-trash',
		                label: 'Clear',
		                on: {
		                  click: function() {
		                    datepicker.clearSelection();
		                  }
		                }
		              },
		              
		            ]]
		          },
		          zIndex: 1
		        }
		      }
		    );
		  }
		);

YUI().use(
		  'aui-datepicker',
		  function(Y) {
		    var datepicker = new Y.DatePicker(
		      {
		        trigger: '#DATA_4',
		         mask: '%d/%m/%Y',
		         popover: {
		          toolbars: {
		            header: [[
		              {
		                icon:'icon-trash',
		                label: 'Clear',
		                on: {
		                  click: function() {
		                    datepicker.clearSelection();
		                  }
		                }
		              },
		              
		            ]]
		          },
		          zIndex: 1
		        }
		      }
		    );
		  }
		);
YUI().use(
		  'aui-datepicker',
		  function(Y) {
		    var datepicker = new Y.DatePicker(
		      {
		        trigger: '#DATA_40',
		         mask: '%d/%m/%Y',
		         popover: {
		          toolbars: {
		            header: [[
		              {
		                icon:'icon-trash',
		                label: 'Clear',
		                on: {
		                  click: function() {
		                    datepicker.clearSelection();
		                  }
		                }
		              },
		              
		            ]]
		          },
		          zIndex: 1
		        }
		      }
		    );
		  }
		);
		
function show(){
	alert("Hello");
}
</script> 
<aui:form name="fm" id="fm" action="${formSubmit}">  
<div class="container-fluid-1280"> 
<!-- First Row --> 
<div class="row"> 
<div class="col-md-12"> 
<!-- <table style="text-align:center;font-family:Lucida Sans Unicode;font-size:14px;font-style:regular;background-color:#4f81bd;color:white;">
<tr><td></td><
<td> SCHEDA UNICA DI SEGNALAZIONE DI SOSPETTA REAZIONE AVVERSA (ADR)<br/> 
<span style="font-size:11px"> A cura dei medici e degli altri operatori sanitari. Inviare al responsabile di farmacovigilanza della struttura di appartenenza<br> (
gli indirizzi dei responsabili possono essere recuperati nel sito dellâ??AIFA: www.agenziafarmaco.it/it/responsabili) </span> </td><td></td></tr></table> --> 
<img src="<%=request.getContextPath() %>/images/formImg_2_1500x.png" width="100%"> 
</div> 
</div> 
<!-- Second Row --> 
<div class="row border_cols"> 
<br> 
<div class="col-md-2"> 
<table>
<tbody>
<tr><td>1. INIZIALI PAZIENTE<br>Nome-Cognome</td></tr>
<tr><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>INIZIALI_1" id="INIZIALI_1">
</td></tr></tbody></table> 
</div> 
<div class="col-md-2"> 
<table><tbody><tr><td>2. DATA di NASCITA o ETÀ</td></tr>
<tr><td><br/> <input class="form-control" style="background-color: #eee" name="<portlet:namespace/>DATA_2" id="DATA_2" placeholder="dd/mm/yyyy"> </td></tr></tbody></table> 
</div> 
<div class="col-md-2"> 
<table width="100%"><tbody><tr><td>3. SESSO <br>&nbsp;</td></tr><tr><td><table><tbody><tr><td> <input type="radio" name="<portlet:namespace/>SESSO_3" value="M"> M</td> <td>&nbsp;<input type="radio" name="<portlet:namespace/>SESSO_3" value="F"> F </td></tr></tbody></table> </td></tr></tbody></table> 
</div> 
<div class="col-md-2"> 
<table><tbody><tr><td>4. DATA INSORGENZA REAZIONE</td></tr><tr><td> <input class="form-control" style="background-color: #eee" name="<portlet:namespace/>DATA_4" id="DATA_4" placeholder="dd/mm/yyyy"> </td></tr></tbody></table> 
</div> 
<div class="col-md-2"> 
<table><tbody><tr><td>5. ORIGINE ETNICA<br>&nbsp;</td></tr><tr><td> <input class="form-control" style="background-color: #eee" name="<portlet:namespace/>ORIGINE_5"> </td></tr></tbody></table> 
</div> 
<div class="col-md-2"> 
<table><tbody><tr><td>CODICE SEGNALAZIONE<br>&nbsp;</td></tr><tr><td> <input class="form-control" style="background-color: #eee" name="<portlet:namespace/>CODICE" required> </td></tr></tbody></table>
</div> 
</div> 
<!-- Third row border_cols -->
<div class="row border_cols">
<br> 
<div class="col-md-2"> 
<table><tbody><tr><td>1.a. PESO (kg) <br>&nbsp;</td></tr><tr><td> <input class="form-control" style="background-color: #eee" name="<portlet:namespace/>INIZIALI_1_a"> </td></tr></tbody></table> 
</div>
<div class="col-md-2"> 
<table><tbody><tr><td>1.b. ALTEZZA (cm) <br>&nbsp;</td></tr><tr><td> <input class="form-control" style="background-color: #eee" name="<portlet:namespace/>INIZIALI_1_b"> </td></tr></tbody></table> 
</div> 
<div class="col-md-2"> 
<table><tbody><tr><td>1.c. DATA ULTIMA MESTRUAZIONE</td></tr><tr><td> <input class="form-control" style="background-color: #eee" name="<portlet:namespace/>INIZIALI_1_c"> </td></tr></tbody></table> 
</div> 
<div class="col-md-4"> 
<table width="100%"><tbody><tr></tr><tr><td></td><td>1.d. GRAVIDANZA<br>&nbsp;</td><td>
<input type="radio" name="<portlet:namespace/>INIZIALI_1_d" value="sconosciuta">sconosciuta </td> </tr>
<tr><td colspan="3"> 
<table><tbody><tr><td> 
<input type="radio" name="<portlet:namespace/>INIZIALI_1_d" value="1° trimestre"> 1° trimestre  </td><td> &nbsp;<input type="radio" name="<portlet:namespace/>INIZIALI_1_d" value="2° trimestre"> 2° trimestre  </td> <td> &nbsp;<input type="radio" name="<portlet:namespace/>INIZIALI_1_d" value="3° trimestre"> 3° trimestre  </td> </tr></tbody></table> 
</td></tr>
</tbody>
</table> 
</div> 
<div class="col-md-2"> 
<table><tbody><tr><td>1.e. ALLATTAMENTO<br>&nbsp;</td></tr><tr><td> <table width="100%"><tbody><tr><td> <input type="radio" name="<portlet:namespace/>INIZIALI_1_e" value="SI"> SI</td><td>&nbsp;<input type="radio" name="<portlet:namespace/>INIZIALI_1_e" value="NO">NO</td></tr></tbody>
</table>
</td></tr></tbody>
</table>
</div>
</div>

<!-- Third Row -->
<div class="row border_cols">
<br> 
<div class="col-md-12"> 
<table width="100%"> <tbody>
<tr><td>6. DESCRIZIONE DELLA REAZIONE ED EVENTUALE DIAGNOSI (*se il segnalatore è un medico)</td></tr> 
<tr> <td> <textarea style="background-color: #eee" class="form-control" rows="5" name="<portlet:namespace/>DESCRIZIONE_6"></textarea> </td> </tr> </tbody>
</table> 
</div> 
</div> 
<!-- four Row --> 
<div class="row border_cols"> 
<br> 
<div class="col-md-4"> 
<table> <tbody><tr><td>7. INDICARE SE LA REAZIONE OSSERVATA DERIVA DA </td></tr> 
<tr> <td> 
<br> 
<table width="100%"> <tbody>
<tr><td><input type="checkbox" name="<portlet:namespace/>INDICARE_7_1" value="INTERAZIONE"> INTERAZIONE</td><td><input type="checkbox" name="<portlet:namespace/>INDICARE_7_2" value="ERRORE TERAPEUTICO"> ERRORE TERAPEUTICO</td></tr> 
<tr><td><input type="checkbox" name="<portlet:namespace/>INDICARE_7_3" value="ABUSO"> ABUSO</td><td><input type="checkbox" name="<portlet:namespace/>INDICARE_7_4" value="MISUSO"> MISUSO</td></tr> 
<tr><td><input type="checkbox" name="<portlet:namespace/>INDICARE_7_5" value="OFF LABEL"> OFF LABEL</td><td><input type="checkbox" name="<portlet:namespace/>INDICARE_7_6" value="OVERDOSE"> OVERDOSE</td></tr> 
<tr><td colspan="3"><input type="checkbox" name="<portlet:namespace/>INDICARE_7_7" value="ESPOSIZIONE PROFESSIONALE"> ESPOSIZIONE PROFESSIONALE</td></tr> </tbody></table> </td> </tr> </tbody>
</table> 
</div> 
<div class="col-md-8"> 
<table width="100%"> <tbody>
<tr><td>8. GRAVITA' DELLA REAZIONE</td></tr> 
<tr> <td> <br> 
<table width="100%"> <tbody>
<tr><td colspan="3">GRAVE</td></tr> 
<tr><td><input type="checkbox" name="<portlet:namespace/>GRAVITA_8_1" value="DECESSO"> DECESSO</td><td><input type="checkbox" name="<portlet:namespace/>GRAVITA_8_2" value="OSPEDALIZZAZIONE O PROLUNGAMENTO"> OSPEDALIZZAZIONE O PROLUNGAMENTO</td></tr> 
<tr><td><input type="checkbox" name="<portlet:namespace/>GRAVITA_8_3" value="INVALIDITA' GRAVE O PERMANENTE"> INVALIDITA' GRAVE O PERMANENTE</td><td><input type="checkbox" name="<portlet:namespace/>GRAVITA_8_4" value="HA MESSO IN PERICOLO DI VITA"> HA MESSO IN PERICOLO DI VITA</td></tr> 
<tr><td><input type="checkbox" name="<portlet:namespace/>GRAVITA_8_5" value="ANOMALIE CONGENITE/DEFICIT NEL NEONATO"> ANOMALIE CONGENITE/DEFICIT NEL NEONATO</td><td><input type="checkbox" name="<portlet:namespace/>GRAVITA_8_6" value="ALTRA CONDIZIONE CLINICAMENTE RILEVANTE"> ALTRA CONDIZIONE CLINICAMENTE RILEVANTE</td></tr> 
<tr><td colspan="3"><br><input type="checkbox" name="<portlet:namespace/>GRAVITA_8_7" value="NON GRAVE"> NON GRAVE</td></tr> </tbody>
</table> </td> </tr> </tbody>
</table> 
</div> 
</div> 

<!-- five Row --> 
<div class="row border_cols"> <br> <div class="col-md-8"> 
<table width="100%"> <tbody>
<tr> <td> 
<table width="100%"> <tbody>
<tr><td>9. EVENTUALI ESAMI DI LABORATORIO RILEVANTI PER ADR (riportare risultati e date in cui gli accertamenti sono stati eseguiti)</td></tr> 
<tr> <td> <textarea style="background-color: #eee" class="form-control" rows="5" name="<portlet:namespace/>EVENTUALI_9"></textarea> </td> </tr> </tbody>
</table> 
</td> </tr> 
<tr> <td> 
<br> 
<table width="100%"> <tbody><tr><td>11. AZIONI INTRAPRESE (specificare)</td></tr> 
<tr> 
<td style="text-align:right"> 
<textarea style="background-color: #eee" class="form-control" rows="4" name="<portlet:namespace/>AZIONI_11"></textarea> 
<br> In caso di sospensione compilare i campi da 17 a 20 </td> </tr> </tbody>
</table> 
</td> </tr> </tbody>
</table> 
</div> 

<div class="col-md-4"> 
<table width="100%"><tbody><tr> <td colspan="3">
<table><tbody>
<tr><td>10. ESITO DATA&nbsp;&nbsp;&nbsp; </td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>ESITO_10"></td></tr>
</tbody></table></td> </tr> 
<tr><td><input type="checkbox" name="<portlet:namespace/>ESITO_10_1" value="RISOLUZIONE COMPLETA ADR"> RISOLUZIONE COMPLETA ADR</td></tr> 
<tr><td><input type="checkbox" name="<portlet:namespace/>ESITO_10_2" value="RISOLUZIONE CON POSTUMI"> RISOLUZIONE CON POSTUMI</td> </tr> 
<tr><td><input type="checkbox" name="<portlet:namespace/>ESITO_10_3" value="MIGLIORAMENTO"> MIGLIORAMENTO</td> </tr> 
<tr><td><input type="checkbox" name="<portlet:namespace/>ESITO_10_4" value="REAZIONE INVARIATA O PEGGIORATA"> REAZIONE INVARIATA O PEGGIORATA</td></tr> 
<tr><td><input type="checkbox" name="<portlet:namespace/>ESITO_10_5" value="DECESSO"> DECESSO</td> </tr> 
<tr> <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" name="<portlet:namespace/>ESITO_10_6" value="dovuto alla reazione avversa"> dovuto alla reazione avversa</td></tr> 
<tr> <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" name="<portlet:namespace/>ESITO_10_7" value="il farmaco può avere contribuito"> il farmaco può avere contribuito</td></tr> 
<tr> <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" name="<portlet:namespace/>ESITO_10_8" value="non dovuto al farmaco"> non dovuto al farmaco</td></tr> 
<tr> <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox" name="<portlet:namespace/>ESITO_10_9" value="causa sconosciuta"> causa sconosciuta</td></tr> 
<tr><td><input type="checkbox" name="<portlet:namespace/>ESITO_10_10" value="NON DISPONIBILE"> NON DISPONIBILE</td> </tr> </tbody>
</table>
</div>
</div>
 
<!-- six Row --> 
<div class="row"> 
<br> 
<div class="col-md-12"> 
<img src="<%=request.getContextPath() %>/images/middle-1.PNG" width="100%"> 
 </div> 
 </div> 

<!-- seven Row --> 
<div class="row border_cols"> 
<br> 
<div class="col-md-12"> 
<table><tbody><tr><td>12. FARMACO/I SOSPETTO/I (indicare il nome della specialità medicinale o del generico*). Riportare il numero di lotto per vaccini e medicinali biologici</td></tr>
</tbody></table> 
<!-- A --> 
<div class="col-md-12"> 
<br> 
<div class="col-md-2"> 
<table><tbody><tr><td>A)&nbsp;&nbsp;&nbsp; </td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_12_a"></td></tr>
</tbody></table> 
</div> 
<div class="col-md-4"> 
<table><tbody><tr><td>13. LOTTO&nbsp;&nbsp;&nbsp; </td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_12_a_13"></td></tr>
</tbody></table>
</div> 
<div class="col-md-6"> 
<table><tbody><tr><td>14. DOSAGGIO/FREQUENZA (specificare) &nbsp;&nbsp;&nbsp; </td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_12_a_14"></td></tr>
</tbody></table> 
</div> 
</div> 
<div class="col-md-12">
<br> 
<div class="col-md-4"> 
<table width="100%"><tbody><tr><td width="220px">15. VIA DI SOMMINISTRAZIONE &nbsp;&nbsp;&nbsp;</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_12_a_15"></td></tr>
</tbody></table> 
</div> 
<div class="col-md-6"> 
<table width="100%"><tbody><tr><td width="170px">16. DURATA DELL'USO </td><td> 
<table><tbody><tr> <td>DAL&nbsp;&nbsp;&nbsp;</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_12_a_16_1"></td> <td> AL&nbsp;&nbsp;&nbsp;</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_12_a_16_2"></td> </tr>
</tbody></table> </td></tr>
</tbody></table> 
</div> 
</div> 

<div class="col-md-12"> 
<br> 
<div class="col-md-5"> 
<table><tbody>
<tr><td>17. IL FARMACO E’ STATO SOSPESO?&nbsp;&nbsp;&nbsp; </td><td> <input type="radio" name="<portlet:namespace/>FARMACO_12_a_17" value="SI">&nbsp;SI&nbsp;<input type="radio" name="<portlet:namespace/>FARMACO_12_a_17" value="NO">&nbsp;NO&nbsp;
</td></tr></tbody></table> </div>  
<div class="col-md-7"> 
<table><tbody><tr><td> 18. LA REAZIONE E' MIGLIORATA DOPO LA SOSPENSIONE? &nbsp;&nbsp;&nbsp; </td><td> <input type="radio" name="<portlet:namespace/>FARMACO_12_a_18" value="SI">&nbsp;SI&nbsp;<input type="radio" name="<portlet:namespace/>FARMACO_12_a_18" value="NO">&nbsp;NO&nbsp;
 </td></tr></tbody></table> </div> 
</div> 
<div class="col-md-12"> <br> 
<div class="col-md-5"> 
<table><tbody><tr><td>19. IL FARMACO E’ STATO RIPRESO?&nbsp;&nbsp;&nbsp; </td><td> <input type="radio" name="<portlet:namespace/>FARMACO_12_a_19" value="SI">&nbsp;SI&nbsp;<input type="radio" name="<portlet:namespace/>FARMACO_12_a_19" value="NO">&nbsp;NO&nbsp; </td></tr>
</tbody></table> 
</div> 
<div class="col-md-7"> 
<table><tbody><tr><td>20. SONO RICOMPARSI I SINTOMI DOPO LA RISOMMINISTRAZIONE? &nbsp;&nbsp;&nbsp; </td><td> <input type="radio" name="<portlet:namespace/>FARMACO_12_a_20" value="SI"> &nbsp;SI&nbsp;<input type="radio" name="<portlet:namespace/>FARMACO_12_a_20" value="NO">&nbsp;NO&nbsp;
 </td></tr></tbody></table>
</div> 
</div> 
<!-- B --> 
<div class="col-md-12"> 
<br> 
<div class="col-md-2"> 
<table><tbody><tr><td>B)&nbsp;&nbsp;&nbsp; </td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_12_b"></td></tr>
</tbody></table> 
</div> 
<div class="col-md-4"> 
<table><tbody><tr><td>13. LOTTO&nbsp;&nbsp;&nbsp; </td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_12_b_13"></td></tr></tbody>
</table> 
</div> 
<div class="col-md-6"> 
<table><tbody><tr><td>14. DOSAGGIO/FREQUENZA (specificare) &nbsp;&nbsp;&nbsp; </td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_12_b_14"></td></tr>
</tbody></table> 
</div> 
</div> 
<div class="col-md-12"> 
<br> 
<div class="col-md-4"> 
<table width="100%"><tbody><tr><td width="220px">15. VIA DI SOMMINISTRAZIONE &nbsp;&nbsp;&nbsp;</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_12_b_15"></td></tr>
</tbody></table> 
</div> 
<div class="col-md-6"> 
<table width="100%"><tbody><tr><td width="170px">16. DURATA DELL'USO </td><td>
<table><tbody><tr> <td>DAL&nbsp;&nbsp;&nbsp;</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_12_b_16_1"></td> <td> AL&nbsp;&nbsp;&nbsp;</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_12_b_16_2"></td> 
</tr></tbody></table> 
</td></tr>
</tbody></table> 
</div> 
</div> 
<div class="col-md-12">
 <br> 
<div class="col-md-5"> 
<table><tbody><tr><td>17. IL FARMACO E’ STATO SOSPESO?&nbsp;&nbsp;&nbsp; </td><td> <input type="radio" name="<portlet:namespace/>FARMACO_12_b_17" value="SI"/>&nbsp;SI&nbsp;<input type="radio" name="<portlet:namespace/>FARMACO_12_b_17" value="NO"/>&nbsp;NO&nbsp;</td></tr>
</tbody></table> 
</div> 
<div class="col-md-7"> 
<table><tbody><tr><td> 18. LA REAZIONE E' MIGLIORATA DOPO LA SOSPENSIONE? &nbsp;&nbsp;&nbsp; </td><td> <input type="radio" name="<portlet:namespace/>FARMACO_12_b_18" value="SI">&nbsp;SI&nbsp;<input type="radio" name="<portlet:namespace/>FARMACO_12_b_18" value="NO">&nbsp;NO&nbsp; </td></tr>
</tbody></table> 
</div> 
</div> 
<div class="col-md-12"> 
<br> 
<div class="col-md-5"> 
<table><tbody><tr><td>19. IL FARMACO E’ STATO RIPRESO?&nbsp;&nbsp;&nbsp; </td><td> <input type="radio" name="<portlet:namespace/>FARMACO_12_b_19" value="SI">&nbsp;SI&nbsp;<input type="radio" name="<portlet:namespace/>FARMACO_12_b_19" value="NO">&nbsp;NO&nbsp; </td></tr>
</tbody></table>
</div> 
<div class="col-md-7"> 
<table><tbody><tr><td>20. SONO RICOMPARSI I SINTOMI DOPO LA RISOMMINISTRAZIONE? &nbsp;&nbsp;&nbsp; </td><td> <input type="radio" name="<portlet:namespace/>FARMACO_12_b_20" value="SI"> &nbsp;SI&nbsp;<input type="radio" name="<portlet:namespace/>FARMACO_12_b_20" value="NO">&nbsp;NO&nbsp; </td></tr>
</tbody></table> 
</div> 
</div> 

<!-- C --> 
<div class="col-md-12"> 
<br> 
<div class="col-md-2"> 
<table><tbody><tr><td>C)&nbsp;&nbsp;&nbsp; </td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_12_c"></td></tr>
</tbody></table> 
</div>
<div class="col-md-4">
<table><tbody><tr><td>13. LOTTO&nbsp;&nbsp;&nbsp; </td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_12_c_13"></td></tr>
</tbody></table> 
</div>
 <div class="col-md-6"> 
 <table><tbody><tr><td>14. DOSAGGIO/FREQUENZA (specificare) &nbsp;&nbsp;&nbsp; </td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_12_c_14"></td></tr>
 </tbody></table> 
 </div> 
 </div> 
 
 <div class="col-md-12"> 
 <br> 
 <div class="col-md-4"> 
 <table width="100%"><tbody><tr><td width="220px">15. VIA DI SOMMINISTRAZIONE &nbsp;&nbsp;&nbsp;</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_12_c_15"></td></tr>
 </tbody></table> 
 </div> 
 <div class="col-md-6"> 
 <table width="100%"><tbody><tr><td width="170px">16. DURATA DELL'USO </td><td>
 <table><tbody><tr> <td>DAL&nbsp;&nbsp;&nbsp;</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_12_c_16_1"></td> <td> AL&nbsp;&nbsp;&nbsp;</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_12_c_16_2"></td> </tr>
 </tbody></table> 
 </td></tr>
 </tbody></table> 
 </div> 
 </div> 
 
 <div class="col-md-12"> 
 <br> 
 <div class="col-md-5">
 <table><tbody><tr><td>17. IL FARMACO E’ STATO SOSPESO?&nbsp;&nbsp;&nbsp; </td><td> <input type="radio" name="<portlet:namespace/>FARMACO_12_c_17" value="SI">&nbsp;SI&nbsp;<input type="radio" name="<portlet:namespace/>FARMACO_12_c_17" value="NO">&nbsp;NO&nbsp; </td></tr>
 </tbody></table> 
 </div> 
 <div class="col-md-7"> 
 <table><tbody><tr><td> 18. LA REAZIONE E' MIGLIORATA DOPO LA SOSPENSIONE? &nbsp;&nbsp;&nbsp; </td><td> <input type="radio" name="<portlet:namespace/>FARMACO_12_c_18" value="SI">&nbsp;SI&nbsp;<input type="radio" name="<portlet:namespace/>FARMACO_12_c_18" value="NO">&nbsp;NO&nbsp; </td></tr>
 </tbody></table> 
 </div> 
 </div> 
 <div class="col-md-12">
  <br> 
  <div class="col-md-5"> 
 <table><tbody><tr><td>19. IL FARMACO E’ STATO RIPRESO?&nbsp;&nbsp;&nbsp; </td><td> <input type="radio" name="<portlet:namespace/>FARMACO_12_c_19" value="SI">&nbsp;SI&nbsp;<input type="radio" name="<portlet:namespace/>FARMACO_12_c_19" value="NO">&nbsp;NO&nbsp; </td></tr>
 </tbody></table> 
 </div> 
 <div class="col-md-7"> 
 <table><tbody><tr><td>20. SONO RICOMPARSI I SINTOMI DOPO LA RISOMMINISTRAZIONE? &nbsp;&nbsp;&nbsp; </td><td> <input type="radio" name="<portlet:namespace/>FARMACO_12_c_20" value="SI"> &nbsp;SI&nbsp;<input type="radio" name="<portlet:namespace/>FARMACO_12_c_20" value="NO">&nbsp;NO&nbsp;</td></tr>
  </tbody></table> 
  </div> 
  </div> 
 <table><tbody><tr> <td>* Nel caso di vaccini specificare anche il numero di dosi e/o di richiamo, l’ora e il sito della somministrazione</td> </tr></tbody></table> </div> </div> 


<!-- eight --> 
<div class="row border_cols "> 
<div class="col-md-12">
<br> 
<table width="100%"> <tbody>
<tr> <td>21. INDICAZIONI O ALTRO MOTIVO PER CUI IL FARMACO È STATO USATO (le lettere fanno riferimento ai farmaci indicati precedentemente)</td> </tr> <tr> <td> 
<table width="300px"> <tbody>
<tr><td>A.</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>INDICAZIONI_21_a"></td></tr> 
<tr><td>B.</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>INDICAZIONI_21_b"></td></tr> 
<tr><td>C.</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>INDICAZIONI_21_c"></td></tr>
 </tbody></table> 
 </td> </tr> 
 </tbody></table> 
 </div> 
 </div> 
<!-- Nine --> 
<div class="row border_cols "> 
<div class="col-md-12"> 
<br> 
<table><tbody><tr><td>22. FARMACO/I CONCOMITANTE/I (indicare il nome della specialità medicinale o del generico*). Riportare il numero di lotto per vaccini e medicinali biologici</td></tr></tbody></table>
 <!-- A -->
 <div class="col-md-12"> 
 <br> 
 <div class="col-md-2"> 
 <table><tbody>
 <tr><td>A)&nbsp;&nbsp;&nbsp; </td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_22_a"></td></tr>
 </tbody></table> 
 </div> 
 <div class="col-md-4"> 
 <table><tbody><tr><td>23. LOTTO&nbsp;&nbsp;&nbsp; </td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_22_a_23"></td></tr>
 </tbody></table> 
 </div> 
 <div class="col-md-6"> 
 <table><tbody><tr><td>24. DOSAGGIO/FREQUENZA (specificare) &nbsp;&nbsp;&nbsp; </td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_22_a_24"></td></tr>
 </tbody></table> 
 </div> 
 </div> 
 
 <div class="col-md-12"> 
 <br> 
 <div class="col-md-4"> 
 <table width="100%"><tbody><tr><td width="220px">25. VIA DI SOMMINISTRAZIONE </td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_22_a_25"></td></tr>
 </tbody></table> 
 </div> 
 
 <div class="col-md-6"> 
 <table width="100%"><tbody><tr><td width="170px">26. DURATA DELL'USO </td><td> 
 <table><tbody><tr> <td>DAL&nbsp;&nbsp;&nbsp;</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_22_a_26_1"></td> <td> AL&nbsp;&nbsp;&nbsp;</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_22_a_26_2"></td> </tr>
 </tbody></table> 
 </td></tr></tbody></table> 
 </div> 
 </div> 
 
 <div class="col-md-12"> 
 <br> 
 <div class="col-md-5"> 
 <table><tbody><tr><td>27. IL FARMACO E’ STATO SOSPESO?&nbsp;&nbsp;&nbsp; </td><td> <input type="radio" name="<portlet:namespace/>FARMACO_22_a_27" value="SI">&nbsp;SI&nbsp;<input type="radio" name="<portlet:namespace/>FARMACO_22_a_27" value="NO">&nbsp;NO&nbsp;
 <table><tbody><tr> <td></td><td> </td><td></td><td> </td></tr></tbody></table> </td></tr>
 </tbody></table> 
 </div> 
 
 <div class="col-md-7"> 
 <table><tbody><tr><td> 28. LA REAZIONE E' MIGLIORATA DOPO LA SOSPENSIONE? &nbsp;&nbsp;&nbsp; </td><td> <input type="radio" name="<portlet:namespace/>FARMACO_22_a_28" value="SI">&nbsp;SI&nbsp;<input type="radio" name="<portlet:namespace/>FARMACO_22_a_28" value="NO">&nbsp;NO&nbsp; </td></tr>
 </tbody></table> 
 </div> 
 </div> 
 <div class="col-md-12"> 
 <br> 
 <div class="col-md-5"> 
 <table><tbody><tr><td>29. IL FARMACO E’ STATO RIPRESO?&nbsp;&nbsp;&nbsp; </td><td> <input type="radio" name="<portlet:namespace/>FARMACO_22_a_29" value="SI">&nbsp;SI&nbsp;<input type="radio" name="<portlet:namespace/>FARMACO_22_a_29" value="NO">&nbsp;NO&nbsp; </td></tr>
 </tbody></table> 
 </div> 
 <div class="col-md-7"> 
 <table><tbody><tr><td>30. SONO RICOMPARSI I SINTOMI DOPO LA RISOMMINISTRAZIONE? &nbsp;&nbsp;&nbsp; </td><td> <input type="radio" name="<portlet:namespace/>FARMACO_22_a_30" value="SI"> &nbsp;SI&nbsp;<input type="radio" name="<portlet:namespace/>FARMACO_22_a_30" value="NO">&nbsp;NO&nbsp; </td></tr>
 </tbody></table> 
 </div> 
 </div> 
 <!-- B --> 
 <div class="col-md-12"> 
 <br> 
 <div class="col-md-2"> 
 <table><tbody><tr><td>B)&nbsp;&nbsp;&nbsp; </td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_22_b"></td></tr>
 </tbody></table> 
 </div> 
 
<div class="col-md-4"> 
 <table><tbody><tr><td>23. LOTTO&nbsp;&nbsp;&nbsp; </td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_22_b_23"></td></tr>
 </tbody></table> 
 </div> 
 <div class="col-md-6">
 <table><tbody><tr><td>24. DOSAGGIO/FREQUENZA (specificare) &nbsp;&nbsp;&nbsp; </td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_22_b_24"></td></tr>
 </tbody></table> 
 </div> 
 </div> 
 <div class="col-md-12"> 
 <br> 
 <div class="col-md-4"> <table width="100%"><tbody><tr><td width="220px">25. VIA DI SOMMINISTRAZIONE </td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_22_b_25"></td></tr></tbody></table>
  </div> 
  <div class="col-md-6"> <table width="100%"><tbody><tr><td width="170px">26. DURATA DELL'USO </td><td> 
 <table><tbody><tr> <td>DAL&nbsp;&nbsp;&nbsp;</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_22_b_26_1"></td> <td> AL&nbsp;&nbsp;&nbsp;</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FARMACO_22_b_26_2"></td> </tr>
 </tbody></table>
  </td></tr>
 </tbody></table> 
 </div> 
 </div> 
 <div class="col-md-12"> 
 <br> 
 <div class="col-md-5"> 
 <table><tbody><tr><td>27. IL FARMACO E’ STATO SOSPESO? &nbsp;&nbsp;&nbsp; </td><td> <input type="radio" name="<portlet:namespace/>FARMACO_22_b_27" value="SI">&nbsp;SI&nbsp;<input type="radio" name="<portlet:namespace/>FARMACO_22_b_27" value="NO">&nbsp;NO&nbsp;
 <table><tbody><tr> <td></td><td> </td><td></td><td> </td></tr></tbody></table> </td></tr>
 </tbody></table> 
 </div> 
 <div class="col-md-7"> 
 <table><tbody><tr><td> 28. LA REAZIONE E' MIGLIORATA DOPO LA SOSPENSIONE? &nbsp;&nbsp;&nbsp; </td><td> <input type="radio" name="<portlet:namespace/>FARMACO_22_b_28" value="SI">&nbsp;SI&nbsp;<input type="radio" name="<portlet:namespace/>FARMACO_22_b_28" value="NO">&nbsp;NO&nbsp; </td></tr>
 </tbody></table> 
 </div> 
 </div>
  <div class="col-md-12"> 
  <br> 
  <div class="col-md-5"> 
 <table><tbody><tr><td>IL FARMACO E’ STATO RIPRESO?&nbsp;&nbsp;&nbsp; </td><td> <input type="radio" name="<portlet:namespace/>FARMACO_22_b_29" value="SI">&nbsp;SI&nbsp;<input type="radio" name="<portlet:namespace/>FARMACO_22_b_29" value="NO">&nbsp;NO&nbsp;</td></tr>
 </tbody></table> 
 </div> 
 <div class="col-md-7"> 
 <table><tbody><tr><td>30. SONO RICOMPARSI I SINTOMI DOPO LA RISOMMINISTRAZIONE? &nbsp;&nbsp;&nbsp; </td><td> <input type="radio" name="<portlet:namespace/>FARMACO_22_b_30" value="SI"> &nbsp;SI&nbsp;<input type="radio" name="<portlet:namespace/>FARMACO_22_b_30" value="NO">&nbsp;NO&nbsp; </td></tr>
 </tbody></table> 
 </div> 
 </div> 
 <table><tbody><tr> <td>* Nel caso di vaccini specificare anche il numero di dosi e/o di richiamo, l’ora e il sito della somministrazione</td> </tr></tbody></table> 
 </div> 
 </div> 
 
 <!-- 10th --> 
 <div class="row border_cols"> 
 <div class="col-md-12"> 
 <br> 
 <table> <tbody><tr><td colspan="5">31. INDICAZIONI O ALTRO MOTIVO PER CUI IL FARMACO È STATO USATO (le lettere fanno riferimento ai farmaci indicati qui sopra):</td></tr> <tr><td> A:</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>INDICAZIONI_31_a"></td><td> B:</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>INDICAZIONI_31_b"></td></tr>
</tbody></table>
 </div> 
 </div> 
 <!-- 11th --> 
 <div class="row border_cols"> 
 <div class="col-md-12"> 
 <br> 
 <table width="100%"> 
 <tbody><tr><td>32. USO CONCOMITANTE DI ALTRI PRODOTTI A BASE DI PIANTE OFFICINALI, INTEGRATORI ALIMENTARI, ecc. (specificare)</td></tr> 
 <tr> <td> <textarea style="background-color: #eee" class="form-control" rows="5" name="<portlet:namespace/>USO_32"></textarea> </td> </tr> 
 </tbody></table> 
 </div> 
 </div> 
 
 <!-- 12th --> 
 <div class="row border_cols"> 
 <div class="col-md-12"> 
 <br> 
 <table width="100%"> <tbody>
 <tr><td> 33. CONDIZIONI PREDISPONENTI e/o CONCOMITANTI (se il farmaco sospetto è un vaccino riportare l'anamnesi ed eventuali vaccini somministrati nelle 4 settimane precedenti alla somministrazione) </td></tr> 
 <tr> <td> <textarea style="background-color: #eee" class="form-control" rows="5" name="<portlet:namespace/>CONDIZIONI_33"></textarea> </td> </tr> 
 </tbody></table>
  </div> 
  </div> 
 <!-- 13th --> 
 
 <div class="row border_cols"> 
 <div class="col-md-12"> 
 <br> 
 <table width="100%"> 
 <tbody><tr><td> 34. ALTRE INFORMAZIONI </td></tr> 
 <tr> <td> <textarea style="background-color: #eee" class="form-control" rows="5" name="<portlet:namespace/>ALTRE_34"></textarea> </td> </tr> 
 </tbody></table> 
 </div> 
 </div> 
 <!-- 14th --> 
 <div class="row"> 
 <div class="col-md-12"> 
 <img src="<%=request.getContextPath() %>/images/endimg.PNG" width="100%"> 
 </div> 
 </div>
 
 <!-- 15th --> 
 
 <div class="row border_cols"> 
 <div class="col-md-12"> 
 <table width="100%"> 
 <tbody><tr> <td>35. INDICARE SE LA REAZIONE E' STATA OSSERVATA NELL'AMBITO DI</td> <td><input type="checkbox" name="<portlet:namespace/>INDICARE_35_1" value="Progetto di Farmacovigilanza Attiva">Progetto di Farmacovigilanza Attiva</td> <td><input type="checkbox" name="<portlet:namespace/>INDICARE_35_2" value="Registro Farmaci">Registro Farmaci</td> </tr> 
 <tr> <td> <table><tbody><tr><td><input type="checkbox" name="<portlet:namespace/>INDICARE_35_3" value="Studio Osservazionale"> Studio Osservazionale, specificare: titolo studio&nbsp;&nbsp;&nbsp;</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>INDICARE_35_4"></td></tr>
 </tbody></table>
 </td><td>
 <table><tbody><tr><td> tipologia&nbsp;&nbsp;&nbsp;</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>INDICARE_35_5"></td></tr>
 </tbody></table>
 </td> <td>
 <table><tbody><tr><td> numero&nbsp;&nbsp;&nbsp;</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>INDICARE_35_6"></td></tr>
 </tbody></table>
 </td> 
 </tr> 
 </tbody>
 </table> 
 </div> 
 </div> 
 
 <!-- 16th --> 
 <div class="row border_cols"> 
 <br> 
 <div class="col-md-7"> 
 <table width="100%"> <tbody><tr><td>36. QUALIFICA DEL SEGNALATORE </td><td><input type="checkbox" name="<portlet:namespace/>QUALIFICA_36_1" value="MEDICO OSPEDALIERO"> MEDICO OSPEDALIERO</td></tr> 
 <tr><td><input type="checkbox" name="<portlet:namespace/>QUALIFICA_36_2" value="MEDICO MEDICINA GENERALE"> MEDICO MEDICINA GENERALE</td><td><input type="checkbox" name="<portlet:namespace/>QUALIFICA_36_3" value="PEDIATRA LIBERA SCELTA"> PEDIATRA LIBERA SCELTA</td></tr> 
 <tr><td><input type="checkbox" name="<portlet:namespace/>QUALIFICA_36_4" value="SPECIALISTA"> SPECIALISTA</td><td><input type="checkbox" name="<portlet:namespace/>QUALIFICA_36_5" value="MEDICO DISTRETTO"> MEDICO DISTRETTO</td></tr> 
 <tr><td><input type="checkbox" name="<portlet:namespace/>QUALIFICA_36_6" value="RARMACISTA"> RARMACISTA</td><td><input type="checkbox" name="<portlet:namespace/>QUALIFICA_36_7" value="INFERMIERE"> INFERMIERE</td></tr> 
 <tr><td><input type="checkbox" name="<portlet:namespace/>QUALIFICA_36_8" value="CAV"> CAV</td><td><table><tbody><tr><td><input type="checkbox" name="<portlet:namespace/>QUALIFICA_36_9" value="ALTRO"> ALTRO(specificare)&nbsp;&nbsp;&nbsp;</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>QUALIFICA_36_10"></td></tr>
 </tbody></table>
 </td></tr> 
 </tbody></table> 
 </div> 
 <div class="col-md-5"> 
 <table width="100%"> 
 <tbody><tr> <td colspan="4">37. DATI DEL SEGNALATORE (i dati del segnalatore sono trattati in modo confidenziale)</td> </tr> 
 <tr> <td>NOME E COGNOME</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>DATI_37_1"></td> </tr>
  <tr> <td>INDIRIZZO</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>DATI_37_2"></td> </tr> 
  <tr> <td>TEL E FAX</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>DATI_37_3"></td> </tr> 
  <tr> <td>E-MAIL</td><td><input class="form-control" type="email" style="background-color: #eee" name="<portlet:namespace/>DATI_37_4"></td> </tr> 
  </tbody></table> 
  </div> 
  </div> 
  
 <!-- 17th --> 
 <div class="row border_cols"> 
 <br> 
 <div class="col-md-6"> 
 <table><tbody><tr><td>38. ASL DI APPARTENENZA&nbsp;&nbsp;&nbsp;</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>ASL_38"></td></tr>
 </tbody></table> 
 </div> 
 <div class="col-md-6"> 
 <table><tbody><tr><td>39. REGIONE&nbsp;&nbsp;&nbsp;</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>REGIONE_39"></td></tr>
 </tbody></table> 
 </div> 
 </div> 
 <!-- 18th --> 
 <div class="row border_cols">
  <br> 
  <div class="col-md-6"> 
 <table><tbody><tr><td>40. DATA DI COMPILAZIONE&nbsp;&nbsp;&nbsp;</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>DATA_40" id="DATA_40" placeholder="dd/mm/yyyy"></td></tr>
 </tbody></table> 
 </div> 
 <div class="col-md-6">
 <table><tbody><tr><td>41. FIRMA DEL SEGNALATORE&nbsp;&nbsp;&nbsp;</td><td><input class="form-control" style="background-color: #eee" name="<portlet:namespace/>FIRMA_41"></td></tr>
 </tbody></table> 
 </div> 
 </div> 
 <!-- 19th --> 
 <div class="row"> 
 <br> 
 <div class="col-md-12" style="background-color:#4f81bd;padding:10px 10px 10px 10px; "> 
 <table cellpadding="10px" cellspacing="0" height="100%" style="background-color:#4f81bd;float:right;"><tbody>
 <tr> <td>
<!-- <input type="reset" value="Reset" style="width:200px;background-color:#e60000 ;color:white; height:40px">
<input type="submit" value="Submit" style="width:200px;background-color:#006622;color:white; height:40px">-->
 <aui:button  style="width:200px;background-color:#e60000;color:white; height:40px" value="Reset" onclick="this.form.reset()" />
 <aui:button value="Save" key="save"  style="width:200px;background-color:#006622;color:white; height:40px" onClick="javascript:showAddNoteDialog();"/>
 </td>
</tr>
</tbody>
</table>
</div>
</div>
</div> 
</aui:form>
<div class="yui3-skin-sam">
  <div id="modal"></div>
</div> 

<script>

$("#fm").submit(function(e) {
    e.preventDefault();
});

function showAddNoteDialog(){

  
   YUI().use('aui-modal', function(Y) {
       var modal = new Y.Modal(
         {
           bodyContent: '<label for="feedback/suggestions" ><liferay-ui:message key="Are you want to submit form"/></label>',
           centered: true,
           headerContent: '<h3><label for="formsofinteraction"><liferay-ui:message key="Confirmation Box"/></label></h3>',
           modal: true,
           render: '#modal',
           width: 500
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
                      var inputs = document.getElementsByTagName('input');
                      var flag=true;
                      for(var i = 0; i < inputs.length; i++) {
                          if(inputs[i].type.toLowerCase() == 'text') {
                        	  if(inputs[i].value==''){
                              if(inputs[i].name=="<portlet:namespace/>INIZIALI_1")
                        	  {
                            	  inputs[i].style.backgroundColor = "red";
                            	  inputs[i].focus();
                            	  flag=false;
                            	//  alert(inputs[i].value);
                              }
                              if(inputs[i].name=="<portlet:namespace/>CODICE")
                        	  {
                            	  inputs[i].style.backgroundColor = "red";
                            	  inputs[i].focus();
                            	  flag=false;
                            	//  alert(inputs[i].value);
                              }
                        	}
                          }
                      }
						
                      if(flag==true){
                    	document.getElementById("<portlet:namespace/>fm").submit();
						}
                     }
                   }
                 },
                ]
       );
     }
   );
    }
    
function <portlet:namespace />savePolicySettings() {
	submitForm(document.<portlet:namespace />fm);
}
</script>


