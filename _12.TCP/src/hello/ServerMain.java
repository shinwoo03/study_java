package hello;

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
			server = new ServerSocket(8000);//데이터 송수신할 통로인 포트를 결정한다.
			System.out.println("서버준비 완료");
			
			client = server.accept();//클라이언트의 요청을 기다린다. 
			System.out.println("클라이언트와 연결 완료");
			
			//들어온 요청을 읽어들인다
//			InputStream stream = client.getInputStream(); //단위 : byte, char
//			//읽어온 byte데이터를 문자열로 변환
//			in = new DataInputStream( stream );
			in = new DataInputStream( client.getInputStream() );
			
			String msg = in.readUTF();
			System.out.println("수신 메시지> " + msg);
			
			//서버도 클라이언트에게 메시지 보내기
			out = new DataOutputStream( client.getOutputStream() );
			System.out.println("송신 메시지> " );
			out.writeUTF( scan.nextLine() );
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}finally {
			try { out.close(); } catch (Exception e) {}
			try { in.close(); } catch (Exception e) {}
			try { client.close(); } catch(Exception e) {}
			try { server.close(); } catch(Exception e) {}
			
		}
		
		scan.close();
		//사용중인 프로그램의 포트, ip 확인 : netstat -na
		
		
	}

}
