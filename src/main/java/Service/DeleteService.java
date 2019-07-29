package Service;

import dao.DeleteDao;

public class DeleteService {
	public int deleteService(String id) {
		DeleteDao d=new DeleteDao();
		return d.deleteDao(id);
	}
}
