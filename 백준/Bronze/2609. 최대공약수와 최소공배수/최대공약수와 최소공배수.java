import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = 0;
        int max;
        
        if (a >= b){
            int temp = a;
            a = b;
            b = temp;
        }
        
        for (int i = 1; i <= a; i++){
            if ((a % i == 0) && (b % i == 0)) min = i;
        }
        
        max = a * b / min;
        
        System.out.printf("%d\n%d", min, max);
    }
}