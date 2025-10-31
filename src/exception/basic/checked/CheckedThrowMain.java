package exception.basic.checked;

/**
 * 에외가 main밖으로 던져지면 예외 정보와 스택트레이스를 출력하고 프로그램이 종료된다.
 * 스택트레이스 정보를 확용하면 예외가 어디서 발생하는지, 어떤 경로를 거쳐서 넘어왔는지 확인할 수 있다.
 */
public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.callThrow();
        System.out.println("정상 종료");

    }
}
