
public class Person {

	private String name;
	private int age;
	private int shoeSize;

public Person(String name, int age, int shoeSize) {
		super();
		this.name = name;
		this.age = age;
		this.shoeSize = shoeSize;
}
	

private void walking() {
	System.out.println(name + age + shoeSize );
}

public void startWalking() { 
	walking();
	
}
}