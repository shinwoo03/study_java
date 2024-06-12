package video;

public class VideoThread extends Thread {

   @Override
   public void run() {
      //비디오  프레임 번호 출력
      int[]no = { 1,2,3,4,5 };
   
      for( int idx=0; idx<no.length; idx++) {
         System.out.print("(비디오프레임)" + no[idx] );
         
         try {
            Thread.sleep(300);
         } catch (InterruptedException e) {
         } 
         
      }
   
   
   
   }
   
   
   

   
   
   
   
   
}
