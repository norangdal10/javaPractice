package lang.string.method;

public class StringChangeMain1 {
    public static void main(String[] args){
        String str = "Hello, Java! Welcome to Java";

        System.out.println("인덱스의 7 이후의 문자열 : " + str.substring(7));
        System.out.println("인덱스의 7 이후, 12 이전의 문자열 : " + str.substring(7,12));

        System.out.println("문자열 결합 : " + str.concat("!!!"));

        System.out.println("'Java'를 'World'로 대체 :" + str.replace("Java", "World"));
        System.out.println("첫 번째 'Java' 를 'World' 로 대체 : " + str.replaceFirst("Java", "World"));
    }
}
