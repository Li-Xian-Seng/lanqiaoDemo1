package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Until.DButil;
import Until.StringUtil;
import model.User;

public class QuaryUserDao {
	public User userQuarryDao(String id){
		String sql="select * from user_1 where user_id=?";
		List<Map<String,Object>> list= DButil.query(sql,id);
		User user = null;
		for(int i=0;i<list.size();i++) {
			
				user=new User();
				user.setUserId(StringUtil.valueof(list.get(i).get("user_id")));
				user.setUsername(StringUtil.valueof(list.get(i).get("user_name")));
				user.setPassword(StringUtil.valueof(list.get(i).get("password")));
				user.setName(StringUtil.valueof(list.get(i).get("name")));
				user.setAge(StringUtil.valueof(list.get(i).get("age")));
				user.setEmail(StringUtil.valueof(list.get(i).get("email")));
				user.setTel(StringUtil.valueof(list.get(i).get("tel")));
				
			}
			
		
		return user;
	}
}
