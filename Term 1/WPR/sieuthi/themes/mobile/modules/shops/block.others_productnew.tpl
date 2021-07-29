<!-- BEGIN: main -->

                  
                  <div class="carousel-box-content">
                     <div id="carousel1">
                        <ul class="jcarousel-skin-opencartfc">
                            <!-- BEGIN: loop -->
                           <li>
                              <div class="carousel_wrapper">
                                 <div class="boxgrid">
                                    <div class="image">
                                       <a href="{link}">
                                       <img src="{src_img}" alt="image" style="width:190px; height:190px;" />
                                       </a>
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
                                       <!-- BEGIN: price --> <span class="{class_money}">{product_price}{money_unit}</span><!-- END: price --> <br /> <!-- BEGIN: discounts --> <span class="money">{product_discounts}{money_unit}</span><!-- END: discounts --> 						
                                       <!-- BEGIN: sale -->	
                                       <div class="ribbon-sale">{sale}%</div>
                                       <!-- END: sale -->	
                                    </div>
                                 </div>
                              </div>
                           </li>
                            <!-- END: loop -->
                        </ul>
                     </div>
                  </div>
<script type="text/javascript">
                  jQuery(document).ready(function($){
                  
                  
                  function mycarousel_initCallback(carousel)
                  {
                      // Disable autoscrolling if the user clicks the prev or next button.
                      carousel.buttonNext.bind('click', function() {
                          carousel.startAuto(0);
                      });
                  
                      carousel.buttonPrev.bind('click', function() {
                          carousel.startAuto(0);
                      });
                  
                      // Pause autoscrolling if the user moves with the cursor over the clip.
                      carousel.clip.hover(function() {
                          carousel.stopAuto();
                      }, function() {
                          carousel.startAuto();
                      });
                  };
                  
                  $('#carousel1 ul').jcarousel({
                  	initCallback: mycarousel_initCallback,
                  	animation: 300,
                  	vertical: false,
                  	easing: "easeInOutQuad",
                  	auto:  0,
                  	visible: 4,
                  	scroll: 1});
                  
                  });
                   
                  
               </script>
<!-- END: main -->