package lang.math.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        System.out.println("integer1 = " + Integer.valueOf(str));
        System.out.println("intValue = " + Integer.valueOf(str).intValue());
        System.out.println("integer2 = " + Integer.valueOf(Integer.valueOf(str).intValue()));
    }
}
