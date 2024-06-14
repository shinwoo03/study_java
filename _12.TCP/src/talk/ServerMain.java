package talk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {
   public static void main(String[] args) {
      ServerSocket server = null;
      Socket client = null;
      DataInputStream in = null;
      DataOutputStream out = null;
      Scanner scan = new Scanner(System.in);
      
      try {
         server = new ServerSocket(8000);
         System.out.println("[서버] 준비");
         
         client = server.accept();
         System.out.println("클라이언트와 연결됨");
         
         in = new DataInputStream( client.getInputStream());
         out = new DataOutputStream( client.getOutputStream());
         
         while(true) {
            //클라이언트가 보낸 메시지 출력
            String msg = in.readUTF();
            System.out.println("수신> " + msg);
            //bye 메세지를 수신하면 종료하기
            if( msg.equals("bye") )break;
            
            //클라이언트에게 메세지 보내기
            System.out.println("송신> ");
            out.writeUTF(scan.nextLine());
         }
         
         
      } catch (IOException e) {
         System.out.println("클라이언트와 연결 끊김");
         
      } finally {
         try { out.close(); }catch(Exception e) {}
         try { in.close(); }catch(Exception e) {}
         try { client.close(); }catch(Exception e) {}
         try { server.close(); }catch(Exception e) {}
      }
      
      
      
      
      
      
      
   }
}
