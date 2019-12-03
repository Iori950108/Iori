package web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

	public class SearchLogic{
		public ArrayList<SearchBean>Search(int proCd,String proName,
				String stockNo,int price,String catId,String proImg,
				String proMsg){

			// DBにアクセスする情報変数
			// String url = "jdbc:mysql://localhost/ecsite?autoReconnect=true&useSSL=false";
			String url = "jdbc:mysql://localhost/ECSite";
			String id = "root";
			String pw = "password";

			Connection cnct = null;
			PreparedStatement pst = null;
			ResultSet rs = null;
			System.out.println();
			// UserBeanを格納するArrayListを定義
			ArrayList<SearchBean> list = new ArrayList<SearchBean>();

			// DBに接続
			try {
				Class.forName("com.mysql.jdbc.Driver");
				cnct = DriverManager.getConnection(url, id, pw);

				// PreparedStatementを使用する方が理想
				// ※引数の数が変更することがないため
				// ※SQL文で取得するデータを限定すること
				String sql = "SELECT * FROM product";
				pst = cnct.prepareStatement(sql);


				// パラメータをセット
				pst.setInt	 (1, proCd);
				pst.setString(2, proName);
				pst.setString(3, stockNo);
				pst.setInt	 (4, price);
				pst.setString(5, catId);
				pst.setString(7, proImg);
				pst.setString(7, proMsg);

				// SQLを実行する
				rs = pst.executeQuery();

				// 取得データ分繰り返し
				while (rs.next()) {
					// SearchBeanにproductテーブルのデータを格納
					SearchBean product = new SearchBean();
					product.setProCd(rs.getInt(1));
					product.setProName(rs.getString(2));
					product.setStockNo(rs.getString(3));
					product.setPrice(rs.getInt(4));
					product.setCatId(rs.getString(5));
					product.setProImg(rs.getString(6));
					product.setProMsg(rs.getString(7));
					// ArrayListに格納
					list.add(product);
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
