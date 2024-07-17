package lang.rapper;

public class WrapperVsPrimitive {
    public static void main(String[] args){
        int iterations = 1_000_000_000; // 10억
        long startTime, endTime;

        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations ; i++){
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive : " + sumPrimitive);
        System.out.println("걸린 시간 : " + (endTime - startTime) + "ms");
    }
}
