package softserveex329;
import java.util.Scanner;
public class SoftServeEx329 {

    public static void main(String[] args) {
        int N =100;
        int M =100;
        for (int i = 1; i < N; i++) {
            String str = i+"";
            int sqOfSum = 0;
            for (int j = 0; j < str.length(); j++) {
                sqOfSum+=Integer.parseInt(str.charAt(j)+"");
            }
            sqOfSum = (int)Math.pow(sqOfSum, 2);
            if(sqOfSum==M)
                System.out.println("Square of "+i+" = "+sqOfSum);
        }
    }
    
}
