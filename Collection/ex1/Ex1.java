package ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		ListGenericTotal(addElementGenericArray());
	}

	public static List<Integer> addElementGenericArray() {
		List<Integer> list = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		if(list.isEmpty()) {
			System.out.println("List is Empty : ");
			
			System.out.println("Please Enter the value for the List : ");
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Enter the value : " + (i + 1));
			list.add(sc.nextInt());
		}
		sc.close();
		return list;
	}
	
	public static void ListGenericTotal(List<Integer> list) {
		int total = 0;
		int i = 0;
		
		for(Integer x : list) {
			total += x;
			System.out.println("Value : " + (i + 1) + " " + x);
			i++;
		}
		System.out.println("Total is : " + total);
	}
	
}
