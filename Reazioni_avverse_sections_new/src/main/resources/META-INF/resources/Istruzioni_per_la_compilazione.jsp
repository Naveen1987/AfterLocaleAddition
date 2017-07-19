<div class="container-fluid-1280"> 
<div class="row" style="text-align:right">
<div class="col-md-12">
<br/>
<a class="medownload btn btn-warning" href="" >Download</a>
<br/>
</div>
</div>
<div class="row" style="text-align:center">
<div class="col-md-12">
<img src="<%=request.getContextPath() %>/documents/file-page-2.jpg" width="1000"/>
</div>
</div>
</div>

<script>
$('.medownload').click(function(e) {
   e.preventDefault();  //stop the browser from following
    window.location.href = '<%=request.getContextPath()%>/documents/istruzioni.pdf';
   
});
</script>