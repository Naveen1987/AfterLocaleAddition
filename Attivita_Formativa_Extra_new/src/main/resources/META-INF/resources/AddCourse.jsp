<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/init.jsp" %>
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
<portlet:actionURL name="formSubmit" var="formSubmit">
<portlet:param name="mvcPath" value="/AddCourse.jsp"/> 
</portlet:actionURL>
<aui:form action="${formSubmit}" enctype="multipart/form-data" method="post" id="fm" name="fm">
<div class="container-fluid-1280">
<%--<div class="row">
<div class="col-md-12 text-center">
<h1>New Course</h1>
<hr/>
</div>
</div> --%>
<div class="row">
<div class="col-md-12">
<center>
<table width="70%">
<tbody>
<tr>
<td>Docente<span style="font-size:20px;color:red"><b>*</b></span></td><td><input type="text" id="Docente" name="<portlet:namespace/>Docente" placeholder="Docente" value="<%=user.getFullName()%>" class="form-control"  readonly="readonly" style="color:black"/>
<span id="_Docente" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Docente</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Evento Progetto<span style="font-size:20px;color:red"><b>*</b></span></td><td><input  type="text" name="<portlet:namespace/>Evento_Progetto" class="form-control" placeholder="Evento Progetto" value="" id="Evento_Progetto"/>
<span id="_Evento_Progetto" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Evento Progetto</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Titolo<span style="font-size:20px;color:red"><b>*</b></span></td><td><input  type="text" name="<portlet:namespace/>Titolo"  class="form-control" placeholder="Titolo" value="" id="Titolo">
<span id="_Titolo" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Titolo</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Descrizione<span style="font-size:20px;color:red"><b>*</b></span></td><td><input  type="text" name="<portlet:namespace/>Descrizione"  class="form-control" placeholder="Descrizione" value="" id="Descrizione">
<span id="_Descrizione" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Descrizione</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Figure Professionali Coinvolte<span style="font-size:20px;color:red"><b>*</b></span></td><td><input  type="text" name="<portlet:namespace/>Figure_Professionali_Coinvolte"  class="form-control" placeholder="Figure Professionali Coinvolte" value="" id="Figure_Professionali_Coinvolte">
<span id="_Figure_Professionali_Coinvolte" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Figure Professionali Coinvolte</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>

<tr>
<td>Nr Edizione<span style="font-size:20px;color:red"><b>*</b></span></td><td><input  type="text" name="<portlet:namespace/>Nr_Edizione"  class="form-control" placeholder="Nr Edizione" value="" id="Nr_Edizione">
<span id="_Nr_Edizione" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Nr Edizione</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Sede<span style="font-size:20px;color:red"><b>*</b></span></td><td><input  type="text" name="<portlet:namespace/>Sede"  class="form-control" placeholder="Sede" value="" id="Sede">
<span id="_Sede" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Sede</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Abstract<span style="font-size:20px;color:red"><b>*</b></span></td><td><input  type="text" name="<portlet:namespace/>Abstract"  class="form-control" placeholder="Abstract" value="" id="Abstract">
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
<input class="form-control Date-creator"  type="text" placeholder="<liferay-ui:message key="ClickforCalendar"/>"  name="<portlet:namespace/>Data_Inizio-date" id="Data_Inizio-date" readonly="readonly">
<span id="_Data_Inizio-date" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Data Inizio Date</span>
 </div>
 </td>
 <td>/</td>
 <td>
 <div class="input-group clockpicker">
 <input type="text"  name="<portlet:namespace/>Data_Inizio-time" id="Data_Inizio-time" class="form-control" placeholder="<liferay-ui:message key="ClickforClock"/>" readonly="readonly">
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
<input class="form-control Date-creator"  type="text" placeholder="<liferay-ui:message key="ClickforCalendar"/>"  id="Data_Fine-date" name="<portlet:namespace/>Data_Fine-date"  readonly="readonly">
<span id="_Data_Fine-date" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Data Fine Date</span>
</div>
 </td>
 <td>/</td>
 <td>
 <div class="input-group clockpicker">
 <input type="text" id="Data_Fine-time" name="<portlet:namespace/>Data_Fine-time" class="form-control" placeholder="<liferay-ui:message key="ClickforClock"/>" readonly="readonly">
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
<input class="form-control Date-creator"  type="text" placeholder="<liferay-ui:message key="ClickforCalendar"/>"  id="Scadenza_Iscrizioni-date" name="<portlet:namespace/>Scadenza_Iscrizioni-date" readonly="readonly">
<span id="_Scadenza_Iscrizioni-date" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Scadenza Iscrizioni Date</span>
</div>
 </td>
 <td>/</td>
 <td>
 <div class="input-group clockpicker">
 <input type="text" id="Scadenza_Iscrizioni-time" class="form-control" placeholder="<liferay-ui:message key="ClickforClock"/>" name="<portlet:namespace/>Scadenza_Iscrizioni-time" readonly="readonly">
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
<td>Tot Ore<span style="font-size:20px;color:red"><b>*</b></span></td><td>
<input  type="text" name="<portlet:namespace/>Tot_Ore"  class="form-control" placeholder="Tot_Ore" value="" id="Tot_Ore"><br/>
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
    <input type="text" data-ride="spinner" id="Ammessi_al_corso" class="form-control input-number" value="" name="<portlet:namespace/>Ammessi_al_corso">
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
<input type="checkbox" id="Visibile" name="<portlet:namespace/>Visibile" data-toggle="toggle" data-on="SI" data-off="NO" data-size="large" data-onstyle="success" data-offstyle="info" checked>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Bloccato<span style="font-size:20px;color:red"><b>*</b></span></td><td>
<input type="hidden" name="<portlet:namespace/>Bloccato_data" id="Bloccato_data">
<input type="checkbox" id="Bloccato" name="<portlet:namespace/>Bloccato" data-toggle="toggle" data-on="SI" data-off="NO" data-size="large" data-onstyle="success" data-offstyle="info">
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td>Dispensa corso<span style="font-size:20px;color:red"><b>*</b></span></td><td> <input type="file" name="<portlet:namespace/>Dispensa_corso"  class="form-control" placeholder="Dispensa corso" value="" id="Dispensa_corso">
<span  id="_Dispensa_corso" style="color:red; display:none"><liferay-ui:message key="addCourseError"/> Dispensa corso</span>
</td>
</tr>
<tr>
<td><br/></td>
</tr>
<tr>
<td></td><td style="text-align:right"><span id="submit" class="btn btn-success" onClick="showAddNoteDialog()" style="width:100px">   Submit   </span>     
    <span id="reset" class="btn btn-warning" style="width:100px">   Reset   </span>
