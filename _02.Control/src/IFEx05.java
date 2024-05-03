
public class IFEx05 {
public static void main(String[] args) {
	//성적에 따른 학점 출력하기
	//성적을 담을 변수
	int score = 69;
	if (score >= 90) { //99 >= 90 : T
		System.out.println("A학점");
	} else if(score >=80){ //99 >= 80 : F
		System.out.println("B학점");
	} else if(score >=70){ // 99 >= 70 : F
		System.out.println("C학점");
	} else if(score >=60){ //99 >= 60 : F
		System.out.println("D학점");
	//}else if (score < 60)
	} else {
		System.out.println("F학점");
	}
	
	
	
	
}
}
