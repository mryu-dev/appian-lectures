
class Animal1 {
	int i = 10;
	public Animal1() {
		System.out.println("In Animal1 Constructor");
	}
	public void bark() {
		System.out.println("in animal");
	}
	
	public void move() {
		//super.move();
		System.out.println("in animal move");
	}	
}

class Dog1 extends Animal1 {
	int i =20;
	public Dog1() {
	//	super();
		System.out.println("In Dog1 Constructor");
	}
	public void move() {
		super.bark();
		System.out.println("in dog");
	}	
}

public class Inheritance3 {
	public static void main(String[] args) {
//		Animal1 a = new Animal1(); // Animal reference and object
		Animal1 d = new Dog1(); // Animal reference but Dog object
		
//		System.out.println(a.i);
//		System.out.println(d.i);
		d.bark();
	//	a.move();
		d.move();
	}
}
