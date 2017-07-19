<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="java.util.List"%>
<%@page import="com.daffo.suilupposervice.model.suiluppo_room"%>
<%@page import="com.daffo.suilupposervice.service.suiluppo_roomLocalServiceUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/init.jsp" %>

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

.glyphicon.glyphicon-edit {
    font-size: 30px;
    color:#e09833;
    cursor:pointer;
}
.glyphicon.glyphicon-edit:hover {
 color:#7d4b05;
}
.glyphicon.glyphicon-trash {
    font-size: 30px;
    color:#d9534f;
    cursor:pointer;
}

.glyphicon.glyphicon-trash:hover {
    color:red;
}
 /* .rowdiv {
        border: 1px solid;
        padding:1 1 1 1;
        border-radius: 10px;
        height:500px;
        overflow: auto
      } */
 .box{
  height:650px;
  border-radius:10px; 
  border:1px solid #666;
  padding:6px 0px;
}

.box-content{
  height:635px;
  overflow:auto;
  border-radius:8px;
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
<div class="container-fluid-1280">
<div class="row">
<div class="col-md-12">
<br/>
<h1><liferay-ui:message key="ListOfRooms"/></h1>
</div>
</div>
<div class="row box">
<div class="col-md-12 box-content">
<div class="form-group pull-right">
    <input type="text" class="search form-control" placeholder="<liferay-ui:message key="walf"/>">
</div>
<span class="counter pull-right"></span>
<table class="table table-hover table-bordered results">
  <thead>
    <tr class="bg-primary">
    <th><b><liferay-ui:message key="rmName"/></b></th>
    <th><b><liferay-ui:message key="rmDescription"/></b></th>
    <th><b><liferay-ui:message key="action"/></b></th>
    </tr>
     <tr class="warning no-result">
      <td colspan="10"><i class="fa fa-warning"></i> <liferay-ui:message key="noresult"/></td>
    </tr>
    </thead>
    <tbody>
   
    <%
    List<suiluppo_room> lsr=suiluppo_roomLocalServiceUtil.getsuiluppo_rooms(-1, -1);
    		for(suiluppo_room sr:lsr){
    			%>
    			<tr>
    			<td><%=sr.getRoom_name() %></td>
    			<td><%=sr.getRoom_description() %></td>
    			<td>
    			<span class="glyphicon glyphicon-edit" onClick="onRoomEdit('<%=sr.getRoomID()%>')"></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    			<span class="glyphicon glyphicon-trash" onClick="onRoomDelete('<%=sr.getRoomID()%>')"></span>
    			</td>
    			</tr>
    			<%
    		}
    %>
    </tbody>
    </table>
</div>
</div>




    <div class="row">
    <div class="col-xs-12">
    <br/>
    <div class="pull-right">
    <a class="btn btn-action btn-primary" id="btnNewRoom">
 	<span class=""> <svg class="lexicon-icon lexicon-icon-plus" role="img" title="" viewBox="0 0 512 512">  
 	<path class="lexicon-icon-outline" d="M479.82 224.002h-192.41v-191.91c0-17.6-14.4-32-32-32v0c-17.6 0-32 14.4-32 32v191.91h-191.41c-17.6 0-32 14.4-32 32v0c0 17.6 14.4 32 32 32h191.41v191.91c0 17.6 14.4 32 32 32v0c17.6 0 32-14.4 32-32v-191.909h192.41c17.6 0 32-14.4 32-32v0c0-17.6-14.4-32-32-32z"></path>
	</svg> <span class="taglib-icon-label"> </span> </span>
	</a>
    </div>
    </div>
    </div>
  </div>
  <%--this is css button to show --%>

 
<script>
$("#btnNewRoom").click(function(){
	 var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>'); 
	    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/NewRoom.jsp');
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'<liferay-ui:message key="NewRoom"/>',
	                uri: portletURL,
	                id:'<portlet:namespace/>NewRoom',
	                dialog: {
	                	centered: true,
	                	constrain2view: true,
	                    destroyOnHide: true,
	                    resizable: false,
	                    cache: false,
	                    modal: true,
	                    width: 700,
	                    height:300
	                }
	            }).after('destroy', function(event) {
	            	//It will refresh
	            	location.reload();
	            });
	        });
	    });

	
});

<portlet:actionURL name="roomDelete" var="roomDelete">
<portlet:param name="mvcPath" value="/ListRoom.jsp" />
</portlet:actionURL>
function onRoomDelete(roomId){
	var a=  confirm('<liferay-ui:message key="DoyoureadytoRoomDelete"/>');
	  if(a==true)
	  {
		  AUI().use('aui-base','aui-io-request', function(A){
				//aui ajax call to get updated content
				A.io.request('<%=roomDelete%>',{
		  		dataType: 'json',
		  		method: 'POST',
		  		data:{'<portlet:namespace/>roomID':roomId},
		  		on: {
		   			 success: function() {
		   			 alert('<liferay-ui:message key="RoomDeletedSuccessfully"/>')  			
		   			 location.reload();
		    		}
		  		}
				});
				});	
	  }
	
}


function onRoomEdit(roomId){
	 var portletURL = Liferay.PortletURL.createRenderURL();
	 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>'); 
	 	portletURL.setParameter('roomId', roomId); 
	 	portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
	    portletURL.setParameter('mvcPath', '/EditRoom.jsp');
	    YUI().ready(function(A) {
	        YUI().use('aui-base','liferay-util-window', function(A) {
	            Liferay.Util.Window.getWindow({
	                title :'<liferay-ui:message key="EditRoom"/>',
	                uri: portletURL,
	                id:'<portlet:namespace/>Edit_Room',
	                dialog: {
	                	centered: true,
	                	constrain2view: true,
	                    destroyOnHide: true,
	                    resizable: false,
	                    cache: false,
	                    modal: true,
	                    width: 700,
	                    height:300
	                }
	            }).after('destroy', function(event) {
	            	//It will refresh
	            	location.reload();
	            });
	        });
	    });

	}
</script>