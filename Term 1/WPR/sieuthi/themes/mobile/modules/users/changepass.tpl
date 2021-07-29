<!-- BEGIN: main -->
<style type="text/css">
	
#users {
    margin: auto;
    padding: 10px;
}

.page-header {
    padding-bottom: 5px;
}

#bodyReg h2, #bodyReg h3 {
    color: #0387D8;
}

.clearfix:after {
    clear: both;
    content: ".";
    display: block;
    height: 0;
    line-height: 0;
    visibility: hidden;
}
#users .top-option {
    padding: 0;
}

ul.list-tab li {
    background: none repeat scroll 0 0 #F1F1F1;
    border-color: #E5E5E5 #E5E5E5 #F1F1F1;
    border-radius: 3px 3px 0 0;
    border-style: solid;
    border-width: 1px 1px 2px;
    display: block;
    float: left;
    margin-right: 2px;
}

ul.list-tab li.ui-tabs-selected {
    background: url("../images/bgregis.png") repeat-x scroll center center #304EA6;
    border-color: #3C5DB4;
}
ul.list-tab li {
    background: none repeat scroll 0 0 #F1F1F1;
    border-color: #E5E5E5 #E5E5E5 #F1F1F1;
    border-radius: 3px 3px 0 0;
    border-style: solid;
    border-width: 1px 1px 2px;
    display: block;
    float: left;
    margin-right: 2px;
}

ul.list-tab li a {
    color: #414F5B;
    display: block;
    float: left;
    font-size: 0.8em;
    font-weight: bold;
    padding: 3px 8px 2px;
    text-transform: uppercase;
}
ins, a {
    text-decoration: none;
}

ul.list-tab li.ui-tabs-selected a {
    color: #FFFFFF;
}
ul.list-tab li a {
    color: #414F5B;
    display: block;
    float: left;
    font-size: 0.8em;
    font-weight: bold;
    padding: 3px 8px 2px;
    text-transform: uppercase;
}
ins, a {
    text-decoration: none;
}

.clearfix:after {
    clear: both;
    content: ".";
    display: block;
    height: 0;
    line-height: 0;
    visibility: hidden;
}
html[xmlns] .clearfix {
    display: block;
}
.box-border-shadow {
    -moz-border-bottom-colors: none;
    -moz-border-left-colors: none;
    -moz-border-right-colors: none;
    -moz-border-top-colors: none;
    background: url("../images/dot.png") repeat-x scroll 0 bottom rgba(0, 0, 0, 0);
    border-color: #E5E5E5 #E5E5E5 #F1F1F1;
    border-image: none;
    border-style: solid;
    border-width: 1px 1px 2px;
    height: 1%;
}

table {
    border-collapse: collapse;
    border-spacing: 0;
}
.mb_bgtitle {
    background: url("../images/bgregis.png") repeat-x scroll center center rgba(0, 0, 0, 0);
    border-bottom: 1px solid #E5E5E5;
    color: #FFFFFF;
    padding: 6px 6px 7px;
    width: 100%;
}

.mb_bgtitle span {
    color: #FFFFFF;
}
.info {
    background: url("../images/warning_16.png") no-repeat scroll 0 center rgba(0, 0, 0, 0);
    color: #3B454F;
    font: bold 12px/10px Arial,Helvetica,sans-serif;
    padding-bottom: 10px;
    padding-left: 25px;
    padding-top: 10px;
    text-align: left;
}
</style>
<div id="content" style=" margin-right: 235px;
    padding-right: 25px;">
<div class="woocommerce">
<div id="users">
	<div class="page-header">
		<h3>{LANG.change_pass}</h3>
	</div>
	<ul class="list-tab top-option clearfix">
		<li>
			<a href="{URL_HREF}editinfo">{LANG.editinfo}</a>
		</li>
		<li class="ui-tabs-selected">
			<a href="{URL_HREF}changepass">{LANG.changepass_title}</a>
		</li>
        <!-- BEGIN: logout -->
		<li>
			<a href="{URL_HREF}logout">{LANG.logout_title}</a>
		</li>
        <!-- END: logout -->
	</ul>
	<form class="box-border-shadow clearfix" id="changePassForm" action="{USER_CHANGEPASS}" method="post">
		<table width="100%" cellspacing="1" cellpadding="0" border="0">
			<tbody><tr>
				<td style="background: #404040;" colspan="2" class="mb_bgtitle"><span class="info">
                Để thay đổi mật khẩu bạn cần điền đầy đủ các thông tin sau</span></td>
			</tr>
            <!-- BEGIN: passEmpty -->
				<tr>
				<td class="mb_tdrow1">{LANG.pass_old}:</td>
				<td class="mb_tdrow2">
				<input type="password" id="nv_password_iavim" name="nv_password" value="{DATA.nv_password}" class="fieldtext" maxlength="{PASS_MAXLENGTH}">
				</td>
			</tr>
			<!-- END: passEmpty -->
			<tr>
				<td class="mb_tdrow1">{LANG.pass_new}:</td>
				<td class="mb_tdrow2">
				<input type="password" id="new_password_iavim" name="new_password" value="{DATA.new_password}" class="fieldtext" maxlength="{PASS_MAXLENGTH}">
				</td>
			</tr>
			<tr>
				<td class="mb_tdrow1">{LANG.pass_new_re}:</td>
				<td class="mb_tdrow2">
				<input type="password" id="re_password_iavim" name="re_password" value="{DATA.re_password}" class="fieldtext"  maxlength="{PASS_MAXLENGTH}">
				</td>
			</tr>
			<tr>
				<td align="center" colspan="2" class="mb_tdrow1" style="padding: 6px;">
				<input type="hidden" name="checkss" value="{DATA.checkss}">
				<input type="submit" value="{LANG.change_pass}" class="button">
				</td>
			</tr>
		</tbody></table>
	</form>
</div></div></div>
<!-- END: main -->