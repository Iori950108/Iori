package web;
import java.io.Serializable;
public class LoginBean implements Serializable{
	static final long serialVersionUID = 1L;
	private String pw;
	private String UserName;

	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String UserName) {
		this.UserName = UserName;
	}


}