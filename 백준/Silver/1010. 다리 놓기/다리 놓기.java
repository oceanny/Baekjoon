import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[] ans = new long[num];
        
        for (int i = 0; i < num; i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            if (n > m / 2) n = m - n;
            
            long temp = 1;
            for (int j = 0; j < n; j++){
                temp = temp * (m - j);
            }
            for (int j = n; j > 0; j--){
                temp = temp / j;
            }
            ans[i] = temp;
        }
        
        for (int i = 0; i < num; i++){
            System.out.println(ans[i]);
        }
    }
}