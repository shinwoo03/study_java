package cloth;

public class Cloth {
	String code, name, material;
//	int season;
	Season season;
//	enum Season {
//		SPRING, SUMMER, FALL, WINTER
//	}
//	static final int SPRING = 1;
//	static final int SUMMER = 2;
//	static final int FALL = 3;
//	static final int WINTER = 4;
	
	Cloth(String code, String name, String material, Season season){
		this.code = code;
		this.name = name;
		this.material = material;
		this.season = season;
	}
	
}
