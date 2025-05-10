package practice.java;
import java.io.FileReader;
public class file_read {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("output.txt");
			int c = fr.read();
			while(c!=-1) {
				System.out.print((char)c);
				c = fr.read();
			}
			fr.close();
			System.out.println("Success");
			
		}
		catch(Exception e){
			System.out.println("something has happened");
		}

	}

}
