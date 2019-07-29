package dao;

import Until.DButil;

public class DeleteDao {
	public int deleteDao(String id) {
		String sql="UPDATE `haha`.`user_1` SET `status` = '0' WHERE `user_id` = ?";
		int i=DButil.update(sql, id);
		return i;
	}
}
