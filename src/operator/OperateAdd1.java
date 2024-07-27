package operator;

public class OperateAdd1 {
    public static void main(String[] args) {
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a); //1

        a = a + 1;
        System.out.println("a = " + a); //2

        //증간 연산자 -- 를쓰면 감소
        ++a;
        System.out.println("a = " + a); //3

        ++a;
        System.out.println("a = " + a); //4

        --a;
        System.out.println("a = "+ a); //3
    }
}
