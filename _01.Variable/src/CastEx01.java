
public class CastEx01 {
	//프로그램 실행시작점 main메소드
	public static void main(String[] args) {
		
		//정수형 : byte < short < int < long
		byte b_No; // -128 ~ 127 : 500ml 생수병
		b_No = 127;
		
		int i_No;  // 2000ml 생수병
		i_No = 127;  // int 타입의 그릇에 127 담기		 
		i_No = b_No; // int 타입의 그릇에 byte타입인 b_No 의 데이터를 담기 : 암묵적형변환(자동형변환)
		i_No = (int)b_No; // int 타입의 그릇에 byte타입인 b_No 의 데이터를 담기 : 명시적형변환
		//UpCast
		
		b_No = 127;
		b_No = (byte)i_No; // 2000ml 생수병에 있는 700ml 를 500ml 생수병에다 옮겨담기: 명시적형변환 해야 함 
		//데이터타입을 바꾸는 형변환(Cast) 연산자 : (데이터타입)변수
		//DownCast
		
		
	}
}
