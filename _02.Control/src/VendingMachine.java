import java.util.Scanner;

public class VendingMachine {
public static void main(String[] args) {
	//각 메뉴의 금액을 담을 변수선언
	int cola = 1250 ;
	int letsbe = 1000;
	int	coco = 900;

	//자판기메뉴
	System.out.println("----자판기메뉴----");
	System.out.printf("1. 코카콜라 : %d원 \n", cola);
	System.out.printf("2. 레쓰비 : %d원 \n", letsbe);
	System.out.printf("3. 코코팜 : %d원 \n", coco);
	
	//돈을 투입구에 넣는다
	System.out.println("투입구에 돈을 넣으세요.");
	//키보드로 입력해서 돈을 투입하기 : 투입한 돈을 담을 변수 선언
	
	Scanner scan ;
	scan = new Scanner(System.in);

	int money = scan.nextInt() ;
	//투입금액에 따라 선택할 수 있는 음료에 선택가능 램프가 켜지도록 한다.
	
	if (money >= letsbe ) {
		System.out.println("레쓰비 선택 가능");
	} 
	if (money >= coco) {
		System.out.println("코코팜 선택 가능");
	} 
	if (money >= cola) {
		System.out.println("콜라 선택 가능");
	}
	
	System.out.println("음료를 선택하시오.");
		
	new Scanner(System.in);
	
	
	//메뉴중 하나를 선택하기
	cola = 1;
	letsbe = 2;
	coco = 3;
	
	if (cola == 1 )
	//거스름돈 계산
	
	
	
	//메뉴가격에 따라서 >제품 나오고, 거스름돈이 나온다.<
	//1000원짜리 몇개
	//500원짜리 몇개
	//100원짜리 몇개
	//50원짜리 몇개
	
	
	
}
}
