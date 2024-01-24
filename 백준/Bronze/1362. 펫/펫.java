import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int stage = 1;
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int o = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			
			if (o == 0 && w == 0) return;
			boolean death = false;
			
			while (true) {
				st = new StringTokenizer(br.readLine());
				String action = st.nextToken();
				int n = Integer.parseInt(st.nextToken());
				
				if (action.equals("#")) break;
				if (action.equals("E")) w -= n;
				if (action.equals("F")) w += n;
				
				if (w <= 0) death = true;
			}
			
			if (death) System.out.printf("%d RIP\n", stage);
			else if (w > o / 2 && w < o * 2) System.out.printf("%d :-)\n", stage);
			else System.out.printf("%d :-(\n", stage);
			
			stage++;
		}
	}
}