</td>
</tr>
</tbody>
</table>
 
</center>
</div>
</div>
</div>
</aui:form>

<%--

<link href="<%= request.getContextPath()%>/testing/duration-picker.css" rel="stylesheet">
<script src="<%= request.getContextPath()%>/testing/duration-picker.js"></script>

duration picker demo
<input type="text" id="duration" name="duration">
 

//$("#duration").durationPicker();
$("#btn").click(function(){
	alert($("#duration").val());
});
$("#duration").durationPicker({
	  hours: {
	    label: "h",
	    min: 0,
	    max: 100
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
	  classname: 'form-control',
	  responsive: true
	});
 --%> 
<script type="text/javascript">
//How to get value of CHeckox
/* $("#oncl").click(function(){
	//
	var data= $("#Bloccato").prop('checked');
	alert(data+""+$('#example1').val()+" "+$('#input-time').val()+" "+$("#spinner").val());
});
*/
//Any data want to update on page load
$(document).ready(function () {
$('.Date-creator').datepicker({
 format: "dd/mm/yyyy"
});  

$('.clockpicker').clockpicker({donetext: 'Fatto'});
$("#duration-minutes").val('00');
$("#duration-seconds").val('00');
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
 
 $("#duration-minutes").keydown(function(event){
	   if (this.value.length > 2) {
       this.value = this.value.slice(0,1); 
       return false;
 		}
	 var v = parseInt(this.value + String.fromCharCode(event.which));
     if (v>=0&&v<60)
		{ return true;}
     else if(v<0 || v>=60){
     if(this.value.length==2){
     this.value = this.value.slice(0,2); }
     else{this.value = "0"+this.value.slice(0,2); }
     return false;
     }
     else{
     return false;
     }
	});
  
  $("#duration-minutes").focusout(function(event){
     if(this.value.length==2){
     this.value = this.value.slice(0,2); }
     else{this.value = "0"+this.value.slice(0,1); }  
	});
 
  $("#duration-seconds").keydown(function(event){
	   if (this.value.length > 2) {
       this.value = this.value.slice(0,1); 
       return false;
		}
	var v = parseInt(this.value + String.fromCharCode(event.which));
    if (v>=0&&v<60)
		{ return true;}
    else if(v<0 || v>=60){
    if(this.value.length==2){
    this.value = this.value.slice(0,2); }
    else{this.value = "0"+this.value.slice(0,2); }
    return false;
    }
    else{
    return false;
    }
	});
 
 $("#duration-seconds").focusout(function(event){
    if(this.value.length==2){
    this.value = this.value.slice(0,2); }
    else{this.value = "0"+this.value.slice(0,1); }  
	});
</script>

<div class="yui3-skin-sam">
  <div id="modal"></div>
</div> 

<script type="text/javascript">
  $("#reset").click(function(){
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
	 $("#<portlet:namespace/>fm").closest('form').find("input[type=text] ").val("");
	 $("#<portlet:namespace/>fm").closest('form').find("input[type=file]").val("");
	 $("#Docente").val("<%=user.getFullName()%>");
	 $("#Ammessi_al_corso").val("");
	 $('#Visibile').bootstrapToggle('off')
	 $('#Bloccato').bootstrapToggle('off')
});  

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
                    	  if(inputs[i].type.toLowerCase() == 'file') {
                    		  if(inputs[i].value==''){
                    			  if(inputs[i].name=="<portlet:namespace/>Dispensa_corso")
                            	  {
                    				  flag=false;
                    				  $("#_Dispensa_corso").show();
                    				  //alert(inputs[i].name);
                            	  }
                   
                    		  }
                    		  if(inputs[i].value){
                    			  if(inputs[i].name=="<portlet:namespace/>Dispensa_corso")
                            	  {
                    				  $("#_Dispensa_corso").hide();
                    				  //alert(inputs[i].name);
                            	  }
                   
                    		  }
                    	  }
                    	  
                          if(inputs[i].type.toLowerCase() == 'text') {
                        	  if(inputs[i].value){
                        		  
                        		  if(inputs[i].name=="<portlet:namespace/>Docente")
                            	  {
                        			  $("#_Docente").hide();
                                	  //alert(inputs[i].name);
                                  }
                                  
                       
                                  if(inputs[i].name=="<portlet:namespace/>Evento_Progetto")
                            	  {
                                	  $("#_Evento_Progetto").hide();
                                	//alert(inputs[i].name);
                                  } 
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Titolo")
                            	  {
                                	  $("#_Titolo").hide();
                                	//alert(inputs[i].name);
                                  }
                                  
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Descrizione")
                            	  {
                                	  $("#_Descrizione").hide();
                                	//alert(inputs[i].name);
                                  }
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Figure_Professionali_Coinvolte")
                            	  {
                                	  $("#_Figure_Professionali_Coinvolte").hide();
                                	//alert(inputs[i].name);
                                  }
                                  
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Nr_Edizione")
                            	  {
                                	  $("#_Nr_Edizione").hide();
                                	//alert(inputs[i].name);
                                  }
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Sede")
                            	  {
                                	  $("#_Sede").hide();
                                	//alert(inputs[i].name);
                                  }
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Abstract")
                            	  {
                                	  $("#_Abstract").hide();
                                	//alert(inputs[i].name);
                                  }
                                  
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Data_Inizio-date")
                            	  {
                                	  $("#_Data_Inizio-date").hide();
                                	//alert(inputs[i].name);
                                  }
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Data_Inizio-time")
                            	  {
                                	  $("#_Data_Inizio-time").hide();
                                	//alert(inputs[i].name);
                                  }
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Data_Fine-date")
                            	  {
                                	  $("#_Data_Fine-date").hide();
                                	//alert(inputs[i].name);
                                  }
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Data_Fine-time")
                            	  {
                                	  $("#_Data_Fine-time").hide();
                                	//alert(inputs[i].name);
                                  }
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Tot_Ore")
                            	  {
                                	  if(inputs[i].value==='0h,0m,0s')
                                		  {
                                		  $("#_Tot_Ore").text('Seleziona la durata');
                                		  $("#_Tot_Ore").show();
                                		  }
                                	  else{
                                		  $("#_Tot_Ore").hide();
                                	  }
                                	
                                	//alert(inputs[i].name);
                                  }
                                  /* if(inputs[i].name=="<portlet:namespace/>Tot_Ore-date")
                            	  {
                                	  $("#_Tot_Ore-date").hide();
                                	//alert(inputs[i].name);
                                  }
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Tot_Ore-time")
                            	  {
                                	  $("#_Tot_Ore-time").hide();
                                	//alert(inputs[i].name);
                                  } */
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Scadenza_Iscrizioni-date")
                            	  {
                                	  $("#_Scadenza_Iscrizioni-date").hide();
                                	//alert(inputs[i].name);
                                  }
                                  
                                  if(inputs[i].name=="<portlet:namespace/>Scadenza_Iscrizioni-time")
                            	  {
                                	  $("#_Scadenza_Iscrizioni-time").hide();
                                	//alert(inputs[i].name);
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
                            	  //alert(inputs[i].name);
                              }
                                                         
                              if(inputs[i].name=="<portlet:namespace/>Evento_Progetto")
                        	  {
                            	  $("#_Evento_Progetto").show();
                            	  flag=false;
                            	//alert(inputs[i].name);
                              }
                              if(inputs[i].name=="<portlet:namespace/>Titolo")
                        	  {
                            	  $("#_Titolo").show();
                            	  flag=false;
                            	//alert(inputs[i].name);
                              }
                              
                              
                              if(inputs[i].name=="<portlet:namespace/>Descrizione")
                        	  {
                            	  $("#_Descrizione").show();
                            	  flag=false;
                            	//alert(inputs[i].name);
                              }
                              
                              
                              if(inputs[i].name=="<portlet:namespace/>Figure_Professionali_Coinvolte")
                        	  {
                            	  $("#_Figure_Professionali_Coinvolte").show();
                            	  flag=false;
                            	//alert(inputs[i].name);
                              }
                              
                              
                              if(inputs[i].name=="<portlet:namespace/>Nr_Edizione")
                        	  {
                            	  $("#_Nr_Edizione").show();
                            	  flag=false;
                            	//alert(inputs[i].name);
                              }
                              
                              if(inputs[i].name=="<portlet:namespace/>Sede")
                        	  {
                            	  $("#_Sede").show();
                            	  flag=false;
                            	//alert(inputs[i].name);
                              }
                              
                              if(inputs[i].name=="<portlet:namespace/>Abstract")
                        	  {
                            	  $("#_Abstract").show();
                            	  flag=false;
                            	//alert(inputs[i].name);
                              }
                              
                              
                              if(inputs[i].name=="<portlet:namespace/>Data_Inizio-date")
                        	  {
                            	  $("#_Data_Inizio-date").show();
                            	 flag=false;
                            	//alert(inputs[i].name);
                              }
                              
                              if(inputs[i].name=="<portlet:namespace/>Data_Inizio-time")
                        	  {
                            	  $("#_Data_Inizio-time").show();
                            	 flag=false;
                            	//alert(inputs[i].name);
                              }
                              
                              if(inputs[i].name=="<portlet:namespace/>Data_Fine-date")
                        	  {
                            	  $("#_Data_Fine-date").show();
                            	  flag=false;
                            	//alert(inputs[i].name);
                              }
                              
                              if(inputs[i].name=="<portlet:namespace/>Data_Fine-time")
                        	  {
                            	  $("#_Data_Fine-time").show();
                            	  flag=false;
                            	//alert(inputs[i].name);
                              }
                              if(inputs[i].name=="<portlet:namespace/>Tot_Ore")
                        	  {
                            	  $("#_Tot_Ore").show();
                            	  flag=false;
                            	//alert(inputs[i].name);
                              }
                              /*   if(inputs[i].name=="<portlet:namespace/>Tot_Ore-date")
                        	  {
                            	  $("#_Tot_Ore-date").show();
                            	  flag=false;
                            	//alert(inputs[i].name);
                              }
                              
                             if(inputs[i].name=="<portlet:namespace/>Tot_Ore-time")
                        	  {
                            	  $("#_Tot_Ore-time").show();
                            	  flag=false;
                            	//alert(inputs[i].name);
                              } */
                              
                              if(inputs[i].name=="<portlet:namespace/>Scadenza_Iscrizioni-date")
                        	  {
                            	  $("#_Scadenza_Iscrizioni-date").show();
                            	  flag=false;
                            	//alert(inputs[i].name);
                              }
                              
                              if(inputs[i].name=="<portlet:namespace/>Scadenza_Iscrizioni-time")
                        	  {
                            	  $("#_Scadenza_Iscrizioni-time").show();
                            	  flag=false;
                            	//alert(inputs[i].name);
                              }
                              
                              if(inputs[i].name=="<portlet:namespace/>Ammessi_al_corso")
                        	  {
                            	  $("#_Ammessi_al_corso").show();
                            	  flag=false;
                            	//alert(inputs[i].name);
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
                    		 /* $("#_Tot_Ore-date").hide();
                    		 $("#_Tot_Ore-time").hide(); 
                    		  */
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

