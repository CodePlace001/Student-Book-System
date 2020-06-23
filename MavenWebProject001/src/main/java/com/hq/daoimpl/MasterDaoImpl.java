package com.hq.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.hq.bean.SysMaster;
import com.hq.dao.MasterDao;
import com.hq.utils.JDBCUtils1;


public class MasterDaoImpl implements MasterDao {

	@Override
	public SysMaster selectByaccountAndPassword(String account, String password) {
		// TODO �������ݿ�Ĵ���
		//1:��ȡ���Ӷ���
		Connection conn = JDBCUtils1.getConnection();
		//? ����ռλ��  �����ֵ��ȷ��
		String sql = "select * from master where account=? and  password=?";
		 SysMaster master = null;
		//Ԥ����sql
	    try {
	    	//2:��ȡ�Ự����PreparedStatement
			PreparedStatement pt = conn.prepareStatement(sql);
			//3�����sql���в�ȷ���Ĳ��� �� ��Ҫ����ֵ
			 pt .setString(1, account);
			 pt.setString(2, password);
			 
			 //4:ִ��sql  ResultSet set = pt.executeQuery(); ResultSet:��������� ���洢���Ǳ��е�����
			 ResultSet set = pt.executeQuery();
			 
			 //5���ӽ�����л�ȡ����
			 while(set.next()){//�����������next��ֵ����true
				 //��ȡ������
				String sys_id =set.getString("sys_id");
				String db_account = set.getString("account");
				String db_password = set.getString("password");
				String name = set.getString("name");
				String sex = set.getString("sex");
			    Timestamp time = set.getTimestamp("entry_time");
			    //��װ��һ������
			     master = new SysMaster(sys_id, db_account, db_password, name, sex, time);
			   // System.out.println("master:"+master);
				
				 
			 }
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return master;
	}
	
	

}
