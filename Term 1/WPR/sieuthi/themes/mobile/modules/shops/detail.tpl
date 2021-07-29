

<!-- BEGIN: main -->
<script>(function(d, s, id) {
		  var js, fjs = d.getElementsByTagName(s)[0];
		  if (d.getElementById(id)) return;
		  js = d.createElement(s); js.id = id;
		  js.src = "../connect.facebook.net/vi_VN/all.js#xfbml=1";
		  fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'facebook-jssdk'));</script>
<div class="product_detail_left">
   <div class="product_detail_picture">
      <a class="MagicZoomPlus" target="_blank" href="{SRC_PRO}" 
         rel="zoom-position: inner;hint: false" id="zoom" style="width:800px; height:445px;" >
      <img itemprop="image" class="product_detail_image" 
         src="{SRC_PRO}" alt="" title="{TITLE}" style="width:315px; height:315px;" />
      </a>
   </div>
</div>
<div class="product_detail_right">
   <div itemprop="name">
      <h1 class="title">{TITLE}</h1>
   </div>
   <div class="teaser">
      <span itemtype="http://data-vocabulary.org/Review-aggregate" itemscope="" itemprop="review">
      Có <span itemprop="count">{NUM_VIEW}</span> {detail_num_view}
      | {LANG.detail_codesp}: <span content="mpn:206" itemprop="identifier">{codesp}</span>
      </span>
   </div>
   <div class="thong_tin_banggia">
      <span itemtype="http://data-vocabulary.org/Offer-aggregate" itemscope="" itemprop="offerDetails">
         <meta content="VND" itemprop="currency">
         <div style="display:block;" class="tab_content" id="tabs_pro_1">
             <!-- BEGIN: price -->
            <div class="{class_money}">{LANG.deal_original_price}: <span itemprop="price">{product_price}</span> <span>VNĐ</span></div>
             <!-- END: price -->
             <!-- BEGIN: discounts -->
            <div class="money2">{LANG.deal_original_buy}: <span itemprop="price">{product_discounts}</span> <span>VNĐ</span></div>
         	 <!-- END: discounts -->
         </div>
         <ul>
            <!-- BEGIN: warranty -->
            <li class="gift">{LANG.detail_warranty}:  {warranty} </li>
            <!-- END: warranty -->
            <li class="gift">{LANG.detail_number_status}: 
            <!-- BEGIN: number_on -->
            <span class="tagged_as">{LANG.detail_numberon}</span>	
            <!-- END: number_on -->
            <!-- BEGIN: number_off -->
            <span class="tagged_as">{LANG.detail_numberon}</span>	
            <!-- END: number_off --></li>
            <!-- BEGIN: source -->
            <li class="gift">{LANG.detail_source}: {source}</li>
            <!-- END: source -->
            <!-- BEGIN: note -->
            <li class="gift">{LANG.promotional}: <span content="in_stock" itemprop="availability">{note}</span></li>
            <!-- END: note -->
       
            <li class="gift">{LANG.detail_address}: <span content="in_stock" itemprop="availability">{address}</span></li>
           

         </ul>
      </span>
   </div>
   <style type="text/css">
   	.quantity {
    float: left;
    margin-right: 10px;
}
input.input-text.qty {
    -moz-border-bottom-colors: none;
    -moz-border-left-colors: none;
    -moz-border-right-colors: none;
    -moz-border-top-colors: none;
    border-color: #E6E6E6 -moz-use-text-color;
    border-image: none;
    border-radius: 0;
    border-style: solid none;
    border-width: 1px 0;
    color: #42494D;
    font-size: 14px;
    height: 50px;
    margin: 2px 8px;
    padding: 0 0 1px;
    text-align: center;
    width: 42px;
}
   </style>
   <div class="dat_hang">
<div class="quantity">
    <input type="number" min="1" value="1" name="num" id="pnum" title="Qty" class="input-text qty text" size="4" />
    </div>
		<a class="buttom" href="javascript:void(0)" id="{proid}" title="{title_pro}" onclick="cartorder_detail(this)"> <span>{LANG.add_product}</span> 
        <font>(Giao hàng miễn phí)</font> </a> 
<div class="clear">
	&nbsp;</div>
	{detail_note2}

   </div>
</div>
<div class="clear"></div>
<div class="product_detail_tags">
   Tags:
   {keywords}
</div>
<div class="type_category_title">
   <a class="tab active" id="tab_0" onclick="ShowTab(0)">{LANG.product_detail}</a>
   <a class="tab" id="tab_1" onclick="ShowTab(1)">{LANG.detail_comments}</a>
    <a class="tab" id="tab_2" onclick="ShowTab(2)">{LANG.detail_maps}</a>
   <div class="clear"></div>
</div>
<div style="display:block;" id="content_tab_0" class="tab_category type_category_content">
   {DETAIL}
</div>
<h4 id="content_tab_1" class="tab_category type_category_content">
   <div class="fb-comments" data-href="{link_commentfb}" data-num-posts="5" data-width="820"></div>
</h4>
<h4 id="content_tab_2" class="tab_category type_category_content">
  <div class="maps">
			<script type="text/javascript" 
src="http://maps.googleapis.com/maps/api/js?sensor=false&language=vi"></script>
				<script type="text/javascript">

				function initialize() {

				var myLatLng = new google.maps.LatLng({maps});

				var mapOptions = {

				zoom : 16,

				center : myLatLng,

				mapTypeId : google.maps.MapTypeId.ROADMAP


				};

				

				var map = new google.maps.Map(document.getElementById('map-canvas'), mapOptions);

				

				var infowindow = new google.maps.InfoWindow({

				content : '<b>{businessname}</b><br /><br /><div style="width: 250px; height: 60px;">{businessdesc}</div>',

				position : myLatLng

				});

				infowindow.open(map);

				

				google.maps.event.addListener(map, 'zoom_changed', function() {

				var zoomLevel = map.getZoom();

				map.setCenter(myLatLng);

				infowindow.setContent('<b>{businessname}</b><br /><br /><div style="width: 250px; height: 60px;">{businessdesc}</div>');

				});

				}

				google.maps.event.addDomListener(window, 'load', initialize);

			</script>

			<div id="map-canvas" style=" height:300px; width:800px;"></div>

		</div>
</h4>
<!-- BEGIN: other -->
<h3 class="home_title_thuonghieu"><b>{LANG.detail_others}</b></h3>
{OTHER}
<!-- END: other -->
<!-- BEGIN: other_view -->
<h3 class="home_title_thuonghieu"><b>{LANG.detail_others_view}</b></h3>
{OTHER_VIEW}
<!-- END: other_view -->
<!-- END: main -->

