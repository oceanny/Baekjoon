import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		boolean[] cups = new boolean[4];
		cups[1] = true;
		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int X = Integer.parseInt(st.nextToken());
			int Y = Integer.parseInt(st.nextToken());
			boolean temp = cups[X];
			cups[X] = cups[Y];
			cups[Y] = temp;
		}
		for (int i = 0; i < 4; i++) {
			if (cups[i]) System.out.println(i);
		}
	}
}