
public class IFEx07 {
public static void main(String[] args) {
	//성별 판단하기 - 1,2,3,4 에 따라 남성/여성인지 출력하기
	//주민번호 성별을 담을 변수 선언 : 데이터타입 + 변수명;
	
	
	int gen = 4;
	/*
	//각각 조건을 판단하는 경우
    if(gen == 1 ) {
       System.out.println("남성");
    } else if(gen == 2) {
       System.out.println("여성");
    } else if(gen == 3) {
       System.out.println("남성");
    } else if(gen == 4) {
          System.out.println("여성");
    }
    }
    
   //남성/여성
    if(gen == 1 || gen == 3) {
       System.out.println("남성");
    } else if(gen == 2 || gen == 4) {
       System.out.println("여성");
    }
	 */
	
	gen = 5;
//	if(gen == 1 || gen == 3) {
//		System.out.println("남성");
//	} else  {
//		System.out.println("여성");
//	}
	if(gen == 1 || gen == 3) {
		System.out.println("남성");
	} else if(gen == 2 || gen == 4) {
		System.out.println("여성");
	}else {
			System.out.printf("주민번호 %d은 성별 판별 불가\n",gen);
		}
	
	
	//1,3 : 남성 2,4:여성 - 2로 나눈 나머지가 0이면 여성, 아니면 남성
	
	if(gen %2 == 0) {
		System.out.printf("주민번호 %d은 여성", gen);
	} else {
		System.out.printf("주민번호 %d은 남성", gen);
	}
	}
	
	}


