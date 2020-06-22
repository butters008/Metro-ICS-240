
public abstract class Animal {
	private String name;
	private int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract void print();
}

class Dog extends Animal {
	
	public Dog(String name, int age) {
		super(name, age);
	}
	
	public void print() {
		System.out.print("Whatever");
	}
}
