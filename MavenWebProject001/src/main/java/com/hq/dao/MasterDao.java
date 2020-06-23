package com.hq.dao;

import com.hq.bean.SysMaster;

public interface MasterDao {
	//根据用户名和密码查询用户
	public SysMaster selectByaccountAndPassword(String account,String password);

}
