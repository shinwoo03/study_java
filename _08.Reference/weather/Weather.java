package weather;

public enum Weather {
	SUN("해"), CLOUD("구름"), WIND("바람"), RAIN("비"), SNOW("눈"), FOG("안개");
	
	final private String name;
	
	Weather(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
}
