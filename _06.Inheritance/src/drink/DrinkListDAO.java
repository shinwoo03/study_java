package drink;

import java.util.Scanner;

public class DrinkListDAO extends DrinkManage implements DrinkDAO {
	DrinkListDAO( DrinkDTO[] drinks, Scanner scan ){
		super(drinks, scan);
	}
	@Override
	public void insert() {

	}

	@Override
	public void list() {
		System.out.println("음료목록출력...");
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
	public void search() {
		
	}


}
