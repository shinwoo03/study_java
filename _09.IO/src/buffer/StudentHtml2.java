package buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class StudentHtml2 {
	public static void main(String[] args) {
		
		//읽기
		String[] lines = new String[10];//lines[0] ~ lines[9]
		BufferedReader reader = null;
		
		String filename = "src/buffer/학생명단.txt";
		
		try {
			reader = new BufferedReader ( new FileReader( filename ) );
			String line;
			int idx = 0;
			while( (line = reader.readLine()) != null ) {
				
				//line : 한신우,여,010-1234-8888
				lines[idx++] = line;
		}
		}catch(FileNotFoundException e) {
		}catch(IOException e) {
		}finally {
			if(reader != null) {
				try{reader.close();} catch(Exception e) {}
			}
		}
		
		
		
		
		
		//쓰기
		
		String htmlFile = "src/buffer/학생명단2.html";
		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter(htmlFile);
			
			writer.print("<html>");
			writer.print("<body>");
			writer.print("<h2>학생명단</h2>");
			writer.print("<table border='1'>");
			writer.print("<tr> <th>성명</th> <th>성별</th> <th>전화번호</th> </tr>");
			
			for(String line : lines) {
				if (line==null)continue;
				//line : 한신우,여,010-1234-8888
				String[] info = line.split(",");
			writer.printf("<tr> <td>%s</td> <td>%s</td> <td>%s</td> </tr>",info[0],info[1],info[2]);
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
