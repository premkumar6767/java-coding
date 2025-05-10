package inheritnace;
class person{
	String name;
	person(String name){
		this.name = name;
		System.out.println(this.name);
	}
}
class employee extends person{
	int employeeid;
	employee(String name){
		super(name);
	}
}

public class company {

	public static void main(String[] args) {
		employee obj1 = new employee("prem");

	}

}
