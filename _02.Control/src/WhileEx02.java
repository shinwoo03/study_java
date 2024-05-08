
public class WhileEx02 {
	public static void main(String[] args) {
		//3 x 1 = 3
		//3 x 2 = 6
		//3 x 3 = 9
		//....
		//3 x 9 = 27
		int by = 1;
		while (by <= 9) { //by <= 9 가 가독성이 높다.
			System.out.printf("3 X %d = %d \n", by, 3*by);
			++by; //by = by + 1;
			
		}
	}
}
