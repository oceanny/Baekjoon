import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] files = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			files[i] = Integer.parseInt(st.nextToken());
		}
		int cluster = Integer.parseInt(br.readLine());
		long size = 0;
		for (int i = 0; i < N; i++) {
			if (files[i] == 0) continue;
			if (files[i] <= cluster) size += cluster;
			else if (files[i] % cluster == 0) size += files[i] / cluster * cluster;
			else size += (files[i] / cluster + 1) * cluster;
		}
		System.out.println(size);
		
	}
}