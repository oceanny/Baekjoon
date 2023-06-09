import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] num = new int[n];
		
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
			if (num[i] >= m) num[i] = 0;
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = 0;
				if (num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					int sum = num[i] + num[j] + num[k];
					if ((sum <= m) && sum > max) {
						max = sum;
					}
				}
			}
		}
		System.out.println(max);
    }
}