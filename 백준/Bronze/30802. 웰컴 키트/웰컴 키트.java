import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] size = new int[6];
		for (int i = 0; i < 6; i++) {
			size[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(size);
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		int tsum = 0;
		for (int i = 0; i < 6; i++) {
			tsum += Math.ceil((double)size[i] / T);
		}
		System.out.println(tsum);
		System.out.printf("%d %d", N / P, N % P);
	}
}