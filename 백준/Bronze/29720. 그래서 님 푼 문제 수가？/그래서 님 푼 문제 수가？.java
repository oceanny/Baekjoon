import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		int min = N - M * K > 0? N - M * K : 0;
		int max = N - M * (K - 1) - 1;
		System.out.printf("%d %d", min, max);
	}
}