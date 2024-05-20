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
	
	
	
	public static void main(String[] args) {
		String name[] = {"강철리", "김선우", "김종덕", "김현준", "박지빈", "신명섭", "이해진", "한신우"};
		String gender[] = {"남", "남", "남", "남", "남", "남", "여", "여"};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("누구의 성별을 알고 싶나용?");
		String names = scan.next();
		
		String result = genDer(name, names, gender);
		System.out.println(result);
	}
	
	//성별을 반환하는 메소드 선언
	static String genDer(String[] name, String names, String[] gen) {
		String g = "" ;
		for (int i=0; i<name.length; i++) {
			if(name[i].equals(names)) {
				g = gen[i];
			}
		}
		return g;
	}
	
}
