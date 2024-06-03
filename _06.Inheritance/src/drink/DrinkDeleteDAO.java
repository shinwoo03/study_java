package drink;

import java.util.Scanner;

public class DrinkDeleteDAO extends DrinkManage implements DrinkDAO {
	
	DrinkDeleteDAO( DrinkDTO[] drinks, Scanner scan ){
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
		System.out.println("음료정보삭제...");
	}
	public void search() {
		
	}


}
