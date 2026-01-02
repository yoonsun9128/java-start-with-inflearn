package casting;

public class Casting1 {
    public static void main(String[] args) {
        // 자동 형변환 -> 작은 그릇에 있는걸 큰 그릇으로 변환하는건 문제가 되지 않는다.
        // int<long<double
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; //int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; //int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; //long -> double
        System.out.println("doubleValue = " + doubleValue);
    }
}
