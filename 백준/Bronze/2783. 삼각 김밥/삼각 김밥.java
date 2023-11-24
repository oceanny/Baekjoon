import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int Xi = Integer.parseInt(st.nextToken());
			int Yi = Integer.parseInt(st.nextToken());
			if((double)Xi / Yi < (double)X / Y) {
				X = Xi; Y = Yi;
			}
		}
		System.out.println((double)X / Y * 1000);
	}
}