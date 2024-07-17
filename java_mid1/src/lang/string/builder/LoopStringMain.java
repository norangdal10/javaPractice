package lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        String result = "";
        // 사실상 반복문 내에서 Stringbuilder가 String을 10만번 실행했기 때문에 굉장히 느리다.
        for (int i = 0; i < 100000; i++){
            result += "Hello Java ";
        }

        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}
