package buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import student.StudentDTO;

public class StudentDTOMain {
	public static void main(String[] args) {
		//파일(DB)에서 학생정보 읽어오기 -> 데이터클래스에 담기
		StudentDTO[] students = new StudentDTO[10]; //10개를 담을 공간을 만든거임.
		
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
		
		
		//화면에 출력하기
		String htmlFile = "src/buffer/학생명단DTO.html";
		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter(htmlFile);
			
			writer.print("<html>");
			writer.print("<body>");
			writer.print("<h2>학생명단DTO</h2>");
			writer.print("<table border='1'>");
			writer.print("<tr> <th>성명</th> <th>성별</th> <th>전화번호</th> </tr>");
			
			for(StudentDTO student : students) {
				if ( student==null )continue;
				//line : 한신우,여,010-1234-8888
			writer.printf("<tr> <td>%s</td> <td>%s</td> <td>%s</td> </tr>",student.getName(),student.getGender(),student.getPhone());
			}
			writer.print("</table>");
			writer.print("</body>");
			writer.print("</html>");
		}catch(IOException e) {
		}finally {
			writer.close();
		}
		
		
		
		
		
		
		
	}
}
