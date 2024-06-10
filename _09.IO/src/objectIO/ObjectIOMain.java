package objectIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObjectIOMain {
	public static void main(String[] args) {
		String filename = "objects";
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream ( new FileOutputStream(filename) );
			GregorianCalendar c = new GregorianCalendar();
			out.writeObject(c);
			out.writeObject( new GregorianCalendar(2024, 3, 10) );
			out.writeObject( new GregorianCalendar(2024, 4, 15) );
			
			
		}catch(IOException e) {
			
		}finally {
			try{ out.close(); } catch(Exception e) {
		}
			System.out.println("쓰기완료");
			
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream( new FileInputStream(filename));
			while(true) {
				GregorianCalendar obj = (GregorianCalendar)in.readObject();
				System.out.print(obj.get(Calendar.YEAR) + "년");
				System.out.print(obj.get(Calendar.MONTH) + "월");
				System.out.println(obj.get(Calendar.DATE) + "일");
			}
		}catch(FileNotFoundException e) {	
		}catch(IOException e) {
		}catch(ClassNotFoundException e) {
		}finally {
			if(in != null) {try {in.close();}catch(Exception e) {} }
		
		}
		System.out.println("읽기완료!");
		}
		
	}
	
}
