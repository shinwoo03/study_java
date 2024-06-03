package dao;

public class ListDAO extends InsertDAO {
	//데이터행을 저장해서 조회할 수 있다.
	//저장 메소드를 갖는 클래스 상속하기
	
	public void list() {
		System.out.println("데이터 목록 보기");
	}

}
