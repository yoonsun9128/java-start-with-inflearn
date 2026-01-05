package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //a, b를 한번에 교환할 수 없으니 둘중에 하나의 값을 temp 에다가 보관한 뒤에 교환하는것
    }
}
