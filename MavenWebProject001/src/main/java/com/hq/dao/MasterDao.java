package com.hq.dao;

import com.hq.bean.SysMaster;

public interface MasterDao {
	//�����û����������ѯ�û�
	public SysMaster selectByaccountAndPassword(String account,String password);

}
