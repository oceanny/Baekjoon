import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[k];
		long min = 0;
		long mid = 0;
		long max = 0;
		
		
		for (int i = 0; i < k; i++) {
			arr[i] = sc.nextInt();
			if (max < arr[i]) max = arr[i];
		}
		
        max++;
        
		while(min < max) {
			mid = (min + max) / 2;
			
			long count = 0;
			
			for (int i = 0; i < k; i++) {
				count += arr[i] / mid;
			}
			
			if (count < n) max = mid;
			else min = mid + 1;
			
		}
		
		System.out.println(min - 1);
		
	}
}
