<!-- BEGIN: main -->
{FILE "header.tpl"}
<link type="text/css" rel="stylesheet" href="{NV_BASE_SITEURL}themes/{TEMPLATE}/css/magiczoomplus.css">
<script src="{NV_BASE_SITEURL}themes/{TEMPLATE}/js/magiczoomplus.js" type="text/javascript"></script>
<div class="fix_width_1200">
<div class="content_left">
 <!-- BEGIN: mod_title -->
		<div class="product_breadcrumb">
        
			<a href="/">{LANG.Home}</a>
            <!-- BEGIN: breakcolumn -->
				<span>›</span>
                		
						<h1><a href="{BREAKCOLUMN.link}">{BREAKCOLUMN.title}</a></h1>	
                        <!-- END: breakcolumn -->						
                        </div>
                         <!-- END: mod_title -->
		{MODULE_CONTENT}		
	</div>
	<div class="content_right">
		<div class="right_banner">
			[ADS]
		</div>
			[VIEWPRODUCT]
		<div class="right_banner">
			[ADS2]
		</div>
			[NEWS]
				</div>
	<div class="clear"></div>
</div>
{FILE "footer.tpl"}
<!-- END: main -->

