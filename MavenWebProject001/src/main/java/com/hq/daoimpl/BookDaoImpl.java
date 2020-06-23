package com.hq.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hq.bean.Books;
import com.hq.dao.BookDao;
import com.hq.utils.JDBCUtils1;

public class BookDaoImpl implements BookDao {

	@Override
	public List<Books> selectAllBooks() {
		// TODO �������ݿ�  ��ȡ���е�����Ϣ
		Connection conn = JDBCUtils1.getConnection();
		String sql = "select * from book";
		//����һ�����϶��������洢Books����
		List<Books> list_books = new ArrayList<>();
		try {
			PreparedStatement pt = conn.prepareStatement(sql);
			//sql��û�У��Ͳ���Ҫ����ֵ
			//ִ��sql
			ResultSet st = pt.executeQuery();
			while (st.next()) {
				//��ȡ��Ӧ�е�������
				Books book = new Books();
				book.setBook_id(st.getString("book_id"));
				book.setBook_name(st.getString("book_name"));
				book.setBook_type(st.getString("book_type"));
				book.setAuthor(st.getString("author"));
				book.setPress(st.getString("press"));
				book.setPublish_date(st.getDate("publish_date"));
				book.setPrice(st.getDouble("price"));
				book.setRegister_time(st.getTimestamp("register_time"));
				book.setIs_borrow(st.getBoolean("is_borrow"));
				
				//���������ӽ�����List��
				list_books.add(book);
				
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list_books;
	}

	public void insertBook(Books book) {
		// TODO Auto-generated method stub
		
	}

	

}
