<!-- BEGIN: main -->
<div class="header_border_search">
        <form action="{NV_BASE_SITEURL}" method="get" name="frm_search"  onsubmit="return onsubmitsearch();">
        <div class="form_input">
         <input type="hidden" name="type" value="product" />	
            <input style="width:400px;" type="text" id="keyword"  name="keyword" value="" placeholder="Từ khóa tìm kiếm của bạn ----------" autocomplete="off" /></div>
            <input class="form_submit" type="image" src="{NV_BASE_SITEURL}themes/{TEMPLATE}/images/submit_icon.jpg" alt="Submit" name="submit" id="submit" onclick="onsubmitsearch()" />
        <div class="clear"></div>
        </form>
</div>
<!-- END: main -->