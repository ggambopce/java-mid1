package exception.ex1;

public class NetworkServiceV1_2 {

    /**
     * 오류가 발생했을 때 어떤 오류가 발생했는지 자세한 내역을 남기면 이후 디버깅에 도움이 될 것이다.
     * 오류 로그를 남겨야 한다.
     * 하지만 사용 후에는  disconnect()를 반드시 호출해야 하는 문제는 해결되지 않았다.
     * 자바의 경우 GC가 있기 때문에 JVM 메모리에 있는 인스턴스는 자동으로 해제할 수 있다.
     * 하지만 외부 연결과 같은 자바 외부의 자원은 자동으로 해제가 되지 않는다.
     * 따라서 외부 자원을 사용한 후에는 연결을 해제해서 외부 자원을 반드시 반납해야 한다.
     */
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data);


        String connectResult = client.connect();
        if (isError(connectResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
            return;
        }
        String sendResult = client.send(data);
        if (isError(sendResult)) {
            System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            return;
        }
        client.disconnect();
    }

    private static boolean isError(String resultCode) {
        return !resultCode.equals("success");
    }
}
