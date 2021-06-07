package ch08;

public class PersonTest {

	public static void main(String[] args) {

		Person personT = new Person();
		personT.name = "Tomas";
		personT.age = 37;
		personT.height = 180;
		personT.weight = 78;
		personT.gender = "남성";
		
		personT.showPersonInfo();
		
	}

}
