package mail;

import java.net.MalformedURLException;
import java.net.URL;

//import org.apache.commons.mail.EmailAttachment;
//import org.apache.commons.mail.EmailException;
//import org.apache.commons.mail.HtmlEmail;
//import org.apache.commons.mail.SimpleEmail;

public class EmailSender {

   void sendHtmlMail(String name, String email) {
//      HtmlEmail mail = new HtmlEmail();
//      mail.setCharset("utf-8");
//      mail.setDebug(true);
//      
//      mail.setHostName("smtp.naver.com");
//      mail.setAuthentication("itstudydev@naver.com", "Itstudy10102");//보내는이의 메일서버에 로그인
//      mail.setSSLOnConnect(true); //로그인버튼클릭
//      
//      
//      try {
//         //송신자
//         mail.setFrom("itstudydev@naver.com", "쿠폰관리자");
//         
//         //수신자
//         mail.addTo(email, name);
//         
//         //제목
//         mail.setSubject("생일 축하 메시지");
//         
//         //내용
//         StringBuffer msg = new StringBuffer();
//         msg.append("<h2>생일축하 쿠폰발급</h2>");
//         msg.append("<strong>"). append( name ).append("</strong>님 생일을 축하합니다!");
//         msg.append("<div>생일 쿠폰이 발급되었으니</div>");
//         msg.append("<div><a href='https://www.naver.com/'>당사 사이트</a> 쿠폰함을 확인하세요</div>");
//         mail.setHtmlMsg( msg.toString() );
//         
//         //파일첨부하기
//         EmailAttachment file = new EmailAttachment();
//         file.setPath( "D:\\Study_Java\\객체지향평가지.hwp" );
//         mail.attach(file);
//         
//         file = new EmailAttachment();
//         file.setURL( new URL("https://imgnews.pstatic.net/image/094/2024/06/17/0000011851_001_20240617073511681.jpg?type=w647") );
//         mail.attach(file);
//         
//         mail.send(); //메일보내기버튼 클릭
//         
//      } catch (EmailException e) {
//      } catch (MalformedURLException e) {
//      }
//      
   }
   
   
   
   void sendMail(String name, String email) {
//      //메일서버에 접속하기
//      SimpleEmail mail = new SimpleEmail();
//      mail.setCharset("utf-8");
//      mail.setDebug(true);
//      
//      mail.setHostName("smtp.naver.com"); //메일서버지정
//      mail.setAuthentication("itstudydev@naver.com", "Itstudy10102");//보내는이 정보입력
//      mail.setSSLOnConnect(true); //로그인 버튼 클릭
//      
//      try {
//         //보내는이 정보: 관리자
//         mail.setFrom("itstudydev@naver.com", "한울자바 관리자");
//         
//         //받는이 정보
//         mail.addTo(email, name);
//         //mail.addTo(email, name);
//         
//         //메일제목
//         mail.setSubject("생일축하 메시지");
//         
//         //메일내용
//         StringBuffer msg = new StringBuffer();
//         msg.append( name + " 고객님! \n");
//         msg.append( "생일을 축하합니다\n");
//         msg.append( "생일 쿠폰이 발급되었습니다\n");
//         msg.append( "당사 사이트 쿠폰함을 확인하세요");
//         mail.setMsg( msg.toString() );
//         
//         //보내기 버튼 클릭
//         mail.send();
//         
//      } catch (EmailException e) {
//      } 
//      //
//      
      
   }
   
}