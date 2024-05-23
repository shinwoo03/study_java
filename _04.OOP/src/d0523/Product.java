package d0523;

public class Product {
//	1. 상품정보 클래스 Product 선언
	//class는 자기자신 this
//	1-1) 필드 : 상품명, 상품코드, 상품가격
	String productName, productCode;
	int productPrice;
	
//	1-2) 생성자 : 1(상풍명, 상품코드를 초기화) 2(모든 필드를 초기화)
	
	Product(String productName, String productCode){
		this.productName = productName;
		this.productCode = productCode;
	}
	
	Product(String productName, String productCode, int price){
		this (productName, productCode);
		this.productPrice = price;
	}
//	1-3) 메소드 : 가격을 변경한다
	
	void setPrice(int productPrice) {
		this.productPrice = productPrice;  
	}
	
}
