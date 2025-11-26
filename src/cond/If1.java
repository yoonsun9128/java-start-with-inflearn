package cond;

public class If1 {

    public static void main(String[] args) {
        int age = 20; //사용자 나이

        if (age >= 10) {
            //조건이 참일 경우에 진행
            System.out.println("성인입니다");
        }

        if (age < 10) {
            System.out.println("미성년자 입니다");
        }

    }
}
