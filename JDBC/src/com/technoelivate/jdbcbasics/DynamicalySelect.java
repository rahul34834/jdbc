package com.technoelivate.jdbcbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DynamicalySelect {

	public static void main(String[] data) throws IOException, SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		FileInputStream fs=new FileInputStream("properties.properties");
		
		Properties p=new Properties();
		p.load(fs);
		
		con=DriverManager.getConnection(p.getProperty("dburl"),p.getProperty("user"),p.getProperty("pwd"));
		String querry="select * from student12 where id=?;";
		
		ps=con.prepareStatement(querry);
		ps.setInt(1,Integer.parseInt(data[0]));
		
		rs=ps.executeQuery();
		
		

		while(rs.next()) {
			System.out.println("Id : " + rs.getInt("id") + " NAME : " + rs.getString("name") + " Age : " + rs.getInt("age"));
		} 
	}

}
