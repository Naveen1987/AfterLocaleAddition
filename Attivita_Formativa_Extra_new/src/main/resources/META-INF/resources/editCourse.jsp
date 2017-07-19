<%@page import="com.liferay.portal.kernel.util.LocaleUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@page import="com.liferay.portal.kernel.log.LogFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.log.Log"%>
<%@page import="java.util.regex.Pattern"%>
<%@page import="com.daffo.suilupposervice.service.suiluppo_courseLocalServiceUtil"%>
<%@page import="com.daffo.suilupposervice.model.suiluppo_course"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="/init.jsp" %>
<%
final Log logger=LogFactoryUtil.getLog(this.getClass());
suiluppo_course ls=null;
try{
ls=suiluppo_courseLocalServiceUtil.getsuiluppo_course(new Long(request.getParameter("courseId")).longValue());
}catch(Exception e){
logger.info("Object getting for attribute");
ls=suiluppo_courseLocalServiceUtil.getsuiluppo_course(new Long(request.getAttribute("courseId").toString()).longValue());
}
String duration[]=ls.getTot_Ore().split(",");
String sh=duration[0].substring(0,duration[0].length()-1);
String sm=duration[1].substring(0,duration[1].length()-1);
String ss=duration[2].substring(0,duration[2].length()-1);
%> 
<%--Toggle button /date picker /Time picker/ Spinner(Not have css only js) --%>
<link href="<%= request.getContextPath()%>/testing/duration-picker.css" rel="stylesheet">
<script src="<%= request.getContextPath()%>/testing/duration-picker.js"></script>


<link href="<%= request.getContextPath()%>/css/bootstrap-toggle.min.css" rel="stylesheet">
<script src="<%= request.getContextPath()%>/css/bootstrap-toggle.min.js"></script>
<link href="<%= request.getContextPath()%>/css/datepicker_1.css" rel="stylesheet">
<script src="<%= request.getContextPath()%>/css/datepicker_1.js"></script>
<link href="<%= request.getContextPath()%>/css/clockpicker.css" rel="stylesheet">
<script src="<%= request.getContextPath()%>/css/clockpicker.js"></script>
<script src="<%= request.getContextPath()%>/css/bootstrap-spinner.js"></script>
<liferay-ui:success key="success" message="successkey" />

<portlet:actionURL name="updateSubmit" var="formSubmit">
<portlet:param name="mvcPath" value="/editCourse.jsp"/>
</portlet:actionURL>
<aui:form action="${formSubmit}" enctype="multipart/form-data" method="post" id="fm" name="fm">
<input type="hidden" name="<portlet:namespace/>courseId" value="<%=ls.getCourse_id()%>">
<div class="container-fluid-1280">
<div class="row">
<div class="col-md-12">
<center>
<table width="70%">
<tbody>
<tr>
<td>Docente<span style="font-size:20px;color:red"><b>*</b></span></td><td><input type="text" id="Docente" name="<portlet:namespace/>Docente" placeholder="Enter Docente" value="<%=ls.getDocente()%>" class="form-control"  readonly="readonly" style="color:black"/>
<span id="_Docente" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Docente</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Evento Progetto<span style="font-size:20px;color:red"><b>*</b></span></td><td><input  type="text" name="<portlet:namespace/>Evento_Progetto" class="form-control" placeholder="Enter Evento Progetto" value="<%=ls.getEvento_Progetto()%>" id="Evento_Progetto"/>
<span id="_Evento_Progetto" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Evento Progetto</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Titolo<span style="font-size:20px;color:red"><b>*</b></span></td><td><input  type="text" name="<portlet:namespace/>Titolo"  class="form-control" placeholder="Enter Titolo" value="<%=ls.getTitolo()%>" id="Titolo">
<span id="_Titolo" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Titolo</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Descrizione<span style="font-size:20px;color:red"><b>*</b></span></td><td><input  type="text" name="<portlet:namespace/>Descrizione"  class="form-control" placeholder="Enter Descrizione" value="<%=ls.getDescrizione()%>" id="Descrizione">
<span id="_Descrizione" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Descrizione</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Figure Professionali Coinvolte<span style="font-size:20px;color:red"><b>*</b></span></td><td><input  type="text" name="<portlet:namespace/>Figure_Professionali_Coinvolte"  class="form-control" placeholder="Enter Figure Professionali Coinvolte" value="<%=ls.getFigure_Professionali_Coinvolte()%>" id="Figure_Professionali_Coinvolte">
<span id="_Figure_Professionali_Coinvolte" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Figure Professionali Coinvolte</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>

