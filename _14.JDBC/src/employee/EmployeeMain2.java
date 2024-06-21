package employee;

import java.util.Scanner;

import model.EmployeeDAO;
import model.EmployeeDTO;

public class EmployeeMain2 {
	public static void main(String[] args) {
		//사원정보화면 - 사번입력하기
		Scanner scan = new Scanner(System.in);
		System.out.println("조회할 사번 : ");
		int employee_id= scan.nextInt();
		scan.close();
		
		EmployeeDAO dao = new EmployeeDAO();
		EmployeeDTO dto = dao.employeeInfo(employee_id);
		if( dto==null )
			System.out.println(employee_id + "사번의 사원정보는 없습니다.");
		else {
			System.out.println("사번 : " + dto.getEmployee_id() );
			System.out.println("성명 : " + dto.getLast_name() + " " + dto.getFirst_name()  );
			System.out.println("이메일 : " + dto.getEmail() );
			System.out.println("급여 : " + dto.getSalary() );
			System.out.println("입사일자 : " + dto.getHire_date() );
			System.out.println("부서 : " + dto.getDepartment_id() );
			System.out.println("업무 : " + dto.getJob_id() );
			System.out.println("매니저 : " + dto.getManager_id() );
		}
		
		
		
	}

}
