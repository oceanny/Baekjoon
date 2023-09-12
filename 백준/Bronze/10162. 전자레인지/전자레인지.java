import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.close();
		if (T % 10 != 0) System.out.print(-1);
		else {
			int A; int B; int C;
			A = T / 300;
			T %= 300;
			B = T / 60;
			T %= 60;
			C = T / 10;
			System.out.printf("%d %d %d", A, B, C);
		}
	}
}