package lang.object.tayo;

public class ObjectTayoExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();

        Object[] objects = { dog, car, object };

        size(objects);
    }

    public static void size(Object[] objects) {
        System.out.println("전달된 object의 수 : " + objects.length);
    }
}
