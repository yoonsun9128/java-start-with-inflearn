package array;

public class Array1Ref4 {
	public static void main(String[] args) {

		int[] students = {90, 80, 70, 60, 50}; //배열 생성과 초기화
		// -> 주위할 부분 라인을 나누면 안된다. 타입 정보에 대해서 같은 라인 선상에 있어야함

		for (int i =0; i < students.length; i++) {
			//문자 더하기 숫자는 문자다!!! () 많이 중요함!!!
			System.out.println("학생" + (i+1) + " 점수: " + students[i]);
		}
	}
}
