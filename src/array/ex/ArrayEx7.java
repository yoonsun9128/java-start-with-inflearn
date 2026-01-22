package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int index = 0;
		String[] productNames = new String[10];
		int[] productPrices = new int[10];

		while (true) {
			System.out.println("1. 상품 등록 | 2.상품 목록 | 3. 종료");
			System.out.print("메뉴를 선택하세요: ");
			int choice = scanner.nextInt();
			if (choice == 1) {
				if (index < 10) {
					System.out.print("상품 이름을 입력하세요:");
					productNames[index] = scanner.nextLine();
					System.out.print("상품 가격을 입력하세요:");
					productPrices[index] = scanner.nextInt();
					index++;
				} else {
					System.out.println("더 이상 상품을 등록할 수 없습니다.");
				}
			} else if (choice == 2) {
				if (index == 0) {
					System.out.println("등록된 상품이 없습니다.");
				} else {
					for (int i = 0; i < productNames.length; i++){
						System.out.println("상품: " + productNames[i] + "가격: " + productPrices[i]);
					}
				}
			} else {
				System.out.println("프로그램 종료합니다.");
				break;
			}
		}
	}
}
