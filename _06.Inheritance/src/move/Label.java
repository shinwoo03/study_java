package move;

public class Label implements Changable {
	
	//라벨지에 출력할 문구
	String text;
	int width, height;
	String background, foreground, font;
	
	Label(String text, int width, int height, String background, String foreground, String font){
		this.text = text;
		this.width = width;
		this.height = height;
		this.background = background;
		this.foreground = foreground;
		this.font = font;
	}
	
	
	
	

	@Override
	public void resize(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public void setBackgroundColor(String color) {
		this.background = color;
	}

	@Override
	public void setForegroundColor(String color) {
		this.foreground = color;
	}

	@Override
	public void setFont(String font) {
		this.font = font;
	}

	
	
	

}
