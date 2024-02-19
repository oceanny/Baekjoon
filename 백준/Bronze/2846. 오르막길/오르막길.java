import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] height = new int[N];
		height[0] = Integer.parseInt(st.nextToken());
		int max = 0;
		boolean start = false;
		int start_num = 0;
		for (int i = 1; i < N; i++) {
			height[i] = Integer.parseInt(st.nextToken());
			if (!start && height[i - 1] < height[i]) {
				start = true;
				start_num = height[i - 1];
			}
			if (start && height[i - 1] >= height[i]) {
				start = false;
				int temp = height[i - 1] - start_num;
				if (temp > max) max = temp;
			}
		}
		if (start) {
			int temp = height[N - 1] - start_num;
			if (temp > max) max = temp;
		}
		System.out.println(max);
	}

}