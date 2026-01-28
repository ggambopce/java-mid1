package lang.object;

/**
 * Object 클래스
 * 자바에서 모든 클래스의 최상위 부모 클래스는 항상 Object 클래스이다.
 */
public class Parent extends Object {
    public void parentMethod(){
        System.out.println("Parent.parentMethod()");
    }
}
