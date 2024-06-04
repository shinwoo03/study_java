package drink;

import java.util.Scanner;

public class DrinkInsertDAO extends DrinkManage implements DrinkDAO{
	
	public DrinkInsertDAO(DrinkDTO[] drinks, Scanner scan) {
		super(drinks, scan);
	}

	@Override
	public void insert() {
		String name;
		int price, quantity;
		int cnt=0;
		for(int i=0; i<this.drinks.length; i++) {
			if( drinks[i] == null ) {
				System.out.print("등록하고자 하는 상품의 이름을 입력하세요: ");
				name = scan.nextLine();
				System.out.print("등록하고자 하는 상품의 가격을 입력하세요: ");
				price = scan.nextInt();
				System.out.print("등록하고자 하는 상품의 수량을 입력하세요: ");
				quantity = scan.nextInt();
				drinks[i] = new DrinkDTO(name, price, quantity);
				System.out.println("상품 등록이 완료되었습니다.");
				break;
			}
			cnt++;	
		}
		if(cnt == this.drinks.length) {
			System.out.println("10개의 공간이 모두 차서 더이상 등록할 수 없습니다.");
		}
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
	}

}
