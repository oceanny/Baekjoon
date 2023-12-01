import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int streak_now = 0;
		int streak_max = 0;
		for (int i = 0; i < N; i++) {
			if (Integer.parseInt(st.nextToken()) != 0) streak_now++;
			else streak_now = 0;
			if (streak_now > streak_max) streak_max = streak_now;
		}
		System.out.println(streak_max);
	}
}