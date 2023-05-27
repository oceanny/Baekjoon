import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] fibo = new int[n + 1];
        int ans = 0;
        
        if ((n == 0) || (n == 1)) ans = n;
        else {
            for (int i = 0; i < 2; i++){
            fibo[i] = i;
            }
            for (int i = 2; i <= n; i++){
                fibo[i] = fibo[i - 1] + fibo[i - 2];
            }
            ans = fibo[n];
        }
        System.out.println(ans);
    }
}