package com.itheima.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.e3mall.pojo.TbItem;
import com.itheima.e3mall.service.TbItemService;

@Controller
public class TbItemController {
	
	//注入service
	@Autowired
	private TbItemService tbItemService;
	
	@RequestMapping("/item/{itemId}")
	@ResponseBody
	public TbItem findTbItemById(@PathVariable Long itemId){
		TbItem item = tbItemService.findTbItemById(itemId);
		return item;
	}

}
