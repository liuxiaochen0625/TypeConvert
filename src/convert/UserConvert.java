package convert;

import java.util.Map;

import domain.User;
import ognl.DefaultTypeConverter;


public class UserConvert extends DefaultTypeConverter{
	@Override
	public Object convertValue(Map context,Object value,Class toType){
		if(toType .equals(User.class)){
			String []param = (String [])value;
			User user = new User();
			String []userValues = param[0].split(",");
			user.setName(userValues[0]);
			user.setPass(userValues[1]);
			return user;
		}else if(toType.equals(String.class)){
			User user = (User)value;
			return "<"+user.getName()+","+user.getPass()+">";
		}
		return null;
	}
}
