import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		double a = Integer.parseInt(st.nextToken());
		double b = Integer.parseInt(st.nextToken());
		double c = Integer.parseInt(st.nextToken());
		int count = 1;
		
		while (!(a == 0 && b == 0 && c == 0)) {
			if (a == -1) {
				System.out.println("Triangle #" + count);
				if (c * c - b * b <= 0) System.out.println("Impossible.\n");
				else System.out.printf("a = %.3f\n\n", Math.sqrt(c * c - b * b));
			}
			if (b == -1) {
				System.out.println("Triangle #" + count);
				if (c * c - a * a <= 0) System.out.println("Impossible.\n");
				else System.out.printf("b = %.3f\n\n", Math.sqrt(c * c - a * a));
			}
			if (c == -1) {
				System.out.printf("Triangle #%d\nc = %.3f\n\n", count, Math.sqrt(a * a + b * b));
			}
			
			count++;
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
		}
	}
}