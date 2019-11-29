package web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class JDBCyeah {

	public  ArrayList<LoginBean> login(String userName, String pw) {

			Connection conn =null;
			String url = "jdbc:mysql://localhost/ecsite";
			String id = "root";
			PreparedStatement pst = null;
			String pass = "password";
			ResultSet rs=null;

			ArrayList<LoginBean> list = new ArrayList<LoginBean>();


	    	try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("u");

		    	conn = DriverManager.getConnection(url,id,pass);
		    	System.out.println("a1");
		    	System.out.println("i");
		    	String login="select from user where login_pw=? AND user_name=?";
		    	System.out.println("i2");
//		    	user nameとpassword参照
		    	pst = conn.prepareStatement(login);
		    	pst.setString(1, userName);
		    	pst.setString(2, pw);
		    	rs=pst.executeQuery();


		    	while (rs.next()) {
					// UserBeanにuserテーブルのデータを格納
					LoginBean user = new LoginBean();
					user.setUserName(rs.getString(1));
					user.setPw(rs.getString(2));
					// ArrayListに格納
					list.add(user);
				}
	    		} catch (ClassNotFoundException ex) {
				ex.printStackTrace();


		    	} catch (SQLException ex) {
		    	ex.printStackTrace();

			}	finally {
				try {
					if (rs != null)
						rs.close();
					if (pst != null)
						pst.close();
					if (conn != null)
						conn.close();
				} catch (Exception ex) {
					ex.printStackTrace();
					}
				}
				return list;
		}

}