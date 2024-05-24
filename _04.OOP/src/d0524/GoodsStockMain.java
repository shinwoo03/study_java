package d0524;
public class GoodsStockMain {
	public static void main(String[] args) {
		
		//특정 상품 재고관리하기
		//생성자 생성
		
		GoodsStock nike 
		= new GoodsStock( "나이키 모자", "NK01", 50 );
		goodsInfo(nike);
		
		
		
		
		//생성자
		GoodsStock adidas
		= new GoodsStock("아디다스 가방", "AD01");
		goodsInfo(adidas);
		
		
	}
	//상품정보출력하기
	static void goodsInfo(GoodsStock goods) {
		
		System.out.println("상품명 : " + goods.getGoodsName());
		System.out.println("상품코드 : " + goods.getGoodsCode());
		System.out.println("상품재고수량 : " + goods.getStockAmount());
		System.out.println();
		
	}
	
	
	
}
