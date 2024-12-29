import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] cards = new int[N];
		for (int i = 0; i < N; i++) {
			cards[i] = Integer.parseInt(st.nextToken());
		}
		
		int sum = 0;
		
		for (int i = 0; i < cards.length; i++) {
			int tmp = 0;
			for (int j = i + 1; j < cards.length; j++) {
				for (int k = j + 1; k < cards.length; k++) {
					tmp = cards[i] + cards[j] + cards[k];
					if (tmp <= M) sum = Math.max(sum, tmp);
				}
			}
		}
		
		System.out.println(sum);
	}
}