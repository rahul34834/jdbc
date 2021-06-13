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

public class DynamicallyUpdate {

	public static void main(String[] data) throws SQLException, IOException {
		

		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		FileInputStream fs=new FileInputStream("properties.properties");
		
		Properties p=new Properties();
		p.load(fs);
		
		con=DriverManager.getConnection(p.getProperty("dburl"),p.getProperty("user"),p.getProperty("pwd"));
		String querry="update student12 set name=? where id=?;";
		ps=con.prepareStatement(querry);
		ps.setString(1, data[0]);
		ps.setInt(2,Integer.parseInt(data[1]));
		
		int n=ps.executeUpdate();
		
		System.out.println(n + "one rows affected");


	}

}
