package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");  //x001
        ImmutableAddress b = a;
        System.out.println(a);
        System.out.println(b);

//        b.setValue("부산");
        b = new ImmutableAddress("부산");
        System.out.println("b -> 부산");
        System.out.println(a);
        System.out.println(b);
    }
}
