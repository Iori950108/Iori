package web;

import java.io.Serializable;

public class UserBean implements Serializable {

	static final long serialVersionUID = 1L;
	private int userId;
	private String userName;
	private String loginCd;
	private String loginPw;

	/**
	 * @return userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId セットする userId
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName セットする userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return loginCd
	 */
	public String getLoginCd() {
		return loginCd;
	}
	/**
	 * @param loginCd セットする loginCd
	 */
	public void setLoginCd(String loginCd) {
		this.loginCd = loginCd;
	}
	/**
	 * @return loginPw
	 */
	public String getLoginPw() {
		return loginPw;
	}
	/**
	 * @param loginPw セットする loginPw
	 */
	public void setLoginPw(String loginPw) {
		this.loginPw = loginPw;
	}

}
