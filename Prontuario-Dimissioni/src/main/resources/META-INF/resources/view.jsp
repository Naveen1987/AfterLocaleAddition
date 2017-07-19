<%@ include file="/init.jsp" %>

<div class="container-fluid-1280"> 
<div class="row" style="text-align:right">
<div class="col-md-12">
<br/>
<br/>
</div>
</div>
<div class="row" style="text-align:center">
<br/>
<div class="col-md-12">
<a class="medownload" href=""><img src="<%=request.getContextPath() %>/img/download.png"/></a>
</div>
</div>
</div>

<script>
$('.medownload').click(function(e) {
    e.preventDefault();  //stop the browser from following
    window.location.href = '<%=request.getContextPath()%>/img/PRONTUARIO ALLA DIMISSIONE APR 2011.pdf';
});
</script>