package scope;

//접근 가능한 범위를 scope라고 한다
public class Scope1 {
    public static void main(String[] args) {
        int m = 10;

        if (true) {
            int x = 20;
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        }
        System.out.println("main m = " + m);
//        System.out.println("main x = " + x);
    }
}
