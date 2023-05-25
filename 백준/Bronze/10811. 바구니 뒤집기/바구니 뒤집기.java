import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[n];
        
        for (int i = 0; i < n; i++) {
			num[i] = i + 1;
		}
        
        for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
            int b = sc.nextInt();
            int na = a;
            int nb = b;
            for (int j = 0; j < (b - a + 1) / 2; j++){
                int temp = num[nb - 1];
                num[nb - 1] = num[na - 1];
                num[na - 1] = temp;
                na = a + j + 1;
                nb = b - j - 1;
            }
        }
        
        for (int i = 0; i < n; i++){
            System.out.printf("%d ", num[i]);
        }
        
    }
}