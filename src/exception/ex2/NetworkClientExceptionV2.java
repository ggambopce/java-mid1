package exception.ex2;

/**
 * 오류코드
 * 어떤 종류의 오류가 발생했는지 구분하기 위해 예외 안에 오류코드를 보관한다.
 * 오류메세지
 * 어떤 오류가 발생했는지 개발자가 보고 이해할 수 있는 설명을 보관한다.
 * 오류 메시지는 상위 클래스인 Throwable에서 기본으로 제공하는 기능을 사용한다.
 */
public class NetworkClientExceptionV2 extends Exception {
    private String errorCode;

    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }
    public String getErrorCode() {
        return errorCode;
    }
}
