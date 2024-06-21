package view;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import model.EmployeeDAO;
import model.EmployeeDTO;

public class EmployeeList {
	private Scanner scan;

	public EmployeeList(Scanner scan) {
		this.scan = scan;
	}
	
	void display() {
		System.out.println("1.홈으로  2. 사원정보   0. 종료");
		System.out.println("선택 : ");
		switch( scan.nextInt() ) {
		case 1:
			View.home.display();
			break;
			
		case 2:
			System.out.print("조회할 사번: ");
			View.info.display( scan.nextInt() );
			break;
		case 0:
			System.exit(0);
		}
		
		
		PrintWriter out = null;
		String filename = "employeeList.html";
		File dir = new File(View.path);
		if( ! dir.exists()) dir.mkdirs();
		
		try {
			out = new PrintWriter(View.path + filename);
			
			out.print("<html>");
			out.print("<body>");
			out.print("<h2>사원목록</h2>");
			out.print("<table border='1'>");
			out.print(" <tr> <th>사번</th> <th>성명</th> " + "<th>부서</th><th>입사일자</th></tr>" );
			
			EmployeeDAO dao = new EmployeeDAO();
			ArrayList<EmployeeDTO> list = dao.employeeList();
			for( EmployeeDTO dto : list) {
				out.printf(" <tr> <td>%s</td> <td><a href='employeeInfo_%s.html?id='>%s</a></td> " + "<td>%s</td><td>%s</td></tr>",
						dto.getEmployee_id(),
						dto.getEmployee_id(),
						dto.getName(),
						dto.getDepartment_id(),
						dto.getHire_date());
				
			}
			out.print("</table>");
			out.print("</body>");
			out.print("</html>");
			
		} catch (Exception e) {
		} finally {
			out.close();
		}
		
	}
	

}
