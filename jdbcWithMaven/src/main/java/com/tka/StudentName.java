package com.tka;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class StudentName {
public static void main(String[] args) throws Throwable {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	PreparedStatement ps=c.prepareStatement("select *from stud_info");
	ResultSet rs=ps.executeQuery();
	
	while(rs.next()) {
		int studId=rs.getInt(1);
		String Name=rs.getString(2);
		System.out.println("id = "+studId +" Name = "+Name);
	}
}
}
