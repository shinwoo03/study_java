package shape;

public class Rectangle {
	
	int width, height;
	
	Rectangle(int width, int height){
		this.height = height;
		this.width = width;
	}

	public boolean equals(Object o) {
		if( o instanceof Rectangle ) {
			//Object --> Rectangle :
			Rectangle r = (Rectangle)o;
			return this.width == r.width && this.height == r.height 
					|| this.width == r.height && this.height == r.width;
//			if( this.width == r.width && this.height == r.height) {
//				return true;
//			}else if( this.width == r.height && this.height == r.width) {
//				return true;
//			}else
//				return false;
		}else {
			return false;
		}	
	}
	
}