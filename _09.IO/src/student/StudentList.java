package student;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class StudentList {
	private StudentDTO[] students;
	
	public StudentList(StudentDTO[] students) {
		this.students = students;
	}
	
	
	public void display() {
//		String htmlFile = "src/buffer/학생명단목록.html";
		String folder = "D:/io/student";
//		파일을 저장할 디렉토리(폴더)가 없다면 폴더를 만들어야 한다.
		File dir = new File( folder );
		if( ! dir.exists() ) {
			dir.mkdirs();
		}
			
		String htmlFile = "/학생명단목록.html";
		
		
		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter(folder + htmlFile);
			
			writer.print("<html>");
			writer.print("<body>");
			writer.print("<h2>학생명단목록</h2>");
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
