import java.util.Scanner;

public class VendingMachine {
public static void main(String[] args) {
	//각 메뉴의 금액을 담을 변수선언
	Scanner scan ;
	scan = new Scanner(System.in);
	
	int cola = 1250 ;
	int letsbe = 1000;
	int	coco = 900;

	//자판기메뉴
	System.out.println("----자판기메뉴----");
	System.out.printf("1. 코카콜라 : %d원 \n", cola);
	System.out.printf("2. 레쓰비 : %d원 \n", letsbe);
	System.out.printf("3. 코코팜 : %d원 \n", coco);
	System.out.println("-----------------");
	
	//돈을 투입구에 넣는다
	System.out.println("투입구에 돈을 넣으세요.");
	//키보드로 입력해서 돈을 투입하기 : 투입한 돈을 담을 변수 선언
	

	int money = scan.nextInt() ;
	System.out.println("투입금액 : " + money);
	//투입금액에 따라 선택할 수 있는 음료에 선택가능 램프가 켜지도록 한다.
	boolean bCola = false, bLetsbe = false , bCoco = false;
	
	/*if (money >= cola) {
		bCola = true;
		bLetsbe = true;
		bCoco = true;
	} else if (money >= coco) {
		bLetsbe = true ;
		bCoco = true ;
	} else if(money >= letsbe) {
		bLetsbe = true;
	}
	*/
	
	if (money >= letsbe ) {
		bLetsbe = true;	
	} if (money >= coco) {
		bCoco = true;	
	} if (money >= cola) {
		bCola = true;
	}
	//선택가능 메뉴에 불켜짐 표현하기.
	System.out.printf("1. 콜라 : %d [%s] \n", cola, bCola ? "ON" : "OFF" );
	System.out.printf("2. 레츠비 : %d [%s] \n", letsbe, bLetsbe ? "ON" : "OFF" );
	System.out.printf("3. 코코팜 : %d [%s] \n", coco, bCoco ? "ON" : "OFF" );
	

	System.out.println("음료를 선택하시오.");
		
	//메뉴중 하나를 선택하기
	
	int choice = scan.nextInt();
	int change = money;
	if ( bCola && choice == 1 ) { //콜라선택
		System.out.println("콜라가 나온다.");
		 change = money - cola ;
		}else if (bLetsbe && choice ==2 ) {
			System.out.println("레쓰비가 나온다.");
			change = money - letsbe ;
		}else if (bCoco && choice ==3) {
			System.out.println("코코팜이 나온다.");
			change = money - coco ;
			
//		}else {
//			change = money;
			
		}
	
	
	System.out.printf("거스름돈 : %d \n", change);

	if ( change > 0) {//거스름돈이 있는 경우
		int c1000 = 0, c500 = 0, c100 = 0, c50 = 0;
		//3000원을 넣어서 1000짜리 구매 1000짜리가 두장이 나오면 된다.
		c1000 = change/1000;
		if(c1000 > 0) System.out.printf("1000원 %d장 \n", c1000);
		
		//나머지가 얼마인지에 따라서 나오는게 다름
		change %= 1000; //change = change % 1000;
		c500 = change / 500; //몫이 500원짜리 한개
		if(c500 > 0) System.out.printf("500원 %d개 \n", c500);
		
		change %= 500; //250원 남았을때
		c100= change / 100;
		if(c100 > 0) System.out.printf("100원 %d개 \n", c100);
		
		change %= 100 ;
		c50 = change / 50;
		if(c50 > 0) System.out.printf("50원 %d개 \n", c50);
		
		
	}
	
	
	//거스름돈 계산
	
	
	
	//메뉴가격에 따라서 >제품 나오고, 거스름돈이 나온다.<
	//1000원짜리 몇개
	//500원짜리 몇개
	//100원짜리 몇개
	//50원짜리 몇개
	
	
	
}
}
