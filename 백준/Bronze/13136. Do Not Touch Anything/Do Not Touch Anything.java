import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		long x; long y;
		if (R % N == 0) x = R / N;
		else x = R / N + 1;
		if (C % N == 0) y = C / N;
		else y = C / N + 1;
		
		System.out.print(x * y);
	}
}