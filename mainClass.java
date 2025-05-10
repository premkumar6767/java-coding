package practice.java;

class A extends Thread{
		public void run() {
			for(int i = 1; i<=50 ; i++) {
				System.out.println("HI");
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					System.out.println(e);
				}
			}
		}
	
}
class B extends Thread{
	public void run() {
		for(int i = 1; i<=50 ; i++) {
			System.out.println("OK BYE");
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}

}
class C extends Thread{
	int j = 0;
	public void run() {
		for(int i = 1; i<=50 ; i++) {
			j = i;
		}
		
	}

}
		


public class mainClass {

	public static void main(String[] args) {
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		a1.setPriority(10);
		b1.setPriority(2);
		a1.start();
		b1.start();
		c1.start();
		try {
			c1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c1.j);
		

	}

}
