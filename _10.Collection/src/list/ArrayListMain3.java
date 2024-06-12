package list;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import student.StudentDTO;

public class ArrayListMain3 {
	public static void main(String[] args) {
		//데이터를 관리할 클래스 : StudentDTO
		//읽기
		ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
		BufferedReader reader = null;
		String filename = "src/list/학생명단.txt";
	
		try {
			reader = new BufferedReader(new FileReader(filename));
			
			String line;
			while( (line = reader.readLine()) != null ) {
				String info[] = line.split(",");
//				StudentDTO dto = new StudentDTO("info[0]", "info[1]", "info[2]");
//				list.add( dto );
				list.add( new StudentDTO(info[0], info[1], info[2]) );
			}
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}finally {
			if(reader!=null) {
				try{ reader.close();} catch (IOException e) {}
					
				
			}
		}
	
		
		//쓰기
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("src/list/dto.html");
			writer.print("<html><body>");
			writer.print("<h3>학생명단</h3>");
			
			writer.print("<table border='1'>");
			writer.print("<colgroup> <col width='200px'> <col width='100px'> <col width='250px'> </col></col></col></colgroup>");
			
			writer.print("<tr> <th>성명</th> <th>성별</th> <th>전화번호</th> </tr>");
			
			for( StudentDTO dto : list) {
			writer.printf("<tr> <td>%s</td> <td>%s</td> <td>%s</td> </tr>",dto.getName(), dto.getGender(), dto.getPhone() );
			}
			
			writer.print("</table></body></html>");
			
			

		}catch(IOException e) {
			
		}finally {
			writer.close();
		}
		
		
		
	}

}
