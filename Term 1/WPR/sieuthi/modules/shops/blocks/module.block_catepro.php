<?php

if ( ! defined( 'NV_MAINFILE' ) ) die( 'Stop!!!' );

if ( ! nv_function_exists( 'nv_cate_product' ) )
{
    function nv_block_config_cate_blocks ( $module, $data_block, $lang_block )
    {
        global $db, $language_array, $db_config;
        $html = "";
        $html .= "<tr>";
        $html .= "	<td>" . $lang_block['catid'] . "</td>";
        $html .= "	<td><select name=\"config_catid\">\n";
        $sql = "SELECT `catid`,  " . NV_LANG_DATA . "_title," . NV_LANG_DATA . "_alias,lev FROM `" . $db_config['prefix'] . "_" . $module . "_catalogs` ORDER BY `order` ASC";
        $list = nv_db_cache( $sql, 'catid', $module );
        foreach ( $list as $l )
        {
			$lev_i  = $l['lev'];
    		$xtitle_i = "";
			if ( $lev_i > 0 )
			{
				for ( $i = 1; $i <= $lev_i; $i ++ )
				{
					$xtitle_i .= "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;";
				}
			}
            $sel = ( $data_block['catid'] == $l['catid'] ) ? ' selected' : '';
            $html .= "<option value=\"" . $l['catid'] . "\" " . $sel . ">" . $xtitle_i. $l[NV_LANG_DATA . '_title'] . "</option>\n";
        }
        $html .= "	</select></td>\n";
        $html .= "</tr>";
        $html .= "<tr>";
        $html .= "	<td>" . $lang_block['numrow'] . "</td>";
        $html .= "	<td><input type=\"text\" name=\"config_numrow\" size=\"5\" value=\"" . $data_block['numrow'] . "\"/></td>";
        $html .= "</tr>";
        $html .= "<tr>";
        $html .= "	<td>" . $lang_block['cut_num'] . "</td>";
        $html .= "	<td><input type=\"text\" name=\"config_cut_num\" size=\"5\" value=\"" . $data_block['cut_num'] . "\"/></td>";
        $html .= "</tr>";
		$array = array( 'digitals', 'women', 'men');
        $html .= "<tr>";
        $html .= "	<td>" . $lang_block['style_cat'] . "</td>";
        $html .= "	<td>";
		$html .= "<select name=\"config_style_cat\">";
            foreach ( $array as $key => $val )
            {
                $html .= "<option value=\"" . $val . "\"" . ( $val == $data_block['style_cat'] ? " selected=\"selected\"" : "" ) . ">" . $val . "</option>";
            }
		$html .= "</select>";
		$html .= "</td>";
        $html .= "</tr>";
        return $html;
    }

    function nv_block_config_cate_blocks_submit ( $module, $lang_block )
    {
        global $nv_Request;
        $return = array();
        $return['error'] = array();
        $return['config'] = array();
        $return['config']['catid'] = $nv_Request->get_int( 'config_catid', 'post', 0 );
        $return['config']['numrow'] = $nv_Request->get_int( 'config_numrow', 'post', 0 );
        $return['config']['cut_num'] = $nv_Request->get_int( 'config_cut_num', 'post', 0 );
        $return['config']['style_cat'] = filter_text_input( 'config_style_cat', 'post', 0 );
        return $return;
    }

    function nv_cate_product ( $block_config )
    {
        global $site_mods, $global_config, $module_config, $module_name, $module_info, $global_array_cat, $db, $db_config, $my_head, $lang_module,$pro_config;
        $module = $block_config['module'];
        $mod_data = $site_mods[$module]['module_data'];
        $mod_file = $site_mods[$module]['module_file'];
        $pro_config = $module_config[$module];
        /*get theme block*/
        if ( file_exists( NV_ROOTDIR . "/themes/" . $global_config['site_theme'] . "/modules/" . $mod_file . "/block.cate_product.tpl" ) )
        {
            $block_theme = $global_config['site_theme'];
        }
        else
        {
            $block_theme = "default";
        }
        /*show data*/
        $link = NV_BASE_SITEURL . "index.php?" . NV_LANG_VARIABLE . "=" . NV_LANG_DATA . "&amp;" . NV_NAME_VARIABLE . "=" . $module . "&amp;" . NV_OP_VARIABLE . "=";
        $array_cat_list = GetCatidInParent( $block_config['catid'] );
		$xtpl = new XTemplate( "block.cate_product.tpl", NV_ROOTDIR . "/themes/" . $block_theme . "/modules/" . $mod_file );
		//print_r("ok");exit();
		$xtpl->assign( 'LANG', $lang_module );
		$xtpl->assign( 'STYLE', $block_config['style_cat'] );
		$xtpl -> assign('TITLE_CATALOG', $global_array_cat[$block_config['catid']]['title']);
		$xtpl -> assign('LINK_CATALOG', $global_array_cat[$block_config['catid']]['link']);
		$xtpl -> assign('IMG_CATALOG', $global_array_cat[$block_config['catid']]['image']);
		$xtpl -> assign('ICON_CATALOG', $global_array_cat[$block_config['catid']]['icon']);
		$xtpl -> assign('DES_CATALOG', $global_array_cat[$block_config['catid']]['description']);
		$array_sub = explode("," , $global_array_cat[$block_config['catid']]['subcatid'] );
		$i= 0;
		foreach ( $array_sub as $sub )
		{
			if ( $i >= 5 ) break;
			if ( !empty ($global_array_cat[$sub]) )
			{
				$xtpl->assign( "SUB", $global_array_cat[$sub] );
				$xtpl->parse( 'main.sub' );
				$i++;
			}
		}
        $sql = "SELECT  t1.id, t1.listcatid, t1." . NV_LANG_DATA . "_title as title, t1." . NV_LANG_DATA . "_alias as alias, t1.addtime,t1.homeimgthumb,t1.product_price,t1.product_discounts,t1.money_unit,t1.showprice,t1." . NV_LANG_DATA . "_hometext as hometext,t1.homeimgfile FROM `" . $db_config['prefix'] . "_" . $module . "_rows` as t1 WHERE listcatid IN (" . implode(',',$array_cat_list) . ") AND t1.status= 1 AND  t1.publtime < " . NV_CURRENTTIME . " AND (t1.exptime=0 OR t1.exptime >" . NV_CURRENTTIME . ") AND inhome=1 ORDER BY t1.addtime DESC LIMIT 0 , " . $block_config['numrow'] . "";
        $cut_num = $block_config['cut_num'];
		$list = nv_db_cache_adv( $sql, 'block_cateid'.$block_config['bid'], $module );
        $i = 1;
		foreach ( $list as $l )
		{
			$thumb = explode( "|", $l['homeimgthumb'] );
            if ( ! empty( $thumb[0] ) && ! nv_is_url( $thumb[0] ) )
            {
                $thumb[0] = NV_BASE_SITEURL . NV_UPLOADS_DIR . "/" . $module . "/" . $thumb[0];
            }
            else
            {
                $thumb[0] = NV_BASE_SITEURL . "themes/" . $module_info['template'] . "/images/" . $mod_file . "/no-image.jpg";
            }
			$homeimgfile_i = NV_BASE_SITEURL . NV_UPLOADS_DIR . "/" . $module . "/" . $l['homeimgfile'];
            $xtpl->assign( 'link', $link . $global_array_cat[$l['listcatid']]['alias'] . "/" . $l['alias'] . "-" . $l['id'] );
            $title_i = nv_clean60( $l['title'], 300);
            $hometext_i = nv_clean60( $l['hometext'], 300 );
            $xtpl->assign( 'title', $title_i );
            $xtpl->assign( 'src_img', $thumb[0] );
			$a= round ((100-(($l['product_discounts'])/($l['product_price']))*100));
			//print_r($l);exit();
			
			if
			($a != 100)
			{
			$xtpl->assign( 'sale', $a );
			$xtpl->parse( 'main.loop.sale' );
			}
			$xtpl->assign( 'ID', $l['id'] );
			$xtpl->assign( 'hometext', $l['hometext'] );
			$xtpl->assign( 'SRC_PRO_LAGE', $l['homeimgfile'] );
			$a= round ((100-(($l['product_discounts'])/($l['product_price']))*100));
			$xtpl->assign( 'sale',$a );
            $xtpl->assign( 'time', nv_date( 'd-m-Y h:i:s A', $l['addtime'] ) );
            if ( $pro_config['active_price'] == '1' && $l['showprice'] == '1' )
            {
                $product_price = CurrencyConversion( $l['product_price'], $l['money_unit'], $pro_config['money_unit'], $block_config );
                $xtpl->assign( 'product_price', $product_price );
                $xtpl->assign( 'money_unit', $pro_config['money_unit'] );
                if ( $l['product_discounts'] != 0 )
                {
					$price_product_discounts = $l['product_discounts'];
                    $xtpl->assign( 'product_discounts', CurrencyConversion( $price_product_discounts, $l['money_unit'], $pro_config['money_unit'], $block_config ) );
					$product_price_end = $l['product_price'] - $l['product_discounts'] ;
               		$xtpl->assign( 'product_price_end', CurrencyConversion( $product_price_end, $l['money_unit'], $pro_config['money_unit'], $block_config ) );
					$xtpl->assign( 'class_money', 'discounts_money' );
                    $xtpl->parse( 'main.loop.discounts' );
					$xtpl->parse( 'main.loop.discounts1' );
                }
                else
                {
                    $xtpl->assign( 'class_money', 'money' );
                }
                $xtpl->parse( 'main.loop.price' );
				$xtpl->parse( 'main.loop.price1' );
            }
			if ($pro_config ['active_order'] == '1') {
				if ($l['showprice'] == '1') {
					$xtpl->parse ( 'main.loop.order' );
				}
			}
            $bg = ( $i % 2 == 0 ) ? "bg" : "";
            $xtpl->assign( "bg", $bg );
            $xtpl->parse( 'main.loop' );
            $i ++;
		}
        ///////////////////////////////////////////////////////////////////////////////////
		if ( ! defined( 'NV_ORDER_SHOW' ) ) 
		{
			$xtpl->parse( 'main.sorder' );
			define( 'NV_ORDER_SHOW', TRUE );
		}
        $xtpl->parse( 'main' );
        return $xtpl->text( 'main' );
    }
}


if ( defined( 'NV_SYSTEM' ) )
{
    global $site_mods;
    $module = $block_config['module'];
    $content = nv_cate_product( $block_config );
}
?>