package method;

public class MethodValue2 {
	public static void main(String[] args) {
		int number = 5;
		System.out.println("1. changeNumber 호출 전, num1: " + number);
		changeNumber(number);
		System.out.println("4. chnageNumber after, num1: " + number);
	}

	public static void changeNumber(int number) {
		System.out.println("2. changeNumber 변경 전, num2: " + number);
		number = number * 2;
		System.out.println("3. changeNumber changed. num2: " +  number);
	}

	//변수 명이 값으나 서로 다른 메모리 공간으로 인해 영향을 주지 않는다.
}
