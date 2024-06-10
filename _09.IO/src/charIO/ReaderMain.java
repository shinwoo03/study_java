package charIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderMain {
	public static void main(String[] args) {
		//문자가 있는 파일정보 읽기
		//1.열기 : 객체생성하면 파일이 열린다
		String filename = "정리";
		FileReader reader = null;
		try{
			reader = new FileReader( filename );
		//2.읽기
			while( true ) {
				int read = reader.read(); //char: 2byte
				System.out.print( (char)read ); 
				//더 읽어올 데이터가 없다면 -1이 반환됨
				if( read == -1 ) break; 
			}
		
		}catch(FileNotFoundException e) {
			System.out.println( filename + " 파일 없음");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			//3.닫기
			if( reader!= null ) {
				try{ reader.close(); }catch(Exception e) {}
			}
		}
	}
}