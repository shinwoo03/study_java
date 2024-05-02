
public class operatorEx05 {
	public static void main(String[] args) {
		//증감(증가/감소)연산자 : ++, --
		//++변수, --수
		int no=1;
		no = no + 1; //no : 2
		no +=2; //no=4
		
		no = 1;
		++no; // no = no + 1; , //no += 1;
		//no += 1;
		
	System.out.println( no );
	
	
	++no;
	System.out.println( no );
	++no;
	System.out.println( no );
	++no;
	System.out.println( no );
	
	//1부터 5까지의 합 구하기
	no = 1;
//	no = 1 + 2+ 3+ 4+ 5;
	int sum = 0;
	sum += no; //sum에는 1만큼 들어가있다. 0+1 -> 1
	++no;
	sum += no; //sum에는 1만큼 들어가있다. 0+1+2 -> 3
	++no;
	sum += no; //sum에는 1만큼 들어가있다. 0+1+2+3 -> 6
	++no;
	sum += no; //sum에는 1만큼 들어가있다. 0+1+2+3+4 -> 10
	++no;
	sum += no; //sum에는 1만큼 들어가있다. 0+1+2+3+4+5 -> 15
	
	System.out.println("1~5까지의 합 : " + sum);
	
	no = 5;
	sum = 0;
	sum+= no ; //0+5 -> 5
	 --no;
	 sum+= no ; //0+5+4 -> 9
	 --no;
	 sum+= no ; //0+5+4+3 -> 12
	 --no;
	 sum+= no ; //0+5+4+3+2 -> 14
	 --no;
	 sum+= no ; //0+5+4+3+2+1 -> 15
	 
	 System.out.println("5~1까지의 합 : " +sum);
	 
	 
	
	
	
}
}
