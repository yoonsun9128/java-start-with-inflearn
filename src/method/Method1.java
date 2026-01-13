package method;

public class Method1 {
	public static void main(String[] args) {
		int sum1 = add(5, 10);
		System.out.println("result1 = " + sum1);

		int sum2 = add(10, 20);
		System.out.println("result2 =" + sum2);
	}

	// 변수명만 다를뿐이지 같은 코드를 진행하고 있음 -> function 함수를 만드자는것같음

	// java는 함수를 지정할때도 return에 대한 타입을 정해야 하는건가..? -> 정적 타입 언어(static typed language) 커파일 시점에 메서드가 어떤 타입인지를 반환하는지 알려줘야 함
	// return 값이 없을 경우 void 를 같이 쓴다.
	public static int add(int a, int b) {
		System.out.println(a + "+" + b+ "연상 수행");
		int sum = a + b;
		return sum;
	}
}
