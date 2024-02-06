import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		ArrayList<Boolean> list = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < L; j++) {
				list.add(true);
			}
			if (i != N - 1) {
				for (int j = 0; j < 5; j++) {
					list.add(false);
				}
			}
		}
		
		int result = D;
		
		while (result < list.size()) {
			if (!list.get(result)) break;
			result += D;
		}
		
		System.out.println(result);
	}
}