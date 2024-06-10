package charIO;

import java.io.FileWriter;
import java.io.IOException;

public class WriterMain {

public static void main(String[] args) {
		
		FileWriter writer = null;
		String filename = "test.txt";
		
		//1.파일열기 - 해당 파일이 없으면 자동 생성, 있으면 덮어쓰기된다
		//               생성자파라미터 2번째에 true 지정시 파일내용이 추가된다 
		try {
			writer = new FileWriter( filename, true );
			
		//2.쓰기
			char text[] = { '혼', '자', ' ', '공', '부', '하', '는', 
					'혼', '자', ' ', '공', '부', '하', '는', ' ', '자', '바'};
			writer.write(text);
			
		} catch (IOException e) {
		} finally {
			System.out.println("Finished");
			if( writer != null ) {
				try{ writer.close(); }catch(Exception e) {}
			}
		}
		
		
		
		
		
	}
}