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
		int C = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		int lo = 1;
		int hi = arr[N - 1] - arr[0] + 1;
		
		while (lo < hi) {
			int mid = (lo + hi) / 2;
			
			if (find(arr, mid) < C) hi = mid;
			else lo = mid + 1;
		}
		
		System.out.println(lo - 1);
	}

	private static int find(int[] arr, int dst) {
		int count = 1;
		int last = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			int now = arr[i];
			if (now - last >= dst) {
				count++;
				last = now;
			}
		}
		
		return count;
	}
}