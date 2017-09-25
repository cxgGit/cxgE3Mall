package com.itheima.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.e3mall.mapper.TbItemMapper;
import com.itheima.e3mall.pojo.TbItem;
import com.itheima.e3mall.service.TbItemService;

@Service
public class TbIteamServiceImpl implements TbItemService{
    
	//注入TbItemMapper
	@Autowired
	private TbItemMapper tbItemMapper;
	@Override
	public TbItem findTbItemById(Long id) {
		return tbItemMapper.selectByPrimaryKey(id);
	}

}
