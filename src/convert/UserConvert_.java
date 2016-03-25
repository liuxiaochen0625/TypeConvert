package convert;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import domain.User;

public class UserConvert_ extends StrutsTypeConverter{

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		// 如果请求参数数组的长度大于1
		if (values.length > 1)
		{
			// 创建一个List对象，List对象的元素类型是User
			List<User> result = new ArrayList<User>();;
			// 遍历请求参数数组
			for (int i = 0; i < values.length ; i++ )
			{
				// 将每个数组元素转换成一个User实例
				User user = new User();
				String[] userValues = values[i].split(",");
				user.setName(userValues[0]);
				user.setPass(userValues[1]);
				// 将转换的User实例装入List对象
				result.add(user);
			}
			return result;
		}
		// 如果请求参数数组的长度为1
		else
		{
			// 创建一个User实例
			User user = new User();
			// 将请求参数转换成一个User实例
			String[] userValues = values[0].split(",");
			user.setName(userValues[0]);
			user.setPass(userValues[1]);
			return user;
		}
	}

	@Override
	public String convertToString(Map context, Object o) {
		// 如果需要转换的值是单个的User实例
		if (o instanceof User)
		{
			User user = (User)o;
			return "<" + user.getName()
				+ "," + user.getPass() + ">";
		}
		// 如果需要转换的值是List对象
		else if (o instanceof List)
		{
			List<User> users = (List<User>)o;
			String result = "[";
			for (User user : users )
			{
				result += "<" + user.getName()
					+ "," + user.getPass() + ">";
			}
			return result + "]";
		}
		else
		{
			return "";
		}
	}

}
