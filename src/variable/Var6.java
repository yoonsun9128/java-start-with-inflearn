package variable;

public class Var6 {
    public static void main(String[] args) {
        //정수 -> 높을수록 메모리를 차지한다.
        byte b =127; //-128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 210382034; //약 20억 정도까지 작성가능

        long l = 123123234234234342L; //제일 긴 정수를 넣을수가 있다

        //실수
        float f = 10.0f;
        double d = 10.0; // float보다 더큰 실수의 범위를 쓸수 있다.
    }
}
