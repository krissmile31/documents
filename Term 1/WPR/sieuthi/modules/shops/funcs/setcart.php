<?php
/**
 * @Project NUKEVIET 3.0
 * @Author VINADES.,JSC (contact@vinades.vn)
 * @Copyright (C) 2010 VINADES., JSC. All rights reserved
 * @Createdate 3-6-2010 0:14
 */

if ( ! defined( 'NV_IS_MOD_SHOPS' ) ) die( 'Stop!!!' );
if ( ! defined( 'NV_IS_AJAX' ) ) die( 'Wrong URL' );
if ( ! isset( $_SESSION[$module_data . '_cart'] ) ) $_SESSION[$module_data . '_cart'] = array();

$id = $nv_Request->get_int( 'id', 'post,get', 1 );
$num = $nv_Request->get_int( 'num', 'post,get', 1 );
$ac = $nv_Request->get_string( 'ac', 'post,get', 0 );
$contents_msg = "";
if ( ! is_numeric( $num ) || $num < 0 )
{
    $contents_msg = 'ERR_' . $lang_module['cart_set_err'];
}
else
{
    if ( $ac == 0 )
    {
        if ( $id > 0 )
        {
            $query = $db->sql_query( "SELECT * FROM `" . $db_config['prefix'] . "_" . $module_data . "_rows` WHERE `id` = " . $id . "" );
            $data_content = $db->sql_fetchrow( $query, 2 );
			$thumb=explode("|",$data_content['homeimgthumb']);
			if(!empty($thumb[0])&&!nv_is_url($thumb[0])) {
				$thumb[0]=NV_BASE_SITEURL.NV_UPLOADS_DIR."/".$module_name."/".$thumb[0];
			} else {
				$thumb[0]=NV_BASE_SITEURL."themes/".$module_info['template']."/images/".$module_file."/no-image.jpg";
			}
            //$price_product_discounts = $data_content['product_price'] - ( $data_content['product_price'] * ( $data_content['product_discounts'] / 100 ) );
			if ($data_content['product_discounts'] > 0) {
				$price_product_discounts = $data_content['product_discounts'];
			}
			else
			{
				$price_product_discounts = $data_content['product_price'];
			}
            $price_product_discounts = CurrencyConversionToNumber( $price_product_discounts, $data_content['money_unit'], $pro_config['money_unit'] );
        	if ( $pro_config['active_price'] == '0' ) { $price_product_discounts = 0; }
        	if ( $pro_config['active_order_number'] == '1' ) { $num = 0; }
            if ( $num > $data_content['product_number'] && $pro_config['active_order_number'] == '0' )
            {
                $contents_msg = 'ERR_' . $lang_module['cart_set_err_num'];
            }
            else
            {
                $update_cart = true;
                if ( ! isset( $_SESSION[$module_data . '_cart'][$id] ) )
                {
                    $_SESSION[$module_data . '_cart'][$id] = array( 
                        'num' => $num, 'order' => 0, 'price' => $price_product_discounts, 'store' => $data_content['product_number'],'title'=>$data_content[NV_LANG_DATA.'_title'],'homeimgthumb'=>$thumb[0] 
                    );
                }
                else
                {
                    if ( ( $_SESSION[$module_data . '_cart'][$id]['num'] + $num ) > $data_content['product_number'] )
                    {
                        $contents_msg = 'ERR_' . $lang_module['cart_set_err_num'] . ': ' . $data_content['product_number'];
                        $update_cart = false;
                    }
                    else
                    {
                        $_SESSION[$module_data . '_cart'][$id]['num'] = $_SESSION[$module_data . '_cart'][$id]['num'] + $num;
                    }
                }
                if ( $update_cart )
                {
                    $title = str_replace( "_", "#@#", $data_content[NV_LANG_DATA . '_title'] );
                    $contents = sprintf( $lang_module['set_cart_success'], $title );
                    $contents_msg = 'OK_' . $contents;
                }
            }
        }
    }
    else
    {
        if ( $id > 0 )
        {
            $query = $db->sql_query( "SELECT * FROM `" . $db_config['prefix'] . "_" . $module_data . "_rows` WHERE `id` = " . $id . "" );
            $data_content = $db->sql_fetchrow( $query, 2 );
            if ( $num > $data_content['product_number'] )
            {
                $contents_msg = 'ERR_' . $lang_module['cart_set_err_num'] . ': ' . $data_content['product_number'];
            }
            else
            {
                if ( isset( $_SESSION[$module_data . '_cart'][$id] ) ) $_SESSION[$module_data . '_cart'][$id]['num'] = $num;
                $contents_msg = 'OK_' . $lang_module['cart_set_ok'] . $num;
            }
        }
    }
}
include ( NV_ROOTDIR . "/includes/header.php" );
echo nv_unhtmlspecialchars( $contents_msg );
include ( NV_ROOTDIR . "/includes/footer.php" );

?>