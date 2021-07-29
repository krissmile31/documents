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
		<h3>{LANG.change_question_pagetitle}</h3>
	</div>
	<ul class="list-tab top-option clearfix">
		<li><a href="{URL_HREF}editinfo">{LANG.editinfo}</a></li>
		<li><a href="{URL_HREF}changepass">{LANG.changepass_title}</a></li>
		<li class="ui-tabs-selected"><a href="{URL_HREF}editinfo&amp;changequestion">{LANG.question2}</a></li>
		<!-- BEGIN: logout --><li><a href="{URL_HREF}logout">{LANG.logout_title}</a></li><!-- END: logout -->
	</ul>
	<div class="note m-bottom">
		<strong>{LANG.changequestion_info}</strong>
		<ol>
			<li>
			{LANG.changequestion_info1}
			</li>
			<li>
			{LANG.changequestion_info2}
			</li>
		</ol>
	</div>
    <!-- BEGIN: step1 -->
	<form id="changeQuestionForm" class="box-border-shadow content-box clearfix" action="{FORM1_ACTION}" method="post">
        <p>
            <strong>{DATA.info}</strong>
        </p>
        <div class="clearfix rows">
            <label>
                {LANG.password}
            </label>
            <input class="required password input" name="nv_password" id="nv_password_iavim" type="password" maxlength="{PASS_MAXLENGTH}" />
        </div>
		<div class="clearfix rows">
            <label>
                &nbsp;
            </label>
            <input type="hidden" name="checkss" value="{DATA.checkss}" />
			<input type="submit" value="{LANG.changequestion_submit1}" class="button" />
        </div>
    </form>
    <!-- END: step1 -->
    <!-- BEGIN: step2 -->
<script type="text/javascript">
    function question_change()
    {
        var question_option = document.getElementById( 'question' ).options[document.getElementById( 'question' ).selectedIndex].value;
        document.getElementById( 'question' ).value = '0';
        document.getElementById( 'your_question' ).value = question_option;
        document.getElementById( 'your_question' ).focus();
        return;
    } 
</script>
	<form id="changeQuestionForm" class="box-border-shadow content-box clearfix change-question" action="{FORM2_ACTION}" method="post">
        <p>
            <strong>{DATA.info}</strong>
        </p>
            <div class="clearfix rows">
                    <label>
                        {LANG.question}
                    </label>
                    <select name="question" id="question" onchange="question_change();">
                        <!-- BEGIN: frquestion -->
                        <option value="{QUESTIONVALUE}">{QUESTIONTITLE}</option>
                        <!-- END: frquestion -->
                    </select>
            </div>
            <div class="clearfix rows">
                    <label>
                        {LANG.your_question}
                    </label>
                    <input class="required input" name="your_question" id="your_question" value="{DATA.your_question}" />
            </div>
            <div class="clearfix rows">
                    <label>
                        {LANG.answer_your_question}
                    </label>
                    <input class="required input" name="answer" value="{DATA.answer}" />
            </div>
			<div class="clearfix rows">
                    <label>
                        &nbsp;
                    </label>
                    <input type="hidden" name="nv_password" value="{DATA.nv_password}" />
					<input type="hidden" name="checkss" value="{DATA.checkss}" />
					<input type="hidden" name="send" value="1" />
					<input type="submit" value="{LANG.changequestion_submit2}" class="button" />
            </div>
        
    </form>
    <!-- END: step2 -->
</div>
</div>
</div>
<!-- END: main -->