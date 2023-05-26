import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int ans;
        int y = 0;
        
        n = sc.nextInt();sc.close();
        
        if (n == 1 || n == 2 || n == 4 || n == 7) ans = -1;
        else {
        	if (n % 5 == 0) {
        		ans = n / 5;
        	}
        	else {
        		while(n % 5 != 0) {
        			n = n - 3;
        			y++;
        		}
        		ans = n / 5 + y;
        	}
        }
        
        System.out.println(ans);
    }
}