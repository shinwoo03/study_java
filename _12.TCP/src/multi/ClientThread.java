package multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//수신메시지 모든 클라이언트에게 송신처리
public class ClientThread extends Thread {
	Socket client;
	PrintWriter writer;
	//static 인 list에 여러 쓰레드가 접근할때 문제상황이 생길수 있다
	//동기화처리가 필요함
	//모든 자료구조에는 동기화를 해주는  Collections 클래스의 synchronized 메소드를 사용할 수 있다
	static List<PrintWriter> list 
		= Collections.synchronizedList( new ArrayList<PrintWriter>() ) ;

	
	public ClientThread(Socket client) {
		this.client = client;
		
		try {
			writer = new PrintWriter( client.getOutputStream() );
			list.add( writer );
			
		} catch (IOException e) {
		}

		
	}

	@Override
	public void run() {
		String name = null;
		//클라이언트가 송신한 메시지를 읽어서 모든 클라이언트에게 송신
		try {
			BufferedReader reader
				= new BufferedReader( new InputStreamReader( client.getInputStream() ) );
			
			name = reader.readLine();
			System.out.printf("[%s]님 입장 \n", name);
			sendAll( name + "님 입장" );
			
			//맨처음 수신한 메시지는 접속자명
			
			while( true ) { //수신하는 동안 계속 송신
				String send = reader.readLine();
				if( send==null ) break;
				
				sendAll(name + "> "+ send );
			}
			
		} catch (IOException e) {
		} finally { 
			//해당클라이언트의 출력스트림은 삭제
			list.remove( writer );
			sendAll( name + "님 퇴장" );
			try{ client.close(); }catch(Exception e) {}
		}
	}
	
	void sendAll(String msg) {
		for(PrintWriter out : list ) {
			if( out==writer ) continue;   //자신은 빼고 보내기
			out.println( msg );
			out.flush();
		}
	}
}