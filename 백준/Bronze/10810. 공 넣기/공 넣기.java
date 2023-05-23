import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        
        int[] num = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = 0;
        }
        
        for(int i = 0; i < m; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            
            for(int j = a - 1; j <= b - 1; j++){
                num[j] = c;
            }
        }
        
        for(int i = 0; i < n; i++){
            System.out.printf("%d ", num[i]);
        }
    }
}