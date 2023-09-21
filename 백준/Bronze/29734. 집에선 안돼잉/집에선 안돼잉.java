import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long M = sc.nextLong();
		long T = sc.nextLong();
		long S = sc.nextLong();
		sc.close();
		long home = N % 8 != 0 ? N / 8 * (8 + S) + N % 8 : N / 8 * (8 + S) - S;
		long library = M % 8 != 0 ? M / 8 * (8 + S + 2 * T) + M % 8 + T : M / 8 * (8 + S + 2 * T) - T - S;
		if (home < library) {
			System.out.println("Zip");
			System.out.println(home);
		}
		else {
			System.out.println("Dok");
			System.out.println(library);
		}
	}
}