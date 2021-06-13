package com.technoelivate.jdbcbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Static {

	public static void main(String[] args) throws IOException  {
		
		Student44 s=new Student44();
		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;	
		
		try {
//			String dburl="jdbc:mysql://localhost:3306/student";
//			con=DriverManager.getConnection(dburl,"root","Ra2420hul");
			
			FileInputStream fs=new FileInputStream("C:\\Users\\Rahul\\Desktop\\JavaJdbcPgm\\JDBC\\properties.properties");
			Properties p=new Properties();
			p.load(fs);
			
			con=DriverManager.getConnection(p.getProperty("durl"),p.getProperty("user"),p.getProperty("pwd"));
			String querry="select * from student12 where id=3;";
			st=con.createStatement();
			rs=st.executeQuery(querry);
			
			while(rs.next()) {
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setAge(rs.getInt("age"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println(s.id + "  " + s.name + " " + s.age );

	}

}
