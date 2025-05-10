package inheritance;

class animal{
	String name;
	int age;
	void makeSound() {
		System.out.println("animal makes sound");
	}
}
class dog extends animal{
	String breed;
	void makeSound() {
		System.out.println("Dog barks");
	}
	void fetching() {
		System.out.println("Dog is fetching");
	}
}
class cat extends animal{
	String color;
	void makeSound() {
		System.out.println("cat meows");
	}
	void climb() {
		System.out.println("cat is climbing");
	}
}

public class zoo {
	
	public static void main(String[] args) {
		dog a1 = new dog();
		a1.name = "xyz";
		a1.age = 10 ;
		a1.makeSound();

	}

}
