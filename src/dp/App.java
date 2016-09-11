package dp;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Employee {
	private String name;
	private String SSN;

	public Employee(String name, String SSN) {
		this.name = name;
		this.SSN = SSN;
	}
}

class Engineer extends Employee {

	public Engineer(String name, String SSN) {
		super(name, SSN);
	}
}

class Manager extends Employee {

	public Manager(String name, String SSN) {
		super(name, SSN);
	}
	
}