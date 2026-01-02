package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647;
        long matIntOver = 2147483648L; //int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.println("maxIntValue casting = " + intValue);

        intValue = (int) matIntOver;
        System.out.println("matIntOver casting = " + intValue); //-2147483648
        // int의 작은 단위부터 다시 시작함 즉 시계가 이미 한바퀴가 돌고 나서 그 나머지가 더 돈 상태
        // 오버플로우 현상이다
    }
}
