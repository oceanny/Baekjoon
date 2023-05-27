import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long v = sc.nextLong();
        long ans;
        
        if ((v - b) % (a - b) == 0) ans = (v - b) / (a - b);
        else ans = (v - b) / (a - b) + 1;
        
        System.out.println(ans);
    }
}