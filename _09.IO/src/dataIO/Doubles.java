package dataIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Doubles {
//	double 타입의 데이터 5개를 저장하고
//	저장된 파일의 double 타입의 데이터를 읽어들여 콘솔에 출력하기.
	public static void main(String[] args) {
		
		 String filename = "integers";
	      //1. 파일열기
//	      FileOutputStream out = null;
	      DataOutputStream out = null;
	      try {
//	      out = new FileOutputStream( filename );
//	      DataOutputStream writer = new DataOutputStream( out );
	         out = new DataOutputStream(new FileOutputStream( filename ));
//	         2. 쓰기
	         double data[] = { 10000.5, 20000.3, 30000.4, 40000.6, 50000.7, 60000.9 };   
	         for(double su : data) {
	            out.writeDouble(su);
	         }
	      
	      
	      }catch(IOException e) {
	      }finally {
//	         3. 파일닫기
	    	  System.out.println("저장된 파일크기 : " + out.size());
	         try { out.close(); } catch(Exception e) {}
	      }
	      System.out.println("쓰기 완료!");   
	      
	      
	      
	      DataInputStream in = null;
	      try {
	    	  in = new DataInputStream( new FileInputStream(filename));
	      	while(true) {
	      		//읽기
	      		double no = in.readInt();
	      		System.out.println(no);
	      	}
	      } catch(FileNotFoundException e) {
	    	  
	      }catch(IOException e) {
	    	  
	      }finally {
	    	  if(in != null) {
	    		  try {in.close();} catch(Exception e) {}
	    		  
	    	  }
	      }
	      System.out.println("읽기 완료!");
	      
	   }
	}
