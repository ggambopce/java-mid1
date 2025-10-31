package exception.basic.checked;

/**
 * 예외를 잡아서 처리했기 때문에 main()메서드까지 예외가 올라오지 않는다.
 */
public class CheckedCatchMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callCatch();
        System.out.println("정상 종료");
    }
}
