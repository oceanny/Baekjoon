import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		int m = A / 2 + B;
		System.out.println(Math.min(N, m));
	}
}