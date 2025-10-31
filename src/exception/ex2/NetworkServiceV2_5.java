package exception.ex2;

/**
 * try-catch-finally
 * finally코드 블럭은 어떤 경우라도 반드시 호출 된다.
 */
public class NetworkServiceV2_5 {
    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지" + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
