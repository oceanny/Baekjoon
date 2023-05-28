import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i = 0; i < t; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            String ans = "";
            String y; String x;
            
            if (n % h == 0) {
                y = ans + h;
                x = ans + n / h;
            }
            else {
                y = ans + n % h;
                x = ans + (n / h + 1);
            }
            
            if (x.length() == 1) x = "0" + x;
            ans = y + x;
            System.out.println(ans);
        }
        
    }
}