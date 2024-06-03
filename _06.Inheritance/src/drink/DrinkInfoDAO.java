package drink;

import java.util.Scanner;

public class DrinkInfoDAO extends DrinkManage implements DrinkDAO {
	DrinkInfoDAO( DrinkDTO[] drinks, Scanner scan ){
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
		System.out.println("음료정보출력...");
	}

	@Override
	public void update() {

	}

	@Override
	public void delete() {

	}
	public void search() {
		
	}


}
