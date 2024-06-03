package dao2;

public class DataControl {
	
	DataDAO dao;
	
	public void insert() {
		dao= new InsertDAO(); //다향성
		dao.insert();
		
	}
	public void list() {
		dao= new ListDAO();
		dao.list();
		
	}
	public void info() {
		dao = new InfoDAO();
		dao.info();
		
	}
	public void update() {
		dao = new UpdateDAO();
		dao.update();
		
	}
	public void delete() {
		dao = new DeleteDAO();
		dao.delete();
		
	}
	
	
	

}
