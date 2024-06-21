package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectMain2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("조회할 부서번호 : ");
		int department_id = scan.nextInt();
		scan.close();
		
		Connection conn = null;
		try {
			//1. 드라이버 로딩 -> 드라이버 관리자가 생김
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 드라이버관리자로 DB에 연결하기
			//   DB의 위치(ip주소), 유저명, (인증을 위한)비밀번호
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","0000");
			
			//3. DB연결되면 쿼리문 작성
			//   작성한 쿼리문을 실행하기 -> select의 경우 조회된 결과가 있음 : ResultSet(질의결과)
			//   60번 부서에 소속된 사원들의 정보 조회 - 사번, 성명, 부서코드, 업무코드, 전화번호, 이메일, 급여, 입사일자
			String sql = "select * from employees " //employees뒤에 공백이 꼭 있어야함.
						+"where department_id = " + department_id + " order by employee_id";
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql); // sqldeveloper에서의 ctrl + enter
			
			//   조회된 결과를 눈으로 확인할 수 있게 출력문작성
			while( rs.next() ) { //커서이동이 되면
				System.out.print( rs.getInt("employee_id") +"\t" );
				System.out.print( rs.getString("last_name") + " " + rs.getString("first_name") + "\t" );
				System.out.print( rs.getInt("department_id") +"\t" );
				System.out.print( rs.getString("job_id") +"\t" );
				System.out.print( rs.getString("phone_number") +"\t" );
				System.out.print( rs.getString("email") +"\t" );
				System.out.print( rs.getInt("salary") +"\t" );
				System.out.println( rs.getDate("hire_date") );
			}
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println( e.getMessage() );
		} finally {
			try{ conn.close(); }catch(Exception e) {}
		}
		
		
		//4. DB연결 해제
		
		
		
		
		
	}

}
