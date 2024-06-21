package employee;

import java.util.ArrayList;

import model.EmployeeDAO;
import model.EmployeeDTO;

public class EmployeeMain {
	public static void main(String[] args) {
		
		//사원목록 조회
		//모든 사원들의 사번, 성명, 부서코드, 업무코드, 입사일자 조회
		//DAO(Data Access Object)
		EmployeeDAO dao = new EmployeeDAO();
		ArrayList<EmployeeDTO> list = dao.employeeList();
		for( EmployeeDTO dto : list) {
			System.out.print(dto.getEmployee_id() + "\t");
			System.out.print(dto.getName() + "\t");
			System.out.print(dto.getDepartment_id() + "\t");
			System.out.print(dto.getJob_id() + "\t");
			System.out.println(dto.getHire_date() );
			
		}
		
		
	}

}
