
public class operatorEx06 {
	public static void main(String[] args) {
		//논리연산자 : 논리합연산자|| |, 논리곱연산자&&(엠퍼센트)&, not연산자!
		//논리합연산자 : 둘 다 False 인 경우만 False
		//논리곱연산자 : 둘 다 True 인 경우만 True
		//not연산자 : True -> False, False -> True
		
		int no1 = 5, no2 = 3;
		System.out.println(no1 > no2); //5 > 3 ->True
		
		int no3 = 3, no4 = 5;
		System.out.println(no3> no4); //3 > 5 -> False
		
		//논리합
		System.out.println( no1 > no2 || no3 > no4); //T || F -> T
		//점심을 먹을수 있는지를 판단 해볼때 : 현금이O, 카드O
	
		System.out.println( !(no1 > no2) || no3 > no4); //F || F -> F
		
		//논리곱
		System.out.println( no1 > no2 && no3 > no4); //T && F -> F
		
		System.out.println( no1 > no2 && !(no3 > no4)); //T && T -> T
		
		
	}
}
