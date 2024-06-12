package list;

import java.util.ArrayList;

public class ArrayListMain1 {
	public static void main(String[] args) {
		String texts[] = new String[0];
		
		ArrayList<String> list =new ArrayList<String>();
		//저장
		list.add( "이해진" );
		list.add( "힙Girl" );
		System.out.println( list.size() );
		//조회
		System.out.println(list.get(1));
		
		//중간 삽입저장
		list.add(1, "막내");
		System.out.println( list.size() );
		for(int idx=0; idx<list.size(); idx++) {
			System.out.println(idx + ". " +list.get(idx));
		}
		
		//삭제
		list.remove(0);
		//조회
		for( String subject :list ) {
			System.out.println(subject);
		}
		
		
		//데이터변경
		list.set(1, "해진이");
		//조회
		for( String subject :list ) {
			System.out.println(subject);
		}
		System.out.println("------------");
		
		//삭제
		list.remove("힙Girl");
		//조회
		for( String subject :list ) {
			System.out.println(subject);
		}
		
		
		
		
		
		
	}

}
