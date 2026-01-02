package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue; // 컴파일 오류 발생 : java: incompatible types: possible lossy conversion from double to int

        //소수 데이터를 날려도 괜찮을 경우
        intValue = (int) doubleValue;
        System.out.println("change intValue = " + intValue);
        //숫자가 손실되는 경우가 있음 -> 이럴경우 문제가 발생할 수 도 있음, 예를들면 은행 이자같은경우



    }
}
