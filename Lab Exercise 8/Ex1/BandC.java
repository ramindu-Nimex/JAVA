public class BandC<T extends Number>  {
   
   T arr[];
	
	public void add(T t[]) {
		this.arr = t;
	}
	
	public T[] get() {
		return arr;
	}
	
	void bubbleSort() {
		
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = 0; j < arr.length - i - 1; j++)
				if (arr[j].doubleValue() > arr[j + 1].doubleValue()) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}
	
	public void printArray() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

   public static void main(String[] args) {
		
		Float arr1[] = {45f, 3f, 78f, 12f, 54f, 72f, 56f, 89f, 13f, 44f};
		Double[] arr2 = {38., 3.0, 83.0, 12.0, 54.0, 72.0, 56.0, 89.0, 13.0, 45.0};
		
		BandC<Float> s1 = new BandC<>();
		s1.add(arr1);
		s1.bubbleSort();
		s1.printArray();
      
		System.out.println();

		BandC<Double> s2 = new BandC<>();
		s2.add(arr2);
		s2.bubbleSort();
		s2.printArray();
	}
}
