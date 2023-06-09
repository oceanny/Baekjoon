import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d5 = n / 5;
        int d25 = n / 25;
        int d125 = n / 125;
        
        int ans = d5 + d25 + d125;
        System.out.println(ans);
    }
}