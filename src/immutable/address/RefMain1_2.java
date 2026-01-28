package immutable.address;

/**
 * 여러 변수가 하나의 객체를 공유하는 것을 막을 방법은 없다.
 */
public class RefMain1_2 {
    public static void main(String[] args) {
        Address a = new Address("서울");
        Address b = new Address("서울");
        System.out.println("a= " + a);
        System.out.println("b= " + b);

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }
}
