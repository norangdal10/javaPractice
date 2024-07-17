package lang.system;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis : " + currentTimeMillis);

        // 현재 시간(나노초)를 가져온다
        long currentNano = System.nanoTime();
        System.out.println("currentNano : " + currentNano);

        // 환경 변수를 읽는다.
        System.out.println("getenv + " + System.getenv());

        // 시스템 속성을 읽는다.
        System.out.println("Java properties = " + System.getProperties());
        System.out.println("Java version = " + System.getProperty("java.version"));

        //배열 고속 복사
        char[] originalArray = {'h','e','l','l','o'};
        char[] copiedArray = new char[5];

        System.arraycopy(originalArray,0,copiedArray,0,originalArray.length);
        System.out.println("originalArray : " + Arrays.toString(originalArray));
        System.out.println("copiedArray : " + Arrays.toString(copiedArray));

        // 프로그램 종료
        System.exit(0);
        System.out.println("hello");
    }
}
