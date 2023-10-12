import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		if (B >= A - 1) System.out.println(2 * A - 1);
		else System.out.println(2 * B + 1);
	}
}