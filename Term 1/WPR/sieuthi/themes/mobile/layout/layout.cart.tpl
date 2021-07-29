<!-- BEGIN: main -->
{FILE "header.tpl"}
<style type="text/css">

.yith_magnifier_gallery {
    margin: 0;
    padding: 0;
}
.yith_magnifier_gallery li {
    display: block;
    float: left;
    position: relative;
}
.yith_magnifier_gallery li.last {
    margin-right: 0;
}
.yith_magnifier_gallery li a {
    display: block;
    height: auto !important;
    margin-top: 10px;
    width: 100% !important;
}
.single-product.woocommerce .thumbnails {
    position: relative;
}
.single-product.woocommerce .thumbnails #slider-prev, .single-product.woocommerce .thumbnails #slider-next {
    background: url("../images/slider-arrow.png") no-repeat scroll left center rgba(0, 0, 0, 0);
    cursor: pointer;
    display: none !important;
    height: 26px;
    margin-top: -2px;
    position: absolute;
    top: 48%;
    width: 27px;
}
.single-product.woocommerce .thumbnails #slider-prev {
    background-position: left center;
    left: 0;
}
.single-product.woocommerce .thumbnails #slider-next {
    background-position: right center;
    right: 0;
}
.single-product.woocommerce .thumbnails:hover #slider-prev, .single-product.woocommerce .thumbnails:hover #slider-next {
    display: block !important;
}
span.onsale {
    z-index: 10000;
}

</style>
<div id="container-wrapper">
<div id="container">
<div id="notification-fixed">
<div id="notification"></div>
</div>
<div id="column-right">
                     [GOIY]
                     <div id="martha_flex_slider_widget-2" class="sidebar-widget adsCarousel">
                     [ALBUM]
                     </div>
                     <div id="martha_flex_slider_widget-2" class="sidebar-widget adsCarousel">
                     [LIKEBOX]
                     </div>
                  </div>
                  <div id="content">
                  <!-- BEGIN: mod_title -->
<div class="breadcrumb">
<a href="{NV_BASE_SITEURL}" class="home">{LANG.Home}</a>
<!-- BEGIN: breakcolumn -->
<span class="seprator">/</span>
<a href="{BREAKCOLUMN.link}">{BREAKCOLUMN.title}</a>
<!-- END: breakcolumn -->
</div>
<!-- END: mod_title -->

{MODULE_CONTENT}
</div>
</div>
</div>
{FILE "footer.tpl"}
<!-- END: main -->