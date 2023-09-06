import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int N = sc.nextInt();
		int M = sc.nextInt();
		int ans = 0;
		if (M < K * N) ans = K * N - M;
		System.out.print(ans);
	}
}