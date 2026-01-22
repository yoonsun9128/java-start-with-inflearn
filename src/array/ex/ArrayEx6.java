package array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("배열의 정수를 입력하세요");
		int arr = scanner.nextInt();

		int[] numbers = new int[arr];
		int minNumber, maxNumber;

		System.out.println(arr +"개의 정수를 입력하세요");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		System.out.println("출력");
		minNumber = maxNumber = numbers[0];

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < minNumber) {
				minNumber = numbers[i];
			}
			if (numbers[i] > maxNumber) {
				maxNumber = numbers[i];
			}
		}

		System.out.println("max: "+ maxNumber );
		System.out.println("min: "+ minNumber );
	}
}
