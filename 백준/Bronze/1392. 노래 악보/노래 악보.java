import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		int[] time = new int[N + 1];
		int size = 0;
		for (int i = 1; i <= N; i++) {
			time[i] = Integer.parseInt(br.readLine());
			size += time[i];
		}
		int[] song = new int[size];
		int count = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < time[i]; j++) {
				song[j + count] = i;
			}
			count += time[i];
		}
		for (int i = 0; i < Q; i++) {
			System.out.println(song[Integer.parseInt(br.readLine())]);
		}
	}
}