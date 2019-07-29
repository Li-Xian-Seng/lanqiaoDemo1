package Service;

import dao.QuaryUserDao;
import model.User;

public class QuarryUserService {
	public User quarryUser(String id) {
		QuaryUserDao q=new QuaryUserDao();
		return q.userQuarryDao(id);
	}
}
