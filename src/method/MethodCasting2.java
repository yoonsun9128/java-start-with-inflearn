package method;

public class MethodCasting2 {
	public static void main(String[] args) {
		int number = 100;
		printNumber(number);
	}

	// int -> double로 변환하는건 문제가 없다 double이 더 큰 범위이기 때문이다.
	public static void printNumber(double n) {
		System.out.println("number: " + n);
	}
}
