
abstract public class Employee {

   protected String name;
	protected int employeeId;
	
	Employee() {};

	public Employee(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	public abstract double calculateSalary();

	public abstract void displayDetails();
}
