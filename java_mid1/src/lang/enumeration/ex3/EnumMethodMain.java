package lang.enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Grade.values()));
        for(Grade grade : Grade.values()){
            System.out.println(grade.name() + " = > " + grade.ordinal());
        }

        //String -> ENUM  변환
        String input = "GOLD";
        Grade grade = Grade.valueOf(input);
        System.out.println(grade);
    }
}
