<!-- BEGIN: main -->
		<div class="product_cat_title">
				<h2><a href="{LINK_CATALOG}" title="{TITLE_CATALOG}" class="title">{TITLE_CATALOG}</a></h2>
				<a href="{LINK_CATALOG}" title="{LANG.view}" class="view">&raquo; {LANG.view}</a>
				<div class="clear"></div>
			</div>
			<div class="product_list_big">
            <!-- BEGIN: loop -->
				<div class="product_list">
						<a href="{link}" class="product_thongso">
							<div>
								<h3 class="list_thongso_name">{title}</h3>
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
                        <a href="{link}" title="{title}">
                        <img src="{src_img}" alt="" style="width:147px; " /></a>
                        </div>
						<h2 class="product_name"><a href="{link}" title="{title}">{title}</a></h2>
                        <!-- BEGIN: price -->
						<div class="{class_money}"><span style="font-size:12px;">{LANG.deal_original_price}</span> : {product_price} đ</div>
                        <!-- END: price -->
                        <!-- BEGIN: discounts -->
						<div class="money"><span  style="font-size:12px;">{LANG.deal_original_buy}</span> : {product_discounts} đ</div>
                        <!-- END: discounts -->
					</div>
            <!-- END: loop -->
								<div class="clear"></div>
			</div>
<!-- END: main -->