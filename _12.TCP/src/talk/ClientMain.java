package talk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {
   public static void main(String[] args) {
      Socket client = null;
      DataInputStream in = null;
      DataOutputStream out = null;
      Scanner scan = new Scanner(System.in);
      
      try {
      client = new Socket("192.168.0.41",8000);
      System.out.println("[클라이언트]");
      
      out = new DataOutputStream( client.getOutputStream());
      in = new DataInputStream( client.getInputStream());
      
      while(true) {
         System.out.println("송신>");
         out.writeUTF(scan.nextLine());
         
         String msg = in.readUTF();
         System.out.println("수신>" + msg);
         //bye 메세지 수신시 종료
         if(msg.equals("bye") ) break;
         }
      
      } catch (UnknownHostException e) {
            System.out.println(e.getMessage());   
      } catch (IOException e) {
            System.out.println(e.getMessage());
      } finally {
            try { in.close();}catch(Exception e) {}
            try { out.close();}catch(Exception e) {}
            try { client.close();}catch(Exception e) {}
            }
            scan.close();
   
      
   }
}
