package action;

import java.util.Date;

import com.opensymphony.xwork2.Action;

import domain.User;

public class LoginAction_global implements Action{

	private User user;
	private User customer;
	private String tip;
	private Date birth;
	
	@Override
	public String execute() throws Exception {
		if (getUser().getName().equals("crazyit")
				&& getUser().getPass().equals("leegang") )
			{
				setTip("转换成功");
				return SUCCESS;
			}
			else
			{
				setTip("转换失败");
				return ERROR;
			}
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getCustomer() {
		return customer;
	}

	public void setCustomer(User customer) {
		this.customer = customer;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

}
