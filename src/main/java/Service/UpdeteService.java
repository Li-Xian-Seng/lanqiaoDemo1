package Service;

import dao.Updete1Dao;
import model.User;

public class UpdeteService {
	public int updeteService(String username,String password,String name,String age,String email,String tel,String id) {
		User user=new User();
		user.setAge(age);
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);
		user.setTel(tel);
		user.setUserId(id);
		user.setUsername(username);
		Updete1Dao d=new Updete1Dao();
		return d.updete1Dao(user);
	
	}
}
