package dao2;

public class DataMain {
	
	public static void main(String[] args) {
		
		DataControl control = new DataControl();
		control.insert();
		control.list();
		control.info();
		control.update();
		control.delete();

		
		
	}
	
	

}
