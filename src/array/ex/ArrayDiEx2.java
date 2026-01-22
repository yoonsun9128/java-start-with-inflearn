package array.ex;

import java.util.Scanner;

public class ArrayDiEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("학생수를 입력하세요: ");
		int row = scanner.nextInt();
		int[][] arr = new int[row][3];
		String[] subjects = {"국어", "영어", "수학"};

		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1) + "번 학생의 성적을 입력하세요:");
			for (int column = 0; column < arr[i].length; column++) {
				System.out.print(subjects[column] + " 점수:");
				arr[i][column] = scanner.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			int total = 0;
			for (int column = 0; column < arr[i].length; column++) {
				total += arr[i][column];
			}
			System.out.println((i+1) + "번 학생의 총점 : "+total+", 평균:" + ((double) total / arr[i].length));
		}
	}
}
