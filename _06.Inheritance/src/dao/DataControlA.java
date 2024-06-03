package dao;

public class DataControlA implements DataDAO {
	 InsertDAO dao = new InsertDAO();
	
	
	
	@Override
	public void insert() {
		dao.insert();
	}

	@Override
	public void list() {
		
	}

	@Override
	public void update() {

	}

	@Override
	public void delete() {

	}

}
