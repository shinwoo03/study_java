
public class IFEx07 {
public static void main(String[] args) {
	//성별 판단하기 - 1,2,3,4 에 따라 남성/여성인지 출력하기
	
	int zen = 2;
    if(zen == 1 ) {
       System.out.println("남성");
    }
    if(zen == 2) {
       System.out.println("여성");
    }
    if(zen == 3) {
       System.out.println("남성");
       
    if(zen == 4) {
          System.out.println("여성");
    }
    }
    
    
    int zeen = 3;
    if(zeen == 1 || zeen == 3) {
       System.out.println("남성");
    }
    if(zeen == 2 || zeen == 4) {
       System.out.println("여성");
    }
	
}
}
