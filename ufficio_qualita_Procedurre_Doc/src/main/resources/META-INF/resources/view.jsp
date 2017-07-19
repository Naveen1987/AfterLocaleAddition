<%@page import="com.liferay.portal.kernel.util.LocaleUtil"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.demo.filelib.model.FileLibInfo"%>
<%@page import="com.demo.filelib.model.FileServiceFileLib"%>
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

.box-content{
  height:900px;
  overflow:auto;
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
<div class="col-md-12 box-content">
<div class="form-group pull-right">
    <input type="text" class="search form-control" placeholder="What you looking for?">
</div>
<span class="counter pull-right"></span>
<table class="table table-hover table-bordered results">
  <thead>
    <tr class="bg-primary">
    <th><b>COD</b></th>
    <th><b>TITOLO</b></th>
    <th><b>REV</b></th>
    <th><b>Dimensioni</b></th>
    <th><b>LINGUA</b></th>
    </tr>
    <tr class="warning no-result">
      <td colspan="5"><i class="fa fa-warning"></i> No result</td>
    </tr>
  </thead>
    <tbody>
<%
String cod="",titolo="",lingua="",rev="";
FileServiceFileLib fsfl=new FileServiceFileLib();
List<FileLibInfo> records=fsfl.getRecords("Procedurre-Doc Az", themeDisplay,locale);
for(FileLibInfo record:records){
	for(Map.Entry<String,String> entry:record.getFields().entrySet()){
		titolo=record.getFileName();
		if(entry.getKey().equalsIgnoreCase("cod")){
			cod=entry.getValue().toString();
		}
		else if(entry.getKey().equalsIgnoreCase("REV")){
			rev=entry.getValue().toString();
		}
		else if(entry.getKey().equalsIgnoreCase("lingua")){
			lingua=entry.getValue().toString();
		}
	}
%>
<tr>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=cod%></aui:a></td>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=titolo%></aui:a></td> 
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=rev%></aui:a></td>
<td>
<aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;">
<img src="<%=renderRequest.getContextPath()%>/images/<%=record.getImageName()%>" width="16" height="16" alt="<%=record.getExtension()%> file"/>
<%=record.getSize()%>
</aui:a>
</td>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=lingua%></aui:a></td>
</tr>
<%} %>
</tbody>
</table>
</div>
</div>
</div>
 

