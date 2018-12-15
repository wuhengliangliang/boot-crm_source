package com.itheima.crm.mapper;

import java.util.List;

import com.itheima.crm.pojo.Customer;
import com.itheima.crm.pojo.QueryVo;

/**
 * 客户持久化接口
 * @author Administrator
 *
 */
public interface CustomerMapper {
	/**
	 * 查询查询条件，分页查询用户列表
	 * @param vo
	 * @return
	 */
	List<Customer> getCustomerByQueryVo(QueryVo vo);
	
	/**
	 * 跟据查询条件查询总记录数
	 * @param vo
	 * @return
	 */
	Integer getCountByQueryVo(QueryVo vo);

	Customer getCustomerById(Integer id);

	void updateCustomer(Customer customer);

	void deleteCustomer(Integer id);
}
