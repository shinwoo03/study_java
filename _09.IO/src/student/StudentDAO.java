package student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StudentDAO {
	private StudentDTO[] students;
	
	public StudentDTO[] getStudentList() {
		connect();
		return students;
	}
	
	public StudentDTO getStudentInfo(String name) {
		connect();
		StudentDTO student = null;
		for(StudentDTO dto : students) {
			if( dto == null) continue;
			if( dto.getName().equals(name)) {
				student = dto;
				break;
			}
		}
		return student;
	}
	
	public void connect() {
		students = new StudentDTO[10];
		//파일(DB)연결하기
		BufferedReader reader = null;
		
		String filename = "src/buffer/학생명단.txt";
		
		try {
			reader = new BufferedReader ( new FileReader( filename ) );
			String line;
			int idx = 0;
			while( (line = reader.readLine()) != null ) {
				//line : 한신우,여,010-1234-8888
				
				String[] info = line.split(",");
				
				students[idx++]= new StudentDTO(info[0], info[1], info[2]);
		}
		}catch(FileNotFoundException e) {
		}catch(IOException e) {
		}finally {
			if(reader != null) {
				try{reader.close();} catch(Exception e) {}
			}
		}
		
	}
	
	

}
