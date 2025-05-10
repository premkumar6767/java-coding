package access_modifier;
import java.util.Scanner;
import java.lang.System;
import java.util.InputMismatchException;

class NotValidException extends Exception{
	public NotValidException(String err){
		super(err);
		
	}
}
public class finaaly_practice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("Enter your age: ");
			int age = scan.nextInt();
			if(age<18) {
				throw new NotValidException("Age should be greater than 18");
			}
			
		}
		catch(NotValidException e){
			System.out.println("Age Not Valid exception error");
		}
		catch(Exception e){
			System.out.println(e);
		}
		

	}

}
