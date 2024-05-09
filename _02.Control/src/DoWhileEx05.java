import java.util.Random;

public class DoWhileEx05 {
	public static void main(String[] args) {
		// 윷을 던져 그 결과를 출력하자
		//윷,모 나오면 한번더 가능~!
		//앞 : 0, 뒤 : 1
		//도 : 앞뒤뒤뒤-3, 개 : 앞앞뒤뒤-2, 걸 : 앞앞앞뒤-1, 윷 : 앞앞앞앞-0, 모 : 뒤뒤뒤뒤-4
		
		Random r = new Random();
		System.out.println("윷 나와라~!");
		
		int yut ;
		//boolean oneMore = true; 불리언 타입일 경우/
		
		do {
			
			int bar1 = r.nextInt(2);//던지는 행위
			int bar2 = r.nextInt(2);//던지는 행위
			int bar3 = r.nextInt(2);//던지는 행위
			int bar4 = r.nextInt(2);//던지는 행위
			
			yut = bar1+bar2+bar3+bar4;
			
			System.out.print(bar1 == 0 ? "앞" : "뒤");
			System.out.print(bar2 == 0 ? "앞" : "뒤");
			System.out.print(bar3 == 0 ? "앞" : "뒤");
			System.out.print(bar4 == 0 ? "앞" : "뒤");
			System.out.println("-->");
			
		    switch (yut) {
	         case 0: System.out.println("윶입니다");
	         System.out.println("한번더"); break;
	         case 1: System.out.println("걸입니다"); break;
	         case 2: System.out.println("개입니다"); break;
	         case 3: System.out.println("도입니다"); break;
	         case 4: System.out.println("모입니다");
	         System.out.println("한번더"); break;
	         }
		    //if(yut==4 || yut==0){
		   // oneMore = true;
//		System.out.println("한번더~");
		    //if (yut == 4) {
//		    System.out.println("한번더");
//		}else if (yut == 0) {
//		    	System.out.println("한번더");
//		    }
		
	      }while(yut==0 || yut==4);

		
		
		
		
		
		
		
	
	}
	}
