package d0524;

public class Member {
	//필드 : 이름*, 아이디*, 비밀번호*, 성별*, 나이, 전화번호
	//(필드) 접근제한자(접근제어자) : public, protected, default, private
	//private : 클래스내에서 접근 가능 (클래스를 벗어나면 사용못함)
	String name, id, pw, gender, phone;
	int age;
	
	//생성자
	Member(String name, String id, String pw, String gender) {
		this.name = name ;
		this.id = id ;
		this.pw = pw ;
		this.gender = gender ;
	}
	
	Member(String name, String id, String pw, String gender, int age) {
		this (name, id, pw, gender);
		this.age = age;
	}
	
	Member(String name, String id, String pw, String gender, String phone) {
		this (name, id, pw, gender);
		this.phone = phone;
	}
	
	Member(String name, String id, String pw, String gender, String phone, int age) {
		//1.
//		this (name, id, pw, gender);
//		this.phone = phone;
//		this.age = age;
		
		//2.
//		this (name, id, pw, gender, phone);
//		this.age = age;
		
		//3.
		this (name, id, pw, gender, age);
		this.phone = phone;		
	}
	
// 메소드
	//비밀번호 변경, 전화번호 변경, 나이변경, 성별변경
	void changePassword(String pw) {
		this.pw = pw;
	}
	void changePhone (String phone) {
		this.phone = phone;
	}
	//값을 넣는다 : set 메소드 - set 필드명(){} 필드명의 시작은 대문자로 시작한다.
	void setAge(int age) {
		this.age = age;
	}
	void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}
