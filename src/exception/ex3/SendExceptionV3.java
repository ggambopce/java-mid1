package exception.ex3;

/**
 * NetworkClientExceptionV3를 상속받도록 설계한다.
 * 전송 실패시 발생하는 예외이다.
 * 내부에 전송을 시도한 sendData를 보관한다.
 */
public class SendExceptionV3 extends NetworkClientExceptionV3 {

    private final String sendData;

    public SendExceptionV3(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }
    public String getSendData() {
        return sendData;
    }
}
