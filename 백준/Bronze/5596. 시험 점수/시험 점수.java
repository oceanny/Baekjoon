import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = 0;
		int T = 0;
		int ans;
		for (int i = 0; i < 4; i++) {
			S += Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			T += Integer.parseInt(st.nextToken());
		}
		if (S == T) ans = S;
		else ans = Math.max(S, T);
		
		System.out.print(ans);
	}
}