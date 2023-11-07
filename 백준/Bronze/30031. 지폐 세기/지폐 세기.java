import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int width = Integer.parseInt(st.nextToken());
			switch (width) {
			case 136: sum += 1000; break;
			case 142: sum += 5000; break;
			case 148: sum += 10000; break;
			case 154: sum += 50000; break;
			}
		}
		System.out.println(sum);		
	}
}