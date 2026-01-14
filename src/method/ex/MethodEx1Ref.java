package method.ex;

public class MethodEx1Ref {
	public static void main(String[] args) {
		averageNumber(1, 2, 3);
		averageNumber(15, 25, 35);
	}

	public static void averageNumber(int a, int b, int c) {
		int sum = a + b + c;
		double result = sum / 3.0;
		System.out.println("average: " + result);
	}

	public static double retrunAverage(int a, int b, int c) {
		int sum = a + b + c;
		double result = sum / 3.0;
		return result;
	}
}
