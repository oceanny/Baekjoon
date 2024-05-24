import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] accsum = new int[N];
		
		st = new StringTokenizer(br.readLine());
		accsum[0] = Integer.parseInt(st.nextToken());
		for (int i = 1; i < N; i++) {
			accsum[i] = accsum[i - 1] + Integer.parseInt(st.nextToken());
		}
		
		int max = accsum[K - 1];
		for (int i = K; i < N; i++) {
			int temp = accsum[i] - accsum[i - K];
			if (temp > max)
				max = temp;
		}
		
		System.out.println(max);
	}
}