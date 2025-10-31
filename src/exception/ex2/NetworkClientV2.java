package exception.ex2;

/**
 * 오류가 발생했을 때 오류 코드를 반환하는 것이 아니라 예외를 던진다.
 * 반환갑이 없기때문에 void로 처리
 * 메서드가 정상 종료되면 성공이고 예외가 던져지면 예외를 통해 실패를 확인 가능
 * 오류가 발생하면 예외 객체를 만들고 거기에 오류 코드와 오류 메시지를 담아둔다
 * 그리고 만든 에외 객체를 throw를 통해 던진다.
 */
public class NetworkClientV2 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 {
        if (connectError) {
            throw new NetworkClientExceptionV2("connectError", address + "서버연결 실패");
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data)  throws NetworkClientExceptionV2 {
        if (sendError) {
            throw new NetworkClientExceptionV2("sendError", data);
        }
        // 전송 성공
        System.out.println(address + "서버에 데이터 전송: " + data);
    }

    public void disconnect(){
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data)  {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
