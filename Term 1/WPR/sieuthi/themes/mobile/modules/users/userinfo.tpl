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

ul.list-tab li a {
    color: #414F5B;
    display: block;
    float: left;
    font-size: 0.8em;
    font-weight: bold;
    padding: 3px 8px 2px;
    text-transform: uppercase;
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

#users .h-info {
    background: none repeat scroll 0 0 #F1F1F1;
    border-bottom: 1px solid #E5E5E5;
    border-top: 1px solid #FFFFFF;
}
.content-box {
    padding: 10px;
}
.left {
    margin-right: 0.875em !important;
}

img.s-border {
    background: none repeat scroll 0 0 #FFFFFF;
    border: 1px solid #D8D8D8;
    padding: 1px;
}

table {
    border-collapse: collapse;
    border-spacing: 0;
}

.mb_tdrow1 {
    background: url("../images/dot.png") repeat-y scroll right 0 #F3F3F3;
    border-bottom: 1px solid #E5E5E5;
    padding: 6px;
}
.mb_tdrow2 {
    background-color: #F8F8FB;
    padding: 4px;
}
</style>
<div id="content" style=" margin-right: 235px;
    padding-right: 25px;">
<div class="woocommerce">
<div id="users">
	<div class="page-header">
		<h3>{LANG.user_info}</h3>
	</div>
	<ul class="list-tab top-option clearfix">
		<li>
			<a href="{URL_HREF}editinfo">{LANG.editinfo}</a>
		</li>
		<li>
			<a href="{URL_HREF}changepass">Đổi mật khẩu</a>
		</li>
		<!-- BEGIN: logout -->
		<li>
			<a href="{URL_HREF}logout">{LANG.logout_title}</a>
		</li>
        <!-- END: logout -->
	</ul>
	<div class="table box-border-shadow">
		<div class="content-box h-info">
			<div class="left fl">
				<img style="width:140px" class="s-border" alt="" src="{SRC_IMG}">
			</div>
			<div style="width:300px; line-height:24px" class="fl">
				{LANG.account2}: <strong>{USER.username}</strong> ({USER.email})
				<br>
				{USER.current_mode}
				<br>
				{LANG.current_login}: {USER.current_login}
				<br>
				{LANG.ip}: {USER.current_ip}
			</div>
		</div>
		<table width="100%" cellspacing="1" cellpadding="0" border="0">
			<tbody><tr>
				<td width="20%" class="mb_tdrow1">{LANG.name}:</td>
				<td class="mb_tdrow2"> {USER.full_name} </td>
			</tr>
			<tr>
				<td width="20%" class="mb_tdrow1">{LANG.birthday}:</td>
				<td class="mb_tdrow2"> {USER.birthday} </td>
			</tr>
			<tr>
				<td width="20%" class="mb_tdrow1">{LANG.gender}:</td>
				<td class="mb_tdrow2">{USER.gender}</td>
			</tr>
			<tr>
				<td width="20%" class="mb_tdrow1">{LANG.address}:</td>
				<td class="mb_tdrow2"> {USER.location} </td>
			</tr>
			<tr>
				<td width="20%" class="mb_tdrow1">{LANG.website}:</td>
				<td class="mb_tdrow2">{USER.website}</td>
			</tr>
			<tr>
				<td width="20%" class="mb_tdrow1">{LANG.yahoo}:</td>
				<td class="mb_tdrow2"> {USER.yim} </td>
			</tr>
			<tr>
				<td width="20%" class="mb_tdrow1">{LANG.phone}:</td>
				<td class="mb_tdrow2">{USER.telephone}</td>
			</tr>
			<tr>
				<td width="20%" class="mb_tdrow1">{LANG.fax}:</td>
				<td class="mb_tdrow2">{USER.fax}</td>
			</tr>
			<tr>
				<td valign="top" class="mb_tdrow1">{LANG.mobile}:</td>
				<td class="mb_tdrow2"> {USER.mobile} </td>
			</tr>
			<tr>
				<td width="20%" class="mb_tdrow1">{LANG.showmail}:</td>
				<td class="mb_tdrow2"> {USER.view_mail} </td>
			</tr>
			<tr>
				<td width="20%" class="mb_tdrow1">{LANG.regdate}:</td>
				<td class="mb_tdrow2"> {USER.regdate} </td>
			</tr>
			<tr>
				<td width="20%" class="mb_tdrow1">{LANG.st_login2}:</td>
				<td class="mb_tdrow2"> {USER.st_login} </td>
			</tr>
			<tr>
				<td width="20%" class="mb_tdrow1">{LANG.last_login}:</td>
				<td class="mb_tdrow2"> {USER.last_login} </td>
			</tr>
		</tbody></table>
	</div>
</div>
</div>
</div>
<!-- END: main -->