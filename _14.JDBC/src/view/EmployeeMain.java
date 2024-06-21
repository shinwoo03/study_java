package view;

import java.util.Scanner;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		View.home = new EmployeeHome(scan);
		View.list = new EmployeeList(scan);
		View.info = new EmployeeInfo(scan);
		
		View.home.display(); //홈화면이 나오게 하기
		
		scan.close();
	}

}
