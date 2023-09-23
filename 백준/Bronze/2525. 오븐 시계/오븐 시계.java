import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        if((B + C < 60) && (C < 60)) System.out.printf("%d %d", A, B + C);
        else if((B + C >= 60) || (C >= 60)){
            A = A + (B + C) / 60;
            B = (B + C) % 60;
            
            if (A <= 23)System.out.printf("%d %d", A, B);
            else System.out.printf("%d %d", A - 24, B);
        }
    }
}