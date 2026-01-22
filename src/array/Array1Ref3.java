package array;

public class Array1Ref3 {
	public static void main(String[] args) {

		int[] students = new int[]{90, 80, 70, 60, 50}; //배열 생성과 초기화

		for (int i =0; i < students.length; i++) {
			//문자 더하기 숫자는 문자다!!! () 많이 중요함!!!
			System.out.println("학생" + (i+1) + " 점수: " + students[i]);
		}
	}
}
