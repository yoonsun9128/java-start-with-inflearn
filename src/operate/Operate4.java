package operate;

public class Operate4 {
    public static void main(String[] args) {

        int sum3 = 2 * 2 + 3 * 3; //(2*2)+(3*3)
        // 예시보다 더욱 복잡한 연산자의 경우에는 () 를 넣어줘서 명확하게 해주는것이 좋다
        // 코드를 몇자 줄이는것보다는 명시적으로 작성해주는게 더 좋다
        int sum4 = (2 * 2) + (3 * 3);
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

    }
}
