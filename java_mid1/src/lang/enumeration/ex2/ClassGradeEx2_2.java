package lang.enumeration.ex2;

import lang.enumeration.ex2.DiscountService;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        ClassGrade classGrade = new ClassGrade();
        int result = discountService.discount(classGrade,price);
        System.out.println("result = " + result);
    }
}
