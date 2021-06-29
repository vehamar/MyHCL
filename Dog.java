
public class Dog {
	
	private String name;
	private int age;
	private double weight;
	
	
	
	public Dog(int age, double weight) {
		super();
		this.age = age;
		this.weight = weight;
	}

	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Dog(String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	
	public void showExcitement() {
		System.out.print(name + "is wagging its tail");
	}
	
	public void showExcitement(int levelOfExcitement) {
		System.out.print(name + "is wagging its tail times" + levelOfExcitement );
	}
	
	public String eating() {
		return "eating";
	}
		
	public void eating(String food) {
		System.out.print("Eating" + food);
	}
		




}
