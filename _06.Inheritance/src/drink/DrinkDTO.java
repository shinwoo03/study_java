package drink;

//음료정보클래스
public class DrinkDTO {
	String name;
	int price, quantity;
	
	
	DrinkDTO(String name, int price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

}
