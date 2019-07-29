package Service;

import java.util.List;

import dao.UserQuarryDao;
import model.User;

public class UserQuarryService {
	public List<User> userquarryService(){
		UserQuarryDao d=new UserQuarryDao();
		return d.userQuarryDao();
	}
}
