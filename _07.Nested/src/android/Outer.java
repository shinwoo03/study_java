package android;


public class Outer {
	int field = 10; //선언한 필드에 데이터 담기
	String data = "10";//new String()3
//	Button btn = new Button() {};
		
	
	
	
	//익명클래스
	Button btn = new Button() {
		public void click() {
			System.out.println("익명 버튼클래스를 필드 클릭");
		}
	};
	
//	String function() {
//		return new String();
//	}
	
	Button method() {
		return new Button() {
			public void click() {
				System.out.println("익명 버튼클래스를 메소드를 통해서 클릭");
			}
		};
	}
	
}
