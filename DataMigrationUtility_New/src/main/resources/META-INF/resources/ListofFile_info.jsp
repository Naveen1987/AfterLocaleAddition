<%@page import="org.apache.commons.io.FilenameUtils"%>
<%@page import="com.liferay.portal.kernel.repository.model.Folder"%>
<%@page import="com.liferay.document.library.kernel.service.DLAppServiceUtil"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page import="com.daffo.filevisible.FileLibInfo"%>
<%@page import="com.daffo.filevisible.FileServiceFileLib"%>
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

<div class="form-group pull-right">
    <input type="text" class="search form-control" placeholder="What you looking for?">
</div>
<span class="counter pull-right"></span>
<%
String folderId=request.getParameter("folderId");
Folder folder=DLAppServiceUtil.getFolder(new Long(folderId).longValue());
    		//case Sansitive
    		//str.matches("val1|val2|val3");
    		//case insensitive matching:
    		//str.matches("(?i)val1|val2|val3");
    		
		if(folder.getName().matches("(?i)Procedurre-Doc Az|Documenti di dipartimento"
				+ "|Sicurezza-Rischio|Note Informative|"
				+ "Farmacia|SIECIO_CIO|SPP_MC|Direzioni Mediche|SITRA"
				+ "|HRM|Comitati_Gruppi di Miglioramento|Rapporti e Dati"
				+ "|Accrediatmento e Controlli|Cartella Clinica")){
			System.out.println(folder.getName());
			%>
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

FileServiceFileLib fsfl=new FileServiceFileLib();
List<FileLibInfo> records=fsfl.getRecords(folder.getName(), themeDisplay,locale);
for(FileLibInfo record:records){
	String cod="",titolo="",lingua="",rev="";
	for(Map.Entry<String,String> entry:record.getFields().entrySet()){
		
		titolo =FilenameUtils.getBaseName(record.getFileName());
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
			
			<%	
		}
		else if(folder.getName().matches("(?i)Report|Normative|Linee Guida|Codifiche|HLA e Malattie"
				+ "|Accoglienza e Ospitalita|Gestione Beni e Servizi|Abbiategrasso"
				+ "|Cuggiono|Magenta|Legnano"
				+ "|Affari Generali e Legali|Comitato Scientifico|Corsi")){
			System.out.println(folder.getName());
			%>
			<table class="table table-hover table-bordered results">
  <thead>
    <tr class="bg-primary">
    <th><b>COD</b></th>
    <th><b>TITOLO</b></th>
    <th><b>Dimensioni</b></th>
    <th><b>LINGUA</b></th>
    </tr>
    <tr class="warning no-result">
      <td colspan="5"><i class="fa fa-warning"></i> No result</td>
    </tr>
  </thead>
<tbody>

<%

FileServiceFileLib fsfl=new FileServiceFileLib();
List<FileLibInfo> records=fsfl.getRecords(folder.getName(), themeDisplay,locale);
for(FileLibInfo record:records){
	String cod="",titolo="",lingua="";
	for(Map.Entry<String,String> entry:record.getFields().entrySet()){
		titolo =FilenameUtils.getBaseName(record.getFileName());
		if(entry.getKey().equalsIgnoreCase("cod")){
			cod=entry.getValue().toString();
		}
		else if(entry.getKey().equalsIgnoreCase("lingua")){
			lingua=entry.getValue().toString();
		}
	}
%>
<tr>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=cod%></aui:a></td>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=titolo%></aui:a></td>
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
			
			<%	
		}
		else if(folder.getName().matches("(?i)Servizio Risorse Umane")){
			System.out.println(folder.getName());
			%>
			<table class="table table-hover table-bordered results">
  <thead>
    <tr class="bg-primary">
    <th><b>COD</b></th>
    <th><b>TITOLO</b></th>
    <th><b>Dimensioni</b></th>
    </tr>
    <tr class="warning no-result">
      <td colspan="5"><i class="fa fa-warning"></i> No result</td>
    </tr>
  </thead>
<tbody>

<%

FileServiceFileLib fsfl=new FileServiceFileLib();
List<FileLibInfo> records=fsfl.getRecords(folder.getName(), themeDisplay,locale);
for(FileLibInfo record:records){
	String cod="",titolo="";
	for(Map.Entry<String,String> entry:record.getFields().entrySet()){
		titolo =FilenameUtils.getBaseName(record.getFileName());
		if(entry.getKey().equalsIgnoreCase("cod")){
			cod=entry.getValue().toString();
		}
		
		
	}
%>
<tr>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=cod%></aui:a></td>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=titolo%></aui:a></td>
<td>
<aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;">
<img src="<%=renderRequest.getContextPath()%>/images/<%=record.getImageName()%>" width="16" height="16" alt="<%=record.getExtension()%> file"/>
<%=record.getSize()%>
</aui:a>
</td>
</tr>
<%} %>
</tbody>
</table>
			
			<%	
		}
		else if(folder.getName().matches("(?i)Modulistica|Regolamenti"))
		{
			System.out.println(folder.getName());
			%>
						<table class="table table-hover table-bordered results">
  <thead>
    <tr class="bg-primary">
    <th><b>Numero</b></th>
    <th><b>Modulo</b></th>
    <th><b>Dimensioni</b></th>
    </tr>
    <tr class="warning no-result">
      <td colspan="5"><i class="fa fa-warning"></i> No result</td>
    </tr>
  </thead>
<tbody>

<%

FileServiceFileLib fsfl=new FileServiceFileLib();
List<FileLibInfo> records=fsfl.getRecords(folder.getName(), themeDisplay,locale);
for(FileLibInfo record:records){
	String Numero="",Modulo="";
	for(Map.Entry<String,String> entry:record.getFields().entrySet()){
		if(entry.getKey().equalsIgnoreCase("Numero")){
			Numero=entry.getValue().toString();
		}
		else if(entry.getKey().equalsIgnoreCase("Modulo")){
			Modulo=entry.getValue().toString();
		}
	}
%>
<tr>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=Numero%></aui:a></td>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=Modulo%></aui:a></td>
<td>
<aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;">
<img src="<%=renderRequest.getContextPath()%>/images/<%=record.getImageName()%>" width="16" height="16" alt="<%=record.getExtension()%> file"/>
<%=record.getSize()%>
</aui:a>
</td>
</tr>
<%} %>
</tbody>
</table>
			
			<%	
		}
		else if(folder.getName().matches("(?i)Customer Satisfaction"))
		{
			System.out.println(folder.getName());
			%>
<table class="table table-hover table-bordered results">
  <thead>
    <tr class="bg-primary">
    <th><b>Anno</b></th>
    <th><b>Sede</b></th>
    <th><b>Unità Organizzativa</b></th>
    <th><b>Dimensioni</b></th>
    </tr>
    <tr class="warning no-result">
      <td colspan="5"><i class="fa fa-warning"></i> No result</td>
    </tr>
  </thead>
<tbody>
<%

FileServiceFileLib fsfl=new FileServiceFileLib();
List<FileLibInfo> records=fsfl.getRecords(folder.getName(), themeDisplay,locale);
for(FileLibInfo record:records){
	String Anno="",Sede="",uo="";
	for(Map.Entry<String,String> entry:record.getFields().entrySet()){
		if(entry.getKey().equalsIgnoreCase("Anno")){
			Anno=entry.getValue().toString();
		}
		else if(entry.getKey().equalsIgnoreCase("Sede")){
			Sede=entry.getValue().toString();
		}
		else if(entry.getKey().equalsIgnoreCase("UnitaOrganizzativa")){
			uo=entry.getValue().toString();
		}
		
	}
%>
<tr>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=Anno%></aui:a></td>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=Sede%></aui:a></td>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=uo%></aui:a></td>
<td>
<aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;">
<img src="<%=renderRequest.getContextPath()%>/images/<%=record.getImageName()%>" width="16" height="16" alt="<%=record.getExtension()%> file"/>
<%=record.getSize()%>
</aui:a>
</td>
</tr>
<%} %>
</tbody>
</table>		
			<%	
		}
		else if(folder.getName().matches("(?i)Manuali"))
		{
			System.out.println(folder.getName());
			%>
		<table class="table table-hover table-bordered results">
  <thead>
    <tr class="bg-primary">
    <th><b>Applicativo</b></th>
    <th><b>Spec</b></th>
    <th><b>Titolo</b></th>
    <th><b>Dimensione</b></th>
    <th><b>Dimensioni</b></th>
    <th><b>LINGUA</b></th>
    </tr>
    <tr class="warning no-result">
      <td colspan="6"><i class="fa fa-warning"></i> No result</td>
    </tr>
  </thead>
<tbody>
<%

FileServiceFileLib fsfl=new FileServiceFileLib();
List<FileLibInfo> records=fsfl.getRecords(folder.getName(), themeDisplay,locale);
for(FileLibInfo record:records){
	String Applicativo="",Spec="",Titolo="",Lingua="",Dimensione="";
	for(Map.Entry<String,String> entry:record.getFields().entrySet()){
		Titolo=FilenameUtils.getBaseName(record.getFileName());
		if(entry.getKey().equalsIgnoreCase("Applicativo")){
			Applicativo=entry.getValue().toString();
		}
		else if(entry.getKey().equalsIgnoreCase("Spec")){
			Spec=entry.getValue().toString();
		}
		else if(entry.getKey().equalsIgnoreCase("Lingua")){
			Lingua=entry.getValue().toString();
		}
		else if(entry.getKey().equalsIgnoreCase("Dimensione")){
			Dimensione=entry.getValue().toString();
		}
	}
%>
<tr>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=Applicativo%></aui:a></td>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=Spec%></aui:a></td>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=Titolo%></aui:a></td>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=Dimensione%></aui:a></td>
<td>
<aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;">
<img src="<%=renderRequest.getContextPath()%>/images/<%=record.getImageName()%>" width="16" height="16" alt="<%=record.getExtension()%> file"/>
<%=record.getSize()%>
</aui:a>
</td>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=Lingua%></aui:a></td>
</tr>
<%} %>
</tbody>
</table>		
			<%	
		}
		else if(folder.getName().matches("(?i)Modulistica in uso|Piano Formativo Annuale|Regolamento"
				+ "|DRG Indicazioni codifica|Pubblicazioni"
				+ "|Monitoraggio Analitico Obbiettivi|Monitoraggio Sintetico Obbiettivi"
				+ "|Giacenze|Acquisti Appalti|Direzioni Mediche|Regole 2016|Regole 2017"))
		{
			System.out.println(folder.getName());
			%>
					<table class="table table-hover table-bordered results">
  <thead>
    <tr class="bg-primary">
    <th><b>COD</b></th>
    <th><b>TITOLO</b></th>
    <th><b>Dimensioni</b></th>
    <th><b>LINGUA</b></th>
    </tr>
    <tr class="warning no-result">
      <td colspan="5"><i class="fa fa-warning"></i> No result</td>
    </tr>
  </thead>
<tbody>

<%

FileServiceFileLib fsfl=new FileServiceFileLib();
List<FileLibInfo> records=fsfl.getRecords(folder.getName(), themeDisplay,locale);
for(FileLibInfo record:records){
	String cod="",titolo="",lingua="";
	for(Map.Entry<String,String> entry:record.getFields().entrySet()){
		titolo=FilenameUtils.getBaseName(record.getFileName());
		if(entry.getKey().equalsIgnoreCase("cod")){
			cod=entry.getValue().toString();
		}
		else if(entry.getKey().equalsIgnoreCase("lingua")){
			lingua=entry.getValue().toString();
		}
	}
%>
<tr>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=cod%></aui:a></td>
<td><aui:a href="<%=record.getDownloadUrl()%>" style="color:black;text-decoration:none;"><%=titolo%></aui:a></td>
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
				
			<%	
		}
%>
