package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;

        if (m > 0) {
            int temp = m + 2;
            System.out.println("temp =" + temp);
        }
        //temp scope가 3_1에 비해 줄어듬

        System.out.println("m = "+ m);
    }
}
