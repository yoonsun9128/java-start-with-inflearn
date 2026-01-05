package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("상품의 가격을 입력하세요 (-1을 입력하면 종료):");
            int price = scanner.nextInt();

            if (price == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("구매하려는 수량을 입력하세요:");
            int quantity = scanner.nextInt();
            scanner.nextLine(); //숫자 입력 후 줄바꿈 처리
            System.out.println("총 비용: " + price*quantity);

            // 이름 입력 후 나이 입력이 바로 있을 경우 에러가 나타난다. 만약 이름 파트에서 종료가 이뤄질 경우 그 순서도 중요함
        }
    }
}
