package lang.enumeration.ex0;

public class StringGradeEx02 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService  discountService = new DiscountService();
        //존재하지 않는 등급
        int unknown = discountService.discount("VIP",price);
        //오타
        int diamond = discountService.discount("DIAMONND",price);
        //소문자
        int gold = discountService.discount("gold",price);

        System.out.println("unknown 할인 : " + unknown);
        System.out.println("diamond 할인: " + diamond);
        System.out.println("gold 할인 : " + gold);
    }
}
