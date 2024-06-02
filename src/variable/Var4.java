package variable;

public class Var4 {
    public static void main(String[] args) {
        int a;
        System.out.println(a);
//        java: variable a might not have been initialized
        //컴퓨터에는 메모리를 여러 시스템을 함께 사용하는 공간 => 어떠한 값들이 계속 저장된다.
        // 선언을 하면 메모리를 차지하는데 그부분에 대해 초기화를 하지 않은 경우 이상한 값이 출력가능성이 있다. 그래서 자바는 그걸 예방하고자 변수를 초기화 하도록 강제한다.
    }
}
