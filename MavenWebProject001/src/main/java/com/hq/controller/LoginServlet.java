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
 * 一个类要想去处理请求和响应：必须继承HttpServlet
 * 重写service方法
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private MasterServiceImpl masterService = new MasterServiceImpl();
	private BookServiceImpl bookService = new BookServiceImpl();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    //解决请求参数乱码 
		req.setCharacterEncoding("utf-8");
		//获取登录的请求参数
		String name = req.getParameter("userName");
		String password = req.getParameter("password");
//		System.out.println("name:"+name);
//		System.out.println("password:"+password);
		//去数据库查询  name 和password匹配的用户  
		//调用业务逻辑层 
		boolean result = masterService.LoginMaster(name, password);
		
		if(result == true){
		//	System.out.println("登录成功");
			//进入到登录成功的页面  做出响应 
			//TODO 需要后端从数据库中查询到的数据显示到jsp页面上 book 需要通过四大作用域传递：HttpServletRequest  HttpSeesion
			//提供方法:req.setAttribute("key", Object);
			/*
			 * 获取HttpSeesion对象要通过HttpServletRequest获取   提供了一个getSession() 方法获取HttpSeesion
			 */
			//从bookService获取数据
			List<Books> db_books = bookService.selectAllBooks();
			for (Books books : db_books) {
				System.out.println("booksLoginServlet:"+books);
				
			}
			
	     	HttpSession session = 	req.getSession();//获取session对象
	     	session.setAttribute("book1", db_books);
	  
			req.getRequestDispatcher("/view/system/main/main.jsp").forward(req, resp);
			
		}else{
			//System.out.println("登录失败");
			//在进入到登录失败的页面 login.jsp 做出响应
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		}
		
	}

}
