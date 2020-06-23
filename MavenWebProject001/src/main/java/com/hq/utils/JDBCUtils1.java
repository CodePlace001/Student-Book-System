package com.hq.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
/*
 自己将工具类实现：
  将自己的stu的CRUD 改为调用工具类的Dao*/

public class JDBCUtils1 {

	private static String url = "jdbc:mysql://localhost:3301/stu?useUnicode=true&characterEncoding=UTF8";
	private static String name = "root";
	private static String password = "admin";
	private static String driverName = "com.mysql.jdbc.Driver";
	private static Connection conn;

	/**
	 * 1:加载驱动 |-放在静态代码快中 ：只加载一次：优化 static 2：获取链接对象 3：关闭资源
	 */
	static {

		try {

			Class.forName(driverName);
		} catch (Exception e) {
			System.out.println("驱动加载异常");
			e.printStackTrace();
		} finally {

		}
	}

	/* 获取链接对象 ：链接对象为单例 */
	public static Connection getConnection() {

		try {

			if (conn == null) { // 没有连接对象
				conn = DriverManager.getConnection(url, name, password);
				System.out.println("数据库连接成功");
			}

		} catch (SQLException e) {
			System.out.println("数据库连接失败：" + e.getMessage());
			e.printStackTrace();
		}
		return conn;
	}

	// 释放资源 Connection statement ResultSet

	public static void cloesDbRes(Connection conn, Statement statenmt, ResultSet resultSet) {
		try {
			if (resultSet != null) {
				resultSet.close();
			}
			if (statenmt != null) {
				statenmt.close();

			}
			if (conn != null) {
				conn.close();

			}

		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {
		JDBCUtils1.getConnection();

	}

}
