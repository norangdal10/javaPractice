package lang.string.test;

import java.nio.file.Path;

public class TestString11 {
    public static void main(String[] args){
        String str = "Hello Java";
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(str)
                .reverse()
                .toString()
        );
    }
}
