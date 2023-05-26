import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int ans = 1;
        
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
        	ans = ans * i;
        }
        
        System.out.println(ans);
    }
}