import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n == 1) return;
        for (int i = 2; i <= n; i++){
            while(n % i == 0){
                n = n / i;
                System.out.println(i);
            }
        }
    }
}