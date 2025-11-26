package cond;

public class If5 {
    public static void main(String[] args) {
        //서로 독립된 사항으로 이뤄질 경우에는 각각에 if문으로
        //연관이 있을경우에만 else if 로 묶는다

        int age = 10;
        int price = 10000;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 10살 이하, 1000원 할인");
        }

        System.out.println("총 할인 금액" + discount + "원");
    }
}
