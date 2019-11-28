package web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCyeah {


	public String userName=null;
	public String pw=null;
	public ResultSet rs=null;


	public  ResultSet Login(){

			Connection conn =null;
			String url = "jdbc:mysql://localhost/ecsite";
			String id = "root";

			String pass = "password";


	    	try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("u");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			try {
				System.out.println("a");

		    	conn = DriverManager.getConnection(url,id,pass);
		    	System.out.println("a1");
		    	Statement stmt = conn.createStatement();
		    	System.out.println("i");
		    	String login="select user_name,login_pw from user";
		    	System.out.println("i2");
//		    	user nameとpassword参照
		    	rs=stmt.executeQuery(login);


		    	while(rs.next()) {
		    		pw= rs.getString("login_pw");
		    		userName = rs.getString("user_name");

		    		}


		    	} catch (SQLException ex) {
		    	ex.printStackTrace();

			}
				return rs;
		}


	}