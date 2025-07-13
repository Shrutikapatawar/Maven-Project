package com.tka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class library {
	public static void main(String[] args) throws Throwable {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","root");
		PreparedStatement ps=c.prepareStatement("select *from library");
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			int bookId=rs.getInt(1);
			String Name=rs.getString(2);
			System.out.println("id = "+bookId +" Name = "+Name);
		}
	}
}
