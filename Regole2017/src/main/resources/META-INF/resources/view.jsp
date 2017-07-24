<%@page import="org.apache.commons.io.FilenameUtils"%>
<%@page import="java.util.Locale"%>
<%@page import="java.util.regex.Pattern"%>
<%@page import="java.util.StringTokenizer"%>
<%@page import="com.liferay.portal.kernel.util.LocaleUtil"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.demo.filelib.model.FileLibInfo"%>
<%@page import="com.demo.filelib.model.FileServiceFileLib"%>
<%@ include file="/init.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
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
  height:650px;
  overflow:auto;
}
.otherhead {
           width: 15.7%; 
           float: left;
       } 
.otherdata {
           width: 16%; 
           float: left;
       } 
 .widthData{
 width:36%;
 float: left;
 } 
 
.dataRow tr:first-child td {
       border-top: none;
  
    }
   .dataRow tr:last-child {
 	 border-bottom: 1px solid gray;
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
<div class="form-group pull-right">
    <input type="text" class="search form-control" placeholder="<liferay-ui:message key="walf"/>">
</div>
<span class="counter pull-right"></span>
<table class="table">
  <thead>
    <tr class="bg-primary">
    <th style="width:.5px"></th>
    <th class="otherhead"><b>COD</b></th>
    <th class="widthData"><b>TITOLO</b></th>
    <th class="otherhead"><b>Dimensioni</b></th>
    <th class="otherhead"><b><liferay-ui:message key="ModifiedDate"/></b></th>
    <th class="otherhead"><b>LINGUA</b></th>
  	<th style="width:2px"></th>
    </tr>
    <tr class="warning no-result">
      <td colspan="8"><i class="fa fa-warning"></i> <liferay-ui:message key="noresult"/></td>
    </tr>
  </thead>
    <tbody>
    <tr>
    <td colspan="7">
    <div class="box-content">
    <table class="table results dataRow">
<%
String cod="",titolo="",lingua="",ModifiedDate="";
FileServiceFileLib fsfl=new FileServiceFileLib();
List<FileLibInfo> records=fsfl.getRecords("Regole 2017", themeDisplay,locale);
for(FileLibInfo record:records){
	for(Map.Entry<String,String> entry:record.getFields().entrySet()){
		titolo=FilenameUtils.getBaseName(record.getFileName());
		ModifiedDate=record.getFileModifyDate();
		if(entry.getKey().equalsIgnoreCase("cod")){
			cod=entry.getValue().toString();
		}
		else if(entry.getKey().equalsIgnoreCase("lingua")){
			lingua=entry.getValue().toString();
		}
	}
%>
<tr>
<td  class="otherdata"><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=getValue(cod)%></aui:a></td>
<td  class="widthData"><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=getValue(titolo)%></aui:a></td> 
<td  class="otherdata"><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;">
<img src="<%=renderRequest.getContextPath()%>/images/<%=record.getImageName()%>" width="16" height="16" alt="<%=record.getExtension()%> file"/>
<%=record.getSize()%>
</aui:a>
</td>
<td  class="otherdata"><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=ModifiedDate%></aui:a></td>
<td  class="otherdata"><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=getValue(lingua)%></aui:a></td>
</tr>
<%} %>
</table>
    </div>
    </td>
    </tr>
</tbody>
</table>
</div>
</div>
</div>
<%!
public String getValue(String val){
	/* System.out.println(val); */
	if(val.contains("{")&&val.contains("}")&&val.contains(":")){
		String data[]=val.split(Pattern.quote(":"));
		StringTokenizer st=new StringTokenizer(data[1],"\"}");
		return st.nextElement().toString();
	}
	
		return val;
}
%>


<%-- <%@page import="org.apache.commons.io.FilenameUtils"%>
<%@page import="org.apache.commons.io.FileUtils"%>
<%@page import="com.liferay.portal.kernel.util.FileUtil"%>
<%@page import="java.util.Locale"%>
<%@page import="java.util.regex.Pattern"%>
<%@page import="java.util.StringTokenizer"%>
<%@page import="com.liferay.portal.kernel.util.LocaleUtil"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.demo.filelib.model.FileLibInfo"%>
<%@page import="com.demo.filelib.model.FileServiceFileLib"%>
<%@ include file="/init.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 

<style>
.results tr[visible='false'],
.no-result{
  display:none;
}

.results tr[visible='true']{
 /*  display:table-row; */
}

.counter{
  padding:8px; 
  color:#ccc;
}
table {
           width: 100%;
       }

       thead, tbody, tr, td, th { display: block; }

       tr:after {
           content: ' ';
           display: block;
           visibility: hidden;
           clear: both;
       }

       thead th {
           height: 30px;

           /*text-align: left;*/	
       }

       tbody {
           height: 650px;
           overflow-y: auto;
       }

       thead {
           /* fallback */
       }


     tbody td, thead th {
           width: 16%; 
           float: left;
       } 
 .widthData{
 width:36%;
 }
/* .box-content{
  height:900px;
  overflow:auto;
} */

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
    <input type="text" class="search form-control" placeholder="<liferay-ui:message key="walf"/>">
</div>
<span class="counter pull-right"></span>
<table class="table table-striped  results">
  <thead>
    <tr class="bg-primary">
    <th><b>COD</b></th>
   <th class="widthData"><b>TITOLO</b></th>
    <th><b>Dimensioni</b></th>
    <th><b><liferay-ui:message key="ModifiedDate"/></b></th>
    <th><b>LINGUA</b></th>
    </tr>
    <tr class="warning no-result">
      <td colspan="5"><i class="fa fa-warning"></i> <liferay-ui:message key="noresult"/></td>
    </tr>
  </thead>
    <tbody>
<%
String cod="",titolo="",lingua="",ModifiedDate="";
FileServiceFileLib fsfl=new FileServiceFileLib();
List<FileLibInfo> records=fsfl.getRecords("Regole 2017", themeDisplay,locale);
for(FileLibInfo record:records){
	for(Map.Entry<String,String> entry:record.getFields().entrySet()){
		titolo=FilenameUtils.getBaseName(record.getFileName());
		ModifiedDate=record.getFileModifyDate();
		if(entry.getKey().equalsIgnoreCase("cod")){
			cod=entry.getValue().toString();
		}
		else if(entry.getKey().equalsIgnoreCase("lingua")){
			lingua=entry.getValue().toString();
		}
	}
%>
<tr>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=getValue(cod)%></aui:a></td>
<td class="widthData"><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=titolo%></aui:a></td> 
<td>
<aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;">
<img src="<%=renderRequest.getContextPath()%>/images/<%=record.getImageName()%>" width="16" height="16" alt="<%=record.getExtension()%> file"/>
<%=record.getSize()%>
</aui:a>
</td>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=ModifiedDate%></aui:a></td>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=getValue(lingua)%></aui:a></td>
</tr>
<%} %>
</tbody>
</table>
</div>
</div>
</div>

<%!
public String getValue(String val){
	/* System.out.println(val); */
	if(val.contains("{")&&val.contains("}")&&val.contains(":")){
		String data[]=val.split(Pattern.quote(":"));
		StringTokenizer st=new StringTokenizer(data[1],"\"}");
		return st.nextElement().toString();
	}
	
		return val;
}
%>

 --%>