package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 리플렉션
 * 클래스의 메타 정보를 기반으로 클래스에 정의된 메서드, 필드, 생성자 등을 조회하고
 * 이를 통해 객체 인스턴스를 생성하거나 메서드를 호출하는 작업
 */
public class ClassMetaMain {
    public static void main(String[] args) {
        Class clazz = String.class;
        //Class clazz = new String().getClass();// 2.인스턴스에서 조회
        //Class clazz = Class.forName("java.lang.String"); // 3.문자열로 조회

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field: " + field.getType() + " " + field.getName());
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method);
        }

        System.out.println("Superclass: " + clazz.getSuperclass().getName());

        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println("Interface: " + i.getName());
        }
    }
}
