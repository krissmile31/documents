<!-- BEGIN: main -->

		<div class="right_sptb_content">
        <!-- BEGIN: loop -->
			<div class="right_product_list ">
					<div class="product_piture">
                    <a href="{link}" title="{title}">
                    <img src="{src_img}" alt="{title}" style=" width:132px; height:150px;" /></a>
                    </div>
					<div class="product_name">
                    <a href="{link}" title="{title}" style="font-weight:bold;">{title}</a>
                    </div>
                    <br />
                     <!-- BEGIN: price --> 
					<div class="{class_money}"><span style="font-size:11px;">{LANG.deal_original_price}</span> :{product_price} đ</div>
                     <!-- END: price --> 
                     <!-- BEGIN: discounts --> 
                    <div class="money"><span  style="font-size:11px;">{LANG.deal_original_buy}</span> : {product_discounts} đ</div>
                    <!-- END: discounts --> 
				</div>
         <!-- END: loop -->
		<div class="clear"></div>
		</div>
<!-- END: main -->