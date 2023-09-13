import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] ent = new int[4];
		int[] out = new int[4];
		int[] num = new int[4];
		int max = 0;
		for (int i = 0; i < 4; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			out[i] = Integer.parseInt(st.nextToken());
			ent[i] = Integer.parseInt(st.nextToken());
		}
		num[0] = ent[0];
		num[1] = num[0] + ent[1] - out[1];
		num[2] = num[1] + ent[2] - out[2];
		num[3] = num[2] + ent[3] - out[3];
		for (int i = 0; i < 4; i++) {
			if (max < num[i]) max = num[i];
		}
		System.out.print(max);
	}
}