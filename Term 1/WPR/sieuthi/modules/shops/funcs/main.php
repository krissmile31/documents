<?php
/**
 * @Project NUKEVIET 3.0
 * @Author VINADES.,JSC (contact@vinades.vn)
 * @Copyright (C) 2010 VINADES., JSC. All rights reserved
 * @Createdate 3-6-2010 0:14
 */
if ( ! defined( 'NV_IS_MOD_SHOPS' ) ) die( 'Stop!!!' );
$page_title = $module_info['custom_title'];
$key_words = $module_info['keywords'];
$page = 0;
if ( ! empty( $array_op[1] ) )
{
    if ( substr( $array_op[1], 0, 5 ) == "page-" )
    {
        $page = intval( substr( $array_op[1], 5 ) );
    }
}
if ( $sort_id > 0 && $page == 0 )
$page = $nv_Request->get_int( 'page', 'get', 0 );
$data_content = array();
$base_url = NV_BASE_SITEURL . "index.php?" . NV_LANG_VARIABLE . "=" . NV_LANG_DATA . "&" . NV_NAME_VARIABLE . "=" . $module_name . "&amp;" . NV_OP_VARIABLE . "=main";
$html_pages = "";

if ( $pro_config['home_view'] == "view_home_all" )
{
	$order_by = " ORDER BY ID DESC ";
	if ($sort_id>0)
    {
    	if ( $sort_id == 1)
    	{
    		$order_by = "ORDER BY " . NV_LANG_DATA . "_title ASC ";
    	}
    	elseif ( $sort_id == 2 )
    	{
    		$order_by = "ORDER BY " . NV_LANG_DATA . "_title DESC ";
    	}
    	elseif ( $sort_id == 3 )
    	{
    		$order_by = "ORDER BY product_price ASC ";
    	}
    	elseif ( $sort_id == 4 )
    	{
    		$order_by = "ORDER BY product_price DESC ";
    	}
    }
    $sql = "SELECT SQL_CALC_FOUND_ROWS id,listcatid, publtime, " . NV_LANG_DATA . "_title," . NV_LANG_DATA . "_alias, " . NV_LANG_DATA . "_hometext, " . NV_LANG_DATA . "_address, homeimgalt, hitstotal, homeimgthumb, product_price,product_discounts, money_unit,showprice,homeimgfile  FROM `" . $db_config['prefix'] . "_" . $module_data . "_rows` WHERE inhome=1 AND status=1 AND publtime <= " . NV_CURRENTTIME . " AND (exptime=0 OR exptime>" . NV_CURRENTTIME . ") ".$order_by." LIMIT " . $page . "," . $per_page . "";
    $result = $db->sql_query( $sql );
    $result_page = $db->sql_query( "SELECT FOUND_ROWS()" );
    list( $numf ) = $db->sql_fetchrow( $result_page );
    $all_page = ( $numf ) ? $numf : 1;
    $link = NV_BASE_SITEURL . "index.php?" . NV_LANG_VARIABLE . "=" . NV_LANG_DATA . "&amp;" . NV_NAME_VARIABLE . "=" . $module_name . "&amp;" . NV_OP_VARIABLE . "=";
    ////////////////////////////////////////////////////////
    while ( list( $id, $listcatid, $publtime, $title, $alias, $hometext, $address, $homeimgalt, $hitstotal, $homeimgthumb, $product_price, $product_discounts, $money_unit, $showprice,$homeimgfile ) = $db->sql_fetchrow( $result ) )
    {
        $thumb = explode( "|", $homeimgthumb );
		$homeimgfile = NV_BASE_SITEURL . NV_UPLOADS_DIR . "/" . $module_name . "/".$homeimgfile;
        if ( ! empty( $thumb[0] ) && ! nv_is_url( $thumb[0] ) )
        {
            $thumb[0] = NV_BASE_SITEURL . NV_UPLOADS_DIR . "/" . $module_name . "/" . $thumb[0];
        }
        else
        {
            $homeimgfile = $thumb[0] = NV_BASE_SITEURL . "themes/" . $module_info['template'] . "/images/" . $module_file . "/no-image.jpg";
        }
		
        $data_content[] = array( 
            "id" => $id, "publtime" => $publtime, "title" => $title, "alias" => $alias, "hometext" => $hometext, "address" => $address, "homeimgalt" => $homeimgalt, "hitstotal" => $hitstotal, "homeimgthumb" => $thumb[0], "product_price" => $product_price, "product_discounts" => $product_discounts, "money_unit" => $money_unit, "showprice" => $showprice, "link_pro" => $link . $global_array_cat[$listcatid]['alias'] . "/" . $alias . "-" . $id, "link_order" => $link . "setcart&amp;id=" . $id ,"homeimgfile"=>$homeimgfile
        );
    }
	if ( $sort_id>0 ) 
    {
    	$base_url = $base_url."&sort=".$sort_id;
    	$html_pages = nv_products_page2( $base_url, $all_page, $per_page, $page );
    }
    else
    {
    	$html_pages = nv_products_page( $base_url, $all_page, $per_page, $page );
    }
}
elseif( $pro_config['home_view'] == "view_home_cat" )
{
    foreach ( $global_array_cat as $catid_i => $array_info_i )
    {
        if ( $array_info_i['parentid'] == 0 && $array_info_i['inhome'] == 1 )
        {
            $array_cat = array();
            $array_cat = GetCatidInParent( $catid_i );
            $s = "SELECT SQL_CALC_FOUND_ROWS id, publtime, " . NV_LANG_DATA . "_title," . NV_LANG_DATA . "_alias, " . NV_LANG_DATA . "_hometext, " . NV_LANG_DATA . "_address, homeimgalt, hitstotal, homeimgthumb, product_price,product_discounts, money_unit,showprice,homeimgfile  FROM `" . $db_config['prefix'] . "_" . $module_data . "_rows` WHERE listcatid IN (" . implode( ",", $array_cat ) . ") AND inhome=1 AND status=1 AND publtime < " . NV_CURRENTTIME . " AND (exptime=0 OR exptime>" . NV_CURRENTTIME . ") ORDER BY ID DESC LIMIT 0," . $array_info_i['numlinks'] . "";
            $re = $db->sql_query( $s );
            
            $result = $db->sql_query( "SELECT FOUND_ROWS()" );
            list( $num_pro ) = $db->sql_fetchrow( $result );
            
            $link = NV_BASE_SITEURL . "index.php?" . NV_LANG_VARIABLE . "=" . NV_LANG_DATA . "&amp;" . NV_NAME_VARIABLE . "=" . $module_name . "&amp;" . NV_OP_VARIABLE . "=";
            $data_pro = array();
            
            while ( list( $id, $publtime, $title, $alias, $hometext, $address, $homeimgalt, $hitstotal, $homeimgthumb, $product_price, $product_discounts, $money_unit, $showprice,$homeimgfile ) = $db->sql_fetchrow( $re ) )
            {
                $thumb = explode( "|", $homeimgthumb );
				$homeimgfile = NV_BASE_SITEURL . NV_UPLOADS_DIR . "/" . $module_name . "/".$homeimgfile;
                if ( ! empty( $thumb[0] ) && ! nv_is_url( $thumb[0] ) )
                {
                    $thumb[0] = NV_BASE_SITEURL . NV_UPLOADS_DIR . "/" . $module_name . "/" . $thumb[0];
                }
                else
                {
                    $thumb[0] = NV_BASE_SITEURL . "themes/" . $module_info['template'] . "/images/" . $module_file . "/no-image.jpg";
                }
                $data_pro[] = array( 
                    "id" => $id, "publtime" => $publtime, "title" => $title, "alias" => $alias, "hometext" => $hometext, "address" => $address, "homeimgalt" => $homeimgalt, "hitstotal" => $hitstotal, "homeimgthumb" => $thumb[0], "product_price" => $product_price, "product_discounts" => $product_discounts, "money_unit" => $money_unit, "showprice" => $showprice, "link_pro" => $link . $global_array_cat[$catid_i]['alias'] . "/" . $alias . "-" . $id, "link_order" => $link . "setcart&amp;id=" . $id , "homeimgfile"=>$homeimgfile
                );
            }
            $data_content[] = array( 
                "catid" => $catid_i, "image" => $array_info_i['image'], "title" => $array_info_i['title'], "link" => $array_info_i['link'], 'data' => $data_pro, 'num_pro' => $num_pro, "num_link" => $array_info_i['numlinks'], "description" => $array_info_i['description'] 
            );
        }
    }
}

$contents = call_user_func( $pro_config['home_view'], $data_content, $html_pages );

include ( NV_ROOTDIR . "/includes/header.php" );
echo nv_site_theme( $contents );
include ( NV_ROOTDIR . "/includes/footer.php" );
?>