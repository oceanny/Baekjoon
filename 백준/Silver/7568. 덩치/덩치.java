import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] kg = new int[n];
		int[] cm = new int[n];
		int[] ans = new int[n];

		for (int i = 0; i < n; i++) {
			ans[i] = 1;
		}

		for (int i = 0; i < n; i++) {
			kg[i] = sc.nextInt();
			cm[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (kg[i] > kg[j] && cm[i] > cm[j])
					ans[j]++;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.printf("%d", ans[i]);
			if (i != n - 1) {System.out.printf(" ");}
		}
    }
}