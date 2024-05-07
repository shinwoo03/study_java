import java.util.Random;

public class Yut {
public static void main(String[] args) {
	//윷을 던져 그 결과를 출력하기
	//도, 개, 걸 ,윷, 모
	//앞 : 0 , 뒤 : 1
	//도 : 앞뒤뒤뒤-3, 개 : 앞앞뒤뒤-2, 걸 : 앞앞앞뒤-1, 윷 : 앞앞앞앞-0, 모 : 뒤뒤뒤뒤-4
	
	Random r = new Random();
	int bar1 = r.nextInt(2); //0~1 두 수 중 랜덤 추출
	int bar2 = r.nextInt(2); //0~1 두 수 중 랜덤 추출
	int bar3 = r.nextInt(2); //0~1 두 수 중 랜덤 추출
	int bar4 = r.nextInt(2); //0~1 두 수 중 랜덤 추출
	System.out.print(bar1 == 0 ? "앞" : "뒤");
	System.out.print(bar2 == 0 ? "앞" : "뒤");
	System.out.print(bar3 == 0 ? "앞" : "뒤");
	System.out.print(bar4 == 0 ? "앞" : "뒤");
	System.out.println("-->");
	
	int yut = bar1 + bar2 + bar3 + bar4;
	if (yut ==0) {
		System.out.println("윷");
	}else if (yut ==1) {
		System.out.println("걸");
	}else if (yut == 2) {
		System.out.println("개");
	}else if (yut == 3) {
		System.out.println("도");
	}else {
		System.out.println("모");
	}
	
	
	
	

}
}
