package drink;

import java.util.Scanner;

public class DrinkUpdateDAO extends DrinkManage implements DrinkDAO {
	DrinkUpdateDAO( DrinkDTO[] drinks, Scanner scan ){
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
		System.out.println("음료정보변경...");
	}

	@Override
	public void delete() {

	}
	public void search() {
		
	}


}
