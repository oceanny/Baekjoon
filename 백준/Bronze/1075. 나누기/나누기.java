import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int F = sc.nextInt();
		sc.close();
		N = N / 100 * 100;
		while(N % F != 0) {
			N++;
		}
		System.out.printf("%02d", N % 100);
	}
}