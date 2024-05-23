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
		//남아있는 수량보다 더 많은 수량을 출고요청을 한다면
		if ( stockAmount < amt ) return 0;
		stockAmount -= amt;
		return amt;
	}
	
	
	
	
}
