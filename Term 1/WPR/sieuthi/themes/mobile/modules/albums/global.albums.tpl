<!-- BEGIN: main -->
    <div id="flexslider3" class="flexslider">
       <ul class="slides">
        <!-- BEGIN: loop -->
          <li class="clone">
             <a href="javascript:void(0);">
                <div class="bigimage" style="background:url({ROW.img_small})no-repeat 50% 0;width:100%;height:340px"></div>
                <img class="slide_img" src="{ROW.img_small}" alt=""/>
             </a>
         <!-- END: loop -->  
          </li>
       </ul>
    </div>
    <script type="text/javascript">
       jQuery(document).ready(function($){
        $('#flexslider3').flexslider({
       slideshow: true, // Setup a slideshow for the slider to animate automatically (true or false).
       animation: "slide", // Controls the animation type (changeable through admin panel).
       pauseOnHover: true, // Pause the slideshow when hovering over slider, then resume when no longer hovering (true or false).
       pauseOnAction: true, // Pause the slideshow when interacting with control elements (true or false).
       touch: true, // Allow touch swipe navigation of the slider on enabled devices (true or false).
       animationSpeed: 600, // Set the speed of animations, in milliseconds.
       slideshowSpeed: 6500, // Set the speed of the slideshow cycling, in milliseconds.
       smoothHeight: false, // Animate the height of the slider smoothly for slides of varying image height (true or false).
       controlNav: true, // Create navigation for paging control of each slide (true or false).
       directionNav: true, // Create previous/next arrow navigation (true or false).
       direction: "horizontal", // Controls the animation direction ("horizontal" or "vertical").
       useCSS: false // Fixes black screen issue on Saffari (do not change this!!!).
       }); 
       
       
       $("#full-width-slider .scroll-down").click(function() {
       $('html, body').animate({
       scrollTop: $("#scroll-down-target").offset().top
       }, 600);
       }); 
       
       });
       
    </script>
<!-- END: main -->