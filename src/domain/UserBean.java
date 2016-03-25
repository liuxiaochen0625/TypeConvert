package domain;

import java.util.Date;

public class UserBean {
	private String name;
	private String pass;
	private Date birth;
	private Integer age;
	
	//无参构造函数
	public UserBean(){
	}
	
	//有参构造函数
	public UserBean(String name,String pass,Integer age,Date birth){
		this.name = name;
		this.pass = pass;
		this.age = age;
		this.birth = birth;
	}
	
	//getter and setter
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
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
