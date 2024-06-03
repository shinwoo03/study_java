package drink;

import java.util.Scanner;

public class DrinkMain { //한신우
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DrinkDTO[] drinks = new DrinkDTO[10];
		drinks[0] = new DrinkDTO("콜라", 1000, 20);
		drinks[1] = new DrinkDTO("코코팜", 1500, 10);
		
		DrinkDAO insert = new DrinkInsertDAO (drinks, scan);
		DrinkDAO list = new DrinkListDAO (drinks, scan);
		DrinkDAO info = new DrinkInfoDAO (drinks, scan);
		DrinkDAO update = new DrinkUpdateDAO (drinks, scan);
		DrinkDAO delete = new DrinkDeleteDAO (drinks, scan);
		DrinkDAO search = new DrinkSearchDAO (drinks, scan);
		
		
		System.out.println("음료관리 프로그램");
		int button = 0;
		do {
			System.out.println("---------------------");
			System.out.println("1.음료등록  2.음료목록보기   3.음료정보보기");
			System.out.println("4.음료정보변경   5.음료정보삭제  6. 음료검색 ");
			System.out.println("0. 종료");
			System.out.println("---------------------");
			System.out.println("기능선택 : ");
			button = scan.nextInt();
			
			if ( button == 1) {
				insert.insert();
			}else if ( button == 2) {
				list.list();
			}else if ( button == 3) {
				list.list();
				info.info();
			}else if ( button == 4) {
				list.list();
				update.update();
			}else if ( button == 5) {
				list.list();
				delete.delete();
			}else if (button == 6) {
				search.search();
				
				
				
			}
			
		}while( button != 0);
		
		scan.close();
		System.out.println("프로그램 종료....");
	}
}
