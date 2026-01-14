package method;

public class Method2 {

	public static void main(String[] args) {
		printHeader();
		System.out.println("프로그램이 동작합니다");
		printFooter();
	}

	//void == 반환 타입이 없는 경우
	public static void printHeader() {
		System.out.println(" 프로그램을 시작합니다.!!");
		return;
	}

	public static void printFooter() {
		System.out.println(" 프로그램을 종료합니다!!");
	}

	//모든 메서드는 항상 return을 호출해야한다. 다만 void 경우에만 retrun 값이 없어도 가능하다.
}