<tr>
<td>Nr Edizione<span style="font-size:20px;color:red"><b>*</b></span></td><td><input  type="text" name="<portlet:namespace/>Nr_Edizione"  class="form-control" placeholder="Enter Nr Edizione" value="<%=ls.getNr_Edizione()%>" id="Nr_Edizione">
<span id="_Nr_Edizione" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Nr Edizione</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Sede<span style="font-size:20px;color:red"><b>*</b></span></td><td><input  type="text" name="<portlet:namespace/>Sede"  class="form-control" placeholder="Enter Sede" value="<%=ls.getSede()%>" id="Sede">
<span id="_Sede" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Sede</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Abstract<span style="font-size:20px;color:red"><b>*</b></span></td><td><input  type="text" name="<portlet:namespace/>Abstract"  class="form-control" placeholder="Enter Abstract" value="<%=ls.getAbstract()%>" id="Abstract">
<span id="_Abstract" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Abstract</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Data Inizio<span style="font-size:20px;color:red"><b>*</b></span></td>
<td>
<table>
<tbody>
<tr>
<td>
<div class="hero-unit">
<input class="form-control Date-creator"  type="text" placeholder="Click for Calendar"  name="<portlet:namespace/>Data_Inizio-date" id="Data_Inizio-date" value="<%=ls.getData_Inizio().split(Pattern.quote(" "))[0]%>" readonly="readonly">
<span id="_Data_Inizio-date" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Data Inizio Date</span>
 </div>
 </td>
 <td>/</td>
 <td>
 <div class="input-group clockpicker">
 <input type="text"  name="<portlet:namespace/>Data_Inizio-time" id="Data_Inizio-time" class="form-control" placeholder="Click for Clock" value="<%=ls.getData_Inizio().split(Pattern.quote(" "))[1]%>" readonly="readonly">
 <span id="_Data_Inizio-time" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Data Inizio Time</span>
</div>
 </td>
</tr>
</tbody>
</table>

</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Data Fine<span style="font-size:20px;color:red"><b>*</b></span></td>
<td>
<table>
<tbody>
<tr>
<td>
<div class="hero-unit">
<input class="form-control Date-creator"  type="text" placeholder="Click for Calendar"  id="Data_Fine-date" name="<portlet:namespace/>Data_Fine-date" value="<%=ls.getData_Fine().split(Pattern.quote(" "))[0]%>"  readonly="readonly">
<span id="_Data_Fine-date" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Data Fine Date</span>
</div>
 </td>
 <td>/</td>
 <td>
 <div class="input-group clockpicker">
 <input type="text" id="Data_Fine-time" name="<portlet:namespace/>Data_Fine-time" class="form-control" placeholder="Click for Clock" value="<%=ls.getData_Fine().split(Pattern.quote(" "))[1]%>" readonly="readonly">
 <span id="_Data_Fine-time" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Data Fine Time</span>
</div>
 </td>
</tr>
</tbody>
</table>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Scadenza Iscrizioni<span style="font-size:20px;color:red"><b>*</b></span></td><td>
<table>
<tbody>
<tr>
<td>
<div class="hero-unit">
<input class="form-control Date-creator"  type="text" placeholder="Click for Calendar"  id="Scadenza_Iscrizioni-date" name="<portlet:namespace/>Scadenza_Iscrizioni-date" value="<%=ls.getScadenza_Iscrizioni().split(Pattern.quote(" "))[0]%>" readonly="readonly">
<span id="_Scadenza_Iscrizioni-date" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Scadenza Iscrizioni Date</span>
</div>
 </td>
 <td>/</td>
 <td>
 <div class="input-group clockpicker">
 <input type="text" id="Scadenza_Iscrizioni-time" class="form-control" placeholder="Click for Clock" name="<portlet:namespace/>Scadenza_Iscrizioni-time" value="<%=ls.getScadenza_Iscrizioni().split(Pattern.quote(" "))[1]%>" readonly="readonly">
<span id="_Scadenza_Iscrizioni-time" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Scadenza Iscrizioni Time</span>
</div>
 </td>
