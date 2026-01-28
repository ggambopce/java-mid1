package lang.object;

/**
 * toString()은 Object메서드
 * 메모리에도 함께 생성된다.
 * 부모에서 찾고 없으면 최상위로 올라가서 찾는다.
 * 공통기능 제공
 * 객체의 정보를 제공하고 이 객체가 다른 객체와 같은지 비교하고 어떤 클래스로 만들어졌는지 확인하는 기능
 */
public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        String string = child.toString();
        System.out.println(string);
    }
}
