package web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		// super.doPost(req, resp);

		req.setCharacterEncoding("UTF-8");

		// パラメータを取得
		String login_cd =req.getParameter("login_cd");
		String login_pw =req.getParameter("login_pw");

		// パラメータがない場合
		if((login_cd.equals("") || login_cd == null)||
				login_pw.equals("") || login_pw == null) {
			// エラー画面へディスパッチ
			RequestDispatcher rd = req.getRequestDispatcher("jsp/LoginError1.jsp");
			rd.forward(req, resp);
			// returnしないと後の処理が実施
			return;
		}

		// インスタンスを生成
		LoginLogic login = new LoginLogic();

		// ArrayListを定義
		ArrayList<UserBean> list = null;

		// LoginLogicのloginを呼び出す
		// 戻り値はArrayList
		list = login.login(login_cd, login_pw);

//System.out.println("list.size():" + list.size());
		if (list.size() != 1 ) {
			// エラー画面へディスパッチ
			RequestDispatcher rd = req.getRequestDispatcher("jsp/LoginError2.jsp");
			rd.forward(req, resp);
			// returnしないと後の処理が実施
			return;
		}

		// セッションをON
		HttpSession session = req.getSession(true);

		// listの1番目を取り出す
		UserBean user = list.get(0);

		// セッションにuserBeanを格納
		session.setAttribute("s_user", user);

		// リクエストにuserBeanを格納
		req.setAttribute("r_user", user);

		// ArrayListを格納する等も可能
		req.setAttribute("userList", list);

		// 検索画面へディスパッチ
		RequestDispatcher rd = req.getRequestDispatcher("jsp/Search.jsp");
		rd.forward(req, resp);

	}


}
