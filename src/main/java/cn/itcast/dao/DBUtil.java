package cn.itcast.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public interface DBUtil {
	public  Connection getConnection();
	public  void close(Connection conn, Statement stm ,ResultSet rs);
	

}