</tr>
</tbody>
</table>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Tot Ore<span style="font-size:20px;color:red"><b>*</b></span></td><td>
<input  type="text" name="<portlet:namespace/>Tot_Ore"  class="form-control" placeholder="Enter Tot_Ore" value="<%=ls.getTot_Ore()%>" id="Tot_Ore"><br/>
<span id="_Tot_Ore" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Tot_Ore</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Ammessi al corso<span style="font-size:20px;color:red"><b>*</b></span></td><td>
<table><tr><td>
<div class="input-group">
    <span class="input-group-btn">
        <button type="button" class="btn btn-default" data-value="decrease" data-target="#Ammessi_al_corso" data-toggle="spinner">
            <span class="glyphicon glyphicon-minus"></span>
        </button>
    </span>
    <input type="text" data-ride="spinner" id="Ammessi_al_corso" class="form-control input-number" value="<%=ls.getAmmessi_al_corso()%>" name="<portlet:namespace/>Ammessi_al_corso">
    <span class="input-group-btn">
        <button type="button" class="btn btn-default" data-value="increase" data-target="#Ammessi_al_corso" data-toggle="spinner">
            <span class="glyphicon glyphicon-plus"></span>
        </button>
    </span>
</div>
<span id="_Ammessi_al_corso" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Ammessi al corso</span>
</td>
</tr></table>
</td>
</tr>
<tr>
<td><br/></td>
</tr>

<tr>
<td>Visibile<span style="font-size:20px;color:red"><b>*</b></span></td><td>
<input type="hidden" name="<portlet:namespace/>Visibile_data" id="Visibile_data">
<input type="checkbox" id="Visibile" name="<portlet:namespace/>Visibile" data-toggle="toggle" data-on="SI" data-off="NO" data-size="large" data-onstyle="success" data-offstyle="info" <%=ls.getVisibile().equalsIgnoreCase("true")?"checked":""%>>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Bloccato<span style="font-size:20px;color:red"><b>*</b></span></td><td>
<input type="hidden" name="<portlet:namespace/>Bloccato_data" id="Bloccato_data">
<input type="checkbox" id="Bloccato"  name="<portlet:namespace/>Bloccato" data-toggle="toggle" data-on="SI" data-off="NO" data-size="large" data-onstyle="success" data-offstyle="info" <%=ls.getBloccato().equalsIgnoreCase("true")?"checked":""%>>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Dispensa corso<span style="font-size:20px;color:red"><b>*</b></span></td><td> 
<%
String sfile[]=ls.getDispensa_corso().split("/");
%>
<table>
<tr>
<td><input class="form-control" id="txt-file" value="<%=sfile[sfile.length-1]%>"></td><td><span id="btn-change" class="btn btn-primary">Modificare</span></td>
<td colspan="2"><input type="file" style="display:none" name="<portlet:namespace/>Dispensa_corso"  class="form-control" placeholder="Dispensa corso" value="" id="Dispensa_corso"></td>
</tr>
</table>
<span  id="_Dispensa_corso" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Dispensa corso</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td></td><td style="text-align:right"><span id="submit" class="btn btn-success" onClick="showAddNoteDialog()" style="width:100px">   <liferay-ui:message key="Update"/>   </span>     
</td>
</tr>
</tbody>
</table>
 
</center>
</div>
</div>
</div>

</aui:form>
<script type="text/javascript">
$("#btn-change").click(function(){
	$("#Dispensa_corso").show();
	$("#txt-file").hide();
	$(this).hide();
});

//How to get value of CHeckox
/* $("#oncl").click(function(){
	//
	var data= $("#Bloccato").prop('checked');
	alert(data+""+$('#example1').val()+" "+$('#input-time').val()+" "+$("#spinner").val());
}); */

//Any data want to update on page load
$(document).ready(function () {
$('.Date-creator').datepicker({
 format: "dd/mm/yyyy"
});  

$('.clockpicker').clockpicker({donetext: 'Fatto'});
});
//Duration
$("#Tot_Ore").durationPicker({
	  hours: {
	    label: "h",
	    min: 0,
	    max: 1000
	  },
	  minutes: {
	    label: "m",
	    min: 0,
	    max: 59
	  },
	  seconds: {
	    label: "s",
	    min: 0,
	    max: 59
	  },
	  responsive: true
	});
