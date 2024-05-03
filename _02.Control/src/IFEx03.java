
public class IFEx03 {
public static void main(String[] args) {
	//분식집에 갔을 때 현금만 있더라.
	//현금의 금액(3500원)에 따라 김밥을 사먹는당. / 조용히 나온다
	//내 주머니에 돈을 확인한다.
	//카드의 유무에 따라서 김밥을 사먹는다.
		
	System.out.println("분식집에 들어간다.");
	System.out.println("주머니를 확인한다.");

	
	int money = 3500;
	boolean card = false;
	
	System.out.printf("돈은 %d가 있네 \n", money);
	System.out.printf("카드가 %s \n", card ? "있다" : "없다");
//		if (money >= 3500 ) {
//			System.out.println("현금결제 김밥을 사먹는다.");
//		
//		}else if(card == true) {
//			System.out.println("카드결제 김밥을 사먹는다.");
//		
//		} else {
//			System.out.println("조용히 나온다.");
//		}

	if (money >=3500 || card ) { //F == T (같냐 동등비교) T == T : T / F == T : F
		System.out.println("김밥을 사먹는다.");
	} else {
		System.out.println("조용히 나온다.");
	}
	
}
	
	
	
}
