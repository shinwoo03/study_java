package file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileMain {
	public static void main(String[] args) {
		//현재 프로젝트 위치를 기준으로 해당 파일을 찾는다. : 상대경로
		File file = new File( "학생명단.html" ); 
		//해당 파일이 있는지 확인
		boolean exist = file.exists();
		System.out.println(exist ? "파일있음" : "파일없음");
		
		
		
		//절대경로로 파일 찾기
		new File("C:\\Users\\HANUL\\Desktop\\06.emcc_finish");
		System.out.println(file.exists() ? "참고파일있음" : "파일없음");
		
		file = new File("."); //현재위치 : . 상위위치 : ..
		File[] list = file.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		for(File f : list) {
			if(f.isDirectory()) {
				System.out.print("폴더: ");
			}
			System.out.print(f.getName() + " > "); //파일/폴더명
			// long -> 년월일시분초에 해당하는 걸로 바꿔서 표현
			String modified = sdf.format(new Date(f.lastModified()));
			System.out.println(modified);  //마지막 수정일시
		}
		
		
		
		
		
	}
}
