package objectIO;

import java.io.Serializable;

public class Person implements Serializable {
	//생성자를 선언하는 이유는 필드를 초기화 시키기 위함.
	String name, gender;
	int age;
	
	//파라미터 있는 생성자 : 필드의 초기화를 위해 선언.
	Person(String name, String gender, int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
			

}
