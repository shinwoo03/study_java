
public class ArrayExMe {
	public static void main(String[] args) {
		
		String name [][] = { { "홍길동", "심청", "박명수" }, 
							  { "Hong", "Sim", "Park" } };
//		System.out.println(name.length);
//		System.out.println(name[0]);
//		System.out.println(name[1]);
		for(int i=0; i<name.length; i++) {
			System.out.println((i+1) +"행 : ");
			for(int j=0; j<name[i].length; j++) {
				System.out.println(name[i] [j]);
			}
		}
		
		
		
		
		
		
		
		
	}
}
