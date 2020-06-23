package com.hq.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hq.bean.Books;
import com.hq.serviceimpl.BookServiceImpl;
import com.hq.utils.UUIDUtils;

@WebServlet("/BookSevlet")
public class BookServlet extends HttpServlet {//�����������  ���  ����  ɾ��  �޸�
	//
	BookServiceImpl bookService = new BookServiceImpl();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //�����һ��servlet���������� ��Ҫ��jspҳ�����ò��������ֲ�ͬ������
		String path = req.getParameter("path");
		System.out.println("path:"+path);
         if(path.equals("addbookui")){
        	 //ת����add.jspҳ��
        	 addBookUI(req,resp);
        	 
         }else if(path.equals("addbook")){
        	 try {
				addBook(req,resp);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	 
         }
		
		//req.getRequestDispatcher("/view/system/main/add.jsp").forward(req, resp);
		
	}
	protected void addBookUI(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
		
		req.getRequestDispatcher("/view/system/main/add.jsp").forward(req, resp);
		
	}
	protected void addBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, ParseException {
       //1 ��ȡadd.jspҳ��Ĳ��� :req.getParameter("����name����ֵ") �÷����ķ���ֵ��String����
		//3:�����󴫵ݵ�service�� --dao  ʵ����ӹ���
		String bookId = UUIDUtils.getUUID();//���б��  �����Stringֵ
		String bookName = req.getParameter("bookname");
		
		int bookType = Integer.parseInt(req.getParameter("bookType"));
		boolean isBorrow = Boolean.parseBoolean(req.getParameter("isBorrow"));
		String author = req.getParameter("author");
		String press = req.getParameter("press");
		double price = Double.parseDouble(req.getParameter("price"));
		
		//ʱ��Ĵ��� ����㷢��ʱ�� �������룺 2020-01-01
		String publishtime = req.getParameter("publishtime"); //��ν�String����ת��ΪDate
		SimpleDateFormat sp = new SimpleDateFormat("YYYY-MM-DD");//���ݿ���е�date�ֶ����ݸ�ʽxxxx-xx-xx
		Date publishDate = sp.parse(publishtime);
	    //register_time ֵ��ϵͳ��ʱ�� ��λ�ȡϵͳʱ��:System.currentTimeMillis() ��ȡϵͳʱ��ĺ���ֵ
		// long  System.currentTimeMillis()  Date(Long time)  new Date()
		Date register_time = new Date(System.currentTimeMillis() );
		
		Books book = new Books(bookId, bookName, bookType, author, press, publishDate, price, register_time, isBorrow);
		System.out.println("book"+book);
		//����ҵ���߼��� 
		bookService.addBook(book);
		
		//��Ӧ�� ��Ӧ��main.jsp��   list.jsp��Ҫ��ʾȫ�������Ϣ
		
		
	}

	

}
