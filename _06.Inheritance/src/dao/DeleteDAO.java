package dao;

public class DeleteDAO extends ListDAO {
	//저장된 데이터를 조회해야 삭제할 수 있다.
	//조회 메소드를 갖는 클래스 상속하기
	public void delete() {
		System.out.println("데이터 정보 삭제");
	}
}
