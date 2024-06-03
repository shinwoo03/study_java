package drink;

import java.util.Scanner;

public class DrinkSearchDAO extends DrinkManage implements DrinkDAO {
	DrinkSearchDAO(DrinkDTO[] drinks, Scanner scan){
		super(drinks, scan);
	}
	
	@Override
	public void insert() {}

	@Override
	public void list() {}

	@Override
	public void info() {}
	
	
	@Override
	public void update() {}

	@Override
	public void delete() {}

	@Override
	public void search() {
		System.out.println("음료검색");
		String title = scan.next();
		drinks[];
		//상품명 : 콜라
		//가격 : 1000
		//수량 : 20

		System.out.println();
		
	}

}