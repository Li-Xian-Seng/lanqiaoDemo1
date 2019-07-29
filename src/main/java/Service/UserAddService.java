package Service;

import dao.UserAddDao;
import model.User;

public class UserAddService {
	public int userAddService(String username,String password,String name,String age,String email,String tel) {
		UserAddDao d=new UserAddDao();
		User user=new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		user.setEmail(email);
		user.setAge(age);
		user.setTel(tel);
		return d.userAddDao(user);
	}
}
