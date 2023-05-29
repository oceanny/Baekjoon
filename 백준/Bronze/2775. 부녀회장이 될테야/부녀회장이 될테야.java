import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            
            int[][] num = new int[k + 1][n];
            for (int j = 0; j < n; j++){
                num[0][j] = j + 1; //0층의 호수 배정
            }
            
            for (int l = 1; l <= k; l++){
                for (int m = 0; m < n; m++){
                    for (int o = 0; o <= m; o++){
                        num[l][m] = num[l][m] + num[l - 1][o];
                    }
                }
            }
            
            System.out.println(num[k][n - 1]);
        }
    }
}