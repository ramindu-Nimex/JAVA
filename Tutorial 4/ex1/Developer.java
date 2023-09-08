public class Developer extends Employee {
   private int hours;
	private double hourlyWage;

	public Developer(String name, int employeeId, int hours, double hourlyWage) {
		super(name, employeeId);	
		this.hours = hours;
		this.hourlyWage = hourlyWage;
	}

	@Override
	public double calculateSalary() {
		double salary = hours * hourlyWage;
		System.out.println("Salary of the Developer is : " + salary);
		return salary;
	}

	@Override
	public void displayDetails() {
		System.out.println("Employee ID : " + employeeId);
		System.out.println("Developer Name : " + name);
		System.out.println("Hourly Wage: " + hourlyWage);
		System.out.println("Hours : " + hours);
	}
}
