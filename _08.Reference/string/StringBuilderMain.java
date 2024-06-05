package string;

public class StringBuilderMain {
	public static void main(String[] args) {
//		StringBuilder > StringBuffer
		//멀티쓰레드 형태가 아니라면
		//멀티쓰레드 라면 StringBuilder는 안정적이지 않다(안정성을 보장x) -> 그럴땐 StringBuffer 를 사용
		
		 StringBuilder script = new StringBuilder("<script>");
	      script  .append("alert('평가는 잘 보셨나요?');")
	              .append("location = 'http://www.naver.com' ")
	              .append("</script> ")
	              .toString();
	      
	      new StringBuilder("</script>");
	      
	      
	      StringBuilder builder= new StringBuilder("자바교재: ");
	      builder.append("혼자");
	      builder.append(" ");
	      builder.append("공부하는 ");
	      builder.append(" ");
	      builder.append("자바 ");
	      System.out.println("StringBuilder" + builder );
//	      System.out.println(builder.toString() );
	   
	   
	   
	      String text = "혼자" + " " + "공부하는 " + "" + "자바";
	      System.out.println("String" + text); 
	   
	   if(builder.equals(text)) {
		   System.out.println("같음");
	   }else
		   System.out.println("다름");
	   
	   if( builder.toString().equals(text)) {
		   System.out.println("같음");
	   }else
		   System.out.println("다름");
	   
	   }
	}
