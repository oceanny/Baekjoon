import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int total = 0;
		int square;
		int cube = 0;
		for (int i = 1; i <= N; i++) {
			total += i;
			cube += Math.pow(i, 3);
		}
		square = (int) Math.pow(total, 2);
		System.out.println(total);
		System.out.println(square);
		System.out.println(cube);
	}
}