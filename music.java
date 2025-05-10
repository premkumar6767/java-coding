package interface_practice;

/*interface Playable{
	void play();
}
class Guiter implements Playable{
	public void play() {
		System.out.println("Guiter is playing");
	}
}
class Piano implements Playable{
	public void play() {
		System.out.println("Piano is playing");
	}
}

public class music {

	public static void main(String[] args) {
		Piano p1 = new Piano();
		p1.play();
		Guiter p2 = new Guiter();
		p2.play();

	}

}*/
interface Readable{
	void read();
}
interface Writable{
	void write();
}
interface Storable{
	void store();
}
class File implements Readable,Writable,Storable{
	public void read() {
		System.out.println("reading file");
	}
	public void write() {
		System.out.println("Writing file");
	}
	public void store() {
		System.out.println("storing file");
	}
}
public class music {

	public static void main(String[] args) {
		File c1 = new File();
		c1.read();
		c1.write();
		c1.store();
	}

}

