package test3;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int jumsu;
		
		while(true) {
			System.out.println("점수를 입력하시오.");
			jumsu = scan.nextInt();
			if(jumsu > 100 || jumsu < 0) {
				System.out.printf("%d 점수의 학점은 없습니다. \n", jumsu);
			
		}else {
			break;
			}
		}
		
		
		 if(jumsu >= 90) { 
			System.out.println(jumsu + " : A학점");
		} else if(jumsu >=80){ 
			System.out.println(jumsu + " : B학점");
		} else if(jumsu >=70){ 
			System.out.println(jumsu + " : C학점");
		} else if(jumsu >=60){ 
			System.out.println(jumsu + " : D학점");
	
		} else {
			System.out.println(jumsu + " : F학점");
			System.out.println("재시 당첨");
		} 
		
		
		
		

	}
}
