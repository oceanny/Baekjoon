import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		for (int i = 0; i < 7; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int ans = 0;
		int min = 100;
		for (int i = 0; i < 7; i++) {
			if (arr[i] % 2 != 0) {
				ans += arr[i];
				if (arr[i] < min) min = arr[i];
			}
		}
		if (ans == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(ans);
			System.out.println(min);
		}
	}
}