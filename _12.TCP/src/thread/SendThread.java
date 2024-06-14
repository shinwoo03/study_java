package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SendThread extends Thread {
	Socket client;

	public SendThread(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		//소켓을 통해 메시지 보내기 : 키보드로 입력한 메시지
//		DataOutputStream out = null;
		BufferedReader reader = null;
		PrintWriter writer = null;
		
		try {
//			out = new DataOutputStream( client.getOutputStream() );
			//키보드로 입력한 메시지를 읽어들여 내보내기
			 
			reader = new BufferedReader( new InputStreamReader( System.in ) );
			writer = new PrintWriter( client.getOutputStream());
			while(true) {
				String line = reader.readLine();
				//bye를 입력시 종료
				if(line.equals("bye")) break;
					
				writer.println( line );
				writer.flush(); //입력데이터 바로 내보내기
			}
		} catch (IOException e) {
		} finally {
			try{writer.close();}catch(Exception e) {}
			try{reader.close();}catch(Exception e) {}
			try{client.close();}catch(Exception e) {}
		}
		
	}
	
	
	
	
	
}
