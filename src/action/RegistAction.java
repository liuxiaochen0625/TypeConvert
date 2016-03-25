package action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class RegistAction extends ActionSupport{
	private String name;
	private String pass;
	private Integer age;
	private Date birth;
	
	public RegistAction(){
		
	}
	public RegistAction(String name,String pass,Integer age,Date birth){
		this.name = name;
		this.pass = pass;
		this.age = age;
		this.birth = birth;
	}
	public String execute(){
		return SUCCESS;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
}
