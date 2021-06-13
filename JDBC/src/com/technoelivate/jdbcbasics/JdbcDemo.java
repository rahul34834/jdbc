package com.technoelivate.jdbcbasics;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
import com.mysql.jdbc.Driver;

public class JdbcDemo {

	public static void main(String[] args) {
		
	   Connection con=null;
	   Statement st=null;
	   ResultSet rs=null;
	   
		
		//1.Loading Driver and Registering the driver
			
//			Driver driver=new Driver();
//			DriverManager.registerDriver(driver);
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			
		//2. Get connection via Driver
		
		try {
		String dburl="jdbc:mysql://localhost:3306/student?user=root&password=Ra2420hul";
		con=DriverManager.getConnection(dburl);
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		//3.issues sql queries via connections
		
		
		try {
			String query="select * from employee";
			st=con.createStatement();
			rs=st.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			while(rs.next()) {
				System.out.println(rs.getInt("empid"));
				System.out.println(rs.getInt("Salary"));
				System.out.println(rs.getString("doj"));
				System.out.println(rs.getString("designation"));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
			if(con!=null) {
				con.close();
			}
				
			if(con!=null) {
					st.close();
			}
					
					if(con!=null) {
						rs.close();	
					}
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
			
		}
}

		
		


