import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] values = new int[4];
		for (int i = 0; i < 3; i += 2) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			values[i] = Integer.parseInt(st.nextToken());
			values[i + 1] = Integer.parseInt(st.nextToken());
		}
		double[] max = new double[4];
		max[0] = (double)values[0] / values[2] + (double)values[1] / values[3];
		max[1] = (double)values[2] / values[3] + (double)values[0] / values[2];
		max[2] = (double)values[3] / values[1] + (double)values[2] / values[0];
		max[3] = (double)values[1] / values[0] + (double)values[3] / values[2];
		int ans = 0;
		for (int i = 0; i < 3; i++) {
			if (max[ans] < max[i + 1]) ans = i + 1;
		}
		System.out.println(ans);
	}
}