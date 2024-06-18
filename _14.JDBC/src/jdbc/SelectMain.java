package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectMain {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
//		1. 드라이버 로딩 -> 드라이버 관리자가 생김
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			
//		2. DB에 연결
//			드라이버 관리자를 통해서 DB에 연결
//			DB위치, username, password
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.27:1521:xe","hr","0000");
			System.out.println("DB 연결 성공");
		
//		3. 쿼리문(sql) 선언
			String sql = " select * from employees " ;
		// 쿼리문 실행 - sqldeveloper에서는 ctrl + enter
			Statement stmt = conn.createStatement(); //쿼리실행의 기능을 갖고 있다.
			ResultSet rs = stmt.executeQuery(sql); //ctrl+enter부분
			System.out.println("조회실행");
			
			System.out.println("사번 \t 성명 \t 부서코드 \t 업무코드");
			while(rs.next()) { //커서이동
				System.out.print(rs.getInt("employee_id") + "\t");
				System.out.print(rs.getString("last_name") + "" + rs.getString("first_name") + "\t");
				System.out.print(rs.getInt("department_id") + "\t");
				System.out.print(rs.getString("job_id") + "\t");
				System.out.println(rs.getDate("hire_date") );
			}
			
			
		} catch (Exception e) {
		} finally {
//		4. DB연결해제(자원회수)
			try{ conn.close(); } catch(Exception e) {}
		}
		
		
		
		
	}

}
