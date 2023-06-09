import java.util.Scanner;

public class Main {
	
//	n이 1보다 크고 10보다 작으므로 int로 정의한다
	public static int factorial(int n) {
		int answer = 1;
		if (n > 1) {
			for (int i = 2; i <= n; i++) {
				answer *= i;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = factorial(n) / factorial(k) / factorial(n - k);
        System.out.println(ans);

	}
}