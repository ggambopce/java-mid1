package exception.ex3;

/**
 * 예외 계층화
 * 자바에서 예외는 객체이다. 부모예외를 잡거나 던지면 자식 예외도 함께 잡거나 던질 수 있다.
 * 특정 예외를 잡아서 처리하려면 하위 예외를 잡아서 처리하면 된다.
 * 체크 예외
 */
public class NetworkClientExceptionV3 extends Exception{
    public NetworkClientExceptionV3(String message) {
        super(message);
    }
}
