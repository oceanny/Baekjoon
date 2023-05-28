import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int[] ans = {x, w - x, y, h - y};
        int temp = 1000;
        
        for (int i = 0; i < 4; i++){
            if (temp >= ans[i]) temp = ans[i];
            else continue;
        }
        
        System.out.println(temp);
        
    }
}