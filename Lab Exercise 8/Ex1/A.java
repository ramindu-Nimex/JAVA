public class A {
   
   void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	public static void main(String[] args) {
		
		int arr[] = {10,50,40,30,20,60,80,70,100,90};
		System.out.println("Before Array : ");
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		A e = new A();
		e.bubbleSort(arr);
		System.out.println("\nAfter Array : ");
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
