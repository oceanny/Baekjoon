import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int i = sc.nextInt();
        String ans = str.substring(i - 1, i);
        
        System.out.println(ans);
    }
}