import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        int ans = n;
        
        for (int i = 0; i < n; i++) {
        	num[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
        	if (num[i] == 1) {
    			ans = ans - 1;
    		}
        	for (int j = 2; j < num[i]; j++) {
        		if (num[i] % j == 0) {
        			ans = ans - 1;
        			break;
        		}
        	}
        }
        
        System.out.println(ans);
    }
}