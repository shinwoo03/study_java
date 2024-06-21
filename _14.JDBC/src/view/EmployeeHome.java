package view;

import java.awt.Desktop;
import java.io.File;
import java.io.PrintWriter;
import java.net.URI;
import java.util.Scanner;

public class EmployeeHome {
	private Scanner scan;

	public EmployeeHome(Scanner scan) {
		this.scan = scan;
	}
	
	void display() {
		
		System.out.println("1.사원목록  2.부서목록  0.종료");
		System.out.print("선택: ");
		int menu = scan.nextInt();
		if( menu==0 ) {
			System.exit(0);
		}else if( menu==1 ) {
			View.list.display(); //사원목록화면 연결
		}else if( menu==2 ) {
//			View.info.display(); //부서목록화면 연결
		}
		
		//html로 만들기
		PrintWriter out = null;
		String filename = "home.html";
		
		File dir = new File( View.path );
		if( ! dir.exists() ) dir.mkdirs();
		
		try {
			out = new PrintWriter( View.path + filename );
			out.print("<html>");
			out.print("<body>");
			out.print("<h2>사원관리</h2>");
			out.print("<ul>");
			out.print("<li> <a href='employeeList.html'>사원목록</a> </li>");
			out.print("<li> <a href='departmentList.html'>부서목록</a> </li>");
			out.print("</ul>");
			out.print("</body>");
			out.print("</html>");
			out.flush();
			
		} catch (Exception e) {
		} finally {
			out.close();
			
		
			try {
				Desktop.getDesktop().browse(new URI( "file:///" + View.path + filename ));
			} catch (Exception e) {
		}
		
		}
	}
	
	

}
