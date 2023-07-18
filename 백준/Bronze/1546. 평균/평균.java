import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			if (temp > max) max = temp;
			sum += temp;
		}
		
		System.out.print(sum * 100.0 / max / n);
	}
}
