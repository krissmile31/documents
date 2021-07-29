function ShowDiv(id){
	if($('#'+id).is(':hidden')) {
		$('#'+id).slideDown();
	}else{
		$('#'+id).slideUp();
	}
}
function ShowTab(id){
	$('.tab').removeClass('active');
	$('#tab_'+id).addClass('active');
	$('.tab_category').hide();
	$('#content_tab_'+id).show();
}
function ShowTabProdcut(id){
	$('.tab_title').removeClass('current');
	$('#tab_title_'+id).addClass('current');
	$('.tab_content').hide();
	$('#tabs_pro_'+id).show();
}
function closePopupHow(){
	$('#PopupHow').hide();
}
function showPopupHow(){
	$('#PopupHow').show();
}
