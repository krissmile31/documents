<?php

/**

 * @Author VINAGON CO.,LTD (info@vinagon.com)

 * @Copyright (C) 2012 VINAGON CO.,LTD. All rights reserved

 * @Createdate 29/04/2012 23:25

 */

if (!defined('NV_MAINFILE'))
	die('Stop!!!');

if (!nv_function_exists('nv_global_facebook_like')) {
	function nv_block_config_facebook_like_blocks($module, $data_block, $lang_block) {
		global $db, $language_array, $site_mods;
		$html = "";
		$html .= "<tr>";
		$html .= "	<td>" . $lang_block['nickfb'] . "</td>";
		$html .= "	<td><input type=\"text\" name=\"config_nickfb\" size=\"25\" value=\"" . $data_block['nickfb'] . "\"/></td>";
		$html .= "</tr>";
		$html .= "<tr>";
		$html .= "	<td>" . $lang_block['width'] . "</td>";
		$html .= "	<td><input type=\"text\" name=\"config_width\" size=\"5\" value=\"" . $data_block['width'] . "\"/></td>";
		$html .= "</tr>";
		$html .= "<tr>";
		$html .= "	<td>" . $lang_block['height'] . "</td>";
		$html .= "	<td><input type=\"text\" name=\"config_height\" size=\"5\" value=\"" . $data_block['height'] . "\"/></td>";
		$html .= "</tr>";
		$array_color = array('light', 'dark');
		$html .= "<tr>";
		$html .= "	<td>" . $lang_block['color'] . "</td>";
		$html .= "	<td>";
		$html .= "<select name=\"config_color\">\n";
		foreach ($array_color as $key1 => $val1) {
			$html .= "<option value=\"" . $val1 . "\"" . ($val1 == $data_block['color'] ? " selected=\"selected\"" : "") . ">" . $val1 . "</option>\n";
		}
		$html .= "</select>\n";
		$html .= "	</td>";
		$html .= "</tr>";
		$array_faces = array('true', 'false');
		$html .= "<tr>";
		$html .= "	<td>" . $lang_block['faces'] . "</td>";
		$html .= "	<td>";
		$html .= "<select name=\"config_faces\">\n";
		foreach ($array_faces as $key2 => $val2) {
			$html .= "<option value=\"" . $val2 . "\"" . ($val2 == $data_block['faces'] ? " selected=\"selected\"" : "") . ">" . $val2 . "</option>\n";
		}
		$html .= "</select>\n";
		$html .= "	</td>";
		$html .= "</tr>";
		$array_stream = array('true', 'false');
		$html .= "<tr>";
		$html .= "	<td>" . $lang_block['stream'] . "</td>";
		$html .= "	<td>";
		$html .= "<select name=\"config_stream\">\n";
		foreach ($array_stream as $key3 => $val3) {
			$html .= "<option value=\"" . $val3 . "\"" . ($val3 == $data_block['stream'] ? " selected=\"selected\"" : "") . ">" . $val3 . "</option>\n";
		}
		$html .= "</select>\n";
		$html .= "	</td>";
		$html .= "</tr>";
		$array_header = array('true', 'false');
		$html .= "<tr>";
		$html .= "	<td>" . $lang_block['header'] . "</td>";
		$html .= "	<td>";
		$html .= "<select name=\"config_header\">\n";
		foreach ($array_header as $key4 => $val4) {
			$html .= "<option value=\"" . $val4 . "\"" . ($val4 == $data_block['header'] ? " selected=\"selected\"" : "") . ">" . $val4 . "</option>\n";
		}
		$html .= "</select>\n";
		$html .= "	</td>";
		$html .= "</tr>";
		return $html;
	}

	function nv_block_config_facebook_like_blocks_submit($module, $lang_block) {
		global $nv_Request;
		$return = array();
		$return['error'] = array();
		$return['config'] = array();
		$return['config']['nickfb'] = filter_text_input('config_nickfb', 'post', 0);
		$return['config']['width'] = $nv_Request -> get_int('config_width', 'post', 0);
		$return['config']['height'] = $nv_Request -> get_int('config_height', 'post', 0);
		$return['config']['color'] = filter_text_input('config_color', 'post', 0);
		$return['config']['faces'] = filter_text_input('config_faces', 'post', 0);
		$return['config']['stream'] = filter_text_input('config_stream', 'post', 0);
		$return['config']['header'] = filter_text_input('config_header', 'post', 0);
		return $return;
	}

	function nv_global_facebook_like($block_config) {
		global $global_config, $db;
		$xtpl = new XTemplate("gloabl_facebook_like.tpl", NV_ROOTDIR . "/themes/" . $global_config['site_theme'] . "/blocks");
		$xtpl -> assign('TEMPLATE', $global_config['site_theme']);
		$xtpl -> assign('nickfb', $block_config['nickfb']);
		$xtpl -> assign('width', $block_config['width']);
		$xtpl -> assign('height', $block_config['height']);
		$xtpl -> assign('color', $block_config['color']);
		$xtpl -> assign('faces', $block_config['faces']);
		$xtpl -> assign('stream', $block_config['stream']);
		$xtpl -> assign('header', $block_config['header']);
		$xtpl -> parse('main');
		return $xtpl -> text('main');

	}

}

if (defined('NV_SYSTEM')) {
	$content = nv_global_facebook_like($block_config);
}
?>