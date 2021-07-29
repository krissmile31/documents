<!-- BEGIN: main -->
<style type="text/css">
	
.woocommerce-ordering, .itemsPerPage {
    -moz-box-orient: vertical;
    display: inline-block;
    float: right;
    vertical-align: top;
}
.woocommerce-ordering {
    position: relative;
    top: 13px;
}
.itemsPerPage, .woocommerce-ordering {
    margin-top: -18px;
}
.woocommerce-ordering {
    background: none repeat scroll 0 0 #FFFFFF;
    padding-left: 10px;
}

.woocommerce-ordering .orderby {
    background: none repeat scroll 0 0 rgba(0, 0, 0, 0);
    border: 1px solid #DDDDDD;
    color: #666666;
    font-size: 11px;
    line-height: 11px;
    padding: 8px 5px 8px 10px;
    text-transform: uppercase;
}
select {
    background-color: #FFFFFF;
    border-color: #DDDDDD;
    border-radius: 2px;
    border-style: solid;
    border-width: 1px;
    color: #42494D;
    margin-top: 5px;
    outline: medium none;
    padding: 7px;
}
</style>
          [MENU_CON]
      <div class="type_category_title">
  <a onclick="ShowTab(0)" id="tab_0" class="tab active">Sản phẩm {CAT_NAME}</a>
  <div style="float:right;">
<form method="get" class="woocommerce-ordering" >
<select class="orderby" name="sort" id="sort" onchange="changesort(this.value,'{OPST}','{view}')">
<!-- BEGIN: sort -->
<option {select} value="{sort}">{value}</option>
<!-- END: sort -->
</select>
<input type="hidden" value="desktop" name="product_cat">
</form>
</div>
  <div class="clear"></div>
</div>
<h3 id="content_tab_1" class="tab_category type_category_content"></h3>
<div id="content_tab_0" class="tab_category product_list_big">
<!-- BEGIN: grid_rows -->
          <div class="product_list">
						<a href="{link_pro}" class="product_thongso">
							<div>
								<h3 class="list_thongso_name">{title_pro}</h3>
                                <!-- BEGIN: price1 -->
								<div class="{class_money}"> <span style="font-size:12px;">{LANG.deal_original_price}</span> : {product_price} đ</div>
                                <!-- END: price1 -->
                                <!-- BEGIN: discounts1 -->
                                <div class="money"><span style="font-size:12px;">{LANG.deal_original_buy}</span> : {product_discounts} đ</div>
                                <!-- END: discounts1 -->
								<ul>
									<li class="list_thongso">{intro}</li>
								</ul>
							</div>
						</a>
						<div class="product_piture">
                        <a href="{link_pro}" title="{title_pro}">
                        <img src="{img_pro}" alt="" style="width:147px; height:150px;" /></a>
                        </div>
						<h2 class="product_name"><a href="{link_pro}" title="{title_pro0}">{title_pro}</a></h2>
                        <!-- BEGIN: price -->
						<div class="{class_money}"><span style="font-size:12px;">{LANG.deal_original_price}</span> : {product_price} đ</div>
                        <!-- END: price -->
                        <!-- BEGIN: discounts -->
						<div class="money"><span  style="font-size:12px;">{LANG.deal_original_buy}</span> : {product_discounts} đ</div>
                        <!-- END: discounts -->
					</div>
                    <!-- END: grid_rows -->
              <div class="clear"></div>
  <div class="phantrang">
  {pages}
  </div>			
</div>
<!-- END: main -->