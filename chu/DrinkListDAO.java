package drink;

import java.util.Scanner;

public class DrinkListDAO extends DrinkManage implements DrinkDAO {

	public DrinkListDAO(DrinkDTO[] drinks, Scanner scan) {
		super(drinks, scan);
	}
	
	@Override
	public void insert() {
	}

	@Override
	public void list() {
		System.out.println("번호\t음료명");
		int drinkNo=1;
		for(DrinkDTO drink : drinks) {
			if(drink != null) System.out.println(drinkNo++ + "\t" + drink.name);
		}
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
