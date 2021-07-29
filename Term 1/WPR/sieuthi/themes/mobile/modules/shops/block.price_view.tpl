<!-- BEGIN: main -->
<style type="text/css">
ul.price_view{ padding:5px}
ul.price_view li{
	background:url('{NV_BASE_SITEURL}themes/{TEMPLATE}/images/shops/access_head_bg.png') no-repeat center left;
	height:20px;
	padding-left:20px;	
}
ul.price_view li a {

color:#000000 !important;}
</style>
<div class="sli_facet_container" id="facets">
<h3>Tìm Theo Giá</h3>
<div>
<ul class="price_view">
    <!-- BEGIN: loopprice -->
    <li><a href="{ROW.link}">{ROW.title}</a></li>
    <!-- END: loopprice -->
</ul>
</div>
</div>
<!-- END: main -->