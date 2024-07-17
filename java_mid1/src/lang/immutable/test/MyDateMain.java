package lang.immutable.test;

public class MyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024,1,1);
        ImmutableMyDate date2 = date1;
        System.out.println(date1);
        System.out.println(date2);

        date1 = date1.setYear(2025);
        System.out.println(date1);
        System.out.println(date2);

    }
}
