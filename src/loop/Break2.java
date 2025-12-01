package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for (;;) {
            sum = sum + i;

            if (sum > 10) {
                System.out.println("합이 10보다 클 경우 : " + sum);
                break;
            }
            i++;
        }

//        for (int i = 1; ; i++) {
//            sum = sum + i;
//
//            if (sum > 10) {
//                System.out.println("합이 10보다 클 경우 : " + sum);
//                break;
//            }
//        }
    }
}
