import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		sc.close();
		int[] sum = new int[s1 + s2 + s3 + 1];
		for (int i = 1; i <= s1; i++) {
			for (int j = 1; j <= s2; j++) {
				for (int k = 1; k <= s3; k++) {
					sum[i + j + k]++;
				}
			}
		}
		int max = 0;
		int ans = 0;
		for (int i = 1; i < sum.length; i++) {
			if (sum[i] > max) {
				max = sum[i];
				ans = i;
			}
			else if (sum[i] == max) ans = Math.min(ans, i);
		}
		System.out.println(ans);
	}
}