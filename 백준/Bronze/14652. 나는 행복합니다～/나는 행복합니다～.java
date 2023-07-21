import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int ans_n = 0;
		int ans_m = 0;
		// 처리 및 출력
		System.out.printf("%d %d", k / m, k % m);
	}
}