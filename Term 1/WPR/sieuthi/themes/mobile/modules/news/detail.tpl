

<!-- BEGIN: main -->
<h1 class="type_category_title">
   <a class="tab active">{DETAIL.title}</a>
   <div class="clear"></div>
</h1>
<div style="display:block;" class="tab_category type_category_content">
   <h2 class="detail_news_teaser">
      <p><span style="text-align: justify;">{DETAIL.hometext}</span></p>
   </h2>
   <div class="detail_news_description">
		{DETAIL.bodytext}
   </div>
   <!-- BEGIN: related -->
   <div class="detail_news_other_title">{LANG.related}</div>
   <ul class="detail_news_other">
   <!-- BEGIN: loop -->
      <li>
         <h3><a href="{RELATED.link}">{RELATED.title}</a></h3>
      </li>
   <!-- END: loop -->
   </ul>
   <!-- END: related -->
</div>
<!-- END: main -->
<!-- BEGIN: no_permission -->
<div id="no_permission">
   <p>
      {NO_PERMISSION}
   </p>
</div>
<!-- END: no_permission -->

