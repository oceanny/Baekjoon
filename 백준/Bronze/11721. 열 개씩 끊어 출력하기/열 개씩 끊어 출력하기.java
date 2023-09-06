import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		int N = str.length() / 10;
		for (int i = 0; i < N; i++) {
			System.out.println(str.substring(i * 10, (i + 1) * 10));
		}
		System.out.println(str.substring(N * 10));
	}
}