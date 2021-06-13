package com.technoelivate.jdbcbasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteSatitc {
	public static void main(String[] args) {
	
	
	Student44 s=new Student44();
	Connection con=null;
	Statement st=null;
	try {
		String dburl="jdbc:mysql://localhost:3306/student";
		con=DriverManager.getConnection(dburl,"root","Ra2420hul");
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	try {
		String querry="Delete from student12  where id=13";
		st=con.createStatement();
		int n=st.executeUpdate(querry);
		System.out.println(n+ " number of rows affected");
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	}
}