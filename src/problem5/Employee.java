package problem5;

public class Employee extends Person {

	private double salary;
	
	public Employee(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}

	@Override
	public String getOccupation() {
		return "Employee at animal shop";
	}
	
	public String toString()
	{
		return super.toString() + String.format(" I'm an employee with a salary of %.2f.", salary);
		
	}

}
