<!-- BEGIN: main -->
<div class="box">
<div id="product-tabs-0" class="htabs-carousel">
 <ul>
    <li><a href="#product-tab-0-latest">Hàng giá rẻ<span class="arrow-down"></span></a></li>
    <li><a href="#product-tab-0-featured">Bán chạy nhất<span class="arrow-down"></span></a></li>
    <li><a href="#product-tab-0-special">Lively Hàng<span class="arrow-down"></span></a></li>
    <li><a href="#product-tab-0-bestseller">Hàng mới về<span class="arrow-down"></span></a></li>
 </ul>
</div>
<div class="box-content-carousel"  id="product-slideshow0">
 <div class="box-product" id="product-tab-0-latest">
 <!-- BEGIN: tab1 -->
    <div>
       <div class="boxgrid">
          <div class="slides">
             <div class="slides_container">
                <div class="image">
                   <a href="{link}">
                   <img src="{src_img}" alt="" style="width:190px; height:190px;">
                   </a>
                </div>
             </div>
          </div>
          <div class="box-product-info">
             <div class="thumbnail-buttons">
                <div class="more"><a href="{link}" title=""></a></div>
             </div>
          </div>
       </div>
       <div class="boxgrid-bottom">
          <div class="arrow-box"></div>
          <div class="name">
             <a href="{link}">{title}</a>
          </div>
          <div class="rating">
          </div>
          <div class="price">
          		<!-- BEGIN: price -->
                <span class="{class_money}">{product_price} VNĐ</span>
                <!-- END: price -->
                 <br>  
                 <!-- BEGIN: discounts -->
                <span class="money">{discounts} VNĐ</span>	
                <!-- END: discounts -->	
                <!-- BEGIN: sale -->		
                <div class="ribbon-sale">{sale}%</div>	
                 <!-- END: sale -->
            </div>
       </div>
    </div>
    <!-- END: tab1 -->
 </div>
 <div class="box-product" id="product-tab-0-featured">
    
    <!-- BEGIN: tab2 -->
    
    
    <div>
       <div class="boxgrid">
          <div class="slides">
             <div class="slides_container">
                
                <div class="image">
                   <a href="{link}">
                   <img src="{src_img}" alt="" style="width:190px; height:190px;">
                   </a>
                </div>
             </div>
          </div>
          <div class="box-product-info">
             <div class="thumbnail-buttons">
                <div class="more"><a href="{link}" oldtitle="View More" title=""></a></div>
             </div>
          </div>
       </div>
       <div class="boxgrid-bottom">
          <div class="arrow-box"></div>
          <div class="name">
             <a href="{link}">{title}</a>
          </div>
          <div class="rating">
          </div>
          <div class="price">
          		<!-- BEGIN: price -->
               <span class="{class_money}">{product_price} VNĐ</span>
                <!-- END: price -->
                 <br>  
                 <!-- BEGIN: discounts -->
                <span class="money">{discounts} VNĐ</span>	
                <!-- END: discounts -->					
            </div>
       </div>
    </div>
    <!-- END: tab2 -->
 </div>
 <div class="box-product" id="product-tab-0-special">
    <!-- BEGIN: tab3 -->
    <div>
       <div class="boxgrid">
          <div class="slides">
             <div class="slides_container">
                
                <div class="image">
                   <a href="{link}">
                   <img src="{src_img}" alt="" style="width:190px; height:190px;">
                   </a>
                </div>
             </div>
          </div>
          <div class="box-product-info">
             <div class="thumbnail-buttons">
                <div class="more"><a href="{link}" oldtitle="View More" title=""></a></div>
             </div>
          </div>
       </div>
       <div class="boxgrid-bottom">
          <div class="arrow-box"></div>
          <div class="name">
             <a href="{link}">{title}</a>
          </div>
          <div class="rating">
          </div>
          <div class="price">
          		<!-- BEGIN: price -->
                <span class="{class_money}">{product_price} VNĐ</span>
                <!-- END: price -->
                 <br>  
                 <!-- BEGIN: discounts -->
                <span class="money">{discounts} VNĐ</span> 	
                <!-- END: discounts -->					
            </div>
       </div>
    </div>
    <!-- END: tab3 -->
 </div>
 <div class="box-product" id="product-tab-0-bestseller">
    <!-- BEGIN: tab4 -->
    <div>
       <div class="boxgrid">
          <div class="slides">
             <div class="slides_container">
                
                <div class="image">
                   <a href="{link}">
                   <img src="{src_img}" alt="" style="width:190px; height:190px;">
                   </a>
                </div>
             </div>
          </div>
          <div class="box-product-info">
             <div class="thumbnail-buttons">
                <div class="more"><a href="{link}" oldtitle="View More" title=""></a></div>
             </div>
          </div>
       </div>
       <div class="boxgrid-bottom">
          <div class="arrow-box"></div>
          <div class="name">
             <a href="{link}">{title}</a>
          </div>
          <div class="rating">
          </div>
         <div class="price">
          		<!-- BEGIN: price -->
                <span class="{class_money}">{product_price} VNĐ</span>
                <!-- END: price -->
                 <br>  
                 <!-- BEGIN: discounts -->
                <span class="money">{discounts} VNĐ</span>	
                <!-- END: discounts -->					
            </div>
       </div>
    </div>
    <!-- END: tab3 -->
 </div>
</div>
</div>
<script type="text/javascript">
jQuery(document).ready(function($) { 

jQuery('#product-slideshow0  .slides').slides();

jQuery('#product-tabs-0 a').tabs();

});
</script>
<!-- END: main -->