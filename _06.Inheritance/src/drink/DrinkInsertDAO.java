package drink;

import java.util.Scanner;

public class DrinkInsertDAO extends DrinkManage implements DrinkDAO {

	DrinkInsertDAO( DrinkDTO[] drinks, Scanner scan ){
		super(drinks, scan);
	} 
	@Override
	public void insert() {
		System.out.println("음료등록처리...");
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
	public void search() {
		
	}

}
