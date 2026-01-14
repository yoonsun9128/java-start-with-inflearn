package method;

public class Overloading1 {
	public static void main(String[] args) {
		System.out.println("1: " + add(1, 2));
		System.out.println("2: " + add(1,2,3));
	}

	public static int add(int a, int b) {
		System.out.println("no 1 start");
		return a + b;
	}

	public static int add(int a, int b, int c) {
		System.out.println("no 2 start");
		return a + b + c;
	}
}
