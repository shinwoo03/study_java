package dao;

public class UpdateDAO extends ListDAO{
	//저장된 데이터를 조회해야 변경 할 수 있다.
	//조회 메소드를 갖는 클래스 상속하기
	
	public void update() {
		System.out.println("데이터 변경 저장");
	}

}
