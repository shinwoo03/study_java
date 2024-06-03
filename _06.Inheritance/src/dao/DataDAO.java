package dao;

public interface DataDAO {
	//개발자 A는 데이터등록저장
	void insert();
	
	//개발자 B는 데이터목록보기
	void list();
	
	//개발자 C는 데이터변경저장
	void update();
	
	//개발자 D는 데이터삭제
	void delete();
	

}
