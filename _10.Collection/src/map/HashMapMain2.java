package map;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import student.StudentDTO;

public class HashMapMain2 {
	public static void main(String[] args) {
		
		//학생명단.txt 파일정보를 읽어 HashMap으로 관리
		
		HashMap<String, StudentDTO> map = new HashMap<String, StudentDTO>();
		
		String filename = "src/list/학생명단.txt";
		
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader( new FileReader( filename ) );
			String line;
			while((line = reader.readLine()) != null) {
				String info[] = line.split(",");
				map.put(info[0], new StudentDTO(info[0], info[1], info[2]));
			}
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} finally {
			if( reader != null) {
				try {reader.close();} catch (IOException e) {}
			}
		}
		
		
		//이름을 입력해서 해당 학생의 정보 출력하기
		
		Scanner scan = new Scanner(System.in);
		System.out.println("찾는 학생 이름?");
		String name = scan.next();
		scan.close();
		
		StudentDTO dto = map.get(name);
		if(dto == null) {
			System.out.println(name + " 학생정보는 없음.");
		}else {
			System.out.println("성명 : " + dto.getName());
			System.out.println("성별 : " + dto.getGender());
			System.out.println("전화번호 : " + dto.getPhone());
		}
		
		
		
	}

}
