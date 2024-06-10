package shape;

public class Circle {
int radius;
	
	Circle(int radius){
		this.radius = radius;
	}

	@Override
	public boolean equals(Object obj) {
		//반지름이 같다면 같은 원이라고 하자
		//Object 가 원인지 확인
		if( obj instanceof Circle ) {
			//super타입 -> sub타입: downCasting
			Circle c = (Circle)obj;
//			if( c.radius ==  this.radius ) return true;
//			else return false;
			
			return c.radius ==  this.radius;
			
		}else
			return false;
	}
	
	
}