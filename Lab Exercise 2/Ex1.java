public class Ex1 {

	public static void main(String[] args) {
		// Declare variable
		int miles, yards;
		double kilometers;
		
		// initialize variable
		miles = 26;
		yards = 385;
		
		
		kilometers = (miles + yards * (1/1760.0)) * 1.609;
		System.out.println("The marathon distance in Kilometers is : " + kilometers);
	}

}