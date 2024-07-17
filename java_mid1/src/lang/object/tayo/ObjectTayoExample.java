package lang.object.tayo;

public class ObjectTayoExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        System.out.println(obj);
//        obj.sound();// 컴파일 오류, Object에는 sound 함수가 없음.
//        만약 실행하려고 한다면 객체에 맞는 다운캐스팅이 필 요
        if(obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.move();
        }
    }
}
