import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		if (N == 1) {
			System.out.println("*");
			return;
		}
		for (int i = 1; i <= N; i++) {
			if (N % 2 == 0) {
				for (int j = 1; j <= N - 1; j++) {
					if (j % 2 == 1) System.out.print("*");
					else System.out.print(" ");
				}
			}
			else {
				for (int j = 1; j <= N; j++) {
					if (j % 2 == 1) System.out.print("*");
					else System.out.print(" ");
				}
			}
			System.out.println();
			if (N % 2 == 0) {
				for (int j = 1; j <= N; j++) {
					if (j % 2 == 0) System.out.print("*");
					else System.out.print(" ");
				}
			}
			else {
				for (int j = 1; j <= N - 1; j++) {
					if (j % 2 == 0) System.out.print("*");
					else System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}