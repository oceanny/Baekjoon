import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int[] L;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		L = new int[N];
		long sum = 0;
		long P = 0;
		
		for (int i = 0; i < N; i++) {
			L[i] = Integer.parseInt(br.readLine());
			if (L[i] <= K) L[i] = 0;
			else if (L[i] < 2 * K) L[i] -= K;
			else L[i] -= 2 * K;
			
			sum += L[i];
		}
		
		P = sum / M;
		
		if (P <= 0) {
			System.out.println("-1");
			return;
		}
		
		long low = 0;
		long high = P;

		while (low <= high) {
			long mid = (low + high) / 2;
			
			if (mid == 0) mid = 1;
			long ck = check(mid);
			
			if (ck < M) high = mid - 1;
			else if (ck >= M) {
				low = mid + 1;
				P = mid;
			}
		}
		
		System.out.println(P);
	}

	private static long check(long mid) {
		long cnt = 0;
		for (int i = 0; i < L.length; i++) {
			cnt += L[i] / mid;
		}
		return cnt;
	}
}