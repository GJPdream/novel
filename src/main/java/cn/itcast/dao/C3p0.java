package cn.itcast.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class C3p0  implements DBUtil{
    private static DataSource ds=null;
 public static DataSource getDataSource()
 {
     if (ds==null){
     ds=new ComboPooledDataSource();
     }
     return ds;
 }
    @Override
    public Connection getConnection() {
     try {
         Connection conn = getDataSource().getConnection();
         if (conn!=null)
             return conn;
     }catch (Exception e){
         e.printStackTrace();
     }


        return null;
    }

    @Override
    public void close(Connection conn, Statement stm, ResultSet rs) {
        if (rs != null) {
            try {rs.close();
            } catch (SQLException e) {}
        }
        if(stm!=null){
            try {conn.close();
            } catch (Exception ec) {}
        }
        if (conn != null) {
            try {conn.close();
            } catch (Exception ex) {}
        }
    }
    }

