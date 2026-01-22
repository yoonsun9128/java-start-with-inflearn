package array;

public class Array1Ref2 {
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
		System.out.println(students.length);
		for (int i =0; i < students.length; i++) {
			//문자 더하기 숫자는 문자다!!! () 많이 중요함!!!
			System.out.println("학생" + (i+1) + " 점수: " + students[i]);
		}
	}
}
