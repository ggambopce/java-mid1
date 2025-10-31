package exception.ex1;

/**
 * 에러 상황 가상 시뮬레이션
 * 연결실패 입력문자에 error1이 있는 경우
 * 전송실패 입력문자에 error2가 있는 경우
 */
public class NetworkClientV1 {
    public final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV1(String address) {
        this.address = address;
    }

    public String connect() {
        if (connectError){
            System.out.println(address + "서버 연결 실패");
            return "connectError";
        }
        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    public String send(String data) {
        if (sendError) {
            System.out.println(address + " 서버에 데이터 전송 실패: " + data);
            return "sendError";
        }
        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")){
            connectError = true;
        }
        if (data.contains("error2")){
            sendError = true;
        }
    }
}
