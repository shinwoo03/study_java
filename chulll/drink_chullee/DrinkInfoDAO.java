package drink;

import java.util.Scanner;

public class DrinkInfoDAO extends DrinkManage implements DrinkDAO {

	public DrinkInfoDAO(DrinkDTO[] drinks, Scanner scan) {
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
		System.out.println("자세한 정보를 보실 음료의 번호를 입력하세요.");
		int drinkNo, idx;
		while(true) {
			drinkNo = scan.nextInt();
			idx = drinkNo-1;
			if( drinks[idx] != null) {
				System.out.println("번호\t음료명\t가격\t수량");
				System.out.println(drinkNo + "\t" + drinks[idx].name + "\t" + drinks[idx].price + "\t" + drinks[idx].quantity);
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 자세히 보실 음료의 번호를 입력하세요.");
			}	
		}
	}

	@Override
	public void update() {
	}

	@Override
	public void delete() {
	}

}
