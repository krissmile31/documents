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
		<h3>{LANG.editinfo_pagetitle}</h3>
	</div>
			<ul class="list-tab top-option clearfix">
				<li class="ui-tabs-selected"><a href="{URL_HREF}editinfo">{LANG.editinfo}</a></li>
				<li><a href="{URL_HREF}changepass">{LANG.changepass_title}</a></li>
				<li><a href="{URL_HREF}editinfo&amp;changequestion">{LANG.question2}</a></li>
				<!-- BEGIN: regroups --><li><a href="{URL_HREF}regroups">{LANG.in_group}</a></li><!-- END: regroups -->
				<!-- BEGIN: logout --><li><a href="{URL_HREF}logout">{LANG.logout_title}</a></li><!-- END: logout -->
			</ul>
	<form action="{EDITINFO_FORM}" method="post" class="box-border content-box clearfix bgray" enctype="multipart/form-data">
		<div class="box-border content-box clearfix m-bottom edit-info bwhite">
            <dl class="clearfix">
                <dt class="fl">
                    <label>
                        {LANG.account}
                    </label>
                </dt>
                <dd class="fl">
                    <!-- BEGIN: username_change -->
                    <input class="input" name="username" value="{DATA.username}" id="nv_username_iavim" maxlength="{NICK_MAXLENGTH}" />
                    <!-- END: username_change -->
                    <!-- BEGIN: username_no_change -->
                    <strong>{DATA.username}</strong>
                    <!-- END: username_no_change -->
                </dd>
            </dl>
            <dl class="clearfix">
                <dt class="fl">
                    <label>
                        {LANG.email}
                    </label>
                </dt>
                <dd class="fl">
                    <!-- BEGIN: email_change -->
                    <input class="input" name="email" value="{DATA.email}" id="nv_email_iavim" maxlength="100" />
                    <!-- END: email_change -->
                    <!-- BEGIN: email_no_change -->
                    <strong>{DATA.email}</strong>
                    <!-- END: email_no_change -->
                </dd>
            </dl>
            <dl class="clearfix">
                <dt class="fl">
                    <label>
                        {LANG.name}
                    </label>
                </dt>
                <dd class="fl">
                    <input class="input" name="full_name" value="{DATA.full_name}" maxlength="255" />
                </dd>
            </dl>
            <dl class="clearfix">
                <dt class="fl">
                    <label>
                        {LANG.gender}
                    </label>
                </dt>
                <dd class="fl">
                    <select name="gender">
                        <!-- BEGIN: gender_option -->
                        <option value="{GENDER.value}"{GENDER.selected}>{GENDER.title}</option>
                        <!-- END: gender_option -->
                    </select>
                </dd>
            </dl>
            <dl class="clearfix">
                <dt class="fl">
                    <label>
                        {LANG.avata} (80x80)
                    </label>
                </dt>
                <dd class="fl">
                    <input type="file" name="avatar" />
                </dd>
            </dl>
            <dl class="clearfix">
                <dt class="fl">
                    <label>
                        {LANG.birthday}
                    </label>
                </dt>
                <dd class="fl">
                    <input name="birthday" id="birthday" value="{DATA.birthday}" style="width: 150px;text-align:left" class="input" maxlength="10" readonly="readonly" type= "text" />
                    <img src="{NV_BASE_SITEURL}images/calendar.jpg" style="cursor: pointer; vertical-align: middle;" onclick="popCalendar.show(this, 'birthday', 'dd.mm.yyyy', true);" alt="" height="17" />
                </dd>
            </dl>
            <dl class="clearfix">
                <dt class="fl">
                    <label>
                        {LANG.website}
                    </label>
                </dt>
                <dd class="fl">
                    <input type="text" class="input" name="website" value="{DATA.website}" maxlength="255" />
                </dd>
            </dl>
            <dl class="clearfix">
                <dt class="fl">
                    <label>
                        {LANG.address}
                    </label>
                </dt>
                <dd class="fl">
                    <input type="text" class="input" name="address" value="{DATA.address}" maxlength="255" />
                </dd>
            </dl>
            <dl class="clearfix">
                <dt class="fl">
                    <label>
                        {LANG.yahoo}
                    </label>
                </dt>
                <dd class="fl">
                    <input type="text" class="input" name="yim" value="{DATA.yim}" maxlength="100" />
                </dd>
            </dl>
            <dl class="clearfix">
                <dt class="fl">
                    <label>
                        {LANG.phone}
                    </label>
                </dt>
                <dd class="fl">
                    <input type="text" class="input" name="telephone" value="{DATA.telephone}" maxlength="100" />
                </dd>
            </dl>
            <dl class="clearfix">
                <dt class="fl">
                    <label>
                        {LANG.fax}
                    </label>
                </dt>
                <dd class="fl">
                    <input type="text" class="input" name="fax" value="{DATA.fax}" maxlength="100" />
                </dd>
            </dl>
            <dl class="clearfix">
                <dt class="fl">
                    <label>
                        {LANG.mobile}
                    </label>
                </dt>
                <dd class="fl">
                    <input type="text" class="input" name="mobile" value="{DATA.mobile}" maxlength="100" />
                </dd>
            </dl>
            <dl class="clearfix">
                <dt class="fl">
                    <label>
                        {LANG.showmail}
                    </label>
                </dt>
                <dd class="fl">
                    <select name="view_mail">
                        <option value="0">{LANG.no}</option>
                        <option value="1"{DATA.view_mail}>{LANG.yes}</option>
                    </select>
                </dd>
            </dl>
		</div>	
        <div class="aright">
			<input type="hidden" name="checkss" value="{DATA.checkss}" />
			<input name="submit" type="submit" class="button" value="{LANG.editinfo_confirm}" />
        </div>
    </form>
</div>
</div>
</div>
<!-- END: main -->