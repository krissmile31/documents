<!-- BEGIN: main -->
<div class="product_detail_other">
<!-- BEGIN: items -->
   <div class="product_list">
						<a href="{LINK}" class="product_thongso">
							<div>
								<h3 class="list_thongso_name">{TITLE0}</h3>
                                <!-- BEGIN: price1 -->
								<div class="{class_money}"> <span style="font-size:12px;">{LANG.deal_original_price}</span> : {product_price} đ</div>
                                <!-- END: price1 -->
                                <!-- BEGIN: discounts1 -->
                                <div class="money"><span style="font-size:12px;">{LANG.deal_original_buy}</span> : {product_discounts} đ</div>
                                <!-- END: discounts1 -->
								<ul>
									<li class="list_thongso">{hometext}</li>
								</ul>
							</div>
						</a>
						<div class="product_piture">
                        <a href="{LINK}" title="{TITLE0}">
                        <img src="{IMG_SRC}" alt="" style="width:147px; height:150px;" /></a>
                        </div>
						<h2 class="product_name"><a href="{LINK}" title="{TITLE0}">{TITLE0}</a></h2>
                        <!-- BEGIN: price -->
						<div class="{class_money}"><span style="font-size:12px;">{LANG.deal_original_price}</span> : {product_price} đ</div>
                        <!-- END: price -->
                        <!-- BEGIN: discounts -->
						<div class="money"><span  style="font-size:12px;">{LANG.deal_original_buy}</span> : {product_discounts} đ</div>
                        <!-- END: discounts -->
					</div>
                    <!-- END: items -->
   <div class="clear"></div>
</div>
<!-- BEGIN: pages -->

<div class="pages">
	{generate_page}
</div>
<!-- END: pages -->
<!-- END: main -->