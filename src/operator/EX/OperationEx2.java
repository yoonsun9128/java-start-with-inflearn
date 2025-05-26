package operator.EX;

public class OperationEx2 {

    public static void main(String[] args) {
        double val1 = 1.5, val2 = 2.5, val3 = 3.5;

        double sum = val1 + val2 + val3;
        double average = sum / 3;
        // double을 사용하면 소숫점을 버리지 않고 그대로 사용할 수 있다.
        System.out.println("sum : " + sum);
        System.out.println("average : " + average );
    }
}
