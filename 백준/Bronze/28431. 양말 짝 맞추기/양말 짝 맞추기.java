import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < 5; i++) {
			if (arr[i] == -1) continue;
			for (int j = i + 1; j < 5; j++) {
				if (arr[j] == -1) continue;
				if (arr[i] == arr[j]) {
					arr[i] = -1;
					arr[j] = -1;
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			if (arr[i] != -1) System.out.print(arr[i]);
		}
	}
}