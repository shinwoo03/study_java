
public class Phone {
	public static void main(String[] args) {
		  //홍길동 010-1111-1111
        //박명수 010-3333-4444
        //심청 010-5555-6666
        //장화 010-7777-8888
        //홍련 010-9999-0000
     String[][] people = {{"홍길동","010-1111-2222"}
                    ,{"박문수","010-3333-4444"}
                    ,{"심청","010-5555-6666"}
                    ,{"장화","010-7777-8888"}
                    ,{"홍련","010-9999-0000"} };
     //int , double, boolean : ==
     //레퍼런스 타입 : 주소비교
     //문자열인 경우 : equals 메소드 사용
     //홍길동 전화번호 찾기
     
//     for(int row=0; row<people.length; row++) { //5행
//        if(people[row][0] == "홍길동")
//           System.out.println("전화번호:" + people[row][1]);
//     }   
//     //장화 전화번호 찾기
//     for(int row=0; row<people.length; row++) { //5행
//        if(people[row][0] == "장화")
//           System.out.println("전화번호:" + people[row][1]);
//        }
     
     //박문수 전화번호 찾기
     findPhoneNumber(people, "박문수");
  
     //홍련 전화번호 찾기
     String phone = findTelNumber(people, "홍련");
     System.out.println("홍련의 전화번호:"+ phone);
     
     //강 전화번호 찾기
     phone = findTelNumber(people, "강");
     System.out.println("강 전화번호:"
           + (phone.isEmpty( ) ? "없습니다" : phone) );
  
  }   
     
  static String findTelNumber(String [][] book , String who) {
     String phone = "";
     for(int row=0; row<book.length; row++) { //5행
        if(book[row][0].equals(who) ) {
           phone = book[row][1];
           break;
        }
     }
     return phone;
  }

     
  //전화번호찾기 메소드
  static void findPhoneNumber(String people[][], String name) {
     for(int row=0; row<people.length; row++) { //5행
        if(people[row][0].equals(name)) {
           System.out.println(name + "전화번호:" + people[row][1]);
           break;
        }
     }
  }
  
  
}
//        System.out.println(people[row][0]+ ":" + people[row][1]);
//        for(int col=0; col<people[row].length; col++) {
//           System.out.println(people[row][col]);
//        }
//        System.out.println();
