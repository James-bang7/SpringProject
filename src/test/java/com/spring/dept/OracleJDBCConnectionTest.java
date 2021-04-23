package com.spring.dept;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class OracleJDBCConnectionTest {
	
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private static final String USER = "hr"; // root
	private static final String PW = "1234"; // 1234
	
	
	
	@Test
	public void testConnection() throws Exception{
		
		try {
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PW);
			System.out.println(conn);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
