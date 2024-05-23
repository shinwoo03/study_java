package d0523;

public class PiggyBankMain {
	public static void main(String[] args) {
		
		//객체 생성문 == 생성자 호출문
		PiggyBank hong 
		= new PiggyBank("홍길동");
	
		
		piggyInfo(hong);
		
		
	}
	static void piggyInfo(PiggyBank who) {
		System.out.println( who.owner + " 돼지저금통");
		System.out.println("현재 저금통안엔 " + who.total);
	}
	
	
	
}
