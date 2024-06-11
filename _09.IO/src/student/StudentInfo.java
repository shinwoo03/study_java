package student;

import java.io.IOException;
import java.io.PrintWriter;

public class StudentInfo {
	private StudentDTO dto;
	public StudentInfo(StudentDTO dto){
		this.dto = dto;
	}
	
	public void display() {
		String htmlFile = "src/buffer/학생정보.html";
		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter(htmlFile);
			
			writer.print("<html>");
			writer.print("<body>");
			writer.print("<h2>학생정보</h2>");
			writer.print("<table border='1'>");
			
			if( dto == null ) {
				
				writer.printf("<tr> <th>해당 학생정보 없습니다.</th> </tr>");
			}else {
				
				writer.printf("<tr> <th>성명</th> <td>%s</td>  </tr>", dto.getName());
				writer.printf("<tr> <th>성별</th> <td>%s</td>  </tr>", dto.getGender());
				writer.printf("<tr> <th>전화번호</th> <td>%s</td>  </tr>", dto.getPhone());
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
