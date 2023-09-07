import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] level = new int[4];
		for (int i = 0; i < 4; i++) {
			level[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(level);
		int A = level[0] + level[3];
		int B = level[1] + level[2];
		if (A >= B) System.out.print(A - B);
		else System.out.print(B - A);
	}
}