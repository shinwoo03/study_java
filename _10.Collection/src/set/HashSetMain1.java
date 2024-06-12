package set;

import java.util.HashSet;

public class HashSetMain1 {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("심청");
		set.add("박명수");
		set.add("한신우");
		set.add("이해진");
		
		for( String name : set ) {
			System.out.println(name);
		}
		
	}
}
