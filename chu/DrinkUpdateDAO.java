package drink;

import java.util.Scanner;

public class DrinkUpdateDAO extends DrinkManage implements DrinkDAO {

	public DrinkUpdateDAO(DrinkDTO[] drinks, Scanner scan) {
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
		System.out.println("변경하실 음료의 번호를 입력하세요.");
		int drinkNo, idx;
		while(true) {
			drinkNo = scan.nextInt();
			idx = drinkNo-1;
			if( drinks[idx] != null) {
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 변경하실 음료의 번호를 입력하세요.");
			}	
		}
		
		System.out.println("번호\t음료명\t가격\t수량");
		System.out.println(idx+1 + "\t" + drinks[idx].name + "\t" + drinks[idx].price + "\t" + drinks[idx].quantity);
		System.out.println("음료의 이름을 변경하시겠습니까? 예:1 아니오:2");
		while(true) {
			int yesOrNo = scan.nextInt();
			if(yesOrNo == 1) {
				scan.nextLine(); // 버퍼 비우기
				System.out.println("이름을 무엇으로 변경하실지 입력하세요.");
				drinks[idx].name = scan.nextLine();
				break;
			}else if(yesOrNo == 2) {
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 이름을 변경하시려면 숫자 1 아니면 2를 눌러주세요.");
			}
		}
		
		System.out.println("음료의 가격을 변경하시겠습니까? 예:1 아니오:2");
		while(true) {
			int yesOrNo = scan.nextInt();
			if(yesOrNo == 1) {
				scan.nextLine(); // 버퍼 비우기
				System.out.println("가격을 얼마로 변경하실지 입력하세요");
				drinks[idx].price = scan.nextInt();
				break;
			}else if(yesOrNo == 2) {
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 가격을 변경하시려면 숫자 1 아니면 2를 눌러주세요.");
			}
		}
		
		System.out.println("음료의 수량을 변경하시겠습니까? 예:1 아니오:2");
		while(true) {
			int yesOrNo = scan.nextInt();
			if(yesOrNo == 1) {
				scan.nextLine(); // 버퍼 비우기
				System.out.println("수량을 몇개로 변경하실지 입력하세요.");
				drinks[idx].price = scan.nextInt();
				break;
			}else if(yesOrNo == 2) {
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 수량을 변경하시려면 숫자 1 아니면 2를 눌러주세요.");
			}
		}
		
	}

	@Override
	public void delete() {
	}

}
