package lang.string.test;

import java.util.Arrays;

public class TestString9 {
    public static void main(String[] args){
        String email = "hello@example.com";
        System.out.println("ID : " + email.split("@")[0]);
        System.out.println("Domain : " + email.split("@")[1]);

    }
}
