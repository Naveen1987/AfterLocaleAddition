<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.roomservice.service.BookedEquipmentLocalServiceUtil"%>
<%@page import="com.roomservice.service.EquipmentLocalServiceUtil"%>
<%@page import="java.util.List"%>
<%@ include file="/init.jsp" %>
<%@page import="com.roomservice.model.*" %>
<%
String courseId=request.getParameter("courseId");
List<Equipment> equipList = EquipmentLocalServiceUtil.getEquipments(-1, -1);
List<BookedEquipment> bkequipList = BookedEquipmentLocalServiceUtil.getBookedEquipments(-1, -1);
%>


<style>
.btn-submit{
background-color: #008CBA;
color:white
}
.btn-submit:hover{
background-color:#024961;
color:white;
}

</style>

<style>
.results tr[visible='false'],
.no-result{
  display:none;
}

.results tr[visible='true']{
  display:table-row;
}

.counter{
  padding:8px; 
  color:#ccc;
}
</style>

<script>
$(document).ready(function() {
	  $(".search").keyup(function () {
	    var searchTerm = $(".search").val();
	    var listItem = $('.results tbody').children('tr');
	    var searchSplit = searchTerm.replace(/ /g, "'):containsi('")
	    
	  $.extend($.expr[':'], {'containsi': function(elem, i, match, array){
	        return (elem.textContent || elem.innerText || '').toLowerCase().indexOf((match[3] || "").toLowerCase()) >= 0;
	    }
	  });
	    
	  $(".results tbody tr").not(":containsi('" + searchSplit + "')").each(function(e){
	    $(this).attr('visible','false');
	  });

	  $(".results tbody tr:containsi('" + searchSplit + "')").each(function(e){
	    $(this).attr('visible','true');
	  });

	  var jobCount = $('.results tbody tr[visible="true"]').length;
	    $('.counter').text(jobCount + ' item');

	  if(jobCount == '0') {$('.no-result').show();}
	    else {$('.no-result').hide();}
			  });
	});
</script>


<script>
function bookRoomDiv() {
	document.getElementById('bookRoomDiv').style.display = "block";
	document.getElementById('listbookedRoomDiv').style.display = "none";
	//document.getElementById('equipDiv').style.display = "none";
}

function listbookedRoomDiv() {
	document.getElementById('listbookedRoomDiv').style.display = "block";
	document.getElementById('bookRoomDiv').style.display = "none";
	//document.getElementById('equipDiv').style.display = "none";
}

function equipDiv() {
	document.getElementById('listbookedRoomDiv').style.display = "none";
	document.getElementById('bookRoomDiv').style.display = "none";
	//document.getElementById('equipDiv').style.display = "block";
}
</script>

<portlet:actionURL name="BookedEquipmentSubmit" var="BookedEquipmentSubmit">
<portlet:param name="mvcPath" value="/RoomAllocation.jsp" />
</portlet:actionURL>

<div class="container-fluid-1280">
<div class="row">
<div class="col-xs-12 ">
<div class="pull-right">
<table>
<tr>
<td><span class="btn btn-submit" id="btn-submit" onclick="bookRoomDiv()"><liferay-ui:message key="BookEquipment"/></span></td>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="btn btn-submit" id="btn-submit"  onclick="listbookedRoomDiv()"><liferay-ui:message key="ViewAllocatedEquipment"/></span></td>
</tr>
<tr>
<td><br/></td>
</tr>
</table>
</div>
</div>

</div>
<div id="bookRoomDiv"  style="display: none;" class="row">
<div class="col-xs-12">
	<form action="<%=BookedEquipmentSubmit%>" method="Post" name="myForm" onsubmit="return validateForm()" >
	<%
	//for submit button visible
	boolean sub=false;
	for(Equipment eq : equipList){ 
			int count=0;
			for(BookedEquipment bk: bkequipList){
				if(eq.getEquip_id()==bk.getEquip_id()){
					count = count+bk.getEquip_quantity();
				}
			}
			if(eq.getEquip_quantity()>count){
				sub=true;
			%>
			<div class="form-group">
				<!-- <label for="course_Id">Course Id:</label>  --><input type="hidden"
					class="form-control" id="course_Id" value="<%=courseId%>" name="<portlet:namespace/>course_Id" readonly="readonly">
			</div>
			<div class="form-group">
				<label for="equipmentName"><%=eq.getEquipment_name()%></br><font color="red">available:<%=eq.getEquip_quantity()-count%></font></label> 
				<input type="number" min="0" max="<%=eq.getEquip_quantity()-count%>"
					class="form-control" id="<%=eq.getEquipment_name()%>" placeholder="Please enter <%=eq.getEquip_quantity()-count%> or less than <%=eq.getEquip_quantity()-count%> <%=eq.getEquipment_name()%>"
					name="<portlet:namespace/><%=eq.getEquipment_name()%>" onChange="validateMe('<%=eq.getEquipment_name()%>','<%= eq.getEquip_quantity()-count%>')">
			</div>
<%} }%>
			<%
			if(sub){
				%>
				<button type="submit" class="btn btn-primary">Submit</button>
				<%
			}
			else{
				%>
				<span style="Color:red;font-size:20px"><liferay-ui:message key="saeb"/></span>
				<%
			}
			%>
		</form>
<br/>
</div>

</div>

<div id="listbookedRoomDiv"   style="display: none;" class="row">
<div class="form-group pull-right">
   <input type="text" class="search form-control" placeholder="<liferay-ui:message key="walf"/>">
</div>
<span class="counter pull-right"></span>
<table class="table table-hover table-bordered results">
 <thead>
   <tr class="bg-primary">
   <th><b><liferay-ui:message key="CourseId"/></b></th>
   <th><b><liferay-ui:message key="EquipmentId"/></b></th>
   <th><b><liferay-ui:message key="EquipmentName"/></b></th>
   <th><b><liferay-ui:message key="EqQuantity"/></b></th>
   <th><b><liferay-ui:message key="BookedDate"/></b></th>
   
   </tr>
   <tr class="warning no-result">
     <td colspan="5"><i class="fa fa-warning"></i> Nessuna attrezzatura prenotata</td>
   </tr>
 </thead>
   <tbody>
   
   <tr>
<%	for(BookedEquipment bked : bkequipList){
	if(bked.getCourse_id()==new Long(courseId).longValue()){	
				for(Equipment eq : equipList){
					if(bked.getEquip_id() == eq.getEquip_id()){
						
	%>
	
	<td style="padding: 5px;">
				<%=bked.getCourse_id()%>
				</td>
				
	<td style="padding: 5px;">
				<%=bked.getEquip_id() %>
				
				</td>
	
	<td style="padding: 5px;">
				<%=eq.getEquipment_name() %>
				</td>
	
	<td style="padding: 5px;">
				<%=bked.getEquip_quantity() %>
				</td>
	
	<td style="padding: 5px;">
				<%=bked.getBooked_equip_date() %>
				</td>
				</tr>
				
			
		<%}
				}
	
	%>
	  
<% }}%>
</tbody>
</table>
</div>
</div>
<script type="text/javascript">
function validateMe(control,ava){
	var id='#'+control;
	//alert($(id).val()+" "+ava);
	if(parseInt($(id).val())>parseInt(ava)){
		alert("Immetti Valore valido");
		$(id).val('');
		return;
	}
}
</script>

