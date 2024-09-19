import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int min = 0;
		int max = arr[N - 1];
		
		while (min < max) {
			int mid = (max + min) / 2;
			long sum = 0;

			for (int i = 0; i < N; i++) {
				if (arr[i] > mid) sum += arr[i] - mid;
			}
			
			if (sum < M) max = mid;
			else min = mid + 1;
		}
		
		System.out.println(min - 1);
	}
}