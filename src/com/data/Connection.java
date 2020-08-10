package com.data;
import java.sql.*;
public class Connection {
	public static java.sql.Connection getConnection(String query){
		ResultSet rs = null;
		java.sql.Connection con=null;
		if(query == null || "".equals(query)) {
			return null;
		}
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			 con=  DriverManager.getConnection("jdbc:mysql://localhost/findyourdoctor?" +"user=root&password=1234");      
			           return con;   
			}catch (Exception e2) {e2.printStackTrace();}
		return con;  
	}
}
