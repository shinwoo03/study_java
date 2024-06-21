package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDAO {
	private Connection conn;
	private  PreparedStatement ps;
	private ResultSet rs;
	
	//사원정보조회
	public EmployeeDTO employeeInfo( int employee_id ) {
		connect();
		
		EmployeeDTO dto = null;
		String sql = "select * from employees where employee_id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, employee_id);
			rs = ps.executeQuery();
			if( rs.next() ) {
				dto = new EmployeeDTO();
				dto.setDepartment_id(rs.getInt("employee_id"));
				dto.setEmail(rs.getString("email"));
				dto.setEmployee_id(rs.getInt("employee_id"));
				dto.setLast_name(rs.getString("last_name"));
				dto.setFirst_name(rs.getString("first_name"));
				dto.setHire_date(rs.getDate("hire_date"));
				dto.setJob_id(rs.getString("job_id"));
				dto.setManager_id(rs.getInt("manager_id"));
				dto.setPhone_number(rs.getString("phone_number"));
				dto.setSalary(rs.getInt("salary"));
				
			}
			
		} catch (SQLException e) {
		} finally {
			disconnect();
		}
		return dto;
	}
	
	
	
	
	
	
	
	
	
	//사원목록 조회
	public ArrayList<EmployeeDTO> employeeList() {
		connect();
		
		ArrayList<EmployeeDTO> list = new ArrayList<EmployeeDTO>();
		
		//쿼리문 작성 : 모든 사원들의 사번, 성명, 부서코드, 업무코드, 입사일자 조회
		String sql = "select employee_id, last_name||' '||first_name as name "
				+ ", department_id, job_id, hire_date "
				+ "from employees "; 
		//쿼리문 실행
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while( rs.next() ) {
				EmployeeDTO dto = new EmployeeDTO();
				dto.setEmployee_id( rs.getInt("employee_id") );
				dto.setName(rs.getString("name"));
				dto.setDepartment_id(rs.getInt("department_id"));
				dto.setJob_id(rs.getString("job_id"));
				dto.setHire_date(rs.getDate("hire_date"));
				list.add(dto);
			}
			
			
		}catch(SQLException e) {
		}finally {
			disconnect();
			
		}
		
		return list;
		
	}
	
	//DB연결 해제
	private void disconnect() {
		if(rs!=null) {
			try { ps.close();} catch(Exception e) {}
		}
		if( conn!=null ) {
				try{ conn.close(); } catch(Exception e) {}
		}
	}
	
	//DB연결과 관련된 처리
	private void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "0000");
			
		} catch (Exception e) {
		}
		
		
		
	}

}
