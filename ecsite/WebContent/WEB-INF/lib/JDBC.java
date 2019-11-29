package ecsite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 例外あり
		try {
			// JDBCドライバ(MYSQL用)を登録する
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException ex) {
			// 例外処理
			ex.printStackTrace();
		}

		// DBに接続するために必要な情報を変数定義している。
		// 接続する場所を定義(URLとして)
		String url = "jdbc:mysql://localhost/ecsite";
		// 接続する際のIDを定義
		String id = "root";
		// 接続する際のパスワードを定義
		String pass = "password";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 引数(url,id,pass)をもとに、実際にDBに接続する。
			// connの代入結果としては、接続が成功したか失敗したかの結果が
			conn = DriverManager.getConnection(url, id, pass);

			// 接続に成功した場合は、stmtに接続情報を設定する。
			stmt = conn.createStatement();

			String query = "SELECT * FROM zaiko";
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				int id1 = rs.getInt(1);
				String name = rs.getString("name");
				int price = rs.getInt("price");
				System.out.println(id1 + " " + name + " " + price);
			}

		} catch (SQLException ex) {
			ex.printStackTrace();

			// finally例外発生の有無に関わらず、必ず実行される
		} finally {
			try {
				// 一番最後に使ったものから順に消していくのが好ましい
				// rsをcloseする
				if (rs != null)
					rs.close();
				// stmtをcloseする
				if (stmt != null)
					stmt.close();
				// connをcloseする
				if (conn != null)
					conn.close();
			} catch (Exception ex) {

				// 例外の情報をコンソールに表示する
				ex.printStackTrace();
			}

		}

	}

}
