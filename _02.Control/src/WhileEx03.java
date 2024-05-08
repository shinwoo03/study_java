import java.util.Scanner;

public class WhileEx03 {
	public static void main(String[] args) {
		System.out.println("구구단 몇 단?");
		
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		
		
		int gugu = 1;//, dan = 8;
	
		while (gugu <= 9) {
			System.out.printf("%d X %d = %d \n", dan, gugu, dan*gugu);
		++gugu;
		}
		
	}
}
