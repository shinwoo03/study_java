package view;

import java.io.PrintWriter;
import java.util.Scanner;

import model.EmployeeDAO;
import model.EmployeeDTO;

public class EmployeeInfo {
	private Scanner scan;
	
	public EmployeeInfo(Scanner scan) {
		this.scan = scan;
	}
	
	void display(int employee_id) {
		PrintWriter out = null;
		String filename = "employeeInfo_"+ employee_id +".html";
		
		try {
			EmployeeDAO dao = new EmployeeDAO();
			EmployeeDTO vo = dao.employeeInfo(employee_id);
			
			out = new PrintWriter( View.path + filename );
			out.print("<html>");
			out.print("<body>");
			out.print("<a href ='employeeList_html'>사원목록</a>");
			out.print("<hr>");
			
			out.print("<h2>사원정보</h2>");
			
			out.print("<table border='1'>");
			
			if(vo==null) {
				out.print("<tr><td>해당 사원정보는 없습니다.</td></tr>");
			}else {
				
			
			out.printf("<tr> <th>사번</th> <td>%s</td> </tr>", vo.getEmployee_id());
			out.printf("<tr> <th>성명</th> <td>%s</td> </tr>", vo.getLast_name() + " " + vo.getFirst_name() );
			out.printf("<tr> <th>이메일</th> <td>%s</td> </tr>", vo.getEmail() );
			out.printf("<tr> <th>전화번호</th> <td>%s</td> </tr>", vo.getPhone_number() );
			out.printf("<tr> <th>입사일자</th> <td>%s</td> </tr>", vo.getHire_date() );
			out.printf("<tr> <th>부서</th> <td>%s</td> </tr>" , vo.getDepartment_id() );
			out.printf("<tr> <th>업무</th> <td>%s</td> </tr>", vo.getJob_id() );
			out.printf("<tr> <th>급여</th> <td>%s</td> </tr>", vo.getSalary() );
			}
			
			out.print("</hr>");
			out.print("</table>");
			out.print("</body>");
			out.print("</html>");
			out.flush();
			
			
		} catch (Exception e) {
		}
		
		
		
	}
	
	
}
