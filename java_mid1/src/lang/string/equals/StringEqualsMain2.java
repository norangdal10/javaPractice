package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args){
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println(isSame(str3, str4));
    }

    private static boolean isSame(String x, String y){
        // return x == y;
        // 함수를 사용하는 개발자는 String이 어떤 식으로 전달될지 모르기 때문에
        // 항상 equals를 사용해서 비교하도록 한다
        return x.equals(y);
    }
}
