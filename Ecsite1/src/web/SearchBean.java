package web;

import java.io.Serializable;

	public class SearchBean implements Serializable {
		private int proCd;
		private String proName;
		private String stockNo;
		private int price;
		private String catId;
		private String proImg;
		public String getProImg() {
			return proImg;
		}
		public void setProImg(String proImg) {
			this.proImg = proImg;
		}
		private String proMsg;

		public int getProCd() {
			return proCd;
		}
		public void setProCd(int proCd) {
			this.proCd = proCd;
		}
		public String getProName() {
			return proName;
		}
		public void setProName(String proName) {
			this.proName = proName;
		}
		public String getStockNo() {
			return stockNo;
		}
		public void setStockNo(String stockNo) {
			this.stockNo = stockNo;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getCatId() {
			return catId;
		}
		public void setCatId(String catId) {
			this.catId = catId;
		}
		public String getProMsg() {
			return proMsg;
		}
		public void setProMsg(String proMsg) {
			this.proMsg = proMsg;
		}
}
