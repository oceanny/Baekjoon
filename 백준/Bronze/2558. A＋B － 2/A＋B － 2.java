import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if ((a >= 10) || (b >= 10)) return;
        else System.out.println(a + b);
    }
}