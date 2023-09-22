import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		int[] minor = new int[N + 1];
		int sum = 0;
		int min = N;
		// 배열 초기화
		for (int i = 1; i <= N; i++) {
			minor[i] = i;
		}
        minor[1] = 0;
		for (int i = 2; i <= Math.sqrt(N); i++) {
			if (minor[i] == 0) continue;
			// i의 배수를 모두 삭제
			for (int j = 2 * i; j <= N; j += i) {
				minor[j] = 0;
			}
		}
		for (int i = M; i <= N; i++) {
			if (minor[i] != 0) {
				sum += minor[i];
				if (min == N) min = i;
			}
		}
		if (sum == 0) System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}