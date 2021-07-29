<!-- BEGIN: main -->
<style type="text/css">
	.users {
    background: none repeat scroll 0 0 #FFFFFF;
    border: 1px solid #CCCCCC;
    border-radius: 2px;
    margin: auto;
}
.users .uheader {
    background: none repeat scroll 0 0 #F4F4F4;
    border-bottom: 1px solid #CCCCCC;
    font-size: 15px;
    font-weight: bold;
    padding: 10px;
}
.fl {
    float: left;
}
.social a {
    float: left;
    margin-right: 8px;
    margin-top: 30px;
}
.facebook_icon {
    background: url("../images/users/socials_icon.png") no-repeat scroll 0 0 rgba(0, 0, 0, 0);
    display: block;
    height: 61px;
    width: 59px;
}
.form_log {
    padding-bottom: 10px;
}
.form_log p {
    margin-bottom: 2px;
    margin-top: 10px;
}
.clearfix:after {
    clear: both;
    content: ".";
    display: block;
    height: 0;
    line-height: 0;
    visibility: hidden;
}

.form_log input[type="text"], .form_log input[type="password"] {
    background: none repeat scroll 0 0 #FFFFFF;
    border: 1px solid #DDDDDD;
    border-radius: 3px;
    height: 38px;
    margin-top: 5px;
    padding: 0 10px;
    width: 340px;
}
input[type="text"] {
    border: 1px solid #CCCCCC;
    padding: 2px;
}
input, select, textarea {
    font-size: 100%;
}

.form_log input[type="text"], .form_log input[type="password"] {
    background: none repeat scroll 0 0 #FFFFFF;
    border: 1px solid #DDDDDD;
    border-radius: 3px;
    height: 38px;
    margin-top: 5px;
    padding: 0 10px;
    width: 340px;
}
input, select, textarea {
    font-size: 100%;
}

.form_log .submit {
    background: linear-gradient(to bottom, #FC915F 0px, #F76C4A 100%) repeat scroll 0 0 rgba(0, 0, 0, 0);
    border: 0 none;
    border-radius: 2px;
    color: #FFFFFF;
    cursor: pointer;
    float: left;
    font-size: 14px;
    height: 35px;
    margin-right: 1px;
    text-shadow: 0 1px rgba(0, 0, 0, 0.1);
    width: 113px;
}
input[type="button"], input[type="submit"] {
    background: url("../images/ads/bg_button.png") repeat-x scroll 0 0 rgba(0, 0, 0, 0);
    border: 1px solid #CECECE;
    border-radius: 3px;
    cursor: pointer;
    font-family: Tahoma;
    font-size: 8pt;
    padding: 3px;
}
input, select, textarea {
    font-size: 100%;
}

.form_log .register {
    background: linear-gradient(to bottom, #FC915F 0px, #F76C4A 100%) repeat scroll 0 0 rgba(0, 0, 0, 0);
    border: 0 none;
    border-radius: 2px;
    color: #FFFFFF;
    cursor: pointer;
    float: left;
    font-size: 14px;
    height: 35px;
    line-height: 35px;
    margin-right: 1px;
    padding: 0 10px;
    text-align: center;
    text-shadow: 0 1px rgba(0, 0, 0, 0.1);
}
a:link, a:active, a:visited {
    color: #006699;
    text-decoration: none;
}
</style>
<div id="content" style=" margin-right: 235px;
    padding-right: 25px;">
<div class="woocommerce">
<div class="users">
	<h2 class="uheader">Đăng nhập</h2>
	<div style="padding:10px">
    <form  id="loginForm" class="clearfix" method="post" action="{USER_LOGIN}">
        
		<div style="width:350px; padding:10px" class="fl clearfix">
            <p style="font-size:14px">
                {LANG.login} <strong></strong> 
            </p>
            <div class="form_log">
            	
                <p>{LANG.account}</p>
                <div class="clearfix">
                    <input type="text" tabindex="1" id="login_iavim" name="nv_login" value="{DATA.nv_login}" maxlength="{NICK_MAXLENGTH}">
                </div>
                <p>{LANG.password} - <a tabindex="3" href="{USER_LOSTPASS}" title="{LANG.lostpass}">{LANG.lostpass}?</a></p>
                <div class="clearfix">
                    <input type="password" id="password_iavim" name="nv_password" value="{DATA.nv_password}" tabindex="2"  maxlength="{PASS_MAXLENGTH}">
                 </div>
                 <!-- BEGIN: captcha -->
            <div class="clearfix r2">
                <label style="margin-left:20px;">
                    {LANG.captcha}
                </label>
                <img id="vimglogin" alt="{N_CAPTCHA}" title="{N_CAPTCHA}" src="{SRC_CAPTCHA}" width="{GFX_WIDTH}" height="{GFX_HEIGHT}" /><img src="{CAPTCHA_REFR_SRC}" class="refesh" alt="{CAPTCHA_REFRESH}" onClick="nv_change_captcha('vimglogin','seccode_iavim');"/>
            </div>
            <div class="clearfix r2">
                <label style="margin-left:20px;">
                    {LANG.retype_captcha}
                </label>
                <input name="nv_seccode" id="seccode_iavim" class="required" maxlength="{GFX_MAXLENGTH}" />
            </div><!-- END: captcha -->
                <div style="margin-top:10px">
                    <input name="nv_redirect" value="{DATA.nv_redirect}" type="hidden">
                    <input type="submit" tabindex="4" class="submit" value="{LANG.login_submit}">
                    <a class="register" href="{USER_REGISTER}" title="{LANG.register}">{LANG.register}</a>
                </div>
            </div>
		</div>
	</form>
    </div>
</div>
</div>
</div>
<!-- END: main -->
