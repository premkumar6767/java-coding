package access_modifier;
import java.util.Scanner;
import java.lang.System;
import java.util.InputMismatchException;

public class division {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a/b);
		}
		catch(ArithmeticException e){
			System.out.println("Arithmic expression error please watch and then give the inputs");
		}
		catch(InputMismatchException e) {
			System.out.println(e);
		}
	}

}
