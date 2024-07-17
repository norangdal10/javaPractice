package lang.string.test;

public class TestString10 {
    public static void main(String[] args){
        String fruits = "apple,banana,mango";
        String[] bucket = fruits.split(",");
        for(String s : bucket){
            System.out.println(s);
        }
        String kitchen = String.join("->", bucket);
        System.out.println(kitchen);
    }
}
