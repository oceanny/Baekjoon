import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] ent = new int[10];
		int[] out = new int[10];
		int[] num = new int[10];
		int max = 0;
		for (int i = 0; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			out[i] = Integer.parseInt(st.nextToken());
			ent[i] = Integer.parseInt(st.nextToken());
		}
		num[0] = ent[0];
		for (int i = 1; i < 10; i++) {
			num[i] = num[i - 1] + ent[i] - out[i];
		}
		for (int i = 0; i < 10; i++) {
			if (max < num[i]) max = num[i];
		}
		System.out.print(max);
	}
}