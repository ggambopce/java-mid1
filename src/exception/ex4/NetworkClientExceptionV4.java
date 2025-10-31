package exception.ex4;

/**
 * 언체크 예외, 런타임 예외
 */
public class NetworkClientExceptionV4 extends RuntimeException {
    public NetworkClientExceptionV4(String message) {
        super(message);
    }
}
