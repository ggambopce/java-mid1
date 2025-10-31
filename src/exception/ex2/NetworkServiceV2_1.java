package exception.ex2;

/**
 * 여기에서는 예외를 별도로 처리하지 않고 throws로 밖으로 던진다
 * 예외가 발생하면 프로그램이 종료된다
 * 사용 후에는 연결을 해제해야한다.
 */
public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2 {
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
