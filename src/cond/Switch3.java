package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;
        int score ;

        switch (grade) {
            case 1:
                score = 1000;
                break;
            case 2: //break 문이 없으면 그다음 라인에 있는 코드가 실행이 된다.
            case 3:
                score = 3000;
                break;
            default:
                score = 500;
        }

        System.out.println("발급받은 쿠폰 " + score);
    }
}
