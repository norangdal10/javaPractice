package lang.string.test;

public class TestString5 {
    public static void main(String[] args){
        String str = "Stringbuilder.java";

        System.out.println("filename = " + str.substring(0,str.indexOf(".")));
        System.out.println("extName = " + str.substring(str.indexOf(".")));
    }
}
