package covid;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class KDCAList {
	void display() {
//		https://api.odcloud.kr/api/apnmOrg/v2/list?
//		page=1
//		&perPage=10
//		&serviceKey=data-portal-test-key
		
		StringBuffer url = new StringBuffer(
				"https://api.odcloud.kr/api/apnmOrg/v2/list?");
		url.append("page=").append(1);
		url.append("$perPage=").append(10);
		url.append("$serviceKey=").append("data-portal-test-key");
		
		String response = requestAPI( url );
		
	      JSONObject json = new JSONObject(response);
	      JSONArray list = json.getJSONArray("data");
		
	      viewHtml(list);
	}
	
	
	 void viewHtml(JSONArray list) {
	      String path = "D:\\io\\kdca\\";
	      File dir = new File(path);
	      if( ! dir.exists( ) ) dir.mkdirs();
	   
	      String filename = "list.html";
	      
	      PrintWriter writer = null;
	      
	      try {
	         writer = new PrintWriter( path + filename );
	         writer.print("<html>");
	         writer.print("<body>");
	         writer.print("<h2>코로나19 예방접종 위탁의료기관 조회서비스</h2>");
	         writer.print("<table border='1'>");
	         writer.print("<colgroup>" + "<col width ='300px'>" +"<col width ='150px>" + "<col width='400px'>"  +"<colgroup>");
	                
	         writer.print("<tr> <th>기관명</th> <th>전화번호</th> <th>주소</th> <th>점심시간시작</th> <th>점심시간종료</th> </tr>");
	         
	         for(int idx=0; idx<list.length(); idx++) {
	            JSONObject json = list.getJSONObject(idx);
	            writer.printf("<tr> <td>%s</td> <td>%s</td> <td>%s</td > <td>%s</td> <td>%s</td> </tr>)"
	                     , json.getString("centerName")
	                     , json.getString("phoneNumber")
	                     , json.getString("address"), json.getString("lunchSttTm"),json.getString("lunchEndTm") );
	                    
	         }
	      
	         writer.print("</table>");
	         writer.print("</body>");
	         writer.print("</html>");
	         
	      }catch(IOException e) {
	      }finally {
	         writer.close();
	      }
	     
	         
	         
	   }
	
	
	
	
	String requestAPI( StringBuffer urlBuilder ) {
	      String response = null;
	        URL url;
	      try {
	         url = new URL(urlBuilder.toString());
	           HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	           conn.setRequestMethod("GET");
	           conn.setRequestProperty("Content-type", "application/json");
	           System.out.println("Response code: " + conn.getResponseCode());
	           BufferedReader rd;
	           if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
	               rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	           } else {
	               rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
	           }
	           StringBuilder sb = new StringBuilder();
	           String line;
	           while ((line = rd.readLine()) != null) {
	               sb.append(line);
	           }
	           rd.close();
	           conn.disconnect();
	           response = sb.toString();
	           System.out.println( response );
	           
	      } catch (Exception e) {
	      }
	      return response;
	   }
	
	
}
