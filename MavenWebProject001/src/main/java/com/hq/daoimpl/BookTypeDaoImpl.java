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
		// TODO �������ݿ�  ��ȡ���е�����Ϣ
				Connection conn = JDBCUtils1.getConnection();
				String sql = "select * from j2ee_booktype";
				//����һ�����϶��������洢Books����
				List<BookType> list_books = new ArrayList<>();
				try {
					PreparedStatement pt = conn.prepareStatement(sql);
					//sql��û�У��Ͳ���Ҫ����ֵ
					//ִ��sql
					ResultSet st = pt.executeQuery();
					while (st.next()) {
						//��ȡ��Ӧ�е�������
						BookType bookType= new BookType();
						bookType.setT_id(st.getInt("t_id"));
						bookType.setT_name(st.getString("t_name"));
						
						//���������ӽ�����List��
						list_books.add(bookType);
						
						
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return list_books;
	}

}
