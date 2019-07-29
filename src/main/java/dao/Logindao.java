package dao;

import java.util.List;
import java.util.Map;

import Until.DButil;
import Until.StringUtil;
import model.User;
import sun.swing.StringUIClientPropertyKey;

public class Logindao {
	public User logindao(String name,String password) {
		String sql="select * from user_1 where user_name=? and password=?";
		List<Map<String,Object>> list= DButil.query(sql,name,password);
		User user=null;
		if(list.size()>0) {
			user=new User();
			user.setUsername(StringUtil.valueof(list.get(0).get("user_name")));
			user.setUserId(StringUtil.valueof(list.get(0).get("user_id")));
			user.setPassword(StringUtil.valueof(list.get(0).get("password")));
		}
		
		return user;
		
	}
}
