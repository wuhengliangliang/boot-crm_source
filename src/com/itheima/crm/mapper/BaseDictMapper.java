package com.itheima.crm.mapper;

import java.util.List;

import com.itheima.crm.pojo.BaseDict;

/**
 * 字典数据表持久化接口
 * @author Administrator
 *
 */
public interface BaseDictMapper {
	/*
	 * 根据字典编码，查询字典列表s
	 */
	List<BaseDict> getBaseDictByCode(String code);
	
}
