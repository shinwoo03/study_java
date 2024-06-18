package multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SendThread extends Thread {
	Socket client; //연결된 소켓
	String name;   //접속된 사용자명

	public SendThread(Socket client, String name) {
		this.client = client;
		this.name = name;
	}

	@Override
	public void run() {
		try {
			//클라이언트가 키보드로 입력한 정보를 읽어서 송신하기
			BufferedReader reader  
			 	= new BufferedReader( new InputStreamReader( System.in ) );
			
			PrintWriter writer = new PrintWriter( client.getOutputStream() );
			
			writer.println( name ); //대화하려는 접속자명 보내기
			writer.flush(); 
			
			while( true ) {
				String send = reader.readLine();
				if( send.equals("bye") ) break;
					
				writer.println( send );
				writer.flush();
			}
		
		} catch (IOException e) {
		} finally {
			try{ client.close(); }catch(Exception e) {}
		}
		
		
		
		
	}
	
}