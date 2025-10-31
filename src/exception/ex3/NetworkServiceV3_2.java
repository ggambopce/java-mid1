package exception.ex3;

/**
 * 부모 타입은 자식을 담을 수 있다
 * catch는 순서대로 실행하므로 더 디테일한 자식을 먼저 잡아야 한다.
 */
public class NetworkServiceV3_2 {
    public void sendMessage(String data) {
        String address = "http://example.com";

        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);

        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메시지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
