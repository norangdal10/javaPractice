package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("아반떼");
        Dog dog1 = new Dog("말티즈",8);
        Dog dog2 = new Dog("푸들", 3);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());
        
        System.out.println("2. pringln 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue = " + refValue);

        String refValue2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println("refValue = " + refValue2);
    }
}
