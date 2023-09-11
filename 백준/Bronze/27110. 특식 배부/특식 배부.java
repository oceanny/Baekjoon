import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		int ans = 0;
		if (A <= N) ans += A;
		else ans += N;
		if (B <= N) ans += B;
		else ans += N;
		if (C <= N) ans += C;
		else ans += N;
		System.out.print(ans);
	}
}