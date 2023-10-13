public class D {
   public static <E extends Number> void bubbleSort(E[] arr) {
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = 0; j < arr.length - i - 1; j++)
				if (arr[j].doubleValue() > arr[j + 1].doubleValue()) {
					E temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}
	
	public static <E extends Number> void printArray(E[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		Float arr1[] = {45f, 3f, 78f, 12f, 54f, 72f, 56f, 89f, 13f, 44f};
		Double[] arr2 = {38.0, 3.0, 83.0, 12.0, 54.0, 72.0, 56.0, 89.0, 13.0, 45.0};
		
		D.bubbleSort(arr1);
		D.printArray(arr1);
		
		D.bubbleSort(arr2);
		D.printArray(arr2);
	}
}
