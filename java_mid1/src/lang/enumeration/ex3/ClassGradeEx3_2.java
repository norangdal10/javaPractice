package lang.enumeration.ex3;


public class ClassGradeEx3_2 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
//      열거형은 외부에서 생성 불가
//      Grade classGrade = new Grade();
        int result = discountService.discount(Grade.BASIC,price);
        System.out.println("result = " + result);
    }
}
