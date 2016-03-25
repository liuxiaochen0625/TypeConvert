package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import domain.UserBean;

public class Regist_map_Action extends ActionSupport{
	private Map<String, UserBean> users;
	private String tip;
	
	public String execute(){
		if(getUsers().get("one").getName().equals("crazyit")&&getUsers().get("one").getPass().equals("leegang")){
			setTip("登录成功");
			return SUCCESS;
		}
		else {
			setTip("登录失败");
			return ERROR;
		}
	}
	
	
	public String getTip() {
		return tip;
	}


	public void setTip(String tip) {
		this.tip = tip;
	}


	public Map<String, UserBean> getUsers() {
		return users;
	}

	public void setUsers(Map<String, UserBean> users) {
		this.users = users;
	}
	
}
