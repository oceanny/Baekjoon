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
		int[] girls = new int[7];
		int[] boys = new int[7];
		int ans = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			if (S == 0) girls[Y]++;
			else boys[Y]++;
		}
		for (int i = 1; i <= 6; i++) {
			if (girls[i] == 0) continue;
			else if (girls[i] % K == 0) ans += girls[i] / K;
			else ans += girls[i] / K + 1;
			
		}
		for (int i = 1; i <= 6; i++) {
			if (boys[i] == 0) continue;
			else if (boys[i] % K == 0) ans += boys[i] / K;
			else ans += boys[i] / K + 1;
			
		}
		System.out.println(ans);
	}
}