import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int H = Integer.parseInt(st.nextToken());
		int min = 100;
		if (S + K + H >= 100) System.out.println("OK");
		else {
			if (S < min) min = S;
			if (K < min) min = K;
			if (H < min) min = H;
			if (min == S) System.out.println("Soongsil");
			if (min == K) System.out.println("Korea");
			if (min == H) System.out.println("Hanyang");
		}
	}
}