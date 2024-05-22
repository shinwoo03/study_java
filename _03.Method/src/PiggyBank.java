
public class PiggyBank { //PiggyBank를 성형틀이라고 생각하자! 중괄호 안에있는걸 만들어 낸다.
//클래스명 : 대문자로 시작한다 - camel case 단어단위로 시작은 대문자로
//필드명, 메소드명 : 소문자로 시작 - camel case, _로 단어단위를 묶어서 표현한다.

//데이터 : 필드 - 주인, 총액 //가독성 때문에 필드먼저 선언하고 메소드를 선언한다.(대부분은)
	String owner;
	int total;
	
//기능 : 메소드 - 돈을 넣는다. 돈을 빼낸다.
	void inputMoney( int money ) { //돈을 넣는 금액이 달라지니까 픽스 시키지 말고 변수선언.
		total += money;
	}
	void output_money( int money ) {
		total -= money;
	}
	
}
