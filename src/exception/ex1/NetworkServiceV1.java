package exception.ex1;

public class NetworkServiceV1 {

    /**
     * 연결이 실패하면 데이터를 전송하지 않아야 하는데,  여기서는 데이터를 전송한다.
     */
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);

        client.initError(data);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}
