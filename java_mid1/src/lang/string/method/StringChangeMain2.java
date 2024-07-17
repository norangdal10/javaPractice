package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args){
        String strWithSpaces = "      Java Programming    ";

        System.out.println("전부 소문자로 : " + strWithSpaces.toLowerCase());
        System.out.println("전부 대문자로 : " + strWithSpaces.toUpperCase());
        System.out.println("공백 제거 : '" + strWithSpaces.trim() + "'");
        System.out.println("strip 사용 : '" + strWithSpaces.strip() + "'");
        System.out.println("앞 공백제거 : '" + strWithSpaces.stripLeading() + "'");
        System.out.println("뒤 공백제거 : '" + strWithSpaces.stripTrailing() + "'");
    }
}
