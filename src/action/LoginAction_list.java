package action;

import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.Action;

import domain.User;

public class LoginAction_list implements Action{
	private List<User> users;
	private Date birth;
	private String tip;
	@Override
	public String execute() throws Exception {
		if (getUsers().get(0).getName().equals("crazyit")
				&& getUsers().get(0).getPass().equals("leegang") )
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
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}

	
}
