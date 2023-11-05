import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int STR = sc.nextInt();
		int DEX = sc.nextInt();
		int INT = sc.nextInt();
		int LUK = sc.nextInt();
		int N = sc.nextInt();
		sc.close();
		int count = N * 4 - STR - DEX - INT - LUK;
		if (count < 0) System.out.println(0);
		else System.out.println(count);
	}
}