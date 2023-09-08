import java.util.Scanner;

public class Main {
	static int[] D;
	public static void main(String[] args) {
		// 톱-다운 방식
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		D = new int[n + 1];
		// DP 테이블 초기화
		for (int i = 0; i <= n; i++) {
			D[i] = -1;
		}
		// 0과 1의 값은 가장 작은 문제
		// 값을 넣어 초기화
		D[0] = 0;
		D[1] = 1;
		fibo(n);
		System.out.println(D[n]);
	}
	private static int fibo(int n) {
		// 이미 계산했다면 DP 테이블 값이 -1이 아님
		if (D[n] != -1) {
			return D[n];
		}
		// 구한 값을 DP 테이블에 저장 후 리턴
		return D[n] = fibo(n - 2) + fibo(n - 1);
	}
}