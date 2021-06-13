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

public class DynamicalyDelete {
	public static void main(String[] data) throws IOException, SQLException {
		

		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		FileInputStream fs=new FileInputStream("properties.properties");
		
		Properties p=new Properties();
		p.load(fs);
		
		con=DriverManager.getConnection(p.getProperty("dburl"),p.getProperty("user"),p.getProperty("pwd"));
		String querry="Delete from student12 where id=?;";
		ps=con.prepareStatement(querry);
		ps.setInt(1,Integer.parseInt(data[0]));
		
		int n=ps.executeUpdate();
		
		System.out.println(n + "one rows affected");
		
	}
}