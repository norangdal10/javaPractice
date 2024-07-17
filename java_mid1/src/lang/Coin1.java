package lang;

import java.util.Scanner;

public class Coin1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] coins = new int[N];
        for(int i = 0; i < N ; i++){
            coins[i] = sc.nextInt();
        }
        for (int i : coins){
            if(K/i>0){
                result += K/i;
                K%=i;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
