package com.tka;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Employee {
	public static void main(String[] args) throws Throwable {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/task","root","root");
		PreparedStatement ps=c.prepareStatement("select *from employee");
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			int EMPid=rs.getInt(1);
			String Name=rs.getString(2);
			System.out.println("EMPid = "+EMPid +" Name = "+Name);
		}
	}
}

