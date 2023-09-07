import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] x = new int[4];
		int[] y = new int[4];
		int X; int Y;
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		if (x[0] == x[1]) X = x[2];
		else if (x[0] == x[2]) X = x[1];
		else X = x[0];
		
		if (y[0] == y[1]) Y = y[2];
		else if (y[0] == y[2]) Y = y[1];
		else Y = y[0];
		
		System.out.printf("%d %d", X, Y);
	}
}