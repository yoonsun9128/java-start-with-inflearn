package loop;

public class doWhile1 {
    public static void main(String[] args) {
        int i = 1;

        //조건에 상관없이 한번은 사용해야한다...?
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 3);
    }
}
