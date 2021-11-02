package com.saeyan.dao;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	// 싱글톤 패턴
	private MemberDAO() {} // 생성자는 private
	
	private static MemberDAO instance = new MemberDAO(); // private static instance 직접 생성
	
	public static MemberDAO getInstance() { // instance getter 생성
		return instance;
	}
	public Connection getConnection() throws Exception{
		Connection conn = null;
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/MyDB");
		conn = ds.getConnection();
		return conn;
	}
}
