import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < M; i++) {
			int key = Integer.parseInt(st.nextToken());
			sb.append(check(arr, key)).append(' ');
		}
		System.out.println(sb);
	}

	private static Object check(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length;
		while (lo < hi) {
			int mid = (lo + hi) / 2;
			if (key == arr[mid]) return 1;
			if (key > arr[mid]) lo = mid + 1;
			else if (key < arr[mid]) hi = mid;
		}
		return 0;
	}
}