public class EmployeeApp {
   
   public static void main(String[] args) {
		
		Employee e1 = new Manager("Ramindu", 100);
		e1.calculateSalary();
		e1.displayDetails();
		System.out.println();
		
		Employee e2 = new Developer("Messi", 101, 20, 5000.00);
		e2.calculateSalary();
		e2.displayDetails();
	}
}