//Now Validation
//Default value setting for duration 
$("#duration-hours").val('<%=sh%>');
$("#duration-minutes").val('<%=sm%>');
$("#duration-seconds").val('<%=ss%>');

 $("#duration-minutes").keydown(function(event){
	var v = parseFloat(this.value + String.fromCharCode(event.which));
	if (v>0&&v<60)
	{ return true;}
	else{
		alert('Minute Not valid');
          return false;
        }
});
 $("#duration-seconds").keydown(function(event){
		var v = parseFloat(this.value + String.fromCharCode(event.which));
		if (v>0&&v<60)
		{ return true;}
		else{
			alert('Seconds Not valid');
	          return false;
	        }
	});


</script>

<div class="yui3-skin-sam">
  <div id="modal"></div>
</div> 

<script type="text/javascript">
//Now Validation
function showAddNoteDialog(){
   YUI().use('aui-modal', function(Y) {
       var modal = new Y.Modal(
         {
           bodyContent: '<label for="feedback/suggestions" ><liferay-ui:message key="Areyouwanttosubmitform"/></label>',
           centered: true,
           headerContent: '<h3><label for="formsofinteraction"><liferay-ui:message key="ConfirmationBox"/></label></h3>',
           modal: true,
           resizable:false,
           render: '#modal',
           zIndex: 1100,
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
                    	 //Start Of On Method
                      modal.hide();
                      var inputs = document.getElementsByTagName('input');
                      var flag=true;
                      for(var i = 0; i < inputs.length; i++) {
                    	  if(inputs[i].type.toLowerCase() == 'text') {
                        	  if(inputs[i].value){
                        		  
                        		  if(inputs[i].name=="<portlet:namespace/>Docente")
                            	  {
                        			  $("#_Docente").hide();
                                	
                                  }
                                  
                       
                                  if(inputs[i].name=="<portlet:namespace/>Evento_Progetto")
                            	  {
                                	  $("#_Evento_Progetto").hide();
                                
                                  } 
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Titolo")
                            	  {
                                	  $("#_Titolo").hide();
                                	
                                  }
                                  
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Descrizione")
                            	  {
                                	  $("#_Descrizione").hide();
                                	
                                  }
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Figure_Professionali_Coinvolte")
                            	  {
                                	  $("#_Figure_Professionali_Coinvolte").hide();
                                	
                                  }
                                  
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Nr_Edizione")
                            	  {
                                	  $("#_Nr_Edizione").hide();
                            	  }
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Sede")
                            	  {
                                	  $("#_Sede").hide();
                                	
                                  }
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Abstract")
                            	  {
                                	  $("#_Abstract").hide();
                                	
                                  }
                                  
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Data_Inizio-date")
                            	  {
                                	  $("#_Data_Inizio-date").hide();
                                
                                  }
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Data_Inizio-time")
                            	  {
                                	  $("#_Data_Inizio-time").hide();
                                
                                  }
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Data_Fine-date")
                            	  {
                                	  $("#_Data_Fine-date").hide();
                                
                                  }
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Data_Fine-time")
                            	  {
                                	  $("#_Data_Fine-time").hide();
                                	
                                  }
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Tot_Ore")
                            	  {
                                	  $("#_Tot_Ore").hide();
                                	
                                  }
                                  
                                
                                  if(inputs[i].name=="<portlet:namespace/>Scadenza_Iscrizioni-date")
                            	  {
                                	  $("#_Scadenza_Iscrizioni-date").hide();
                                	
                                  }
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Scadenza_Iscrizioni-time")
                            	  {
                                	  $("#_Scadenza_Iscrizioni-time").hide();
                                
                                  }
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Ammessi_al_corso")
                            	  {
                                	  $("#_Ammessi_al_corso").hide();
                                	
                                  }
                                 
                        	  }
                        	  
                        	  if(inputs[i].value==''){
                              if(inputs[i].name=="<portlet:namespace/>Docente")
                        	  {
                            	  $("#_Docente").show();
                            	  flag=false;
                            	  
                              }
                                                         
                              if(inputs[i].name=="<portlet:namespace/>Evento_Progetto")
                        	  {
                            	  $("#_Evento_Progetto").show();
                            	  flag=false;
                            	
                              }
                              if(inputs[i].name=="<portlet:namespace/>Titolo")
                        	  {
                            	  $("#_Titolo").show();
                            	  flag=false;
                            	
                              }
                              
                              
                              if(inputs[i].name=="<portlet:namespace/>Descrizione")
                        	  {
                            	  $("#_Descrizione").show();
                            	  flag=false;
                            	
                              }
                              
                              
                              if(inputs[i].name=="<portlet:namespace/>Figure_Professionali_Coinvolte")
                        	  {
                            	  $("#_Figure_Professionali_Coinvolte").show();
                            	  flag=false;
                            	
                              }
                              
                              
                              if(inputs[i].name=="<portlet:namespace/>Nr_Edizione")
                        	  {
                            	  $("#_Nr_Edizione").show();
                            	  flag=false;
                            	
                              }
                              
                              if(inputs[i].name=="<portlet:namespace/>Sede")
                        	  {
                            	  $("#_Sede").show();
                            	  flag=false;
                            	
                              }
                              
                              if(inputs[i].name=="<portlet:namespace/>Abstract")
                        	  {
                            	  $("#_Abstract").show();
                            	  flag=false;
                            	
                              }
                              
                              
                              if(inputs[i].name=="<portlet:namespace/>Data_Inizio-date")
                        	  {
                            	  $("#_Data_Inizio-date").show();
                            	 flag=false;
                            	
                              }
                              
                              if(inputs[i].name=="<portlet:namespace/>Data_Inizio-time")
                        	  {
                            	  $("#_Data_Inizio-time").show();
                            	 flag=false;
                            	
                              }
                              
                              if(inputs[i].name=="<portlet:namespace/>Data_Fine-date")
                        	  {
                            	  $("#_Data_Fine-date").show();
                            	  flag=false;
                            	
                              }
                              
                              if(inputs[i].name=="<portlet:namespace/>Data_Fine-time")
                        	  {
                            	  $("#_Data_Fine-time").show();
                            	  flag=false;
                            	
                              }
                              
                              if(inputs[i].name=="<portlet:namespace/>Tot_Ore")
                        	  {
                            	  $("#_Tot_Ore").show();
                            	  flag=false;
                            	
                              }
                              
                             
                              
                              if(inputs[i].name=="<portlet:namespace/>Scadenza_Iscrizioni-date")
                        	  {
                            	  $("#_Scadenza_Iscrizioni-date").show();
                            	  flag=false;
                            	
                              }
                              
                              if(inputs[i].name=="<portlet:namespace/>Scadenza_Iscrizioni-time")
                        	  {
                            	  $("#_Scadenza_Iscrizioni-time").show();
                            	  flag=false;
                            	
                              }
                              
                              if(inputs[i].name=="<portlet:namespace/>Ammessi_al_corso")
                        	  {
                            	  $("#_Ammessi_al_corso").show();
                            	  flag=false;
                            	
                              }
                             
                              
                        	}
                        	  //Inner If
                          }
                          //outer IF
                      }
						
                     if(flag==true){
                    	     $("#_Docente").hide();
                    		 $("#_Evento_Progetto").hide();
                    		 $("#_Titolo").hide();
                    		 $("#_Descrizione").hide();
                    		 $("#_Figure_Professionali_Coinvolte").hide();
                    		 $("#_Nr_Edizione").hide();
                    		 $("#_Sede").hide();
                    		 $("#_Abstract").hide();
                    		 $("#_Data_Inizio-date").hide();
                    		 $("#_Data_Inizio-time").hide();
                    		 $("#_Data_Fine-date").hide();
                    		 $("#_Data_Fine-time").hide();
                    		 $("#_Tot_Ore").hide();
                    		
                    		 $("#_Scadenza_Iscrizioni-date").hide();
                    		 $("#_Scadenza_Iscrizioni-time").hide();
                    		 $("#_Ammessi_al_corso").hide();
                    		 $("#_Dispensa_corso").hide();
                    		 var bal=$("#Bloccato").prop('checked');
       					     var vis=$("#Visibile").prop('checked');
       						 if(bal){
       							$("#Bloccato_data").val(bal);
       						 }
       						 else {
       							$("#Bloccato_data").val(bal);
       						 }
       						 if(vis){
       							$("#Visibile_data").val(vis);
       						 }
       						 else{
       							$("#Visibile_data").val(vis);
       						 }
                    	document.getElementById("<portlet:namespace/>fm").submit();
                    	 
						} 
                       //document.getElementById("<portlet:namespace/>fm").submit();
                      //End OF On method
                     }
                   }
                 },
                ]
       );
     }
   );
    }

</script>


