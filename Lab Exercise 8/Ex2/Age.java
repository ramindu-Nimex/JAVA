package Ex2;

public class Age<T> {
   T obj;
	
	void add(T val) {
		this.obj = val;
	}
	
	T get() {
		return obj;
	}
	
	public static void print(String message, int val) {
		System.out.println(message + val);
	}
	
	public static void main(String[] args) {

		Age<Integer> m = new Age<>();
		m.add(24);
		int age = m.get();
		print("Age is ", age);
	}
}
