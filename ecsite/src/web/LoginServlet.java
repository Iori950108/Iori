package web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public LoginServlet() {
		super();

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("スタートします");
		request.setCharacterEncoding("UTF-8");
		System.out.println("start2");
		String UserName= request.getParameter("userName");
		System.out.println("start3");
		String pw=request.getParameter("pw");
//ログイン処理
		if(UserName==null||UserName.equals("")
				||pw==null||pw.equals("")){
			RequestDispatcher rd = request.getRequestDispatcher("/null.jsp");
			rd.forward(request,response);
			return;
		}
		JDBCyeah  login = new JDBCyeah();
		ArrayList<LoginBean>list=null;
		list =login.login(UserName,pw);


		if(list.size() !=1) {
			RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
			rd.forward(request,response);
			return;
		}
			HttpSession session = request.getSession(true);
			LoginBean user=list.get(0);
			session.setAttribute("s_user", user);
			request.setAttribute("r_user", user);
			request.setAttribute("userList", list);

			RequestDispatcher rd = request.getRequestDispatcher("/kensaku.jsp");
			rd.forward(request, response);


	}
}

