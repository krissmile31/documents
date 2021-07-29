<!-- BEGIN: main -->
<style>
.coin-slider{ float:left; margin-right:10px; margin-top:10px;}
.coin-slider { overflow: hidden; zoom: 1; position: relative; }
.cs-buttons { font-size: 0px; padding: 3px; float: left; margin-top:-25px; }
.cs-buttons a { margin-left: 5px; height: 12px; width: 12px; float: left; text-indent: -1000px; }
.cs-button-slide_top,.cs-button-slide_top_2{ height:12px; width:12px; background-color:#FFFFFF; border:1px #FFFFFF solid;
	-webkit-border-radius: 500px;
	-moz-border-radius: 500px;
	border-radius: 500px;
	behavior: url(PIE.html);
}
.cs-active { background-color:#ED1C24;
	-webkit-border-radius: 500px;
	-moz-border-radius: 500px;
	border-radius: 500px;
	behavior: url(PIE.html);
}
.cs-prev,.cs-next { color: #FFFFFF; display:none;} 
</style>
<div id="coin-slider-slide_top" class="coin-slider">
	<div id="slide_top">
     <script type="text/javascript" src="{NV_BASE_SITEURL}themes/{TEMPLATE}/js/jssor.core.js"></script>
    <script type="text/javascript" src="{NV_BASE_SITEURL}themes/{TEMPLATE}/js/jssor.utils.js"></script>
    <script type="text/javascript" src="{NV_BASE_SITEURL}themes/{TEMPLATE}/js/jssor.slider.js"></script>
    <script type="text/javascript">
        jssor_slider1_starter = function (containerId) {

            var options = {
                $DragOrientation: 3,                                //[Optional] Orientation to drag slide, 0 no drag, 1 horizental, 2 vertical, 3 either, default value is 1 (Note that the $DragOrientation should be the same as $PlayOrientation when $DisplayPieces is greater than 1, or parking position is not 0)
                $SlideDuration: 800,                                //[Optional] Specifies default duration (swipe) for slide in milliseconds, default value is 500

                $DirectionNavigatorOptions: {                       //[Optional] Options to specify and enable direction navigator or not
                    $Class: $JssorDirectionNavigator$,              //[Requried] Class to create direction navigator instance
                    $ChanceToShow: 2,                               //[Required] 0 Never, 1 Mouse Over, 2 Always
                    $AutoCenter: 2,                                 //[Optional] Auto center arrows in parent container, 0 No, 1 Horizontal, 2 Vertical, 3 Both, default value is 0
                    $Steps: 1                                       //[Optional] Steps to go for each navigation request, default value is 1
                }
            };

            var jssor_slider1 = new $JssorSlider$(containerId, options);
        };
    </script>
    <div id="slider1_container" style="position: relative; width: 960px; height: 263px; overflow: hidden;">
 
        <!-- Slides Container --> 
        <div u="slides" style="cursor: move; position: absolute; left: 0px; top: 0px; width: 960px; height: 380px;
            overflow: hidden;">
            <!-- BEGIN: loop -->
            <div><a href="{ROW.links}"><img u="image" src="{ROW.images}" /></a></div>
            <!-- END: loop -->
        </div> 
        
        <!-- Direction Navigator Skin Begin -->
        <style>
            /* jssor slider direction navigator skin 01 css */
            /*
            .jssord01l              (normal)
            .jssord01r              (normal)
            .jssord01l:hover        (normal mouseover)
            .jssord01r:hover        (normal mouseover)
            .jssord01ldn            (mousedown)
            .jssord01rdn            (mousedown)
            */
            .jssord01l, .jssord01r, .jssord01ldn, .jssord01rdn
            {
            	position: absolute;
            	cursor: pointer;
            	display: block;
                background: url('{NV_BASE_SITEURL}themes/{TEMPLATE}/images/d01.png') no-repeat;
                overflow:hidden;
            }
            .jssord01l { background-position: -8px -38px; }
            .jssord01r { background-position: -68px -38px; }
            .jssord01l:hover { background-position: -128px -38px; }
            .jssord01r:hover { background-position: -188px -38px; }
            .jssord01ldn { background-position: -8px -38px; }
            .jssord01rdn { background-position: -68px -38px; }
        </style>
        <span u="arrowleft" class="jssord01l" style="width: 45px; height: 45px; top: 123px; left: 8px;">
        </span>
        <span u="arrowright" class="jssord01r" style="width: 45px; height: 45px; top: 123px; right: 8px">
        
        <script>
            jssor_slider1_starter('slider1_container');
        </script>
    </div>
    </div>  
    </div>
<!-- END: main -->
