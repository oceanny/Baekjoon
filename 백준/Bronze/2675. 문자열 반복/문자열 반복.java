import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String answer = "";
        
        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            String str = sc.next();
            String[] ans = str.split("");
            for(int j = 0; j < ans.length; j++){
                for (int k = 0; k < n; k++){
                    answer = answer + ans[j];
                }
            }
            System.out.println(answer);
            answer = "";
        }
    }
}