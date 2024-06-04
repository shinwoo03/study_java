package cloth;

public class ClothMain {
	public static void main(String[] args) {
		
		System.out.println(Season.SPRING);
		System.out.println(Season.SPRING.getName());
		
		
		
		
		
		Cloth shirt = new Cloth("T01", "반팔 티셔츠","면100%", Season.SUMMER);
		System.out.println("의류코드 : " + shirt.code);
		System.out.println("의류명 : " + shirt.name);
		System.out.println("의류소재 : " + shirt.material);
		System.out.println("착용계절 : " + shirt.season.getName());
//		System.out.println("착용계절 : " + shirt.season);
		
	}
}
