package lang;

import java.util.Scanner;

public class lost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int stack = 0;
        char[] c = str.toCharArray();
        for (int i =0; i<str.length();i++){
            if(c[i] == '+' || c[i] == '-'){
                for(int j=stack;j>0;j--) {
                    System.out.println(c[i - j]);

                }
                stack = 0;
            }
            stack++;
        }
    }


}
