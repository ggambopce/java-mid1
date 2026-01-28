package equals;

/**
 * ==는 절대 바뀌지 않는다.
 * 하지만 equals()는 재정의(override) 할 수 있다.
 */
public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        System.out.println("identity = " + (user1 == user2));
        System.out.println("equality = " + (user1.equals(user2)));

    }
}
