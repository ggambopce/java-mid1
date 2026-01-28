package lang.object.tostring;

/**
 * toString()메서드는 기본적으로 패키지를 포함한 객체의 이름과 객체의 참조값을 16진수로 제공한다.
 *
 */
public class ToStringMain1 {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        System.out.println(string);

        System.out.println(object);
    }
}
