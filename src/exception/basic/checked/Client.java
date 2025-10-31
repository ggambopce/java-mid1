package exception.basic.checked;

/**
 * 예외도 객체이기 때문에 객체를 먼저 생성하고 예외를 발생시켜야한다.
 * throw 예외 라고 하면 새로운 예외를 발생시킬 수 있다.
 * throws 예외는 발생시킨 예외를 메서드 맊으로 던질 때 사용하는 키워드다.
 */
public class Client {
    public void call() throws MyCheckedException {
        throw new MyCheckedException("ex");
    }
}
