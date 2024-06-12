package list;

import java.util.ArrayList;

public class ArrayListMain2 {
	public static void main(String[] args) {
		int[] no = new int[5];
		
		//각 프리미티브 타입에 해당하는 클래스타입 : Wrapper 클래스
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add( new Integer(10) );
		int n = 20;
		list.add( n ); //int -> Integer : Auto Boxing됌
		
		for( Integer data : list ) {
			System.out.println(data);
		}
		
		for( int data : list ) { //Integer -> int : Unboxing됌.
			System.out.println(data);
		}
		
		
	}
}
