package action;

import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.If;

import com.opensymphony.xwork2.ActionSupport;

import domain.UserBean;

public class Regist_list_Action extends ActionSupport{
	private List<UserBean> users;
	private String tip;
	
	public String execute(){
		if(getUsers().get(0).getName().equals("crazyit")&&getUsers().get(0).getPass().equals("leegang")){
			setTip("登录成功");
			return SUCCESS;
		}else {
			setTip("登录失败");
			return ERROR;
		}
	}
	
	public List<UserBean> getUsers() {
		return users;
	}
	public void setUsers(List<UserBean> users) {
		this.users = users;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	
}
