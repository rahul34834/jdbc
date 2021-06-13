package com.technoelivate.jdbcbasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateStatic {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		
		Student44 s=new Student44();
		

		try {
			String dburl="jdbc:mysql://localhost:3306/student";
			con=DriverManager.getConnection(dburl,"root","Ra2420hul");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		try {
			String querry="update student12 set age=22 where name='ranjan'";
			st=con.createStatement();
			int n=st.executeUpdate(querry);
			System.out.println(n+ " number of rows affested");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(con !=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(st !=null) {
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}

	}

}
