package access_modifier;
abstract class Animal{
	abstract void makeSound();
}
class dog extends Animal{
	void makeSound() {
		System.out.println("dog barks");
	}
}
class cat extends Animal{
	void makeSound() {
		System.out.println("cat meows");
	}
}
public class FINAL {
	public static void main(String[] args) {
		dog o1 = new dog();
		o1.makeSound();
		cat o2 = new cat();
		o2.makeSound();
	}

}
