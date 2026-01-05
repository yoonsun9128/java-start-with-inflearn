package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("0을 입력하면 프로그램은 종료됩니다.");
            System.out.println("첫번째 숫자를 입력해주세요");
            int num1 = scanner.nextInt();

            if (num1 == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

            sum += num1;
        }
        System.out.println("모든 정수의 합: " + sum);
    }
}
