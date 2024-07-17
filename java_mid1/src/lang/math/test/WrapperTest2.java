package lang.math.test;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5","2.5","3.0"};

        Double result = 0.0;
        for (String str : array){
            result += Double.parseDouble(str);
        }
        System.out.println("sum = "+result);
    }
}
