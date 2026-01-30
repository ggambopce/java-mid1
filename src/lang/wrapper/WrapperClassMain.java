package lang.wrapper;

/**
 * 기본형을 래퍼 클래스로 변경하는 것을 박싱이라고 한다.
 * intValue() - 언박싱
 * 래퍼클래스에 들어있는 기본형 값을 다시 꺼내는 메서드
 * 비교는 equals() 사용
 * == 비교는 인스턴스의 참조값을 비교
 * 래퍼 클래스는 equals()를 재정의
 */
public class WrapperClassMain {
    public static void main(String[] args) {

        Integer integerObj = Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);
    }
}
