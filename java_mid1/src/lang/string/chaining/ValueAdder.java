package lang.string.chaining;

public class ValueAdder {
    private int value;

    public int getValue() {
        return value;
    }

    public ValueAdder add(int addVaule){
        value += addVaule;
        return this;
    }
}
