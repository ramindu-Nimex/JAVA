package ex3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Height {

	private double height;

	public Height(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set studentHight = new HashSet();

		for (int i = 0; i < 10; i++) {
			System.out.println("Enter Student Height : " + (i + 1));
			studentHight.add(sc.nextDouble());
		}

		for (Object object : studentHight) {
			System.out.println(object);
		}
	}

}
