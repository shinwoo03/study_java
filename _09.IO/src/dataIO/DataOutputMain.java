package dataIO;

import java.io.*;

public class DataOutputMain {
   public static void main(String[] args) {
      String filename = "integers";
      //1. 파일열기
//      FileOutputStream out = null;
      DataOutputStream out = null;
      try {
//      out = new FileOutputStream( filename );
//      DataOutputStream writer = new DataOutputStream( out );
         out = new DataOutputStream(new FileOutputStream( filename ));
//         2. 쓰기
         int data[] = { 10000, 20000, 30000, 40000, 50000, 60000 };   
         for(int su : data) {
            out.write(su);
         }
      
      
      }catch(IOException e) {
      }finally {
//         3. 파일닫기
    	  System.out.println("저장된 파일크기 : " + out.size());
         try { out.close(); } catch(Exception e) {}
      }
      System.out.println("쓰기 완료!");   
      
      
      
      DataInputStream in = null;
      try {
    	  in = new DataInputStream( new FileInputStream(filename));
      	while(true) {
      		//읽기
      		int no = in.readInt();
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
