
public class PiggyBankMain {
	public static void main(String[] args) {
		//돼지저금통 만들기 - 객체생성
		//데이터타입 변수명
		//PiggyBank hong; //null이 담겨있다.
		//돼지저금통을 만드는거기 때문에 변수타입이 PiggyBank가 된다.
		//hong = new PiggyBank(); //:객체생성문
		
		PiggyBank hong = new PiggyBank(); 
		hong.owner = "홍길동";
		System.out.println("저금통 주인 : " + hong.owner);
		System.out.println( "저금통의 총액 : " + hong.total );
		
		int money;
		
		money = 1000;
		hong.inputMoney(money);
		System.out.println( money + "원 넣어 저금통의 총액 : " + hong.total );
		
		money = 2000;
		hong.inputMoney(money);
		System.out.println( money + "원 넣어 저금통의 총액 : " + hong.total );
		
		money = 5000;
		hong.inputMoney(money);
		System.out.println( money + "원 넣어 저금통의 총액 : " + hong.total );
		
		howMuch(500, hong);
		
		money = 1500;
		hong.output_money(money);
		System.out.println( money + "원 빼내서 저금통의 총액 : " + hong.total );
		
		money = 3000;
		hong.output_money(money);
		System.out.println( money + "원 빼내서 저금통의 총액 : " + hong.total );
		
		howMinus(1000, hong);
		
//		String owner;
//		int total = 0;
//		owner = "홍길동";
//		System.out.println("저금통 주인 : " + owner);
//		System.out.println("저금통 총액 : " + total);
		
	//심청의 저금통 준비하기
		PiggyBank sim = new PiggyBank ();
		
		System.out.println( "===심청의 저금통===" );
		//5000원 넣기
		howMuch(sim, 5000, true);
		//1000원 넣기
		howMuch(sim, 1000, true);
		
		//2000원 빼기
		howMuch(sim, 2000, false);
		
		//500원 빼기
		howMuch(sim, 500, false);
		
		
	}
	
	static void howMuch(PiggyBank who, int money, boolean in) {
		if ( in ) {
			who.inputMoney(money);
		}else {
			who.output_money(money);
		}
		System.out.printf( "%d원 %s저금통 총액 : %d \n", 
							money, in? "넣어" : "빼내", who.total );
	}
	
	
	
	static void howMuch(int money, PiggyBank hong) {
		hong.inputMoney(money);
		System.out.println( money + "원 넣어 저금통의 총액 : " + hong.total );
		
	}
	static void howMinus (int money, PiggyBank hong) {
		hong.output_money(money);
		System.out.println( money + "원 빼내서 저금통의 총액 : " + hong.total );
		
	}
}
