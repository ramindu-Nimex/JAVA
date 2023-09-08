package ex3;

public class AgeValidationDemo {
   
   public void validateAge(int age) throws AgeValidationException {
		if (age < 0 || age > 120) {
			throw new AgeValidationException("Age is not within the valid range (0 to 120).");
		}
		System.out.println("Age is valid: " + age);
	}

   public static void main(String[] args) {
		
		AgeValidationDemo s = new AgeValidationDemo();
		try {
			s.validateAge(150);
		} catch (AgeValidationException e) {
			System.out.println(e.getMessage());
		}
	}
}
