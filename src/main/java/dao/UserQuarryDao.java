package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Until.DButil;
import Until.StringUtil;
import model.User;

public class UserQuarryDao {
	public List<User> userQuarryDao(){
		String sql="select * from user_1";
		List<Map<String,Object>> list= DButil.query(sql);
		List<User> list1=new ArrayList();
		
		User user = null;
		for(int i=0;i<list.size();i++) {
			if(Integer.valueOf(StringUtil.valueof(list.get(i).get("status")))==1) {
				user=new User();
				user.setUserId(StringUtil.valueof(list.get(i).get("user_id")));
				user.setUsername(StringUtil.valueof(list.get(i).get("user_name")));
				user.setPassword(StringUtil.valueof(list.get(i).get("password")));
				user.setName(StringUtil.valueof(list.get(i).get("name")));
				user.setAge(StringUtil.valueof(list.get(i).get("age")));
				user.setEmail(StringUtil.valueof(list.get(i).get("email")));
				user.setTel(StringUtil.valueof(list.get(i).get("tel")));
				list1.add(user);
			}
			
		}
		return list1;
	}
}
