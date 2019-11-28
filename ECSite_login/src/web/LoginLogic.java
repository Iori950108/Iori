package web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LoginLogic {

	// 戻り値にArrayList<UserBean>
	// UserBeanとかでも構わない
	public ArrayList<UserBean> login(String login_cd, String login_pw) {

		// DBにアクセスする情報変数
		// String url = "jdbc:mysql://localhost/ecsite?autoReconnect=true&useSSL=false";
		String url = "jdbc:mysql://localhost/lesson20xx";
		String id = "root";
		String pw = "password";

		Connection cnct = null;
		PreparedStatement pst = null;
		ResultSet rs = null;

		// UserBeanを格納するArrayListを定義
		ArrayList<UserBean> list = new ArrayList<UserBean>();

		// DBに接続
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cnct = DriverManager.getConnection(url, id, pw);

			// PreparedStatementを使用する方が理想
			// ※引数の数が変更することがないため
			// ※SQL文で取得するデータを限定すること
			String sql = "SELECT * FROM user WHERE login_cd = ? AND login_pw = ?";
			pst = cnct.prepareStatement(sql);

			// パラメータをセット
			pst.setString(1, login_cd);
			pst.setString(2, login_pw);

			// SQLを実行する
			rs = pst.executeQuery();

			// 取得データ分繰り返し
			while (rs.next()) {
				// UserBeanにuserテーブルのデータを格納
				UserBean user = new UserBean();
				user.setUserId(rs.getInt(1));
				user.setUserName(rs.getString(2));
				user.setLoginCd(rs.getString(3));
				user.setLoginPw(rs.getString(4));
				// ArrayListに格納
				list.add(user);
			}

		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pst != null)
					pst.close();
				if (cnct != null)
					cnct.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		// 戻り値を返却
		return list;

	}

}
