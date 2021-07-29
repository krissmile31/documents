<!-- BEGIN: main -->


<div class="home-curated-collection">
   <div class="search-result-content">
      <ul class="search-result-items  tiles-container clearfix">
         <li class="grid-tile csmall-tile new-row announement">							
            <img alt="Seen In-Flight" src="{NV_BASE_SITEURL}themes/{TEMPLATE}/images/GOIY.png">			
         </li>
         
           <!-- BEGIN: loop -->
         <li class="grid-tile {A}" >
            <div  class="product-tile">
               <div class="product-image">
                  <a  title="{title}" href="{link}" class="thumb-link">
                     <img title="{title}" alt="{title}" src="{src_img}">
                     <span class="red-curtain">
                        <p>{hometext}</p>
                     </span>
                  </a>
                
               </div>
               <div class="product-text" style="text-align:center">
                  
                  
                  <div class="product-name">
                     <h2 style="font-size: 1em;">
                        <a  title="{title}" href="{link}" class="name-link">
                        {title}
                        </a>
                     </h2>
                  </div>
                  <div class="product-pricing">
                     <div class="product-regular-price">
                     <!-- BEGIN: discounts --> 
                        <div class="product-sales-price">{product_discounts}{money_unit}</div>
                        <!-- END: discounts --> 
                        <!-- BEGIN: price --> 
                         <div class="{class_money}">{product_price}{money_unit}</div>
                         <!-- END: price --> 
                     </div>
                  </div>
                  
                  
               </div>
            </div>
         </li>
         <!-- END: loop --> 
      </ul>
   </div>
</div>

<!-- END: main -->