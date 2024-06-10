package charIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderArrayMain {
public static void main(String[] args) {
		
		FileReader reader = null;
		String filename = "정리";
		
		try {
			reader = new FileReader( filename );
			//한꺼번에 여러개 읽어보자
			char[] read = new char[1024];
			int no = reader.read(read);
			System.out.println("읽은 문자수: " + no );
			System.out.println( read );
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} finally {
			if( reader !=null ) {
				try{ reader.close(); }catch(Exception e) {}
			}
		}

	
	}
}