package buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
//		버퍼를 이용해 문자를 읽는 BufferedReader 클래스를 사용해
		Scanner scan = new Scanner(System.in);
		System.out.println("정보확인할 학생이름은? ");
		String name = scan.next();
		scan.close();
		
		String filename  = "src/buffer/student.txt";
		BufferedReader reader = null;
		try {
			reader = new BufferedReader( new FileReader(filename) );
			while( true ) {
//		학생명단.txt 파일에서 데이터를 한 줄씩 읽어온 후 
				String line = reader.readLine(); //강철리,남,010-1234-1111
				if( line==null ) break;
				if( line.contains(name) ) {
					String[] info = line.split(",");
//		본인의 데이터를 콘솔에 출력하기
//		출력형태
//		성명: 홍길동
//		성별: 남
//		연락처: 010-1234-5555
//				if( info[0].equals( name ) ) {
					System.out.printf("성명: %s \n", info[0]);
					System.out.printf("성별: %s \n", info[1]);
					System.out.printf("연락처: %s \n", info[2]);
					break;
				}
			}
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			if( reader!=null ) {
				try{ reader.close(); }catch(Exception e) {}
			}
		}

	}
}