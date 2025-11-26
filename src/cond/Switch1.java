package cond;

public class Switch1 {
    //psvm
    //switch문은 값이 같은지만 비교할수 있다.
    public static void main(String[] args) {
        int grade = 2;
        int score ;

        if (grade == 1) {
            score = 1000;
            System.out.println("1등급 입니다");
        } else if (grade == 2) {
            score = 2000;
            System.out.println("2등급 입니다");
        } else if (grade == 3) {
            score = 3000;
            System.out.println("3등급 입니다");
        } else {
            score = 500;
            System.out.println("4등급 입니다");
        }

        System.out.println("발급받은 쿠폰 " + score);
    }
}
