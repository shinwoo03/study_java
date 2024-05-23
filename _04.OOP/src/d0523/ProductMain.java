package d0523;

public class ProductMain {

	
	public static void main(String[] args) {
//	2. 상품정보 객체를 생성하여 사용하는 main있는 클래스 선언
//	화장지는 상품가격까지 등록,
//	종이컵은 상품가격 없이 등록 -> 가격을 1500 으로 변경
		
		Product tissue = new Product("화장지","TS01", 10000);
//		productInfo(tissue);
		
		Product cup = new Product("종이컵","PC01");
//		productInfo(cup);
		
		Product water = new Product("생수","WT01", 3000);
		 
		 //cup 가격책정후 변경하기
//		cup.setPrice(2000);
//		productInfo(cup);
		
		 
//	출력결과
//	화장지 TS01   10000
//	종이컵 PC01   1500
//		 System.out.println("상품명 \t상품코드 \t가격");
//		 info(tissue);
//		 info(cup);
//		 info(water);
//		 
		 
		 
		 int no[] = new int[3];
//		 Product[] products = new Product[3];
//		 products[0] = tissue;
//		 products[1] = cup;
//		 products[2] = water;
		 
		 System.out.println("상품명 \t상품코드 \t가격");
		 Product[] products = {tissue, cup, water};
		 
		 for ( Product p : products ) {
			 info(p);
		 }
		 
		 
	}
	
	static void info(Product products) {
	System.out.println(products.productName + "\t" + products.productCode + "\t" + products.productPrice);
	
	}
	
	static void productInfo(Product products) {
		System.out.println("상품 : " + products.productName);
		System.out.println("상품코드 : " + products.productCode);
		System.out.println("상품가격 : " + products.productPrice);
		
		
	}
	
	
}
