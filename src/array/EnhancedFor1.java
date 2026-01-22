package array;

public class EnhancedFor1 {
	public static void main(String[] args) {
		int [] numbers = {1,2,3,4,5};

		for (int i = 0; i < numbers.length; i++) {
			int number = numbers[i];
			System.out.println(number);
		}

		//향상된 for 문
		for (int number : numbers) {
			System.out.println("for enhanced: " + number);
		}

		//for-each 문을 사용할 수 없는 경우, 증가하는 index 값 필요
		for (int i =0; i < numbers.length; i++) {
			//인덱스 번호를 알고 싶을 경우!!
			System.out.println(i);
		}

		//향상된 for 문 -> 사용은 가능하지만 좋은 억지스러운 경우라서 사용하지 않는게 좋다.
		int test = 0;
		for (int number : numbers) {
			System.out.println("for enhanced: " + number);
			test++;
		}
	}
}
