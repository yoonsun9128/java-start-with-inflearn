package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;

        for (int i = 0; i < 2; i++) {
            System.out.println("for m =" + m);
            System.out.println("for i = " + i);
        } // int i 생존

        System.out.println("main m =" + m);
        //i는 for 문에서만 존재하기 때문에 main 전체 블록에서는 생성할 수가 없다.
    }
}
