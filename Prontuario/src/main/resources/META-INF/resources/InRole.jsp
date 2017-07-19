<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.daffo.prontuario_drugservice.model.prontuario_drug"%>
<%@page import="java.util.List"%>
<%@page import="com.daffo.prontuario_drugservice.service.prontuario_drugLocalServiceUtil"%>
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
<span id="add-new" class="btn btn-success">New Drug</span>
</div>
</div>
<div class="row">
<div class="col-md-12">
<div class="form-group pull-right">
    <input type="text" class="search form-control" placeholder="What you looking for?">
</div>
<span class="counter pull-right"></span>
<table class="table table-hover table-bordered results">
<thead>
    <tr class="bg-primary">
    <%--<th><b>#</b></th> --%>
     <th><b>Codice</b></th>
    <th><b>Gruppo</b></th>
    <th><b>SottoGruppo</b></th>
    <th><b>Principio Attivo </b></th>
    <th><b>Nome Commerciale </b></th>
    <th><b>Action</b></th>
    </tr>
    <tr class="warning no-result">
      <td colspan="7"><i class="fa fa-warning"></i> No result</td>
    </tr>
  </thead>
    <tbody>
    <%
    List<prontuario_drug> pd=prontuario_drugLocalServiceUtil.getprontuario_drugs(0, prontuario_drugLocalServiceUtil.getprontuario_drugsCount());
    for(prontuario_drug p:pd){
    %>
    <tr>
    <td><%=p.getCodice() %></td>
    <td><%=p.getGruppo()%></td>
    <td><%=p.getSottoGruppo() %></td>
    <td><%=p.getPrincipio_Attivo() %></td>
    <td><%=p.getNome_Commerciale()%></td>
    <td>
    <span onClick="getRowId('<%=p.getDrug_id()%>')" class="btn btn-warning">Edit</span>
    </td>
    </tr>
    <%
    }
    %>
    </tbody>
</table>
</div>
</div>
</div>

<script>

function getRowId(data){
	
	var portletURL = Liferay.PortletURL.createRenderURL();
 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
    portletURL.setParameter('data', data);    
    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
    portletURL.setParameter('mvcPath', '/drug_edit.jsp');
  /*  Liferay.Util.openWindow({
		dialog: {
		centered: true,
		cssClass: 'my-liferay-popup',
		constrain2view: true,
		modal: true,
		width: 700,
		height:450
		},
		id: '<portlet:namespace/>Edit_Drug',
		title: 'Edit Drug' ,
		uri:  portletURL.toString()
		});	 */
    YUI().ready(function(A) {
        YUI().use('aui-base','liferay-util-window', function(A) {
            Liferay.Util.Window.getWindow({
                title :'Edit Drug',
                uri: portletURL,
                id:'<portlet:namespace/>Edit_Drug',
                dialog: {
                	centered: true,
                    destroyOnHide: true,
                    cache: false,
                    modal: true,
                    width: 700,
            		height:450
                }
            }).after('destroy', function(event) {
            	//It will refresh
            	location.reload();
            });
        });
    });
} 

$("#add-new").click(function(){
	var portletURL = Liferay.PortletURL.createRenderURL();
 	portletURL.setWindowState('<%=LiferayWindowState.POP_UP.toString() %>');
    //portletURL.setParameter('data', pagedata);    
    portletURL.setPortletId("<%=themeDisplay.getPortletDisplay().getId() %>");
    portletURL.setParameter('mvcPath', '/drug_add.jsp');
    // Now we can use the URL
  // alert(portletURL.toString());
  /*  Liferay.Util.openWindow({
		dialog: {
		centered: true,
		cssClass: 'my-liferay-popup',
		constrain2view: true,
		modal: true,
		width: 700,
		height:450
		},
		id: '<portlet:namespace/>Add_New_Drug',
		title: 'Add New Drug' ,
		uri:  portletURL.toString()
		}); */
    YUI().ready(function(A) {
        YUI().use('aui-base','liferay-util-window', function(A) {
            Liferay.Util.Window.getWindow({
                title :'Add New Drug',
                uri: portletURL,
                id:'<portlet:namespace/>Add_New_Drug',
                dialog: {
                	centered: true,
                    destroyOnHide: true,
                    cache: false,
                    modal: true,
                    width: 700,
            		height:450
                }
            }).after('destroy', function(event) {
            	//It will refresh
            	location.reload();
            });
        });
    });
	
});
</script>


<!-- <aui:script> 
Liferay.provide(window,'<portlet:namespace/>windowRefresh', function() 
	{
	alert("Hello");
	location.reload();
	}, 
	['liferay-util-window'] 
	); 
</aui:script> -->