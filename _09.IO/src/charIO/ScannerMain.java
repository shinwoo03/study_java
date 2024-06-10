package charIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerMain {
	public static void main(String[] args) {
		//키보드로 입력해서 저장하기
		Scanner scan = new Scanner(System.in);
		System.out.println("문장을 한 줄로 입력하세요");
		String line = scan.nextLine();
		scan.close();
		
		String filename = "쓰기";
		
		FileWriter writer = null;
		try {
			writer = new FileWriter( filename );
			writer.write( line );
		}catch(IOException e) {
		}finally {
			if( writer !=null ) {
				try{ writer.close(); }catch(Exception e) {}
			}
		}
		System.out.println("쓰기 끝");
		
		System.out.println("파일 읽기");
		FileReader reader = null;
		try {
			reader = new FileReader( filename );
			while( true ) {
				int in = reader.read();
				if( in == -1 ) break;
				System.out.print( (char)in );
			}
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} finally {
			if( reader != null ) {
				try{ reader.close(); }catch(Exception e) {}
			}
		}
		
		
		
		
	}
}

