package buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedRWMain {
	public static void main(String[] args) {
		
		String filename = "src/buffer/buffered.txt";
		//쓰기
		BufferedWriter writer = null;
		
		try {
			writer = new BufferedWriter( new FileWriter(filename) );
			char[] datas = {'혼','자',' ','공','부','하','는',' ','자','바'};
			writer.write(datas);
			String line = "\n DO it! 웹표준의 정석";
			writer.write(line);
			writer.flush();
		}catch(IOException e) {
			
		}finally {
			try {writer.close();}catch(Exception e) {}
		}
		System.out.println("쓰기완료");
		
		//읽기
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(filename));
			while(true) {
				String line = reader.readLine();
				//for()
//				if (line==null)break;
				System.out.println(line);
			}
		}catch(FileNotFoundException e) {
		}catch(IOException e) {
			
		}finally {
			if(reader!=null) {
				try {reader.close();}catch(Exception e) {}
			}
		}
		System.out.println("읽기완료");
	}

}
