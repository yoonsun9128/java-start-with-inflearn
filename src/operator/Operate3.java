package operator;

public class Operate3 {
    public static void main(String[] args) {

        //연산자 우선순위 : 곱셈 > 덧셈
        int sum1 = 1 + 2 * 3; // 1 + (2*3)
        int sum2 = (1 + 2) * 3;
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
}
