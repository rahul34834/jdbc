package com.technoelivate.jdbcbasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;



public class Demo1 {

	public static void main(String[] args) {
		
		Connection con=null;
		Statement st=null;
		
		try {
			String dburl="jdbc:mysql://localhost:3306/student";
			con=DriverManager.getConnection(dburl, "root","Ra2420hul");
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
		try {
			String query="insert into student12 values (4,'suraj',25);";
			st=con.createStatement();
			int n=st.executeUpdate(query);
			System.out.println(n+ " number of rows affested");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
