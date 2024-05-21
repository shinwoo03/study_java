import java.util.Scanner;

public class Gender00 {
//	학생명과 성별을 각각 배열을 담자
//	키보드로 이름 입력시 해당 성별을 출력하기
//	제시문 : 누구의 성별을 알고 싶나요?
//	결과 : xxx 의 성별 :xx
//
//	선언할 메소드
//	1. 성별을 반환하는 메소드
//	2. index 를 반환하는 메소드(배열의 위치를)
//	메소드 2개를 만들어야 함.
//
//
//	"강철리", "김선우", "김종덕", "김현준", "박지빈", "신명섭", "이해진", "한신우"
//	"남", "남", "남", "남", "남", "남", "여", "여"
//	"010-1111-2222", "010-2222-3333", "010-3333-4444", "010-4444-5555", "010-5555-6666", "010-6666-7777", "010-7777-8888", "010-8888-9999"	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
//		실습
//		학생명과 성별을 각각 배열로 담자.
		String[] students 
		= {"강철리", "김선우", "김종덕", "김현준", "박지빈", "신명섭", "이해진", "한신우"};
		String[] genders = { "남", "남", "남", "남", "남", "남", "여", "여" };
		String[] phones 
		= { "010-1111-2222", "010-2222-3333", "010-3333-4444"
			, "010-4444-5555", "010-5555-6666", "010-6666-7777"
			, "010-7777-8888", "010-8888-9999" };
		
//		키보드로 이름 입력시 해당 성별을 출력하기
//		제시문: 누구의 성별을 알고 싶나요?
		System.out.print("누구의 성별을 알고 싶나요? ");
		String who = sc.next();
		
//		결과: 홍길동의 성별: 남
		String gender = yourGender(students, who, genders);
		printInfo(who, gender, ! gender.isEmpty() );
//		if( gender.isEmpty() )
//			System.out.println(who + "의 정보가 없습니다." );
//		else
//			System.out.println(who + "의 성별: " + gender);

		int idx = yourGender(students, who);
		printInfo(who, idx==-1? "": genders[idx], idx==-1? false: true);
//		if( idx == -1 ) {
//			System.out.println(who + "의 정보가 없습니다.");
//		}else {
//			System.out.println(who + "의 성별: " + genders[idx]);
//		}
		
		//성별과 전화번호 출력하기
		String[] info = yourGender( who, students, genders, phones );
		boolean exist = info[0] == null ? false : true;
		printInfo("성별", who, info[0], exist);
		printInfo("전화번호", who, info[1], exist);
//		if( info[0] == null ) {
//			System.out.println(who + "의 정보는 없습니다");
//		}else {
//			System.out.println(who + "의 성별: " + info[0]); 
//			System.out.println(who + "의 전화번호: " + info[1]);
//		}
	}
	//출력메소드
	static void printInfo(String title, String name, String info, boolean exist) {
		if( ! exist )
			System.out.println(name + "의 정보가 없습니다." );
		else
			System.out.printf(name + "의 %s: " + info + "\n", title);
	}
	
	static void printInfo(String name, String gender, boolean exist) {
		if( ! exist )
			System.out.println(name + "의 정보가 없습니다." );
		else
			System.out.println(name + "의 성별: " + gender);
	}
	
	
	
//	3. 성별과 전화번호를 반환하는 메소드
	static String[] yourGender(String name, String students[]
							, String genders[], String phones[]) {
		String info[] = new String[2];
		for(int idx=0; idx<students.length; idx++) {
			if( name.equals( students[idx] ) ) {
				info[0] = genders[idx];
				info[1] = phones[idx];
				break;
			}
		}
		return info;
	}
	
//	2. index(배열의 위치) 를 반환하는 메소드
	static int yourGender(String students[], String name) {
		int position = -1;
		for(int idx=0; idx<students.length; idx++) {
			if( name.equals( students[idx] ) ) {
				position = idx;
				break;
			}
		}
		return position;
	}
	
	
//	1. 성별을 반환하는 메소드
	static String yourGender(String students[], String name, String genders[]) {
		String gender = "";
		for(int idx=0; idx<students.length; idx++) {
			if( students[idx].equals( name ) ) {
				gender = genders[idx];
				break;
			}
		}
		return gender;
	}
	
}