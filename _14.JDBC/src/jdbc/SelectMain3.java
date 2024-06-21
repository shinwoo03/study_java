package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectMain3 {
      public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("조회할 사원의 성 : ");
       String last_name = scan.next();
       System.out.println("조회할 사원의 명 : ");
       String first_name = scan.next();
       scan.close();
    	  
    	  
   // 성이 king인 사원들의 사번, 성명 조회
   Connection conn = null;
   try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      
      conn = DriverManager.getConnection(
            "jdbc:oracle:thin:@192.168.0.27:1521:xe","hr","0000");
      
//      String sql 
//      = "select employee_id, last_name ||  ' ' || first_name as name "
//      + "from employees "
//      + "where upper(last_name) = '"+ last_name.toUpperCase() +"' " 
//      + "and lower(first_name) = '"+ first_name.toLowerCase() +"' ";
//      Statement st = conn.createStatement();
//      ResultSet rs = st.executeQuery(sql);
      
      String sql
      = "select employee_id, last_name ||  ' ' || first_name as name "
      + "from employees "
      + "where upper(last_name) = ? "
      + "and lower(first_name) = ? ";
      //Statement 상속한 PreparedStatement
      PreparedStatement ps = conn.prepareStatement(sql);
      //준비된 문장에 ? 가 있다면 ?에 값을 담는 처리하기
      ps.setString(1, last_name.toUpperCase() );
      ps.setString(2, first_name.toLowerCase() );
      ResultSet rs = ps.executeQuery();
      

      while( rs.next() ) {
         System.out.print(rs.getInt("employee_id") + "\t" );
         System.out.println( rs.getString("name"));
      }
      
   } catch (Exception e) {
      System.out.println(e.getMessage());
   } finally {
      try { conn.close(); }catch(Exception e) {}
         
      }
   }

   
   
   
   
   
   
   
      
   
   
}
