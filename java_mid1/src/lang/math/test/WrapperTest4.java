package lang.math.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";


        System.out.println("integer1 = " + Integer.valueOf(str));
        System.out.println("intValue = " + (int)Integer.valueOf(str));
        System.out.println("integer2 = " + (Integer)((int)Integer.valueOf(str)));
    }
}
