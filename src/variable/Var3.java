package variable;

public class Var3 {
    public static void main(String[] args) {
//        변수를 선언하면 컴퓨터의 메모리 공간을 확보가능
        /*
        int a;
        int b;
        int c, d; //연달아 선언
         */
//        4개의 메모리 공간을 차지하고 있는것
        //1. 변수 선언, 초기화 각각 따로
        int a;
        a = 1;
        System.out.println(a);

        //2. 변수 선언과 초기화를 한번에
        int b = 2;
        System.out.println(b);

        //3. 여러 변수 선언과 초기화를 한번에
        int c=3, d=4;
        System.out.println(c);
        System.out.println(d);
    }
}
