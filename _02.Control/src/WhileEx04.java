
public class WhileEx04 {
	public static void main(String[] args) {
		//1~100까지 출력
		int no = 1;
		while ( no <= 100 ) {
			System.out.println(no);
			++no;; //무한으로 결과가 나오기 때문에 
		}
	//1~100의 합 출력 :1+2+3+....100
		no = 1;
		int sum = 0;
		while ( no <=100) {
			System.out.println(no);
			sum= sum + no; //sum +=no;
			
			++no;
		}
		System.out.println("1~100 까지의 합 : " + sum);
	//no : 1		2			3
	//sum : 0+1	  0+1+2 	0+1+2+3
	
	}
	
}
