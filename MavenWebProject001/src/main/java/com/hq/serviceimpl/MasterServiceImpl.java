package com.hq.serviceimpl;

import com.hq.bean.SysMaster;
import com.hq.daoimpl.MasterDaoImpl;
import com.hq.service.MasterService;
//µ÷ÓÃdao²ã
public class MasterServiceImpl implements MasterService{
	private MasterDaoImpl masterDaoImpl = new MasterDaoImpl();

	@Override
	public boolean LoginMaster(String account, String password) {
		// TODO Auto-generated method stub
		SysMaster master =    masterDaoImpl.selectByaccountAndPassword(account, password);
		if(master !=null){
			return true;
			
		}
		return false;
	}

}
