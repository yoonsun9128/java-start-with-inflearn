package array;

public class Array1Ref1 {
	public static void main(String[] args) {

		int[] students; //int 형 배열 변수 선언
		students = new int[5]; //배열 생성

		System.out.println(students); //[I@2a84aee7 
		// I = int형 배열을 뜻하고
		// @이후의 값은 메모리 16진수의 값을 뜻한다

		students[0] = 90;
		students[1] = 80;
		students[2] = 70;
		students[3] = 60;
		students[4] = 100;

		System.out.println("학생1 점수: " + students[0]);
		System.out.println("학생2 점수: " + students[1]);
		System.out.println("학생3 점수: " + students[2]);
		System.out.println("학생4 점수: " + students[3]);
		System.out.println("학생5 점수: " + students[4]);
	}
}
