package lang.rapper;

import java.util.Objects;

public class MyInteger {
    private final int value;

    public int getValue() {
        return value;
    }

    public MyInteger(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyInteger myInteger = (MyInteger) o;
        return value == myInteger.value;
    }

    @Override
    public String toString() {
        return value + "";
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    public int compareTo(int target){
        if (value < target){
            return -1;
        }else if(value > target) {
            return 1;
        }else{
            return 0;
        }
    }
}
