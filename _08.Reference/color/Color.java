package color;

public enum Color {
	RED("빨강"), YELLOW("노랑"), BLUE("파랑");
	final private String name;
	
	Color(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
}
