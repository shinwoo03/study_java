package byteIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputMain {
public static void main(String[] args) {
		
		FileInputStream in= null;
		String filename = "numbers";
		
		try {
			in = new FileInputStream( filename );
			byte[] datas = new byte[4];
			int no = in.read(datas);
			System.out.println("총 읽은수: " + no);
			for( byte data : datas ) {
				System.out.println( data );
			}
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} finally {
			if( in != null ) {
				try{ in.close(); }catch(Exception e) {}
			}
		}
		
	}
}