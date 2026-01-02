package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;

        if (m > 0) {
            temp = m + 2;
            System.out.println("temp =" + temp);
        }
        // temp의 생존 범위가 사실 if문 안에서만 사용하기 때문에
        // 1. 비효율적인 메모리 사용,
        // 2. 코드 복잡성이 증가 한다. -> if문이 끝났지만 생각해야하는 변수가 2개가 있음

        System.out.println("m = "+ m);
    }
}
