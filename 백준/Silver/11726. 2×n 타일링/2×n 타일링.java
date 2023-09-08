import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 톱-다운 방식
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		// n의 범위가 1000 이하이므로 D를 long으로 선언
		long[] D = new long[1001];
		D[1] = 1;
		D[2] = 2;
		for (int i = 3; i <= n; i++) {
            // 10007로 나눈 나머지 출력이므로 mod 연산을 잊지 않기
			D[i] = (D[i - 1] + D[i - 2]) % 10007;
		}
		System.out.println(D[n]);
	}
}