package web;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public LoginServlet() {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	 System.out.println("スタートします");
		request.setCharacterEncoding("UTF-8");
		JDBCyeah otupoyo = new JDBCyeah();
		String paramUserName= request.getParameter("userName");
		String paramPw=request.getParameter("password");
		String userName=null;
		String pw=null;
		ResultSet rs=otupoyo.Login();
		try {
			while(otupoyo.rs.next()) {
					pw= rs.getString("login_pw");
					userName = rs.getString("user_name");
					String login="select user_name,login_pw from user";
//					ArrayList<> list new )();
				}}catch (SQLException e) {
					e.printStackTrace();
		}
//ログイン処理
		if(userName.equals(paramUserName)&&pw.equals(paramPw)) {
		HttpSession session = request.getSession(true);
		session.setAttribute("loginUser", "User_name");
		response.setContentType("text/html;charset=UTF-8");
		RequestDispatcher rd = request.getRequestDispatcher("/kensaku.jsp");
		rd.forward(request, response);

		}else if(paramUserName==null||paramUserName.equals(" ")
				||paramPw==null||paramPw.equals(" ")){
			RequestDispatcher rd = request.getRequestDispatcher("/null.jsp");
			rd.forward(request,response);
		}else if(userName!=paramUserName||pw!=paramPw) {
			RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
			rd.forward(request,response);
		}

	}
}

