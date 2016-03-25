package action;

import com.opensymphony.xwork2.Action;

import domain.User;

public class LoginAction implements Action{

	private User user;
	private String tip;
	
	@Override
	public String execute() throws Exception {
		if(getUser().getName().equals("crazyit")&&getUser().getPass().equals("leegang")){
			setTip("登录成功");
			return SUCCESS;
		}else {
			setTip("登录失败");
			return ERROR;
		}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
	
	

}
