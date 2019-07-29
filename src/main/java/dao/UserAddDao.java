package dao;

import Until.DButil;
import model.User;

public class UserAddDao {
	public int userAddDao(User user) {
		String sql="INSERT INTO `haha`.`user_1`(`user_id`, `user_name`, `password`, `name`, `age`, `email`, `tel`, `status`) VALUES (null,?,?,?,?,?,?,1)";
		int i=DButil.update(sql, user.getUsername(),user.getPassword(),user.getName(),user.getAge(),user.getEmail(),user.getTel());
		return i;
	}
}
