import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        String str1 = sc.next();
        String[] str2 = str1.split("");
        
        for (int i = 0; i < n; i++){
            int temp = Integer.parseInt(str2[i]);
            ans = ans + temp;
        }
        System.out.println(ans);
    }
}