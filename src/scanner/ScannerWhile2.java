package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("입력한 두개의 숫자가 0이면 종료됩니다.");
            System.out.println("첫번째 숫자를 입력해주세요");
            int num1 = scanner.nextInt();

            System.out.println("두번째 숫자를 입력해주세요");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            int sum = num1 + num2;
            System.out.println("두개의 합산값: " + sum);
        }
    }
}
