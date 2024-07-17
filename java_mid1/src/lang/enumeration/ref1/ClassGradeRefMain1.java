package lang.enumeration.ref1;

import lang.enumeration.ex2.ClassGrade;
import lang.enumeration.ex2.DiscountService;

public class ClassGradeRefMain1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int gold = discountService.discount(ClassGrade.GOLD,price);
        int basic = discountService.discount(ClassGrade.BASIC,price);
        int diamond = discountService.discount(ClassGrade.DIAMOND,price);

        System.out.println("basic 할인률 : " + basic);
        System.out.println("gold 할인률 : " + gold);
        System.out.println("diamond 할인률 : " + diamond);
    }
}
