package practice.java;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class file_handling {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("output.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("hey im prem");
			bw.newLine();
			bw.write("how are you?");
			bw.close();
			System.out.println("Success");
		}
		catch(Exception e){
			System.out.println("something has happened");
		
	}

}
	
}
