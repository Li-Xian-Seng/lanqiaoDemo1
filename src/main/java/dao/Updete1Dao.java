package dao;

import Until.DButil;
import model.User;

public class Updete1Dao {
	public int updete1Dao(User user) {
		String sql="UPDATE `haha`.`user_1` SET `user_name` = ?, `password` =?, `name` =?, `age` = ?, `email` =?, `tel` = ? WHERE `user_id` = ?";
		int i=DButil.update(sql, user.getUsername(),user.getPassword(),user.getName(),user.getAge(),user.getEmail(),user.getTel(),user.getUserId());
	return i;
	}
}
