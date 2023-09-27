import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			int[] arr = new int[M];
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[M - j - 1] = str.charAt(j) - '0';
			}
			for (int j = 0; j < M; j++) {
				System.out.print(arr[j]);
			}
			System.out.println();
		}
	}
}