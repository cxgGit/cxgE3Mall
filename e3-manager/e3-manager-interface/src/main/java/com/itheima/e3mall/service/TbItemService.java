package com.itheima.e3mall.service;

import com.itheima.e3mall.pojo.TbItem;

public interface TbItemService {
	
	/**
	 * 根据id查询商品信息
	 */
	TbItem findTbItemById(Long id);

}
