package action;

import com.opensymphony.xwork2.ActionSupport;

import domain.UserBean;

public class Regist_ongl_Action extends ActionSupport{
	private UserBean user;
	private String tip;
	
	public String execute(){
		setTip("转换成功");
		return SUCCESS;
	}
	
	public UserBean getUser() {
		return user;
	}
	public void setUser(UserBean user) {
		this.user = user;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	
	
}
