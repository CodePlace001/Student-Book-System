package com.hq.controller;

import java.io.IOException;
import java.security.Provider.Service;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hq.bean.Books;
import com.hq.serviceimpl.BookServiceImpl;
import com.hq.serviceimpl.MasterServiceImpl;

/*
 * һ����Ҫ��ȥ�����������Ӧ������̳�HttpServlet
 * ��дservice����
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private MasterServiceImpl masterService = new MasterServiceImpl();
	private BookServiceImpl bookService = new BookServiceImpl();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    //�������������� 
		req.setCharacterEncoding("utf-8");
		//��ȡ��¼���������
		String name = req.getParameter("userName");
		String password = req.getParameter("password");
//		System.out.println("name:"+name);
//		System.out.println("password:"+password);
		//ȥ���ݿ��ѯ  name ��passwordƥ����û�  
		//����ҵ���߼��� 
		boolean result = masterService.LoginMaster(name, password);
		
		if(result == true){
		//	System.out.println("��¼�ɹ�");
			//���뵽��¼�ɹ���ҳ��  ������Ӧ 
			//TODO ��Ҫ��˴����ݿ��в�ѯ����������ʾ��jspҳ���� book ��Ҫͨ���Ĵ������򴫵ݣ�HttpServletRequest  HttpSeesion
			//�ṩ����:req.setAttribute("key", Object);
			/*
			 * ��ȡHttpSeesion����Ҫͨ��HttpServletRequest��ȡ   �ṩ��һ��getSession() ������ȡHttpSeesion
			 */
			//��bookService��ȡ����
			List<Books> db_books = bookService.selectAllBooks();
			for (Books books : db_books) {
				System.out.println("booksLoginServlet:"+books);
				
			}
			
	     	HttpSession session = 	req.getSession();//��ȡsession����
	     	session.setAttribute("book1", db_books);
	  
			req.getRequestDispatcher("/view/system/main/main.jsp").forward(req, resp);
			
		}else{
			//System.out.println("��¼ʧ��");
			//�ڽ��뵽��¼ʧ�ܵ�ҳ�� login.jsp ������Ӧ
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		}
		
	}

}
