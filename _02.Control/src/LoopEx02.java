
public class LoopEx02 {
	public static void main(String[] args) {
		// 구구단 2단 ~ 19단 출력


		for (int dan = 2; dan <= 19; dan++) {
			System.out.printf("구구단 %d단 \n", dan);
			for (int num = 1; num <= 9; num++) {
				System.out.printf("%d X %d = %d \n", dan, num, dan * num);
			}

		}

	}
}
