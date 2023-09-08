package ex2;

public class ShoppingCart {
   
   private double total;
	private int itemCount;

	public ShoppingCart() {
		total = 0.0;
		itemCount = 0;
	}

	public void addItem(double price) {

		if (price < 0 || price > 1000) {
			throw new IllegalArgumentException("Invalid Price");
		}
		total += price;
		itemCount++;
	}

	public double calculateTotalPrice() {
		if (itemCount == 0) {
			throw new ArithmeticException("The card is empty");
		}
		return total;
	}

	public static void main(String[] args) {
		ShoppingCart s1 = new ShoppingCart();
		double sum;

		try {
			s1.addItem(900);
			s1.addItem(200);
			s1.addItem(700);

			sum = s1.calculateTotalPrice();
			System.out.println("Total is : " + sum);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Ënd of operation");
	}
}