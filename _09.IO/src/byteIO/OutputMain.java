package byteIO;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputMain {
public static void main(String[] args) {
		
		FileOutputStream out = null;
		
		String filename = "numbers";
		
		try {
			out = new FileOutputStream( filename );
			
			byte[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
			out.write(data);
			
		} catch (IOException e) {
		} finally {
			if( out != null ) {
				try { out.close(); }catch(Exception e) {}
			}
		}
		System.out.println("Finished");
		
	}
}