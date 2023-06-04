import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		int[][] ans = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				ans[i][j] = a[i][j] + b[i][j];
				System.out.printf("%d", ans[i][j]);
				if (j != m - 1)
					System.out.printf(" ");
			}
			System.out.println();
		}
    }
}