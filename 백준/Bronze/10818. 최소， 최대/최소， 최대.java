import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        num[0] = sc.nextInt();
        int min = num[0];
        int max = num[0];
        
        for (int i = 1; i < n; i++){
            num[i] = sc.nextInt();
            if (num[i] <= min) min = num[i];
            if (num[i] >= max) max = num[i];
            }
        
        System.out.printf("%d %d", min, max);
        }
}