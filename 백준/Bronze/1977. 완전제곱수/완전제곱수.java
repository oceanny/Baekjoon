import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		int sum = 0;
		int min = N + 1;
		for (int i = 1; i <= Math.sqrt(N); i++) {
			if (i * i >= M) {
				sum += i * i;
				min = Math.min(min, i* i);
			}
		}
		if (sum == 0) System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}