package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("이름을 입력하세요 (종료를 입력하면 종료):");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.println("나이를 입력하세요:");
            int age = scanner.nextInt();
            scanner.nextLine(); //숫자 입력 후 줄바꿈 처리
            System.out.println("입력한 이름: "+name+", 나이: "+age);

            // 이름 입력 후 나이 입력이 바로 있을 경우 에러가 나타난다. 만약 이름 파트에서 종료가 이뤄질 경우 그 순서도 중요함
        }
    }
}
