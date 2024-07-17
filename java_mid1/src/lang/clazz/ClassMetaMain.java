package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) throws Exception {
        //Class 조회
        Class clazz = String.class;
        //Class clazz = new String().getClass();
        //Class clazz = Class.forName("java.lang.String");

        // 모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields){
            System.out.println("filed = " + field.getType() + " " + field.getName());
        }

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods){
           // System.out.println(method);
        }

        System.out.println("Superclass : " + clazz.getSuperclass().getName());

        Class[] interfaces = clazz.getInterfaces();
        for(Class i : interfaces){
            System.out.println("Interface :" + i );
        }
    }
}
