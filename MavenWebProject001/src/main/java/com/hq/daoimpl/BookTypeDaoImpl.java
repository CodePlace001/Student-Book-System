package com.hq.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hq.bean.BookType;
import com.hq.dao.BookTypeDao;
import com.hq.utils.JDBCUtils1;

public class BookTypeDaoImpl implements BookTypeDao{

	@Override
	public List<BookType> selectBookType() {
		// TODO 连接数据库  获取所有的书信息
				Connection conn = JDBCUtils1.getConnection();
				String sql = "select * from j2ee_booktype";
				//创建一个集合对象用来存储Books对象
				List<BookType> list_books = new ArrayList<>();
				try {
					PreparedStatement pt = conn.prepareStatement(sql);
					//sql中没有？就不需要设置值
					//执行sql
					ResultSet st = pt.executeQuery();
					while (st.next()) {
						//获取对应行的列数据
						BookType bookType= new BookType();
						bookType.setT_id(st.getInt("t_id"));
						bookType.setT_name(st.getString("t_name"));
						
						//将书对象添加进集合List中
						list_books.add(bookType);
						
						
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return list_books;
	}

}
