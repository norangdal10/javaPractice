package lang.enumeration.ex2;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    //private타입으로 막아두면 새롭게 생성해 오류가 발생하는 것을 차단
    //private ClassGrade(){}
}
