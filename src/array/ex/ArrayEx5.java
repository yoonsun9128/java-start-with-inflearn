package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("배열의 정수를 입력하세요");
		int arr = scanner.nextInt();

		int[] numbers = new int[arr];
		int total = 0;
		System.out.println(arr +"개의 정수를 입력하세요");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
			total += numbers[i];
		}

		System.out.println("출력");

		double average = (double) total / arr;

		System.out.println("total: "+ total );
		System.out.println("average: "+ average );
	}
}
