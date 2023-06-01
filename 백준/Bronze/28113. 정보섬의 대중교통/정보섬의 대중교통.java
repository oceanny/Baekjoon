import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        //initialization
        int n;
        int a;
        int b;
        int bus;
        int subway;
        String ans;
        
        //input
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        
        //process
        if (a > b) ans = "Subway";
        else if (a < b) ans = "Bus";
        else ans = "Anything";
        
        //output
        System.out.println(ans);        
    }
}