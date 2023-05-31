import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        String answer = "";
        for (int i = 0; i < n; i++){
            String str = sc.nextLine();
            String[] ans = str.split("");
            answer = ans[0] + ans[ans.length - 1];
            System.out.println(answer);
        }
    }
}