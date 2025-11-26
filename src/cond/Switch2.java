package cond;

public class Switch2 {
    public static void main(String[] args) {
        int grade = 2;
        int score ;

        switch (grade) {
            case 1:
                score = 1000;
                break;
            case 2:
                score = 2000;
                break;
            case 3:
                score = 3000;
                break;
            default:
                score = 500;
        }

        System.out.println("발급받은 쿠폰 " + score);
    }
}
