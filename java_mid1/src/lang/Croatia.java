package lang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Croatia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] cro_str = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String result = sc.next();
        for(String alp : cro_str){
            result = result.replace(alp,"a");
        }
        System.out.println(result.length());
    }
}
