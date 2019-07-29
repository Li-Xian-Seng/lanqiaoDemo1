package Service;

import dao.Logindao;
import model.User;

public class LoginService {
	public User loginService(String name,String password) {
		Logindao d=new Logindao();
		
		return d.logindao(name, password);
	}
}
