import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 입력
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}
		// 처리
		Arrays.sort(arr);
		// 출력
		System.out.printf("%d %d %d", arr[0], arr[1], arr[2]);
		
	}
}