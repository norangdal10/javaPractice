package lang.enumeration.ex1;

import lang.enumeration.ex0.DiscountService;

public class StringGradeEx01 {
    public static void main(String[] args) {
        int price = 10000;

        lang.enumeration.ex0.DiscountService discountService = new DiscountService();
        int basic = discountService.discount("BASIC",price);
        int gold = discountService.discount("GOLD", price);
        int diamond = discountService.discount("DIAMOND",price);

        System.out.println("basic 할인: " + basic);
        System.out.println("gold 할인: " + gold);
        System.out.println("diamond 할인: " + diamond);
    }
}
