package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int type = scanner.nextInt();

            if (type == 1) {
                //int는 엔터가 없어서 줄을 한번 버리고 진행해야한다
                scanner.nextLine();

                System.out.println("상품명을 입력하세요:");
                String item = scanner.nextLine();

                System.out.println("상품의 가격을 입력하세요:");
                int price = scanner.nextInt();
                System.out.println("구매 수량을 입력하세요:");
                int quantity = scanner.nextInt();

                int total = price*quantity;
                System.out.println("상품명:"+item+" 가격:"+price+" 수량"+quantity+" 합계:"+total);
                sum += total;
            } else if (type == 2) {
                System.out.println("총 비용 : " + sum);
                sum = 0;
            } else {
                break;
            }
        }
    }
}
