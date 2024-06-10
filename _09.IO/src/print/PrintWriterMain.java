package print;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterMain {
	public static void main(String[] args) {
		//문자스트림을 내보내는데 사용하는 클래스로 자동으로 flush 기능을 제공한다
		String filename = "성적표.html";
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(filename);
//			writer.print("성명 \t자바 \tCSS \tHTML \n");
//			writer.printf("%s \t%d \t %d \t %d \n", "홍길동", 81, 68, 90);
//			writer.printf("%s \t%d \t %d \t %d \n", "심청", 88, 98, 60);
			writer.print("<html>");
			writer.print("<body>");
			writer.println("<h2>성적표</h2>");
			writer.println("<table border='1'>");
			writer.println("<colgroup><col width='120px'>"
							+ "<col width='100px'><col width='100px'>"
							+ "<col width='100px'></colgroup>");
			writer.println("<tr><th>성명</th><th>자바</th>"
							+ "<th>CSS</th><th>HTML</th></tr>");
			writer.printf("<tr><td>%s</td><td>%d</td><td>%d</td><td>%d</td></tr>"
							, "홍길동", 81, 68, 90);
			writer.printf("<tr><td>%s</td><td>%d</td><td>%d</td><td>%d</td></tr>"
							, "심청", 88, 98, 60);			
			writer.println("</table>");
			writer.print("</body>");
			writer.print("</html>");
			
		}catch(IOException e) {
		}finally {
			writer.close();
		}
	}
}