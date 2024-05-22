//상품 재고 관리
public class GoodsStock {
	//필드 : 상품명, 상품코드, 재고수량
	String goodsName, goodsCode;
	int stockAmount;
	
	//메소드 : 입고한다. 출고한다
	//입고한다 : 입고된 수량만큼 재고수량이 증가
	void plusStock(int amt) {
		stockAmount += amt;
	}
	//출고한다 : 출고된 수량만큼 재고수량이 감소, 출고된 수량 반환하기
	int minusStock(int amt) {
		stockAmount -= amt;
		return amt;
	}
	
	
	
	
}
