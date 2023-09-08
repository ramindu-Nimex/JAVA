public class Manager extends Employee {

	public Manager(String name, int employeeId) {
		super(name, employeeId);
	}

	@Override
	public double calculateSalary() {
		double salary = 50000.00;
		System.out.println("Salary of the manager is : " + salary);
		return salary;
	}

	@Override
	public void displayDetails() {

		System.out.println("Employee ID : " + employeeId);
		System.out.println("Employee Name : " + name);
		System.out.println("I am Manager");
	}

}