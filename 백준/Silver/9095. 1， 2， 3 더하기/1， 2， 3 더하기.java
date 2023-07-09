import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[11];
		int t = sc.nextInt();
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		for (int i = 0; i < t; i++) {
			int a = sc.nextInt();
			for (int j = 4; j <= a; j++) {
				if (arr[j] != 0) continue; // 이전에 계산했다면 굳이 계산하지 않고 넘긴다
				arr[j] = arr[j - 1] + arr[j - 2] + arr[j - 3];
			}
			System.out.println(arr[a]);
		}
        sc.close();
	}
}
