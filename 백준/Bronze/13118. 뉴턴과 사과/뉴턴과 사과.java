import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] people = new int[4];
		for (int i = 0; i < 4; i++) {
			people[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		int ans = 0;
		sc.close();
		for (int i = 0; i < 4; i++) {
			if (x == people[i]) ans = i + 1;
			else continue;
		}
		System.out.println(ans);
	}
}