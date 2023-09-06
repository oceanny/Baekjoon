import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int P = sc.nextInt();
		int A = sc.nextInt();
		int H = sc.nextInt();
		int total = S + P + A + H;
		System.out.println(total / 60);
		System.out.print(total % 60);
	}
}