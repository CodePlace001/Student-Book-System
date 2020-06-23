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
		// TODO 操作数据库的代码
		//1:获取连接对象
		Connection conn = JDBCUtils1.getConnection();
		//? 代表占位符  这里的值不确定
		String sql = "select * from master where account=? and  password=?";
		 SysMaster master = null;
		//预编译sql
	    try {
	    	//2:获取会话对象PreparedStatement
			PreparedStatement pt = conn.prepareStatement(sql);
			//3：如果sql中有不确定的参数 ？ 需要设置值
			 pt .setString(1, account);
			 pt.setString(2, password);
			 
			 //4:执行sql  ResultSet set = pt.executeQuery(); ResultSet:结果集对象 ：存储的是表中的数据
			 ResultSet set = pt.executeQuery();
			 
			 //5：从结果集中获取对象
			 while(set.next()){//如果有行数据next的值就是true
				 //获取列数据
				String sys_id =set.getString("sys_id");
				String db_account = set.getString("account");
				String db_password = set.getString("password");
				String name = set.getString("name");
				String sex = set.getString("sex");
			    Timestamp time = set.getTimestamp("entry_time");
			    //封装成一个对象
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
