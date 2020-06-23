package com.hq.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;
/*
 �Լ���������ʵ�֣�
  ���Լ���stu��CRUD ��Ϊ���ù������Dao*/

public class JDBCUtils1 {

	private static String url = "jdbc:mysql://localhost:3301/stu?useUnicode=true&characterEncoding=UTF8";
	private static String name = "root";
	private static String password = "admin";
	private static String driverName = "com.mysql.jdbc.Driver";
	private static Connection conn;

	/**
	 * 1:�������� |-���ھ�̬������� ��ֻ����һ�Σ��Ż� static 2����ȡ���Ӷ��� 3���ر���Դ
	 */
	static {

		try {

			Class.forName(driverName);
		} catch (Exception e) {
			System.out.println("���������쳣");
			e.printStackTrace();
		} finally {

		}
	}

	/* ��ȡ���Ӷ��� �����Ӷ���Ϊ���� */
	public static Connection getConnection() {

		try {

			if (conn == null) { // û�����Ӷ���
				conn = DriverManager.getConnection(url, name, password);
				System.out.println("���ݿ����ӳɹ�");
			}

		} catch (SQLException e) {
			System.out.println("���ݿ�����ʧ�ܣ�" + e.getMessage());
			e.printStackTrace();
		}
		return conn;
	}

	// �ͷ���Դ Connection statement ResultSet

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
