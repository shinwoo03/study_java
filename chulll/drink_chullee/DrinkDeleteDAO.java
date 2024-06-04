package drink;

import java.util.Scanner;

public class DrinkDeleteDAO extends DrinkManage implements DrinkDAO {

	public DrinkDeleteDAO(DrinkDTO[] drinks, Scanner scan) {
		super(drinks, scan);
	}
	@Override
	public void insert() {
	}

	@Override
	public void list() {
	}

	@Override
	public void info() {
	}

	@Override
	public void update() {
	}

	@Override
	public void delete() {
		System.out.println("삭제하실 음료의 번호를 입력하세요.");
		int drinkNo, idx;
		while(true) {
			drinkNo = scan.nextInt();
			idx = drinkNo-1;
			if( drinks[idx] != null) {
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 삭제하실 음료의 번호를 입력하세요.");
			}	
		}
		
		System.out.println("정말 삭제하시겠습니까? 예:1 아니오:2");
		while(true) {
			int num = scan.nextInt();
			if(num==1) {
				drinks[idx] = null;
				System.out.println("해당 상품이 삭제되었습니다.");
				break;
			}else if(num==2) {
				System.out.println("삭제가 취소되었습니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 삭제하시려면 숫자 1 아니면 2를 입력하세요.");				
			}
		}
	}

}
