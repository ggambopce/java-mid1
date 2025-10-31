package exception.ex2;

/**
 * try안에 정상 흐름을 모두 담는다.
 * 예외 부분은 catch 블럭에서 해결한다.
 * 사용 후에는 반드시 연결을 해제해야한다.
 */
public class NetworkServiceV2_3 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
            client.disconnect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지" + e.getMessage());
        }
    }
}
