package exception.basic.checked;

/**
 * 체크 예외
 * 예외 클래스를 만들려면 예외를 상속받으면 된다.
 * Exception을 상속받은 예외는 체크 예외가 된다.
 * RuntimeException을 상속받으면 언체크 예외가 된다.
 * 예외가 제공하는 기본 기능이 있는데 그 중 오류메세지를 보관하는 기능도 있다.
 */
public class MyCheckedException extends Exception{
    public MyCheckedException(String message) {
        super(message); // Throwable에 detailMessage에 보관, getMessage()로 조회 가능
    }
}
